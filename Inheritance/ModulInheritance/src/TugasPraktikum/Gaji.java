/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author asus
 */
public class Gaji extends Identitas{
    public Gaji(){
        super();
    }

    private void printPerforma(String performa, int gaji) {
        System.out.println("gaji yang didapat jika bekerja secara "+performa+" menjadi "+gaji);
    }

    void gaji(String performa) {
        switch (performa){
            case "baik":
                printPerforma(performa, this.gaji*2);
                break;
            case "normal":
                printPerforma(performa, this.gaji);
                break;
            case "buruk":
                printPerforma(performa, this.gaji/2);
                break;
        }
    }
}
