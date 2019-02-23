/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horner;

import java.util.Scanner;

/**
 *
 * @author Arlen
 */
public class Horner {
    
    
    public static void main(String[] args) {       
       System.out.println("Wprowadź stopień wielomianu: ");
       Scanner czytacz = new Scanner(System.in);
       int n = czytacz.nextInt();
       System.out.println("Podaj wspolczynniki wielomianu (ostatnia to reszta): ");
       int[] wielomian = new int[n+1];
       int[] nowyWielomian = new int[n+1]; // na pozycji n ma reszte.
       for(int i = 0; i <n+1; i++){
           wielomian[i] = czytacz.nextInt();
       }
       System.out.println("Podaj pierwiastek dwumianu przez ktory chcesz podzielić wielomian: ");
       int x = czytacz.nextInt();
       System.out.println("System zaczyna liczyć...");
       for(int i = 0; i < n+1; i++){
           if(i == 0){
               nowyWielomian[i] = wielomian[i];
           }else{
               nowyWielomian[i] = (nowyWielomian[i-1] * x) + wielomian[i];
           }
       }
       
       
       System.out.println("Współczynnikami nowego wielomianu są: ");
       for(int i = 0; i < n+1; i++){
           if(i < n){
              System.out.print(nowyWielomian[i] + " ");
           }else{
              System.out.print("Reszta to: " + nowyWielomian[i] + " ");
           }
       }
       

       
    }
    
}
