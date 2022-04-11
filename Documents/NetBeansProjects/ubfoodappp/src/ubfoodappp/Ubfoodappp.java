/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubfoodappp;
import java.util.Scanner;
/**
 *
 * @author MS-USER
 */
public class Ubfoodappp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scan = new Scanner(System.in);
        
        
        DataMerchant.merc = DataMerchant.addMerchant(new Merchant ("Bakso Pak Sahid", "Bakso",8000));
        DataMerchant.merc = DataMerchant.addMerchant(new Merchant ("Nasgor Mblebes", "Nasi Goreng Jawa",10000));
        DataMerchant.merc = DataMerchant.addMerchant(new Merchant ("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi" ,10000));
        DataMerchant.showData();
        
        System.out.println("Masukkan Nama Merchant, Nama Produk, Harga Makanan : ");
        DataMerchant.merc = DataMerchant.addMerchant(new Merchant(scan.nextLine(), scan.nextLine(), scan.nextInt()));
        
        System.out.println();
        System.out.println("Merchant Berhasil Ditambahkan!");
        System.out.println();
        DataMerchant.updateMerchant();
    }
    
}
