package Animales;

import Animales.Animal;

import java.util.ArrayList;
import java.util.Date;


public class Gato extends Animal {
    private String razaGato;


    public Gato(String nombre, Date fechaDeNacimiento, int dniOwner, ArrayList<Date> fechasAtencion, String razaGato) {
        super(nombre, fechaDeNacimiento, dniOwner, fechasAtencion);
        this.razaGato = razaGato;
    }


    public String getRazaGato() {
        return razaGato;
    }

    public void setRazaGato(String razaGato) {
        this.razaGato = razaGato;
    }
}
