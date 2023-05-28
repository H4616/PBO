package geometri;

public class KerucutTerpancung extends Kerucut implements Geometri{
    private double r2,luasp,volume,luasa,luast,selimut,b;

    public KerucutTerpancung(double r2, double b, double tinggi, double r) {
        super(tinggi, r);
        this.r2 = r2;
        this.b = b;
    }
    
    public KerucutTerpancung() {
        super();
        r2 = 3;
        b = 4;
    }

    public double getLuasa() {
        luasa=super.getLuas();
        return luasa;
    }

    public double getLuast() {
        luast=PHI*r2*r2;
        return luast;
    }

    public double getSelimut() {
        selimut=PHI*b*(super.getJari()+r2);
        return selimut;
    }
    
    @Override
    public double hitungVolume() {
        volume=PHI*super.getTinggi()*(getJari()*getJari()+r2*r2+getJari()*r2)/3;
        return volume;
    }

    @Override
    public double hitungLuas() {
        luasp=getLuasa()+getLuast()+getSelimut();
        return luasp;
    }
}
