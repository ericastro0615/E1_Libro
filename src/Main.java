/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
        Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
        constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
        luego informar mediante otro método el número de ISBN, el título, el autor del libro y el numero de páginas
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println ("Ingrese los datos del libro: \n" +
                " - ISBN");
        String iSBN = leer.nextLine();
        System.out.println("Título: ");
        String titulo = leer.nextLine();
        System.out.println("Autor: ");
        String autor = leer.nextLine();
        System.out.println("numero de páginas: ");
        int numeroDePaginas = leer.nextInt();


        Libro l1 = new Libro(iSBN, titulo,  autor, numeroDePaginas );

        System.out.printf("El libro ingresado es: " + l1);



    }
}