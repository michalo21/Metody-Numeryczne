/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package falsi;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Arlen
 */
public class Falsi {

    public static double func(double x){ // metoda odpowiedzialna za wprowadzenie funkcji; trzeba samemu wklepać
        double func = x*x*x - 2*x*x - 4*x -7;
        return func;
    }
    public static double pocho(double x){ //rozrysowac i sprawdzic 
        double pocho = 3*x*x - 4*x - 4;
        return pocho;
    }
    public static double pocho2(double x){ // rozrysowac i sprawdzic 
        double pocho2 = 6*x - 4;
        return pocho2;
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
        if((func(a)*func(b) < 0)){
            double x2 = (a*func(b) - b*func(a))/(func(b)-func(a));
            przyblizenie.add(x2);
            int i = przyblizenie.size()-1;
            if((func(a)*func(przyblizenie.get(i))) >= 0){
                while(true){
                    x2 = (przyblizenie.get(i)*func(a) - a*func(przyblizenie.get(i))) / (func(a) - func(przyblizenie.get(i)));
                    if(abs(x2-przyblizenie.get(i-1)) <= e){ //sprawdzenie dokladności
                       przyblizenie.add(x2);
                       break;
                    }
                    else{
                       przyblizenie.add(x2);
                       i++;
                     } 
                }
            }else if((func(b)*func(przyblizenie.get(i))) >= 0){
                 while(true){
                    x2 = (przyblizenie.get(i)*func(b) - b*func(przyblizenie.get(i))) / (func(b) - func(przyblizenie.get(i)));
                    if(abs(x2-przyblizenie.get(i-1)) <= e){ //sprawdzenie dokladności
                       przyblizenie.add(x2);
                       break;
                    }
                    else{
                       przyblizenie.add(x2);
                       i++;
                     } 
                }    
            }
            else{}
        }else{
            System.out.print("Przedzial nie spelnia zalozen dla danej funkcji");
        }
              
        System.out.print("Szukany pierwiastek z przyblizeniem to: " + przyblizenie.get(przyblizenie.size()-1));

    
    }
    
}
//3.63240832283405