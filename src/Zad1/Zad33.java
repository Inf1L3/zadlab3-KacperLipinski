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
public class Zad33 {
    static int wynikr,wyniki;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
    Scanner  czytaj=new Scanner(System.in);
    System.out.println("Podaj podstawe");
      int podstawa=czytaj.nextInt();
      wynikr=podstawa;
      wyniki=podstawa;
      System.out.println("Podaj potege");
      int potega=czytaj.nextInt();
      iteracyjnie(podstawa,potega);
      rekurencyjnie(podstawa,potega);
      System.out.println("Iteracyjnie "+wyniki);
      System.out.println("Rekurencyjnie "+wynikr);
    }
  public static int iteracyjnie(int x, int n) {
    if(x==0){wyniki=0;return wyniki;}else if(n==0){wyniki=1;return wyniki;}else
    for(int f=0;f<n-1;f++)
    {
    wyniki=wyniki*x;    
    }return wyniki;
    }
    
    public static int rekurencyjnie(int x, int n) {
   if(x==0){wynikr=0;return wynikr;}else if(n==0){wynikr=1;return wynikr;}else if(n==1){return wynikr;}else wynikr=wynikr*x;return rekurencyjnie(x,--n);  
    }  
}
