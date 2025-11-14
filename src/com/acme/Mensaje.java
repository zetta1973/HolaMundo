package com.acme;

import java.util.Scanner;

public class Mensaje {

  public String solicitaDatos(String mensaje){
    System.out.println(mensaje);
    Scanner scn = new Scanner(System.in);
    return scn.nextLine();
  }

  public void saludar(Persona persona) {
    System.out.printf("Hola %s %s, bienvenido a Java \n", persona.getNombre(), persona.getApellidos());
  }
}
