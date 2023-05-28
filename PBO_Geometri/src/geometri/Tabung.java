package geometri;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Tabung extends Lingkaran implements Geometri, Runnable {

    private double tinggi, volume, luasp;
    private SharedFile sharedFile;

    public Tabung(double tinggi, double r, SharedFile sharedFile) {
        super(r);
        this.tinggi = tinggi;
        this.sharedFile = sharedFile;
    }
    public Tabung(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }

    public Tabung(SharedFile sharedFile) {
        super();
        tinggi = 10;
        this.sharedFile = sharedFile;
    }
    
    public Tabung() {
        super();
        tinggi = 10;
    }

    @Override
    public double hitungLuas() {
        luasp = super.hitungLuas() * 2 + super.hitungKeliling() * tinggi;
        return luasp;
    }

    @Override
    public double hitungVolume() {
        volume = super.hitungLuas() * tinggi;
        return volume;
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " sedang menghitung volume dan luas permukaan tabung.");
        hitungVolume();
        hitungLuas();
        System.out.println("Volume tabung dengan jari-jari " + super.getJari() + " dan tinggi " + tinggi + " adalah " + volume);
        System.out.println("Luas permukaan tabung dengan jari-jari " + super.getJari() + " dan tinggi " + tinggi + " adalah " + luasp);

        try {
            RandomAccessFile file = new RandomAccessFile("tabung.txt", "rw");

            // Menulis data ke file
            sharedFile.writeData(super.getJari());
            sharedFile.writeData(tinggi);
            sharedFile.writeData(luasp);
            sharedFile.writeData(volume);

            // Menutup file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
