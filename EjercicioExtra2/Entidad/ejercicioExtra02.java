/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra2;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Pc2
 */
public class ejercicioExtra02 {
     private float x1;
     private float x2;
     private float y1;
     private float y2;
    Scanner leer = new Scanner(System.in);
    
    public ejercicioExtra02() {
    }

    public ejercicioExtra02(float x1, float x2, float y1, float y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }

    public void crearPuntos(){
        System.out.println("Ingrese la Coodernada X del punto 1");
        this.x1=leer.nextFloat();
        System.out.println("Ingrese la Coodernada Y del punto 1");
        this.y1=leer.nextFloat();
        System.out.println("Ingrese la Coodernada X del punto 2");
        this.x2=leer.nextFloat();
        System.out.println("Ingrese la Coodernada Y del punto 2");
        this.y2=leer.nextFloat();
 
    }
   public void distancia(){
     float dis = (float) Math.sqrt((Math.pow((x2-x1), 2)+(Math.pow((y2-y1), 2))));
       System.out.println("La distancia entre los puntos es "+dis);
     
   
   
   }   
    
     
     
     
    
    
}