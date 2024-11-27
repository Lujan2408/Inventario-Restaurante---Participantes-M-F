package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner readKeyboard = new Scanner(System.in);

    String[] nombreParticipantes = new String[10];

    String genero;
    Integer hombres = 0;
    Integer mujeres = 0;

    System.out.println("********** Bienvenido **********");
    System.out.println("********** Introduce los datos de los participantes **********");

    for (int i = 0; i < 10; i++) {
      System.out.println("Nombre del participante: " + (i + 1) + ": ");
      nombreParticipantes[i] = readKeyboard.nextLine();

      System.out.print("Ingrese el Género: ");
      genero = readKeyboard.nextLine().toLowerCase();
      // Validamos el genero
      if (genero.equals("masculino")) {
        hombres++;
      } else if (genero.equals("femenino")) {
        mujeres++;
      } else {
        System.out.println("Ingresa un Género Masculino o Femenino");
        break;
      }
    }

    System.out.println("*********************");
    System.out.println("Total de hombres: " + hombres);
    System.out.println("Total de mujeres: " + mujeres);
  }
}