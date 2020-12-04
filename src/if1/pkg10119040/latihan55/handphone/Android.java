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
public class Android extends Handphone{
    private String keystore;

    public Android(String keystore, String manufacture, String operatingsystem, String modal, int harga) {
        super(manufacture, operatingsystem, modal, harga);
        this.keystore = keystore;
    }
    
    public String getKeystore() {
        System.out.println("android Key Store : "+keystore);
        System.out.println("");
        return keystore;
    }

    public void setKeystore(String keystore) {
        this.keystore = keystore;
    }
}
