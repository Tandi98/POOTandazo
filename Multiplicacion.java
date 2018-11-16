/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author andre
 */
public class Multiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c=2;
        for (int i = 2; i <= 20; i+=2) {
            c = c *i;
        }
        System.out.println("la multiplicacion de pares es: "+c);
    }
    
}
