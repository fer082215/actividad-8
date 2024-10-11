//Fernanda Morales  10/10/2024
//Clase que crea perros e invoca 2 métodos

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner para leer entradas del teclado

        //-----Captura de atributos de cada perro. Aquí se crean los 2 perros-----
        //Creación del perrito 1 (p1)
        Perro p1 = new Perro();
        //Atributos de p1
        System.out.println("Ingresa el nombre del perro 1: ");
        p1.setNombre(sc.nextLine());
        System.out.println("Ingresa la raza del perro 1: ");
        p1.setRaza(sc.nextLine());
        System.out.println("Ingresa el color del perro 1: ");
        p1.setColor(sc.nextLine());
        System.out.println("Ingresa la edad del perro 1 (en años, si es menor a 1, ingrese 0): ");
        p1.setEdad(sc.nextByte());
        System.out.println("Ingresa el peso del perro 1 (en kg): ");
        p1.setPeso(sc.nextDouble());
        sc.nextLine();

        //Creación del perrito 2 (p2)
        Perro p2 = new Perro();
        //Atributos de p2
        System.out.println("Ingresa el nombre del perro 2: ");
        p2.setNombre(sc.nextLine());
        System.out.println("Ingresa la raza del perro 2: ");
        p2.setRaza(sc.nextLine());
        System.out.println("Ingresa el color del perro 2: ");
        p2.setColor(sc.nextLine());
        System.out.println("Ingresa la edad del perro 2 (en años, si es menor a 1, ingrese 0): ");
        p2.setEdad(sc.nextByte());
        System.out.println("Ingresa el peso del perro 2 (en kg): ");
        p2.setPeso(sc.nextDouble());

        //Invocación de métodos para cada perro (objeto)
        p1.comer("croquetas", 100);
        System.out.println(p1.ladrar());

        p2.comer("verdura", 50);
        System.out.println(p2.ladrar());

    }
}