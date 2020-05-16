package sistemas.administracion;
import java.util.ArrayList;
import humanos.Paciente;


public class Hospital {
    private int numeroDeCamasTotal;
    private String nombreHospital;
    private ArrayList<Paciente> pacientesPorAtender;
    private ArrayList<Paciente> pacientesSiendoAtendidosActualmente;
    private ArrayList<Paciente> pacientesAtendidos;
    private ArrayList<Paciente> doctoresAtendiendoPacientes;
    
    public Hospital(){
        this.numeroDeCamasTotal = 316;
        this.nombreHospital = "Hospital lopital";
        this.pacientesPorAtender = new ArrayList<>();
        this.pacientesSiendoAtendidosActualmente = new ArrayList<>();
        this.pacientesAtendidos = new ArrayList<>();
        this.doctoresAtendiendoPacientes = new ArrayList<>();
    }

    public int getNumeroDeCamasTotal() {
        return numeroDeCamasTotal;
    }

    public void setNumeroDeCamasTotal(int numeroDeCamasTotal) {
        this.numeroDeCamasTotal = numeroDeCamasTotal;
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public ArrayList<Paciente> getPacientesPorAtender() {
        return pacientesPorAtender;
    }

    public void setPacientesPorAtender(ArrayList<Paciente> pacientesPorAtender) {
        this.pacientesPorAtender = pacientesPorAtender;
    }

    public ArrayList<Paciente> getPacientesSiendoAtendidosActualmente() {
        return pacientesSiendoAtendidosActualmente;
    }

    public void setPacientesSiendoAtendidosActualmente(ArrayList<Paciente> pacientesSiendoAtendidosActualmente) {
        this.pacientesSiendoAtendidosActualmente = pacientesSiendoAtendidosActualmente;
    }

    public ArrayList<Paciente> getPacientesAtendidos() {
        return pacientesAtendidos;
    }

    public void setPacientesAtendidos(ArrayList<Paciente> pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }

    public ArrayList<Paciente> getDoctoresAtendiendoPacientes() {
        return doctoresAtendiendoPacientes;
    }

    public void setDoctoresAtendiendoPacientes(ArrayList<Paciente> doctoresAtendiendoPacientes) {
        this.doctoresAtendiendoPacientes = doctoresAtendiendoPacientes;
    }
    public int pacientesAtendidosTotal(){
        return this.pacientesAtendidos.size();
    }

    public String nombreApellidoEdadPacientesAtendidosActualmente(){
        String nombreApellidoEdadPacientesAtendidosActualmenteString = "";
        for (int i = 0; i < pacientesSiendoAtendidosActualmente.size(); i++){
            Paciente persona  = this.pacientesAtendidos.get(i);
            String DatosPaciente = persona.getNombreyapellido();
            DatosPaciente += persona.getEdad();
            nombreApellidoEdadPacientesAtendidosActualmenteString += DatosPaciente;
        }
    return nombreApellidoEdadPacientesAtendidosActualmenteString;
    }
    public void agregarPacientePorAtender(Paciente pacientePorAtender){
        this.pacientesPorAtender.add(pacientePorAtender);
    }
    public void eliminarPacientesPorAtender(){
        for (int i = 0; i < this.pacientesAtendidos.size(); i++) {
            Paciente pacienteAtendido = this.pacientesAtendidos.get(i);
            for (int j = 0; j < this.pacientesPorAtender.size(); j++) {
                Paciente pacientePorAtender = this.pacientesPorAtender.get(j);
                if (pacientePorAtender.esIgualA(pacienteAtendido)){
                    this.pacientesPorAtender.remove(pacientePorAtender);
                }
            }
        }
    }
    public void agregarPacientesAtendidosTotal(Paciente personaPorAtender){
        this.pacientesAtendidos.add(personaPorAtender);
    }

    public int numeroDeCamasDisponibles(){
        int numeroDeCamasDisponiblesTotal = getNumeroDeCamasTotal();
        int pacientesUsandoCamasActualmente =  getPacientesSiendoAtendidosActualmente().size();
        int numeroDeCamasDisponibles = numeroDeCamasDisponiblesTotal - pacientesUsandoCamasActualmente;
        return numeroDeCamasDisponibles;
    }
    public static void main(String[] args) {


        //3 instancias
        Paciente p1 = new Paciente();
        Paciente p2 = new Paciente();
        Paciente p3 = new Paciente();

        System.out.println("-------------------------------------------");
        System.out.println("datos del paciente1");
        System.out.println("nombre: " + p1.getNombreyapellido());
        System.out.println("edad: " + p1.getEdad());
        System.out.println("dni: " + p1.getDni());
        System.out.println("tel.: " + p1.getTelefono());
        System.out.println("dirección: " + p1.getDireccion());
        System.out.println("-------------------------------------------");
        System.out.println("datos del paciente2");
        System.out.println("nombre: " + p2.getNombreyapellido());
        System.out.println("edad: " + p2.getEdad());
        System.out.println("dni: " + p2.getDni());
        System.out.println("tel.: " + p2.getTelefono());
        System.out.println("dirección: " + p2.getDireccion());
        System.out.println("-------------------------------------------");
        System.out.println("datos del paciente3");
        System.out.println("nombre: " + p3.getNombreyapellido());
        System.out.println("edad: " + p3.getEdad());
        System.out.println("dni: " + p3.getDni());
        System.out.println("tel.: " + p3.getTelefono());
        System.out.println("dirección: " + p3.getDireccion());

    }
}
/*Comentarios generales de la actividad
    .Me parece un poco contra intuitivo la poo ya que me acostumbre mucho a la programacion estructurada del año anterior(cosas como que ahora no le tengo que pasar las "variables" a la funcion sino que son globales)
    .Intente hacer un archivo main separado pero tuve muchos problemas en un momento llegue a tener 23 errores y cuando lo hice en hospital.java me quede con solo 3 y no termine de entender que hice tan mal
    .demaciadas variables para mi gusto la verdad, cada 2 o 3 lineas aparece una nueva llegando a tener nombres tan lindos como "nombreApellidoEdadPacientesAtendidosActualmenteString"
    .hay cosas que no entiendo del todo como es que funcionan o la logica que hay detras de ello simplemente me limito a hacerlo como me dijieron que se hace


    Perdon por entregar las tareas tarde me dormi con la materia deje pasar el tiempo y se me juntaron muchas actividades voy a tratar de tenerlas todas esta semana.
Saludos! */ 