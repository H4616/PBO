package geometri;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Bola extends Lingkaran implements Geometri, Runnable {

    private double luasp, volume;
    private SharedFile sharedFile;

    public Bola(double r, SharedFile sharedFile) {
        super(r);
        this.sharedFile = sharedFile;
    }
    public Bola(double r) {
        super(r);
    }

    public Bola(SharedFile sharedFile) {
        super();
        this.sharedFile = sharedFile;
    }
    
    public Bola() {
        super();
    }

    @Override
    public double hitungLuas() {
        luasp = super.hitungLuas() * 4;
        return luasp;
    }

    @Override
    public double hitungVolume() {
        volume = super.hitungLuas() * getJari() * 4 / 3;
        return volume;
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " sedang menghitung volume dan luas permukaan bola.");
        hitungVolume();
        hitungLuas();
        System.out.println("Volume bola dengan jari-jari " + super.getJari() + " adalah " + volume);
        System.out.println("Luas permukaan bola dengan jari-jari " + super.getJari() + " adalah " + luasp);

        try {
            RandomAccessFile file = new RandomAccessFile("bola.txt", "rw");

            // Menulis data ke file
            sharedFile.writeData(super.getJari());
            sharedFile.writeData(luasp);
            sharedFile.writeData(volume);

            // Menutup file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
