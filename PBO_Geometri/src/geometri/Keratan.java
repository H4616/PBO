package geometri;

public class Keratan extends Bola implements Geometri{
    private double r2,tinggi,luasp,volume;

    public Keratan(double r2, double tinggi, double r) {
        super(r);
        this.r2 = r2;
        this.tinggi = tinggi;
    }
    
    public Keratan() {
        super();
        r2 = 3;
        tinggi = 5;
    }

    @Override
    public double hitungLuas() {
        luasp=getKeliling();
        return luasp;
    }

    @Override
    public double hitungVolume() {
        volume=PHI*super.getJari()*super.getJari()/2+r2*r2/2+PHI*tinggi*tinggi*tinggi/6;
        return volume;
    }
}
