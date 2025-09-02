package fes.aragon.modelo;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private int[] arreglo;
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void iniciarPrograma() {
        ingresarArreglo();

        int opcion;
        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Buscar número en el arreglo");
            System.out.println("2. Ingresar nuevo arreglo");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    buscarNumero();
                    break;
                case 2:
                    ingresarArreglo();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }

    private void ingresarArreglo() {
        System.out.println( "\n\t\tBusqueda lineal");
        System.out.print("\n¿De cuántos elementos será el arreglo?: ");
        int n = scanner.nextInt();
        arreglo = new int[n];
        System.out.println("Ingresa los " + n + " elementos:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        System.out.println("Arreglo actual: " + Arrays.toString(arreglo));
    }

    private void buscarNumero() {
        System.out.print("Ingresa el número a buscar: ");
        int valor = scanner.nextInt();
        int[] resultado = Bl.busquedaLineal(arreglo, valor);

        if (resultado[0] != -1) {
            System.out.println("El número " + valor + " se encontró en la posición " + resultado[0]);
        } else {
            System.out.println("El número " + valor + " no está en el arreglo.");
        }
        System.out.println("Número de comparaciones realizadas: " + resultado[1]);
    }
}
