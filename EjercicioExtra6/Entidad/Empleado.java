/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
6.	Crea una clase "Empleado" que tenga atributos como "nombre", "edad" 
y "salario". Luego, crea un método "calcular_aumento" que calcule el aumento 
salarial de un empleado en función de su edad y salario actual. El aumento
salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si 
tiene menos de 30 años.
 */
package EjercicioExtra6;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Empleado {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private int edad;
    private float salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public void crearEmpleado(){
        System.out.println("Ingrese el nombre del empleado: ");
        this.nombre= leer.nextLine();
        System.out.println("Ingrese la edad: ");
        this.edad= leer.nextInt();
        System.out.println("Ingrese el salario: ");
        this.salario= leer.nextFloat();
            
    }
    
    public void calcular_aumento(){
        if (edad<30) {
            this.salario = (float)(salario * 1.05);         
        } else 
            this.salario = (float) (salario * 1.10);
        
        System.out.println("El salario con el aumento es: " + (float)(Math.round(salario)*100)/100);
    }
    
    
}

