package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner readKeyboard = new Scanner(System.in);

    ArrayList<String> ingredientes = new ArrayList<>();
    ArrayList<Integer> cantidades = new ArrayList<>();
    Integer opcionMenu;

    String nombreIngrediente;
    Integer cantidadStock;
    String nombreIngredienteBuscado;
    Integer ingredienteMayorCantidad;

    do {
      System.out.println("----------------- Bienvenido. ¿Que deseas hacer? -----------------");
      System.out.println("1. Ingresar un ingrediente y su cantidad.");
      System.out.println("2. Buscar un ingrediente por nombre.");
      System.out.println("3. Mostrar el ingrediente con mayor cantidad.");
      System.out.println("4. Mostrar ingredientes con menos de 5 unidades.");
      System.out.println("5. Salir.");
      opcionMenu = readKeyboard.nextInt();
      readKeyboard.nextLine();

        switch (opcionMenu) {
          case 1:
            System.out.println("Digita el nombre del ingrediente:");
            nombreIngrediente = readKeyboard.nextLine();
            System.out.println("Ingresa la cantidad en stock del ingrediente: ");
            cantidadStock = readKeyboard.nextInt();
            readKeyboard.nextLine();
            //Push para inyectar los datos ingresados al arrayList
            ingredientes.add(nombreIngrediente);
            cantidades.add(cantidadStock);
            System.out.println("Agregado correctamente");
            break;

          case 2:
            System.out.println("Ingrese el nombre del ingrediente:");
            nombreIngredienteBuscado = readKeyboard.nextLine();
            ingredienteMayorCantidad = ingredientes.indexOf(nombreIngredienteBuscado);
            // Validamos la longitud que hay en el arreglo
            if (ingredienteMayorCantidad != -1) {
              System.out.println("Cantidad en stock de " + nombreIngredienteBuscado + ": " + cantidades.get(ingredienteMayorCantidad));
            } else {
              System.out.println("No se encontró el ingrediente");
            }
            break;

          case 3:
            if (ingredientes.isEmpty()) {
              System.out.println("No hay ingredientes disponibles");
            } else {
              int maxIndex = 0;
              for (int i = 1; i < cantidades.size(); i++) {
                if ( cantidades.get(i) > cantidades.get(maxIndex)) {
                  maxIndex = 1;
                }
              }
            System.out.println("El ingrediente con mayor cantidad es: " + ingredientes.get(maxIndex) + cantidades.get(maxIndex));
            }
            break;

          case 4:
            System.out.println("Los ingredientes con menos de 5 unidades son: ");
            boolean encontrado = false;
            for (int i = 0; i < cantidades.size(); i++) {
              if (cantidades.get(i) < 5) {
                System.out.println(ingredientes.get(i) + ": " + cantidades.get(i));
                encontrado = true;
              }
            }
            if (!encontrado) {
              System.out.println("Todos los ingredientes tienen 5 o más unidades");
            }
            break;

          case 5:
            System.out.println("Gracias, saliendo...");
            break;

          default:
            System.out.println("Ingrese una opción correcta");
        }
    } while (opcionMenu != 5);

  }
}