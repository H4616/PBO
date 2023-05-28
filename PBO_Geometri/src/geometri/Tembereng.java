package geometri;

public class Tembereng extends Bola implements Geometri{
    private double tinggi,volume,luasp;

    public Tembereng(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        volume=PHI*tinggi*tinggi*(3*super.getJari()-tinggi)/3;
        return volume;
    }

    @Override
    public double hitungLuas() {
        luasp=getKeliling();
        return luasp;
    }
}
