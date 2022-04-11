/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubfoodappp;

/**
 *
 * @author MS-USER
 */
public class Merchant {
    private String NamaMerchant;
    private String NamaProduk;
    private int HargaMakanan;
    
    //CONSTRUCTOR
    Merchant(String NamaMerchant, String NamaProduk, int HargaMakanan){
        this.NamaMerchant = NamaMerchant;
        this.NamaProduk = NamaProduk;
        this.HargaMakanan = HargaMakanan;
    }
    
    //GETTER
    public String getNamaMerchant(){
        return NamaMerchant;
    }
    public String getNamaProduk(){
        return NamaProduk;
    }
    public int getHargaMakanan(){
        return HargaMakanan;
    }
    //SETTER
    public void setNamaMerchant(String NamaMerchant){
        this.NamaMerchant = NamaMerchant;
    }
    public void setNamaProduk(String NamaProduk){
        this.NamaProduk = NamaProduk;
    }
    public void setHargaMakanan(int HargaMakanan){
        this.HargaMakanan = HargaMakanan;
    }
    
    
}
