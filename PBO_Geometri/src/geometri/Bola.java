package geometri;

public class Bola extends Lingkaran implements Geometri, Runnable{
    private double luasp,volume;
    
    public Bola(double r) {
        super(r);
    }
    
    public Bola() {
        super();
    }

    @Override
    public double hitungLuas() {
        luasp=super.hitungLuas()*4;
        return luasp;
    }

    @Override
    public double hitungVolume() {
        volume=super.hitungLuas()*getJari()*4/3;
        return volume;
    }
    
    
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " sedang menghitung volume dan luas permukaan bola.");
        hitungVolume();
        hitungLuas();
        System.out.println("Volume bola dengan jari-jari " + super.getJari() + " adalah " + volume);
        System.out.println("Luas permukaan bola dengan jari-jari " + super.getJari() +  " adalah " + luasp);
    }
}
