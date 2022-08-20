/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author asus
 */
public class Anak extends Ayah{
    String nama = "Naufal";
    int umur = 15;
    
    public void setName(String nama){
        this.nama = nama;
    }
    
    public void cetak(){
        System.out.println("Anak ini punya sifat "+super.Sifat);
        System.out.println("yang bernama "+this.nama);
        System.out.println("berumur "+this.umur);
        System.out.println("dengan tinggi badan "+super.TB);
        super.hobi();
    }
}
