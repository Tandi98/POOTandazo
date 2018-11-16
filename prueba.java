/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 0;
        int b = 0;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        
        System.out.println("Ingrese el primer numero");
        a = new Scanner(System.in).nextInt();
        System.out.println("Ingrese el segundo numero");
        b = new Scanner(System.in).nextInt();
        
        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        division = a / b;
        
        System.out.println("Resultado de la suma es:" + suma);
        System.out.println("Resultado de la resta es:" + resta);
        System.out.println("Resultado de la multiplicacion es:" + multiplicacion);
        System.out.println("Resultado de la division es:" + division);
        
        
    
}
    }
