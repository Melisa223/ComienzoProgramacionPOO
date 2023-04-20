/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExtra4;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
    public class Cuenta {

    private int saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void presentacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del titlar: ");
        titular = leer.nextLine();
        saldo = (int) (Math.random() * 1000000000);
        System.out.println(saldo);
    }

    public void retirar_dinero() {
         String respuesta; 
        do {
            int retiro;
            Scanner leer = new Scanner(System.in);
            System.out.println("Cuanto dinero quiere retirar?: ");
            retiro = leer.nextInt();
            if (saldo > 0 && retiro < 100000) {
                this.saldo = saldo - retiro;
                System.out.println("Su saldo actual es: " + saldo);
            }else {
                System.out.println("Excedio su limite de retiro" );
            }
             System.out.println("Desea continuar retirando dinero? S/N");
             respuesta = leer.next();
        } while (respuesta != "S");  
    }

}

