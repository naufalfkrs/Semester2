/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

/**
 *
 * @author asus
 */
public class Test {
    public static void main(String[] args) {
        Bola Main = new Bola();

        double r = Main.setR(14d);
        System.out.println("Jari-jari : " +Main.getR());
        System.out.println("Diameter : "+Main.getD());
        System.out.println("Luas Permukaan: " +Main.getL());
        System.out.println("Volume Bola : " +Main.getV());
    }
}
