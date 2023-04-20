/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra5;

import java.util.Scanner;

/**
 *
 * @author Meli
 */

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    Scanner leer=new Scanner(System.in);
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }
    public void datos(){
        System.out.println("Ingrese su nombre:");
        this.nombre = leer.nextLine();
        System.out.println("Ingrese edad:");
        this.edad= leer.nextInt();
        System.out.println("Ingrese salario: ");
        this.salario= leer.nextDouble();
    }
    public void calcular_aumento(){
        if(edad > 30){
            salario = (salario + (salario * 0.10));    
        }else{
            salario = (salario +(salario * 0.05));
        }
        System.out.println("Su salario con aumento es:" +salario);
    }
    
  
}
