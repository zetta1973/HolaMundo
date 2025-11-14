package com;

public record PersonalRegistro (String nombre, String apellidos){

  @Override
  public String toString() {
    return "PersonalRegistro{" +
        "nombre='" + nombre + '\'' +
        ", apellidos='" + apellidos + '\'' +
        '}';
  }
}
