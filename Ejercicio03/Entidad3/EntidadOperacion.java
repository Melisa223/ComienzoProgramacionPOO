/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad3;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class EntidadOperacion {
    private int numero1;
    private int numero2;

    public EntidadOperacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public EntidadOperacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

 public void crearOperacion(){
     Scanner leerNum = new Scanner(System.in);
     System.out.println("Ingrese el primer número");
     this.numero1 = leerNum.nextInt();
     System.out.println("Ingrese el segundo número");
     this.numero2 = leerNum.nextInt();
     
 }   

 public int sumar(){
     return numero1 + numero2;   
 }
 
    
}
