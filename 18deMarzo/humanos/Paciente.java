package humanos;

public class Paciente {
    private String nombreyapellido;
    private int dni;
    private int edad;
    private int telefono;
    private String direccion;

    public Paciente(String nombreyapellido, int dni, int edad, int telefono, String direccion){
        this.nombreyapellido = nombreyapellido;
        this.dni = dni;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Paciente(){
        nombreyapellido = "Alfredo Roman";
        dni = 33513765;
        edad = 52;
        telefono = 1123232333;
        direccion = "Moscosini y heredia";
    }

    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public boolean esIgualA(Paciente p){
        boolean sonIguales = this.nombreyapellido == p.getNombreyapellido() &&
                             this.dni == p.getDni() &&
                             this.edad == p.getEdad() &&
                             this.telefono == p.getTelefono() &&
                             this.direccion == p.getDireccion();
        return sonIguales;
    }

}