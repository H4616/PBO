package geometri;

import static java.lang.Math.sqrt;

public class Kerucut extends Lingkaran implements Geometri, Runnable{
    private double tinggi,volume,luasp,sisimiring,selimut;

    public Kerucut(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    public Kerucut() {
        super();
        tinggi = 9;
    }
    
    public double getSisiMiring(){
        sisimiring=sqrt(super.getJari()*super.getJari()+tinggi*tinggi);
        return sisimiring;
    }

    public double getSelimut() {
        selimut=PHI*super.getJari()*getSisiMiring();
        return selimut;
    }
    
    @Override
    public double hitungLuas() {
        luasp=getSelimut()+super.hitungLuas();
//        luasp=super.hitungKeliling()/2*hitungSisiMiring()+super.hitungLuas(); 
        return luasp;
    }

    @Override
    public double hitungVolume() {
        volume=super.hitungLuas()*tinggi/3;
        return volume;
    }

    public double getTinggi() {
        return tinggi;
    }
    
    
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " sedang menghitung volume dan luas permukaan kerucut.");
        hitungVolume();
        hitungLuas();
        System.out.println("Volume kerucut dengan jari-jari " + super.getJari() + ", tinggi " + tinggi + " adalah " + volume);
        System.out.println("Luas permukaan kerucut dengan jari-jari " + super.getJari() + ", tinggi " + tinggi + ", dan sisi miring " + sisimiring + " adalah " + luasp);
    }
}
