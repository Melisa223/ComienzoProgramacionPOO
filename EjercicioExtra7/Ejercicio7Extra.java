/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra7;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Ejercicio7Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el lado 1");
        int lado1=leer.nextInt();
        System.out.println("Ingrese el lado 2");
        int lado2=leer.nextInt();
        
        Rectangulo Rectangulo1= new Rectangulo(lado1, lado2);       
        System.out.println("El área del rectágulo es: " +  Rectangulo1.Calcular_area());
        Rectangulo1.Dibujo();                     
    }    
}
