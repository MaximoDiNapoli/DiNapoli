package Animales;

import java.util.ArrayList;
import java.util.Date;

public class Animal {
    private String nombre;
    private Date fechaDeNacimiento;
    private int dniOwner;
    private ArrayList<Date> fechasAtencion = new ArrayList<>();;


    public Animal(String nombre, Date fechaDeNacimiento, int dniOwner, ArrayList<Date> fechasAtencion) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.dniOwner = dniOwner;
        this.fechasAtencion = fechasAtencion;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getDniOwner() {
        return dniOwner;
    }

    public void setDniOwner(int dniOwner) {
        this.dniOwner = dniOwner;
    }

    public ArrayList<Date> getFechasAtencion() {
        return fechasAtencion;
    }

    public void setFechasAtencion(ArrayList<Date> fechasAtencion) {
        this.fechasAtencion = fechasAtencion;
    }
}

