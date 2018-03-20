package Zad1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kacper2
 */
public class Zad17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a=0,b=0;
     boolean v = true;
     System.out.println("a = "+a+"b = "+b);
     if(a>0^b>0){System.out.println("xor wynik 1");}else{
         System.out.println("xor wynik 0");}
     a=1;
     System.out.println("a = "+a+"b = "+b);
     if(a>0^b>0){System.out.println("xor wynik 1");}else{
         System.out.println("xor wynik 0");}
     a=0;b=1;
     System.out.println("a = "+a+"b = "+b);
     if(a>0^b>0){System.out.println("xor wynik 1");}else{
         System.out.println("xor wynik 0");}
     a=1;
     System.out.println("a = "+a+"b = "+b);
     if(a>0^b>0){System.out.println("xor wynik 1");}else{
         System.out.println("xor wynik 0");}
    System.out.println("boolean v = "+v); 
    System.out.println("negacja v = "+!v);
     }
    }
    

