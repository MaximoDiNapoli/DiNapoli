package Animales;

import Animales.Animal;

import java.util.ArrayList;
import java.util.Date;



public class Tortuga extends Animal {
    private boolean esUnaTortuga;

    public Tortuga(String nombre, Date fechaDeNacimiento, int dniOwner, ArrayList<Date> fechasAtencion, boolean esUnaTortuga) {
        super(nombre, fechaDeNacimiento, dniOwner, fechasAtencion);
        this.esUnaTortuga = esUnaTortuga;
    }

    public boolean isEsUnaTortuga() {
        return esUnaTortuga;
    }

    public void setEsUnaTortuga(boolean esUnaTortuga) {
        this.esUnaTortuga = esUnaTortuga;
    }
}
