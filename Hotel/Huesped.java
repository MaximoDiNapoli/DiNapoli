public class Huesped {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private int estadias;
    public Huesped(){ }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEstadias() {
        return estadias;
    }
        public Huesped(String nombrus, String apellidus, int edadus, int dna, int status){
        nombre = nombrus;
        apellido = apellidus;
        edad = edadus;
        dni = dna;
        estadias = status;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void setEstadias(int estadias) {
        this.estadias = estadias;
    }
        public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getDni(){
        return this.dni;
    }
}
