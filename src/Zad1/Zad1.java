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
public class Zad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a=3;
     a=a<<3;
     // a=3 czyli 0011 w dziesietnym
     // a<<3 czyli przesunięcie o 3 bity w lewo czyli po prawej dodane sa 3 zera
     // czyli a staje sie 0001 1000 a to w dziesietnym 24
     // jezeli a=-3 to stanie sie -24
     System.out.println(a);
     a=24;
     a=a>>3;
     // a>>3 dziala w odwrotny sposob 24 czyli 0001 1000 stanie sie rowne
     // 0011 czyli 3
     //jezeli przesunie sie zbyt wiele razy wynik bedzie rowny 0 poniewaz 0000
     // jezeli a=-24 to stanie sie -3
     System.out.println(a);
     a=-17;
     a=a>>>3;
     //w tym przypadku jezeli licza jest dodatnia to wyniki a=a>>3 i a=a>>>3
     // nie roznia sie, jezeli jest ujemna to jej zapis binarny wyglada tak
     // 1111 1111 1111 1111 1111 1111 1110 1111 a po przesunieciu tak
     // 0001 1111 1111 1111 1111 1111 1111 1101
     // dlatego po zamianie na dziesietna liczba jest taka wielka 
     System.out.println(a);
    }
    
}
