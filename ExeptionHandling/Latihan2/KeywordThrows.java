/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author asus
 */
public class KeywordThrows {
    public static void Nomor(int no)
        throws NullPointerException, java.lang.ArithmeticException{
        if (no < 0) {
            throw new NullPointerException(
                    "Error: null pointer");
        } else {
            throw new java.lang.ArithmeticException(
                    "Error: arithmetic exception");
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Nomor(16);
        } 
        catch (ArithmeticException|NullPointerException e) {
            System.err.println("Eksepsi ditangkap di sini...");
            System.err.println(e.getMessage());
        }
        System.err.println("***************************");
    }

}
