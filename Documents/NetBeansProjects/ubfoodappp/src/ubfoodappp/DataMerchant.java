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
public class DataMerchant {
    static Scanner scan = new Scanner(System.in);
    static Merchant merc[] = new Merchant[0];
    
    public static Merchant[] addMerchant (Merchant merchant){
        Merchant[] newMerch = new Merchant[DataMerchant.merc.length+1];
        
        for(int i=0; i<DataMerchant.merc.length; i++){
            
            newMerch[i] = DataMerchant.merc[i];
            
        }
        newMerch[DataMerchant.merc.length] = merchant;
        
        return newMerch;
    }
    public static void showData(){
        for (Merchant mch1 : merc){
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama merchant : "+ mch1.getNamaMerchant());
            System.out.println("Nama Produk : "+ mch1.getNamaProduk());
            System.out.println("Harga : "+mch1.getHargaMakanan());
            
        }
    }
    public static Merchant searchMerchant(String NamaMerchant, String NamaProduk){
        for (Merchant merch : merc) {
            if (merch.getNamaMerchant().equals(NamaMerchant) || merch.getNamaProduk().equals(NamaProduk) ) 
                return merch;
        }
        return null;
    }
    public static void showMerchant(Merchant merchant){
        System.out.println("Nama merchant : "+ merchant.getNamaMerchant());
        System.out.println("Nama Produk : "+ merchant.getNamaProduk());
        System.out.println("Harga : "+ merchant.getHargaMakanan());
    }
    public static void updateMerchant(){
        for (Merchant mch1 : merc){
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama merchant : "+ mch1.getNamaMerchant());
            System.out.println("Nama Produk : "+ mch1.getNamaProduk());
            System.out.println("Harga : "+mch1.getHargaMakanan());
            
        }
    }

}