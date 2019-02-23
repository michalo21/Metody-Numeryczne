/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siecznych;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Arlen
 */
public class Siecznych {

    public static double func(double x){ // metoda odpowiedzialna za wprowadzenie funkcji; trzeba samemu wklepać
        double func = x*x*x - 2*x*x - 4*x -7;
        return func;
    }
    
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Podaj krańce przedzaiału <a,b>");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.print("Podaj dokładność przybliżenia: ");
        double e = sc.nextDouble();
        List<Double> przyblizenie = new ArrayList<>();
        przyblizenie.add(a);
        przyblizenie.add(b);
        int i = 1;
        if(func(a)*func(b) < 0){
        while(true) // zalozenia do siecznych
           {
            double x2 = przyblizenie.get(i) - ( (func(przyblizenie.get(i)) * (przyblizenie.get(i)-przyblizenie.get(i-1))) / ( func(przyblizenie.get(i)) - func(przyblizenie.get(i-1))));
            if(abs(x2-przyblizenie.get(przyblizenie.size()-1)) <= e){ //sprawdzenie dokladności
                przyblizenie.add(x2);
                break;
           }
            else{
                przyblizenie.add(x2);
                i++;
           }
        }}
        else{}
        System.out.println("Ilość przyblizne: " + przyblizenie.size());
        System.out.print("Szukany pierwiastek z przyblizeniem to: " + przyblizenie.get(przyblizenie.size()-1));
    }
    
}
