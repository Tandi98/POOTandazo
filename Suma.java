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
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador=0;
        for (int i = 2; i <= 20; i+=2) {
            contador += i;
            System.out.println("La suma es "+contador);
        }
    }
    
}
