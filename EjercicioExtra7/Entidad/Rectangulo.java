/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
7.	Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2"
y un método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4
y 6 y imprime el área del rectángulo.
 */
package EjercicioExtra7;

/**
 *
 * @author Meli
 */
public class Rectangulo {
    private int lado1;
    private int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public double Calcular_area(){
    double area = lado1 * lado2;
    return area;
}
    public void Dibujo(){
    for (int i=0; i<lado1 ; i++){
         for (int j=0; j<lado2 ; j++) {
             if (i>0&&i<lado1-1&&j>0&&j<lado2-1){
                 System.out.print("  ");
             }else
                 System.out.print("* ");
         } 
           System.out.println("");
       }
    
    /*public void mostrar_rectangulito() {
        for (int i = 0; i < lado1; i++) {
            for (int j = 0; j < lado2; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }

    }*/
}   
}
