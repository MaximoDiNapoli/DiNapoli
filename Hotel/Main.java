import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] argum) {
        //No cree una clase Hotel debido a que se trata de un solo hotel, en otro caso hubiera creado tal clase y puesto la mayor parte de este codigo como metodos
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        ArrayList<Huesped> todos = new ArrayList<>();
        int contador = 0;
        int edad;
        int dni;
        int estadias;
        int IDS = 0;
        Huesped mayor = new Huesped();
        ArrayList<Habitacion> todas = new ArrayList<>();
        Habitacion major = new Habitacion();
        todas = habitaciones;
        int sumatotal = 0;
        int abonaciones = 0;
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        int opcion2 = 0;
        int desocupadas = 0;
        int counter2 = 0;
        Scanner leer2 = new Scanner(System.in);
        String nombre;
        String apellido;
        System.out.println("Elija una opcion: " );
        System.out.println("1. ingresos totales" );
        System.out.println("2. estadias alargadas" );
        System.out.println("3. cambiar dia de salida de habitacion" );
        System.out.println("4. ingresar un paciente en una habitacion" );
        System.out.println("5. tiempo de instancia" );
        System.out.println("6. Los 6 paciente mas frecuentes" );
        System.out.println("7. que paciente esta en cada habitacion" );
        System.out.println("8. Tiempo ocupadas" );
        System.out.println("9. Las 6 habitaciones mas solicitadas");
        System.out.println("10. desocupadas y ocupadas");
        System.out.println("11. vaciar una habitacion" );
        System.out.println("12. precio a pagar por cada habitacion");
        System.out.println("0. Salir");
        int opcion3 = leer.nextInt();
        while(opcion3 != 0){

            switch (opcion3){
                
                case 1:
                    while (contador < habitaciones.size()){
                        sumatotal = sumatotal + habitaciones.get(contador).getTotalre();
                        contador = contador + 1;
                    }
                    contador = 0;
                    System.out.println("Ganancias : " + sumatotal);
                    break;
                case 2:
                    while(contador < habitaciones.size()){
                        if (habitaciones.get(contador).cantidaddias() > 30){
                            abonaciones = abonaciones + habitaciones.get(contador).getClientes().size();
                        }
                        contador = contador + 1;
                    }
                    System.out.println(abonaciones + " personas pagaron por una estadia alargada");
                    contador = 0;
                    break;


                case 3:
                    System.out.println("Que habitacion desea cambiar?");
                    opcion = leer.nextInt();
                    System.out.println("Cuantos dias desea agregar?");
                    opcion2 = leer.nextInt();
                    habitaciones.get(opcion).sumardias(opcion2);
                    break;
                case 4:
                    System.out.println("ingresar : Nombre, Apellido, Edad, DNI y el Tiempo que ha estado antes en el hostel.");
                    nombre = leer2.nextLine();
                    apellido = leer2.nextLine();
                    edad = leer.nextInt();
                    dni = leer.nextInt();
                    estadias = leer.nextInt();
                    Huesped nuevo = new Huesped(nombre, apellido, edad, dni, estadias);
                    System.out.println("ingresar : Fecha de ingreso y Fecha de egreso. En ese orden");
                    edad = leer.nextInt();
                    dni = leer.nextInt();
                    System.out.println("ingresar : La habitacion a ingresar el huesped");
                    IDS = leer.nextInt();
                    while(contador < habitaciones.size()){
                        if(habitaciones.get(contador).getID() == IDS - 1){
                            habitaciones.get(contador).setclientes2(nuevo);
                            habitaciones.get(contador).setFechaE(edad);
                            habitaciones.get(contador).setFechaS(dni);
                        }
                        contador = contador + 1;
                    }
                    contador = 0;
                break;
                case 5:
                    while(contador < habitaciones.size()){
                        while(counter2 < habitaciones.get(contador).getCapacidad()){
                            System.out.println(habitaciones.get(contador).getClientes().get(counter2).getNombre() + " " + habitaciones.get(contador).getClientes().get(counter2).getApellido() + " de DNI " + habitaciones.get(contador).getClientes().get(counter2).getDni() + " se quedara " + habitaciones.get(contador).cantidaddias() + " dias" + " en la habitacion numero " + habitaciones.get(contador).getID());
                            counter2 = counter2 + 1;
                        }
                        counter2 = 0;
                        contador = contador + 1;
                    }
                    contador = 0;
                    break;
                    
                case 6:
                    for(int i=0;i<(todos.size()-1);i++){
                        for(int j=i+1;j<todos.size();j++){
                            if(todos.get(i).getEstadias()>todos.get(j).getEstadias()){
                                mayor = todos.get(i);
                                todos.set(i,todos.get(j));
                                todos.set(j, mayor);

                            }
                        }
                    }
                    while(contador < 6){
                        System.out.println("El puesto numero " + (contador + 1) + ", con " + todos.get((todos.size() - 1) -(contador)).getEstadias() + " dias en estadia, es para " + todos.get((todos.size() - 1) -(contador)).getNombre() + " " + todos.get((todos.size() - 1) -(contador)).getApellido() + " con el DNI numero " + todos.get((todos.size() - 1) -(contador)).getDni());
                        contador = contador + 1;
                    }

                    contador = 0;
                    break;
                
                case 7:
                    System.out.println("Que habitacion? ingrese ID");

                    opcion = leer.nextInt();
                    opcion = opcion - 1;
                    while(contador < habitaciones.get(opcion).getClientes().size()){
                        System.out.println(habitaciones.get(opcion).getClientes().get(contador).getNombre() + " " + habitaciones.get(opcion).getClientes().get(contador).getApellido());
                        contador = contador + 1;
                    }
                    contador = 0;
                    if (habitaciones.get(opcion).getClientes().size() > 1){
                        System.out.println(" Estan en la habitacion");
                    }
                    else{
                        System.out.println(" Esta en la habitacion");
                    }
                    break;
                case 8:
                    while(contador < habitaciones.size()){
                        System.out.println("La habitacion numero " + habitaciones.get(contador).getID() + " estara ocupada desde " + habitaciones.get(contador).getFechaE() + " hasta " + habitaciones.get(contador).getFechaS());
                        contador = contador + 1;
                    }
                    contador = 0;
                    break;
                case 9:
                    for(int i=0;i<(todos.size()-1);i++){
                        for(int j=i+1;j<todas.size();j++){
                            if(todas.get(i).acta2()>todas.get(j).acta2()){
                                major = todas.get(i);
                                todas.set(i,todas.get(j));
                                todas.set(j, major);

                            }
                        }
                    }
                    while(contador < 6){
                        System.out.println("El puesto numero " + (contador + 1) + ", con " + todas.get((todas.size() - 1) -(contador)).acta2() + " dias en uso, es para la habitacion numero " + todas.get((todas.size() - 1) -(contador)).getID() );
                        contador = contador + 1;
                    }
                    contador = 0;
                    break;


                case 10:
                    while(contador < habitaciones.size()){
                        if(habitaciones.get(contador).cantidaddias() == 0){
                            desocupadas = desocupadas + 1;
                        }
                        contador = contador + 1;
                    }
                    contador = 0;
                    System.out.println("Hay " + desocupadas + " habitaciones desocupadas");
                    break;
                case 11:
                    System.out.println("Que habitacion desea vaciar?");
                    int opcion4 = leer.nextInt();
                    Huesped noo = new Huesped();
                    while(contador < habitaciones.size()){
                        if(habitaciones.get(contador).getID() == opcion4 - 1){
                            habitaciones.get(contador).vaciar();
                        }
                        contador = contador + 1;
                    }
                    contador = 0;
                break;
                case 12:
                    while(contador < habitaciones.size()){
                        habitaciones.get(contador).acta();
                        System.out.println("La habitacion numero " + habitaciones.get(contador).getID() + " debe pagar un total de " + habitaciones.get(contador).getTotalre());
                        contador = contador + 1;
                    }
                    contador = 0;
                    break;
            }
            if(opcion3 != 0) {
                System.out.println("Elija una opcion: " );
                System.out.println("1. ingresos totales" );
                System.out.println("2. estadias alargadas" );
                System.out.println("3. cambiar dia de salida de habitacion" );
                System.out.println("4. ingresar un paciente en una habitacion" );
                System.out.println("5. tiempo de instancia" );
                System.out.println("6. Los 6 paciente mas frecuentes" );
                System.out.println("7. que paciente esta en cada habitacion" );
                System.out.println("8. Tiempo ocupadas" );
                System.out.println("9. Las 6 habitaciones mas solicitadas");
                System.out.println("10. desocupadas y ocupadas");
                System.out.println("11. vaciar una habitacion" );
                System.out.println("12. precio a pagar por cada habitacion");
                System.out.println("0. Salir");
                int opcion3 = leer.nextInt();
            }
        }
    }
    
     /*

    Hola, DiNapoli!

    Bien por el trabajo realizado!

    Recordar:

    - a la hora de entregar todos los trabajos deben compilar
    - los métodos deben tener nombres donde sólo la primer palabra
      puede comenzar con minúscula. Luego, las demás palabras deben
      comenzar con mayúscula.
    - Tener cuidado con llamar a métodos que no están definidos.
    - Aplicar el concepto de alta cohesión en los métodos.
    - los nombres de las variables deben ser declarativas
     */
}
