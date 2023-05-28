package geometri;

public class Tabung extends Lingkaran implements Geometri{
    private double tinggi, volume, luasp;

    public Tabung(double tinggi, double r) {
        super(r);
        this.tinggi = tinggi;
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
    
}
