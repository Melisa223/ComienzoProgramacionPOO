/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04;

import Entidad4.Rectangulo;

/**
 *
 * @author Meli
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo opc1 = new Rectangulo();
        opc1.crearRectangulo();
        System.out.println("La superficie del rectángulo es: "+ opc1.Superficie());
        System.out.println("El perimetro del rectángulo es: "+ opc1.Perimetro());
        opc1.Dibujo();
    }
    
}
