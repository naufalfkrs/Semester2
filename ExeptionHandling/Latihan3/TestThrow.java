/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author asus
 */
class AgeInvalid extends Exception{
    AgeInvalid(String s){
        super(s);
    }
}
public class TestThrow {
    static void validate(int age) throws AgeInvalid{
        if(age<18)
            throw new AgeInvalid("not valid ");
        else
            System.out.println("welcome to vote");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            validate(19);
        }catch(Exception i){
            System.out.println("Exception aktif: " + i);
        }
        System.out.println("rest ");
    }
    
}
