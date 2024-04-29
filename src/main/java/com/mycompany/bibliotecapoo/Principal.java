package com.mycompany.bibliotecapoo;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        Biblioteca libro = new Biblioteca();
        int opcion;

 // Complejidad temporal O(1)
do {
        System.out.println("Elige una opción: \n1: Ingresar libro \n2: Mostrar todos los libros \n3: Buscar libro \n4: Marcar libro como leído \n5: Mostrar libros no leídos \n6: Salir");
         opcion = e.nextInt();

// Complejidad temporal O(1)
        switch (opcion) {

            case 1:
            System.out.println("Ingrese titulo:");
            e.nextLine();
            String titulo= e.nextLine();
            System.out.println("Ingrese autor:");
            String autor= e.nextLine();
            System.out.println("Ingrese año de publicación:");
            int anoPublicacion = e.nextInt();
            System.out.println("Ingrese genero:");
            String genero = e.next();
            Libro libro1 = new Libro(titulo, autor, anoPublicacion, genero);
            libro.registrarLibro(libro1);
            break;

            case 2:
            libro.MostrarLibros();
            break;

            case 3:
            System.out.println("Ingresa el nombre del libro:");
            String palabrabusqueda = e.next();
            Libro libroEncontrado = libro.buscarLibro(palabrabusqueda);
            if (libroEncontrado != null) {
             System.out.println("Libro encontrado:");
             System.out.println("Título: " + libroEncontrado.getTitulo());
             System.out.println("Autor: " + libroEncontrado.getAutor());
        
        } else {
        System.out.println("El libro no fue encontrado.");
    }
            
            break;

            case 4:
            e.nextLine();
            System.out.println("Ingrese libro a marcar:");
            String tituloLibro = e.nextLine(); 
            Libro libroAMarcar = libro.buscarLibro(tituloLibro);
             if (libroAMarcar != null) {
            libroAMarcar.marcarLeido();
            System.out.println("El libro '" + tituloLibro + "' ha sido marcado como leído.");
            } else {
             System.out.println("El libro no fue encontrado.");
     }
            
            break;
            

            case 5:
    
            libro.mostrarLibrosnoLeidos();
            break;

            case 6:
                System.out.println("");
                break;

            default:
            System.out.println("Opción no valida");
            break;

            
        }
        
    } while (opcion != 6);
} 

} 