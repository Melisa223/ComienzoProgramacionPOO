/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Meli
 */
public final class LibrosEj1 {
    
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int NumeroDePagina;

    public LibrosEj1() {
    }

    public LibrosEj1(String ISBN, String Titulo, String Autor, int NumeroDePagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePagina = NumeroDePagina;
        cargarLibro();
        mostrarLibro();
    }
    

    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro");
        this.Titulo = leer.nextLine();
        System.out.println("Ingrese el autor del libro");
        this.Autor = leer.nextLine();
        System.out.println("Ingrese el ISBN del libro");
        this.ISBN = leer.nextLine();
        System.out.println("Ingrese el número de páginas");
        this.NumeroDePagina = leer.nextInt();

    }

    public void mostrarLibro(){
        System.out.println("El título del libro es: " + Titulo);
        System.out.println("El autor del libro es: " + Autor);
        System.out.println("El ISBN del libro es: " + ISBN);
        System.out.println("La cantidad de páginas del libro son: " + NumeroDePagina);
        
        
        
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroDePagina() {
        return NumeroDePagina;
    }

    public void setNumeroDePagina(int NumeroDePagina) {
        this.NumeroDePagina = NumeroDePagina;
    }

}
