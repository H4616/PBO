package geometri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,t;
        String ulang;
        do{
            try{
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Tabung");
            System.out.println("2. Hitung Kerucut");
            System.out.println("3. Hitung Bola");
            System.out.print("Pilih: ");int menu = input.nextInt();
            try{
            switch(menu){
                case 1:
                    System.out.print("Input Tinggi: ");t = input.nextDouble();
                    System.out.print("Input Jari - jari: ");r = input.nextDouble();
                    Tabung tabung = new Tabung(t, r);
                    System.out.println("Luas Lingkaran= " + tabung.getLuas());
                    System.out.println("Keliling Lingkaran= " + tabung.getKeliling());
                    System.out.println("Volume Tabung= " + tabung.hitungVolume());
                    System.out.println("Luas Permukaan Tabung= " + tabung.hitungLuas());
                    break;
                case 2: 
                    System.out.print("Input Tinggi: ");t = input.nextDouble();
                    System.out.print("Input Jari - jari: ");r = input.nextDouble();
                    Kerucut kerucut = new Kerucut(t, r);
                    System.out.println("Luas Lingkaran= " + kerucut.getLuas());
                    System.out.println("Keliling Lingkaran= " + kerucut.getKeliling());
                    System.out.println("Volume Kerucut= " + kerucut.hitungVolume());
                    System.out.println("Luas Permukaan Kerucut= " + kerucut.hitungLuas());
                    System.out.println("\nHitung Kerucut Terpancung");double r2,b;
                    System.out.print("Input Tinggi: ");t = input.nextDouble();
                    System.out.print("Input Jari - jari tutup (r2): ");r2 = input.nextDouble();
                    System.out.print("Input Garis Pelukis/sisi miring (b): ");b = input.nextDouble();
                    KerucutTerpancung kt=new KerucutTerpancung(r2, b, t, r);
                    System.out.println("Volume Kerucut Terpancung= " + kt.hitungVolume());
                    System.out.println("Luas Permukaan Kerucut Terpancung= " + kt.hitungLuas());
                    break;
                case 3:
                    System.out.print("Input Jari - jari: ");r = input.nextDouble();
                    Bola bola = new Bola(r);
                    System.out.println("Luas Lingkaran= " + bola.getLuas());
                    System.out.println("Keliling Lingkaran= " + bola.getKeliling());
                    System.out.println("Volume Bola= " + bola.hitungVolume());
                    System.out.println("Luas Permukaan Bola= " + bola.hitungLuas());
                    System.out.println("Menu Hitung Bagian Bola");
                    System.out.println("1. Hitung Tembereng Bola");
                    System.out.println("2. Hitung Keratan Bola");
                    System.out.println("3. Hitung Cincin Bola");
                    System.out.println("4. Hitung Juring Bola");
                    System.out.print("Pilih: ");
                    
                    int menu2 = input.nextInt();
                    try{
                    switch(menu2){
                        case 1:
                            System.out.println("Hitung Tembereng Bola");
                            System.out.print("Input tinggi: ");t = input.nextDouble();
                            System.out.print("Input jari - jari tembereng: ");r=input.nextDouble();
                            Tembereng tembereng=new Tembereng(t, r);
                            System.out.println("Volume Tembereng Bola= " + tembereng.hitungVolume());
                            System.out.println("Luas Tembereng Bola= " + tembereng.hitungLuas());
                            break;
                        case 2:
                            System.out.println("Hitung Keratan Bola");
                            System.out.print("Input tinggi: ");t = input.nextDouble();
                            System.out.print("Input r1: ");r=input.nextDouble();
                            System.out.print("Input r2: ");r2=input.nextDouble();
                            Keratan keratan=new Keratan(r2, t, r);
                            System.out.println("Volume Keratan Bola= " + keratan.hitungVolume());
                            System.out.println("Luas Keratan Bola= " + keratan.hitungLuas());
                            break;
                        case 3:
                            System.out.println("Hitung Cincin Bola");
                            System.out.print("Input jari-jari dalam: ");r=input.nextDouble();
                            System.out.print("Input jari-jari luar: ");r2=input.nextDouble();
                            Cincin cincin=new Cincin(r2, r);
                            System.out.println("Volume Cincin Bola= " + cincin.hitungVolume());
                            System.out.println("Luas Cincin Bola= " + cincin.hitungLuas());
                            break;
                        case 4:
                            System.out.println("Hitung Juring Bola");
                            System.out.print("Input jari-jari dalam: ");r=input.nextDouble();
                            System.out.print("Input jari-jari luar: ");r2=input.nextDouble();
                            Juring juring=new Juring(r2, r);
                            System.out.println("Volume Juring Bola= " + juring.hitungVolume());
                            System.out.println("Luas Juring Bola= " + juring.hitungLuas());
                            break;
                    }        
                    }catch(Exception e){
            System.err.println(e.getMessage());}
                    break;
                default:System.out.println("Menu tidak tersedia");
              }
            
            }catch(Exception e){
            System.err.println(e.getMessage()); }
            
       }catch(Exception e){
      System.err.println(e.getMessage()); }
            System.out.print("\nUlangi (y/n)? ");ulang = input.next();
        }while(ulang.equals("y"));
    }
}
