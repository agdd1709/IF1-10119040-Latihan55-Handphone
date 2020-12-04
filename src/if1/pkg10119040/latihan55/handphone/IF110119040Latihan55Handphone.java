/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan55.handphone;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program ini berisi program menenampilkan beberapa handphone
 * dengan metode pendekatan berbasis objek
 */
public class IF110119040Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int harga = 3000000;
        
        Android android = new Android("kay store",  "samsung", "Android", "Grand", 3000000);
        android.displayproduct();
        android.setKeystore("234ibfd3840fo");
        android.getKeystore();
        
        Blackberry blackberry = new Blackberry("pinbb", "BlackB","RIM" ,"Curve", 2000000);
        blackberry.displayproduct();
        blackberry.setPinbb("BHS249");
        blackberry.getPinbb();
        
        Windowsphone windowsphone = new Windowsphone("WP KEY", "Nokia","Win8" ,"Lumia", 1000000);
        windowsphone.displayproduct();
        windowsphone.setWpkeystore("UUUQIJWORJ");
        windowsphone.getWpkeystore();
    }
    
}
