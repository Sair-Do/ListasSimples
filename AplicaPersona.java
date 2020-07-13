package enunciado01;

import java.util.Scanner;

public class AplicaPersona {

    static Scanner teclado = new Scanner(System.in);
    static Lista lista = new Lista();
    static Nodo nodo;

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        int opcion;

        do {
            System.out.println("\n\nMenu de opciones");
            System.out.println("===========================================");
            System.out.println("[1] Insertar un Elemento a la Lista");
            System.out.println("[2] Mostrar los Elementos de la Lista");
            System.out.println("[3] Eliminar un Elemento ");
            System.out.println("==========================================");
            System.out.println("[0] Salir");

            System.out.println("Ingrese una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    ingreso();
                    break;
                case 2:
                    lista.mostrar();
                    break;
                case 3: 
                    lista.eliminar(opcion);
            }
        } while (opcion != 0);

    }

    static void ingreso() {
        String nom;

        System.out.println("Ingrese el nombre: ");
        nom = teclado.next();

        lista.agregarInicio(nom);

    }
}
