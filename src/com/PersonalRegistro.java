package com;

public record PersonalRegistro (String nombre, String apellidos){

  @Override
  public String toString() {
    System.out.println("Esta instruccion es inservible");
    return "PersonalRegistro{" +
        "nombre='" + nombre + '\'' +
        ", apellidos='" + apellidos + '\'' +
        '}';
  }
}
