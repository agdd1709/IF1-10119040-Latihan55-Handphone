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
public class Windowsphone extends Handphone {
    private String wpkeystore;

    public Windowsphone(String wpkeystore, String manufacture, String operatingsystem, String modal, int harga) {
        super(manufacture, operatingsystem, modal, harga);
        this.wpkeystore = wpkeystore;
    }

    public String getWpkeystore() {
        System.out.println("Wp Key Store : "+wpkeystore);
        System.out.println("");
        return wpkeystore;
    }

    public void setWpkeystore(String wpkeystore) {
        this.wpkeystore = wpkeystore;
    }
}
