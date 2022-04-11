/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40;
import java.util.Scanner;
/**
 *
 * @author MS-USER
 */
public class Tugas1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
        
        int pilih = scan.nextInt();
        switch (pilih) {
            case 1:
                int sisi = scan.nextInt();
                
                System.out.println(luas(sisi));
            break;
            case 2:
                int alas   = scan.nextInt();
                int tinggi = scan.nextInt();
   
                System.out.println(luas(alas, tinggi));
            break;
            case 3:
                int jarijari = scan.nextInt();
                
                System.out.println(luaslingkaran(jarijari));
            break;
                
            default :
                System.out.println("Input yang anda masukan tidak sesuai");
            break;
        }
    }
    
    public static int luas(int sisi) {

        return sisi*sisi;
    }
    public static int luas(int alas, int tinggi) {
        int luassegitiga = (alas*tinggi)*1/2;
        return luassegitiga;
    }
    public static double luaslingkaran(int jarijari) {
        double luaslingkaran;
          if(jarijari%7 == 0){
                    luaslingkaran = 22/7*(jarijari*jarijari);
                }else {
                    luaslingkaran = 3.14*(jarijari*jarijari);
                }
        return (double)(int)luaslingkaran;
    }
}
