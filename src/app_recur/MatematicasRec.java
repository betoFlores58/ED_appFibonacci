/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_recur;

/**
 *
 * @author aa524
 */
public class MatematicasRec {
    
    public static int FactorialR(int n)
    {
        int f=1;
        
        if(n==0 || n==1)
            return f;
        else
            f=n*FactorialR(n-1);
        return f;
            
        
    }
    
    public static double FactorialRDouble(double n)
    {
        double f=1;
        
        if(n==0 || n==1)
            return 1;
        else
            f=n*FactorialRDouble(n-1);
        return f;
        
    }

    public static void InvertirRec(int n)    
    {
        System.out.print(n%10+"--");
       
        if (n>=10)
            InvertirRec(n/10);
    }
    
     public static int SumatoriaRec(int n)
    {
        if(n==1)
            return 1;
        else
            return n+=SumatoriaRec(n-1);
    }
    
    public static int FibonacciRec (int n){
        
        int fib;
        if(n == 1 || n == 2)
        {
            return 1;
        }
        else
            fib = FibonacciRec(n-1)+FibonacciRec(n-2);
        return fib;
    }

}
