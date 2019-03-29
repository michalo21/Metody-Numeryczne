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
           if(wielomian[0] == 0){
               System.out.print("Zły wielomian");
               return;
           }
           
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
       int pomoc = n-1;
       for(int i = 0; i < n+1; i++,pomoc--){
         //System.out.print(nowyWielomian[i] + " ");
         if(i < n-1){
             if(i == 0 && nowyWielomian[0] >= 0 && nowyWielomian[0]!= 1){
                 System.out.print(nowyWielomian[i]+ "x^"+pomoc);
                 continue;
             }else if(i == 0 && nowyWielomian[0] == 1){
                 System.out.print("x^"+pomoc);
                 continue;
             }
             if(nowyWielomian[i]<0){
                 System.out.print(nowyWielomian[i] + "x^"+pomoc);
             }else{
                 System.out.print("+"+nowyWielomian[i] + "x^"+pomoc);
             }    
         }else if( i == n-1){
             if(nowyWielomian[i] >=0){
               System.out.print("+"+nowyWielomian[i] + " ");  
             }else{
               System.out.print(nowyWielomian[i]+ " ");
             }
         }else if( i == n){
             System.out.print("Reszta: " + nowyWielomian[i]+ " ");
         }
       }
       

       
    }
    
}
