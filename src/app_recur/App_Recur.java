/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_recur;

import java.util.Scanner;

/**
 *
 * @author aa524
 */
public class App_Recur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
//        int fact=MatematicasRec.FactorialR(4);
//        System.out.println("Factorial de "+ 4+ " es: "+fact);

//        int n=1234;
//        MatematicasRec.InvertirRec(n);
        Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt();
        //System.out.printf("El Fibonacci de %d es: %d", n, MatematicasRec.FibonacciRec(n));
        
        //System.out.println(MatematicasRec.FibonacciRec(x));
        
        int n=4;
        int fib = MatematicasRec.FibonacciRec(n);
        System.out.println("Fibonacci de "+ n + " = " +fib);
    }
    
}
