package geometri;

public class Tabung extends Lingkaran implements Geometri, Runnable{
    private double tinggi, volume, luasp;

    public Tabung(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    public Tabung() {
        super();
        tinggi = 10;
    }
    
    @Override
    public double hitungLuas() {
       luasp=super.hitungLuas()*2+super.hitungKeliling()*tinggi;
       return luasp;
    }

    @Override
    public double hitungVolume() {
        volume=super.hitungLuas()*tinggi;
        return volume;
    }
    
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " sedang menghitung volume dan luas permukaan tabung.");
        hitungVolume();
        hitungLuas();
        System.out.println("Volume tabung dengan jari-jari " + super.getJari() + " dan tinggi " + tinggi + " adalah " + volume);
        System.out.println("Luas permukaan tabung dengan jari-jari " + super.getJari() + " dan tinggi " + tinggi + " adalah " + luasp);
    }
}
