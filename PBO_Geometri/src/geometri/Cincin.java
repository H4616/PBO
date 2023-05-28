package geometri;

public class Cincin extends Bola implements Geometri{
    private double r2,luasp,volume,k;

    public Cincin(double r2, double r) {
        super(r);
        this.r2 = r2;
    }

    public double getK() {
        k=r2-super.getJari();
        return k;
    }
    
    @Override
    public double hitungLuas() {
        luasp=getKeliling()+getK()*PHI*(super.getJari()+r2);
        return luasp;
    }

    @Override
    public double hitungVolume() {
        volume=PHI/6+getK()*getK();
        return volume;
    }
}
