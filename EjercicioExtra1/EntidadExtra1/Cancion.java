/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
1.	Desarrollar una clase Cancion con los siguientes atributos: título y
autor. Se deberá́ definir además dos constructores: uno vacío que inicializa 
el título y el autor a cadenas vacías y otro que reciba como parámetros el 
título y el autor de la canción. Se deberán además definir los métodos getters 
y setters correspondientes.
 */
package EntidadExtra1;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public class Cancion {

    public String titulo;
    public String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void iniciarCancion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Título y el Autor de la canción: ");
        this.titulo = leer.nextLine();
        this.autor = leer.nextLine();
    }

    public void mostrarCancion() {
        System.out.println("El título de la canción es: " + titulo);
        System.out.println("El autor de la canción es: " + autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
