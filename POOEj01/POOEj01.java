/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEj01.pooej01;



import POOEj01.Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Scanner leerNum = new Scanner(System.in);
        Persona persona1 = new Persona();
        persona1.setNombre(leer.nextLine());
        persona1.setApellido(leer.nextLine());
        persona1.setDNI(leerNum.nextInt());
        persona1.setEdad(leerNum.nextInt());
        
        Persona persona2 = new Persona();
        persona2.setNombre(leer.nextLine());
        persona2.setApellido(leer.nextLine());
        persona2.setDNI(leerNum.nextInt());
        persona2.setEdad(leerNum.nextInt());
        
        System.out.println(persona1.getNombre()+ " " + persona1.getApellido());
        System.out.println(persona1.getDNI() + " " + persona1.getDNI());
        System.out.println(persona2.getNombre()+ " " + persona2.getApellido());
        System.out.println(persona2.getDNI() + " " + persona2.getDNI());
       
        
    } 
    
}
