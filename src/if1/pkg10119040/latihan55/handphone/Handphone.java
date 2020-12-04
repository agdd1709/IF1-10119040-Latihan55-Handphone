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
public class Handphone {
   protected String manufacture,operatingsystem,model;
   protected int harga;

    public Handphone(String manufacture, String operatingsystem, String model, int harga) {
        this.manufacture = manufacture;
        this.operatingsystem = operatingsystem;
        this.model = model;
        this.harga = harga;
    }
   public void displayproduct(){
       System.out.println("Manufaktur : "+this.manufacture );
       System.out.println("OS : "+this.operatingsystem);
       System.out.println("Model : "+this.model);
       System.out.println("Harga : "+this.harga);
   } 
}
