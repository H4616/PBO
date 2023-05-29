///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package geometri;
//
//import java.io.IOException;
//import java.io.RandomAccessFile;
//
///**
// *
// * @author andra
// */
//public class BacaFile {
//
//    public void baca() {
//        try {
//            RandomAccessFile file = new RandomAccessFile("tabung.txt", "r");
//
//            while (file.getFilePointer() < file.length()) {
//                double r = file.readDouble();
//                double tinggi = file.readDouble();
//                double luasPermukaan = file.readDouble();
//
//                double volume = file.readDouble();
//
//                System.out.println("Data:");
//                System.out.println("Jari-jari: " + r);
//                System.out.println("Tinggi: " + tinggi);
//                System.out.println("Luas Permukaan: " + luasPermukaan);
//
//                System.out.println("Volume: " + volume);
//                System.out.println();
//            }
//
//            file.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
////    public static void main(String[] args) {
////        
////    }
//}
