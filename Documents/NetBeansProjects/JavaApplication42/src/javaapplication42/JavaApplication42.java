/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;
import java.util.Scanner;
/**
 *
 * @author MS-USER
 */
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo = scan.nextDouble();
        double setoran = scan.nextDouble();
        
        saldo(saldo, setoran);
    }
    
    public static void saldo (double saldo, double setoran){
        double formula = saldo + setoran - 7000;
        double saldoakhir = formula*5 / 10000;
        formula = formula + saldoakhir;
        
        System.out.print(formula);
    }
}
