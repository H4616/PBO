package geometri;

public class Lingkaran implements Geometri{
    private double jari, luas, keliling;
    
    public Lingkaran(double r){
        jari = r;
    }
    
    public Lingkaran(){
        jari = 8;
    }
    
    // Encaptulation
    public void setJari(int r){
        jari = r;
    }
    
    public double getJari(){
        return jari;
    }
    
    public double getDiameter(){
        return 2*jari;
    }

    @Override
    public double hitungVolume() {
        return 0;
    }
    
    @Override
    public double hitungLuas() {
        luas = PHI * (jari * jari);
        return luas;
    }

    @Override
    public double hitungKeliling() {
        return keliling = PHI * (2*jari);
    }

    public double getLuas() {
        luas = PHI * (jari * jari);
        return luas;
    }

    public double getKeliling() {
        keliling = PHI * (2*jari);
        return keliling;
    }
    
}
