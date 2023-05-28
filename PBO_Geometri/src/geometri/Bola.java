package geometri;

public class Bola extends Lingkaran implements Geometri{
    private double luasp,volume;
    
    public Bola(double r) {
        super(r);
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
    
}
