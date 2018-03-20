/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad1;

/**
 *
 * @author Kacper2
 */
public class Zad22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String s1 = "aaaaaa";
        String s3 = "AAAAAA";
        String s5 = "aaa";
        String s6 = "    aaaaaa     ";        
//char[] toCharArray()-przemienia string na tablice char
System.out.println(s1.toCharArray());
//byte[] getBytes()-przemienia string na sekwencje bitow,uzywa zestawow znakow platformy i zapisuje je w tabeli bitowej
byte[] s2;
        s2 = s1.getBytes(); 
        for (int i = 0; i < s2.length; i++) {
            System.out.print(i + "." + s2[i] + " ");
        }
//boolean equals(String str)-porownoje 2 zmienne string, jezeli sa takie same zwraca wartosc true
boolean row;
        row = s1.equals(s3); 
        System.out.println(row);
//boolean equalsIgnoreCase(String str)-porownoje 2 zmienne string, ignoruje rozmiar liter
row = s1.equalsIgnoreCase(s3); 
        System.out.println(row);
//int campareTo(String str)-porownoje 2 zmienne string leksykograficznie
System.out.println(s1.compareTo(s3));//porownuje s1 do s2 i gdy znak sie rozni dodaje 1
//int campareToIgnoreCase(String str)-porownoje 2 zmienne string leksykograficznie, ignoruje rozmiar liter
System.out.println(s1.compareToIgnoreCase(s3));
//int indexOf(int i)-podaje numer indeksu w ktorym, pierwszy raz pojawila sie liczba i
System.out.println(s1.indexOf('m'));
//int indexOf(String str)-podaje numer indeksu w ktorym, pierwszy raz pojawil sie napis str
System.out.println(s1.indexOf('m', 1));
//int lastIndexOf(int i)-podaje numer indeksu w ktorym, ostatni raz pojawila sie liczba i
System.out.println(s1.lastIndexOf('a'));
//int lastIndexOf(String str)-podaje numer indeksu w ktorym, najbardziej po prawej pojawil sie napis str
System.out.println(s1.lastIndexOf('a', 3));
//String substring(int startString)-tworzy nowy string którego napis jest czescia orginalnego stringA
System.out.println(s5.substring(3));
//String substring(int startString, int stopString)-tworzy nowy string którego napis jest czescia orginalnego stringA
System.out.println(s5.substring(1, 3));
//String replace(char orginal, char zamiennik)-zmienia każdy wystepujacy w stringu orginal,na zmiennik
System.out.println(s1.replace('i', 'c'));
//trim
        System.out.println("- trim():\nprzed: " + s6);
        System.out.println("po: " + s6.trim());//usuwa nadmiar spacji przed i za lancuchem znakow
        //toLowerCase
        System.out.println(s1.toLowerCase());
        //toUpperCase
        System.out.println(s1.toUpperCase());
        //split
        String[] s1parts = s1.split("og");//Dzieli String na 2 czesci
        String p1 = s1parts[0];//czesc przed zadanymi znakami
        String p2 = s1parts[1];//czesc po zadanych znakach
        System.out.println(p1);
        System.out.println(p2);

    }
    
}
