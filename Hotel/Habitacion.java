import java.util.ArrayList;

public class Habitacion {
    private int capacidad;
    private int precio;
    private int Salida;
    private int Entrada;
    private int Ganancias;
    private ArrayList<Huesped> clientes = new ArrayList<>();
    private int ID;
    
    /*
    las inicializaciones de los atributos sólo deben estar
    dentro de los constructores

    los nombres de los atributos están conformados por una sola
    * palabra, la misma debe estar escrita sólo en minúsculas;
    * si están conformados por más una palabra, sólo la primera
    * debe empezar con minúscula, las demás deben comenzar con 
    * mayúsculas
     */

    public Habitacion(int capacity, int precius, int fecha1, int fecha2, Huesped clientus, int idus){
        capacidad = capacity;
        precio = precius;
        Entrada = fecha1;
        Salida = fecha2;
        clientes.add(clientus);
        ID = idus;
        Ganancias = 0;
    }

    public Habitacion(){}
    public Habitacion(int capacity, int precius, int fecha1, int fecha2, Huesped clientus, int idus, Huesped clientus2){
        capacidad = capacity;
        precio = precius;
        Entrada = fecha1;
        Salida = fecha2;
        clientes.add(clientus);
        clientes.add(clientus2);
        ID = idus;
        Ganancias = 0;
    }

    public ArrayList<Huesped> getClientes() {
        return clientes;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getEntrada() {
        return Entrada;
    }

    public int getSalida() {
        return Salida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setClientes(ArrayList<Huesped> clientes) {
        this.clientes = clientes;
    }
    public void setclientes2(Huesped clientilius){
        this.clientes.add(clientilius);
    }

    public void setEntrada(int Entrada) {
        this.Entrada = Entrada;
    }

    public void setSalida(int Salida) {
        this.Salida = Salida;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getID() {
        return ID;
    }

    public int cantidaddia(){
        int dia = this.Salida - this.Entrada;
        int mes = 0;
        int Año = 0;
        while(dia > 1230){
            dia = dia - 1230;
            Año = Año + 1;
        }
        while(dia > 30){
            dia = dia - 100;
            mes = mes + 1;
        }
        while(mes > 0){
            mes = mes - 1;
            dia = dia + 30;
        }
        while(Año > 0){
            Año = Año - 1;
            dia = dia + 360;
        }
        return dia;
    }
    public int diarestantes(int diahoy){
        int dia = this.Salida - diahoy;
        int mes = 0;
        while(dia > 30){
            dia = dia - 100;
            mes = mes + 1;
        }
        while(mes > 0){
            mes = mes - 1;
            dia = dia + 30;
        }
        int total = this.cantidaddia() - dia;
        return (total);
    }
    public void acta(){
        int contador = 0;
        this.Ganancias = 0;
        while (contador < this.clientes.size()){
            if(cantidaddia() > 30){
                this.Ganancias = Ganancias + (((this.cantidaddia() + this.clientes.get(contador).getEstadia()) * this.precio)/4)*3;
            }
            else{
                this.Ganancias = Ganancias + ((this.cantidaddia() + this.clientes.get(contador).getEstadia()) * this.precio);
            }

            contador = contador + 1;
        }
    }
    public int acta2(){
        int contador2 = 0;
        contador2 = contador2 + this.masfrecuentador().getEstadia() + this.cantidaddia();
        return contador2;
    }
    public Huesped masfrecuentador(){
        Huesped clietne = new Huesped();
        int contador = 0;
        int Pacientequemastiempoestuvoenlahabitacion = 0;
        while (contador < this.clientes.size()){
            if(this.clientes.get(contador).getEstadia() > Pacientequemastiempoestuvoenlahabitacion){
                Pacientequemastiempoestuvoenlahabitacion = this.clientes.get(contador).getEstadia();
                clietne = this.clientes.get(contador);
            }
            contador = contador + 1;
        }
        return clietne;
    }

    public int getGanancias() {
        return Ganancias;
    }
    public void sumardia(int cantidad){
        int mes = 0;
        int Año = 0;
        while(this.Salida > 1230){
            this.Salida = this.Salida - 10000;
            Año = Año + 1;
        }
        while (this.Salida > 30){
            this.Salida = this.Salida - 100;
            mes = mes + 1;
        }
        while (mes > 0){
            mes = mes - 1;
            this.Salida = this.Salida + 30;
        }
        while (Año > 0){
            Año = Año - 1;
            this.Salida = this.Salida + 360;
        }

        this.Salida = this.Salida + cantidad;

        while(this.Salida > 360){
            this.Salida = this.Salida - 360;
            Año = Año + 1;
        }
        while (this.Salida > 30){
            this.Salida = this.Salida - 30;
            mes = mes + 1;
        }
        while (mes > 0){
            mes = mes - 1;
            this.Salida = this.Salida + 100;
        }
        while (Año > 0){
            Año = Año - 1;
            this.Salida = this.Salida + 10000;
        }
        System.out.println(this.Salida);
    }
    public void vaciar(){
        ArrayList<Huesped> clientes2 = new ArrayList<>();
        this.clientes = clientes2;
        this.Salida = 0;
        this.Entrada = 0;
    }
}
