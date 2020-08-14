package Animales;

import java.util.ArrayList;
import java.util.Date;

public class Perro extends Animal {
    private String razaPerro;

    public Perro(String nombre, Date fechaDeNacimiento, int dniOwner, ArrayList<Date> fechasAtencion, String razaPerro) {
        super(nombre, fechaDeNacimiento, dniOwner, fechasAtencion);
        this.razaPerro = razaPerro;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }
}
