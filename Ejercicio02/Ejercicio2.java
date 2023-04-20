
import Entidad2.Circunferencia;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    
 
package Ejercicio02;

/**
 *
 * @author Meli
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);       
        Circunferencia N1 = new Circunferencia();
        N1.crearCircunferencia();
        System.out.println("El área es: " + N1.area());
        System.out.println("El perimetro es: " + N1.perimetro());
        
        
}
}