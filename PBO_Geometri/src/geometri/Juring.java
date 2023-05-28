package geometri;

public class Juring extends Bola implements Geometri{
    private double r2,luasp,volume;

    public Juring(double r2, double r) {
        super(r);
        this.r2 = r2;
    }
    
    @Override
    public double hitungLuas() {
        luasp=getKeliling()+PHI*r2;
        return luasp;
    }

    @Override
    public double hitungVolume() {
        volume=2*PHI*r2*r2/3;
        return volume;
    }
}
