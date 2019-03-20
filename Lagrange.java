/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lagrange;

import java.util.Scanner;

/**
 *
 * @author Arlen
 */
public class Lagrange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Wprowadź ile węzłów chcesz wprowadzic: ");
       int n = sc.nextInt();
       System.out.println("Podaj wartości poszczególnych węzłów i wartosci funkcji dla wezla");
       double[] wezly = new double[n];
       double[] funkcje = new double[n];
       for(int i = 0; i < n; i++){
           System.out.print("x" + i + ": ");
           wezly[i] = sc.nextDouble();
           System.out.print("f(x" + i + "): ");
           funkcje[i] = sc.nextDouble(); 
       }
       System.out.print("Wprowadź dla jakiego argumentu x chcesz obliczyć jego wartość Interpolacja Lagranga: ");
       double x = sc.nextInt();
       double y = 0;
       double temp;
       System.out.print("System zaczyna liczyc....");
       for(int i = 0; i < funkcje.length; i++){
           temp = 1;
           for(int j = 0; j < wezly.length; j++){
               if(j!=i){
                   temp = temp*((x-wezly[j])/(wezly[i]-wezly[j]));
               }
           }
           y += temp*funkcje[i];
       }
       System.out.print("Wynik to: " + y);

       
       
       
       
    }
    
}
