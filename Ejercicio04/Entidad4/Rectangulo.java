/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
4.	Crear una clase Rectángulo que modele rectángulos por medio de 
un atributo privado base y un atributo privado altura. La clase incluirá
un método para crear el rectángulo con los datos del Rectángulo dados por 
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por último, 
tendremos un método que dibujará el rectángulo mediante asteriscos usando la
base y la altura. Se deberán además definir los métodos getters, setters y 
constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package Entidad4;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura");
        this.altura = leer.nextInt();
    }
public double Superficie(){
    double superficie = base * altura;
    return superficie;
}

public double Perimetro(){
    double perimetro = (base + altura)*2;
    return perimetro;
}

public void Dibujo(){
    for (int i=0; i<base ; i++){
         for (int j=0; j<altura ; j++) {
             if (i>0&&i<base-1&&j>0&&j<altura-1){
                 System.out.print("  ");
             }else
                 System.out.print("* ");
         } 
           System.out.println("");
       }
}
}
