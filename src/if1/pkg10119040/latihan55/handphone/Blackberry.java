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
public class Blackberry extends Handphone{
    private String pinbb;

    public Blackberry(String pinbb, String manufacture, String operatingsystem, String modal, int harga) {
        super(manufacture, operatingsystem, modal, harga);
        this.pinbb = pinbb;
    }

    public String getPinbb() {
        System.out.println("Pin : "+pinbb);
        System.out.println("");
        return pinbb;
    }

    public void setPinbb(String pinbb) {
        this.pinbb = pinbb;
    }
}
