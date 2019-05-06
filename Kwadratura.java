/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwadratura;

import java.util.Scanner;

/**
 *
 * @author Arlen
 */
public class Kwadratura {

     public static double func(double x){ // metoda odpowiedzialna za wprowadzenie funkcji; trzeba samemu wklepać
        double func = 5*x*x*x*x  - 3*x*x + 2; 
        return func;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj poczatek przedziału: ");
        int a = sc.nextInt();
        System.out.print("Podaj koniec przedziału: ");
        int b = sc.nextInt();
        System.out.print("Podaj liczbe przedzaiłow n: ");
        int n = sc.nextInt();
        double h = (b-a)/(double)n;
        double sfpp = 0; // suma wartosci funkcji punktow przedzialowych
        double sfps = 0; // suma wartosci funkcjo w punkcie srodkowym przedzialu
        double x = 0;
        for(int i = 1; i < n; i++){
            x = a + i*h;  //punkt podzialowy xi
            sfps+=func(x - h/2); // suma wartosci funkcji w punktach srodkowych przedzialow
            sfpp+=func(x); // suma wartosci wunkcji w punktahc podzialowych xi   
        }
       sfps+=func(b - h/2);
       sfpp = h / 6*(func(a) + func(b) + 4*sfps + 2*sfpp);
       System.out.print("Wartosc calki dla podanej funkcji to: " + sfpp+ " ");
    }
}