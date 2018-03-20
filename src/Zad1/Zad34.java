/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad1;

import java.util.Scanner;

/**
 *
 * @author Kacper2
 */
public class Zad34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner  czytaj=new Scanner(System.in);
      System.out.println("Podaj który wyraz ciagu fibonacciego");
      int n=czytaj.nextInt();
      System.out.println(fibonacci(n));
    }
public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }    
}
