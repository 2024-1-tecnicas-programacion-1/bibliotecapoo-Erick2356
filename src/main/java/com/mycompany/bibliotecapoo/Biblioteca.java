package com.mycompany.bibliotecapoo;


import java.util.LinkedList;

public class Biblioteca {
    private LinkedList <Libro> Libros;
   
    // Complejidad temporal O(1)
    public Biblioteca() {
        this.Libros = new LinkedList<>();
    }

   
// Complejidad temporal O(1)
    public void registrarLibro (Libro newlibro){

        Libros.add(newlibro);
      
       
    }

// Complejidad temporal O(N)
    public Libro buscarLibro(String palabrabusqueda){

        for (Libro r: Libros){
            if (r.getTitulo().equalsIgnoreCase(palabrabusqueda) || r.getAutor().equalsIgnoreCase(palabrabusqueda) || r.getGenero().equalsIgnoreCase(palabrabusqueda)){

                return r;

            }
            
                

        }
        return null;

    }
// Complejidad temporal O(N)
    public void MostrarLibros (){

        for(Libro r:Libros) {
            System.out.println("Título: " + r.getTitulo());
            System.out.println("Autor: " + r.getAutor());
            System.out.println();
        }


    }

// Complejidad temporal O(N)
    public void mostrarLibrosnoLeidos (){

      for (int i=0; i < Libros.size(); i++) {
        if (Libros.get(i).getLeido()==false) {
            System.out.println(Libros.get(i));
            
        }

      }

    }


    
}