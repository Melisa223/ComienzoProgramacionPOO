package EjercicioExtra3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class EjercicioExtra3 {

    public EjercicioExtra3() {
    }
    private int numero;

    public EjercicioExtra3(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void iniciar_juego() {

        Scanner leer = new Scanner(System.in);

        int veces;
        int chance;
        String op;
        int x = 1;
        do {
            x++;
            System.out.println("Jugador numero " + ((x % 2) + (+1)) + " Ingrese un numero: ");
            numero = leer.nextInt();
            System.out.println("Jugador numero " + ((x % 2) + (+1)) + ": Ingrese la cantidad de veces que puede adivinar: ");
            veces = leer.nextInt();
            x++;
            for (int i = 0; i < veces; i++) {
                System.out.println("Jugador numero " + ((x % 2) + (+1)) + " Ingrese numero: ");
                chance = leer.nextInt();
                if (chance == numero) {
                    System.out.println("Usted a ganado :) en " + (i + 1) + " intentos.");
                    break;
                } else if (chance < numero) {
                    System.out.println("Mas alto");
                } else {
                    System.out.println("Mas bajo");
                }
            }
            x++;
            System.out.println("Quiere seguir jugando? S/N");
            op = leer.next();
            op = op.toUpperCase();
        } while (op.equals("S"));
    }

}