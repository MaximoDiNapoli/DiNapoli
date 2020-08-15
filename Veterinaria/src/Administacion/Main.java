package Administacion;

import Animales.Animal;
import Animales.Perro;
import Animales.Gato;
import Animales.Tortuga;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static String verQueTipoDeAnimalTuvoMejorAtencionYearActual(ArrayList<Perro> perros, ArrayList<Gato> gatos, ArrayList<Tortuga> tortugas) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        int visitasPerros = 0;
        int visitasGatos = 0;
        int visitasTortugas = 0;
        Date inicioYear = new Date();
        try {
            inicioYear = ft.parse("2020-00-00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (int j = 0; j < perros.size(); j++) {
            for (int i = 0; perros.get(j).getFechasAtencion().size() > j; j++) {
                if (perros.get(i).getFechasAtencion().get(i).after(inicioYear)) {
                    visitasPerros = visitasPerros + 1;
                }
            }

        }
        if (gatos.size() > 1) {
            for (int j = 0; j < gatos.size(); j++) {
                for (int i = 0; gatos.get(j).getFechasAtencion().size() > j; j++) {
                    if (gatos.get(i).getFechasAtencion().get(i).after(inicioYear)) {
                        visitasGatos = visitasGatos + 1;
                    }
                }

            }
        }
        else {
            for (int j = 0; j < gatos.size(); j++) {
                if (gatos.get(j).getFechasAtencion().get(j).after(inicioYear)) {
                    visitasGatos = visitasGatos + 1;
                }
            }
        }
        if (tortugas.size() > 1) {
            for (int j = 0; j < tortugas.size(); j++) {
                for (int i = 0; tortugas.get(j).getFechasAtencion().size() > j; j++) {
                    if (tortugas.get(i).getFechasAtencion().get(i).after(inicioYear)) {
                        visitasTortugas = visitasTortugas + 1;
                    }
                }

            }
        }
        else {
            for (int j = 0; j < tortugas.size(); j++) {
                if (tortugas.get(j).getFechasAtencion().get(j).after(inicioYear)) {
                    visitasTortugas = visitasTortugas + 1;
                }
            }
        }
        /*for (int j = 0; j < tortugas.size(); j++) {
            for (int i = 0; tortugas.get(j).getFechasAtencion().size() > j; j++) {
                if (tortugas.get(i).getFechasAtencion().get(i).after(inicioYear)) {
                    visitasTortugas = visitasTortugas + 1;
                    }
                }
            }*/

        if (visitasPerros > visitasGatos && visitasPerros > visitasTortugas) {
            return "La raza que mas fue atendida este año fue:  Perro";
        }
        if (visitasGatos > visitasPerros && visitasGatos > visitasTortugas) {
            return "La raza que mas fue atendida este año fue:  Gato";
        }
        if (visitasTortugas > visitasPerros && visitasGatos < visitasTortugas) {
            return "La raza que mas fue atendida este año fue:  Tortugas";
        }
        return "Empate";
    }

    public static void verVisitasYearActualPorRaza(ArrayList<Perro> perros){
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        int dea = 0;
        Date inicioYear = new Date();
        try {
            inicioYear = ft.parse("2020-00-00");
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        ArrayList<Date> temp = new ArrayList<>();
        for (int i = 0; i < perros.size(); i++) {
            temp = perros.get(i).getFechasAtencion();
            for (int j = 0; j < temp.size(); j++) {
                if(temp.get(j).after(inicioYear)){
                    dea = dea + 1;
                }
            }
            if(dea < 4)System.out.println("La raza: "+perros.get(i).getRazaPerro()+ "  no cumple con las visitas");
            dea = 0;
        }
    }
        /*for (int i = 0; i < Agus.getFechasAtencion().size(); i++){
            if(Agus.getFechasAtencion().get(i).after(inicioYear)){
                dea = dea + 1;
            }
        }
        if(dea >= 4){
            System.out.println("La raza: "+Agus.getRazaPerro()+ " Cumple con las visitas");
            return true;
        }
        System.out.println("La raza: "+Agus.getRazaPerro()+ "no Cumple con las visitas");*/

    public static Date sumarDiasAFecha(Date inicioYearVar, int dias){
        if (dias==0) return inicioYearVar;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inicioYearVar);
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        return calendar.getTime();
    }

    public static boolean verVisitasDesdeQueNacio(Animal animalDesignado, int opcion){
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        int dea = 0;
        int dias;
        Date inicioYearVar = new Date();
        try {
            inicioYearVar = animalDesignado.getFechaDeNacimiento();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < animalDesignado.getFechasAtencion().size(); i++) {
            inicioYearVar = sumarDiasAFecha(inicioYearVar, 365);
            for (int j = 0; j < animalDesignado.getFechasAtencion().size(); j++){
                if(animalDesignado.getFechasAtencion().get(j).before(inicioYearVar)){
                    dea = dea + 1;
                }
            }
            if(dea < 4 && opcion == 1) {System.out.println("No");return false;}
            if(dea < 2 && opcion == 2) {System.out.println("No");return false;}
            if(dea < 1 && opcion == 3) {System.out.println("No");return false;}
            dea = 0;
        }

        System.out.println("Si");
        return true;

    }
    public static boolean verVisitasYearActual(Animal animalDesignado, int opcion){
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        int dea = 0;
        Date inicioYear = new Date();
        try {
            inicioYear = ft.parse("2020-00-00");
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        for (int i = 0; i < animalDesignado.getFechasAtencion().size(); i++){
            if(animalDesignado.getFechasAtencion().get(i).after(inicioYear)){
                dea = dea + 1;
            }
        }
        if(dea >= 4 && opcion == 1){
            System.out.println("Este year realizo todas las consultas necesarias");
            return true;
        }
        else if(dea < 4 && opcion == 1){
            System.out.println("Este year no realizo todas las consultas necesarias");
            return false;
        }
        if(dea >= 2 && opcion == 2){
            System.out.println("Este year realizo todas las consultas necesarias");
            return true;
        }
        else if(dea < 2 && opcion == 2){
            System.out.println("Este year no realizo todas las consultas necesarias");
            return false;
        }
        if(dea >= 1 && opcion == 3){
            System.out.println("Este year realizo todas las consultas necesarias");
            return true;
        }
        else if(dea < 1 && opcion == 3){
            System.out.println("Este year no realizo todas las consultas necesarias");
            return false;
        }
        return false;
    }
    public static void main(String[] argum) {
        Main main = new Main();
        ArrayList<Date> fechasAtencionAgus = new ArrayList<>();
        ArrayList<Date> fechasAtencionChicho = new ArrayList<>();
        ArrayList<Date> fechasAtencionHongui = new ArrayList<>();
        ArrayList<Date> fechasAtencionPancha = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();
        ArrayList<Gato> gatos = new ArrayList<>();
        ArrayList<Tortuga> tortugas = new ArrayList<>();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimientoAgus = new Date();
        Date fechaNacimientoChicho = new Date();
        Date fechaNacimientoHongui = new Date();
        Date fechaNacimientoPancha = new Date();
        try {
            fechaNacimientoAgus = ft.parse("2019-03-10");
            fechaNacimientoChicho = ft.parse("2019-03-10");
            fechaNacimientoHongui = ft.parse("2018-03-10");
            fechaNacimientoPancha = ft.parse("2008-03-10");
            fechasAtencionAgus.add(ft.parse("2020-03-10"));
            fechasAtencionAgus.add(ft.parse("2020-04-10"));
            fechasAtencionAgus.add(ft.parse("2019-04-10"));
            fechasAtencionAgus.add(ft.parse("2019-04-10"));
            fechasAtencionAgus.add(ft.parse("2019-04-10"));
            fechasAtencionAgus.add(ft.parse("2019-04-10"));
            fechasAtencionAgus.add(ft.parse("2020-06-10"));
            fechasAtencionAgus.add(ft.parse("2020-07-10"));

            fechasAtencionChicho.add(ft.parse("2020-03-10"));

            fechasAtencionHongui.add(ft.parse("2019-03-10"));
            fechasAtencionHongui.add(ft.parse("2018-03-10"));
            fechasAtencionHongui.add(ft.parse("2020-03-10"));
            fechasAtencionHongui.add(ft.parse("2019-06-20"));
            fechasAtencionHongui.add(ft.parse("2018-09-11"));
            fechasAtencionHongui.add(ft.parse("2019-04-12"));
            fechasAtencionHongui.add(ft.parse("2020-03-10"));
            fechasAtencionHongui.add(ft.parse("2020-01-10"));

            fechasAtencionPancha.add(ft.parse("2010-01-10"));
            fechasAtencionPancha.add(ft.parse("2011-01-10"));
            fechasAtencionPancha.add(ft.parse("2012-01-10"));
            fechasAtencionPancha.add(ft.parse("2013-01-10"));
            fechasAtencionPancha.add(ft.parse("2014-01-10"));
            fechasAtencionPancha.add(ft.parse("2015-01-10"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Perro agus = new Perro("agus", fechaNacimientoAgus, 1, fechasAtencionAgus, "Bugeldog");
        Perro chicho = new Perro("chicho", fechaNacimientoAgus, 4, fechasAtencionChicho, "salchicha");
        Gato hongui = new Gato("hongui", fechaNacimientoHongui, 2, fechasAtencionHongui, "Mestizo");
        Tortuga pancha = new Tortuga("pancha", fechaNacimientoPancha, 3, fechasAtencionPancha, true);
        perros.add(agus);
        perros.add(chicho);
        gatos.add(hongui);
        tortugas.add(pancha);

        System.out.println("Que animal es? " +
                "1:Perro      " +
                "2:Gato       " +
                "3:Tortuga    ");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();
        Animal animalDesignado = chicho;
        verVisitasYearActual(animalDesignado, opcion);
        verVisitasDesdeQueNacio(animalDesignado, opcion);
        verVisitasYearActualPorRaza(perros);
        System.out.println(verQueTipoDeAnimalTuvoMejorAtencionYearActual(perros, gatos, tortugas));
    }

}
