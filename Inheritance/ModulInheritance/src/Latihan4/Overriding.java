/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author asus
 */
public class Overriding {
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar bangundatar=new BangunDatar();
        Persegi persegi = new Persegi();
        persegi.sisi = 8;
        
        PersegiPanjang perjang =new PersegiPanjang();
        perjang.lebar=11;
        perjang.panjang=2;

        bangundatar.luas();
        bangundatar.keliling();

        persegi.luas();
        persegi.keliling();

        perjang.luas();
        perjang.keliling();

    }
}
