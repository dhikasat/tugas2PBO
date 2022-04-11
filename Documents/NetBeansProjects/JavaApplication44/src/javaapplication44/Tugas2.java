/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication44;
import java.util.Scanner;
/**
 *
 * @author MS-USER
 */
public class Tugas2
{

        static Scanner scan = new Scanner(System.in);

    static int input1;
    static int input2;
    static int menu;

public static void main(String[] args) {

    menu = scan.nextInt();
    switch(menu){
            case 1:
                Persegi p = new Persegi(scan.nextInt());
                System.out.println(p.rumusP());
                break;
            case 2:
                Segitiga s = new Segitiga(scan.nextInt(), scan.nextInt());
                System.out.println(s.rumusS());
                break;
            case 3:
                Lingkaran l = new Lingkaran(scan.nextInt());
                System.out.println(l.rumusL());
                break;
            default :
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
    }
}
    
class Persegi{
   static int sisi = Tugas2.input1;

   Persegi(int sisi){
      this.sisi = sisi;
   }

    int rumusP(){
       return sisi*sisi;
   }
}

class Segitiga{
   static int alas = Tugas2.input1;
   static int tinggi = Tugas2.input2;

   Segitiga(int alas, int tinggi){
      this.alas = alas;
      this.tinggi = tinggi;
   }

    int rumusS(){
       return alas*tinggi/2;
   }
}

class Lingkaran{
   int rad = Tugas2.input1;

   Lingkaran(int rad){
      this.rad = rad;
   }

    double rumusL(){
        double hasil;
       if (rad % 7 == 0){
              double phi = 22/7;
              hasil = phi*rad*rad;
          }else{
              double phi = 3.14;
              hasil= phi*rad*rad;
          }
        return (int)(double) hasil; 
    }
} 
