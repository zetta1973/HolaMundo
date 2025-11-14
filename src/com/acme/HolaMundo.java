package com.acme;

public class HolaMundo {

  public static void main(String[] args) {
    // Añadir un comentario para ver como esta el estado del merge
    Mensaje msg = new Mensaje();
    String nombre = msg.solicitaDatos("Escribe tu nombre: ");
    String apellidos = msg.solicitaDatos("Escribe tu apellidos: ");
    Persona p1 = new Persona(nombre, apellidos);
    msg.saludar(p1);
  }
}
