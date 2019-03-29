/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newton;

import java.util.Scanner;

/**
 *
 * @author Arlen
 */
public class Newton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Wprowadź ile węzłów chcesz wprowadzic: ");
       int x = sc.nextInt();
       System.out.println("Podaj wartości poszczególnych węzłów i wartosci funkcji dla wezla");
       double[] wezly = new double[x];
       double[] funkcje = new double[x];
       double[] ilorazy = new double[x]; // zawiera tylko rzedy ilorazow do wypisania
       for(int i = 0; i < x; i++){
           System.out.print("x" + i + ": ");
           wezly[i] = sc.nextDouble();
           System.out.print("f(x" + i + "): ");
           funkcje[i] = sc.nextDouble(); 
       }
       System.out.println("System liczy....");
       for(int i = 0; i < x; i++){
           ilorazy[i] = funkcje[i];    
       }
        for(int i = 1; i < x; i++){
           for(int j = x-1; j>=i; j--){
               ilorazy[j] = (ilorazy[j] - ilorazy[j-1])/(wezly[j] - wezly[j-i]);    
           }
       }
       System.out.print("Wypisanie N(x):  ");
       for(int i = 0; i <= x-1; i++){
           if(ilorazy[i] != 0 ){
             if(ilorazy[i] < 0){
                 System.out.print(ilorazy[i]*-1);
             }else{
                 System.out.print(ilorazy[i]);
             }
           for(int j = 0; j < i; j++){
               if(wezly[j]>=0){
                    System.out.print("(x-" + wezly[j] + ")");  
               }else{
                   System.out.print("(x+" + wezly[j]*-1 + ")");  
               }  
           }
           if(i < x-1){
                if(ilorazy[i+1]>=0 && ilorazy[i+1]!=0){
                    System.out.print(" + ");
                }else if(ilorazy[i+1]<0 && ilorazy[i+1]!=0){
                    System.out.print(" - ");
                }
                
           }else{
                System.out.print(" ");
           }
       }
       }     


    }
    
}
