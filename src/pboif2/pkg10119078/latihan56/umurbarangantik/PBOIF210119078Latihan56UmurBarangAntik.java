/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan56.umurbarangantik;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio r = new Radio(234);
        r.setName("Radio AM");
        System.out.println("Nama barang Antik : " + r.getName());
        r.tampilUmur();
    }
    
}
