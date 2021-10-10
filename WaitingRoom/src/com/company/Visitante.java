package com.company;

public class Visitante {
    public String dni;
    public String nombre;
    public String apellido;
    public Integer year;
    public Boolean antecedentes;
    public Boolean violencia;



    public Visitante() {
    }

    public Visitante(String dni, String nombre, String apellido, Integer year, Boolean antecedentes, Boolean violencia) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.year = year;
        this.antecedentes = antecedentes;
        this.violencia = violencia;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + year +
                ", antecedentes=" + antecedentes +
                ", violencia=" + violencia +
                '}';
    }
}
