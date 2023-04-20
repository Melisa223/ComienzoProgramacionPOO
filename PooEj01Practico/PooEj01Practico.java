/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PooEjerciciosPracticos;

import Entidad.LibrosEj1;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class PooEj01Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese sus datos");
        System.out.print("Nombre:");
        String nombre = leer.nextLine();
        System.out.print("Apellido:");
        String apellido = leer.nextLine();
        System.out.print("Edad:");
        int edad = leer.nextInt();

        LibrosEj1 libro1 = new LibrosEj1();
        libro1.cargarLibro();
        libro1.mostrarLibro();

    }

}
