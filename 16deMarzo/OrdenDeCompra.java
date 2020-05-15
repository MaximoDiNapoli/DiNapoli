public class OrdenDeCompra{
    //atribustos
    private String fecha;
    private int hora;
    private String cliente;
    private int cantidadtotaldeproductos;
    private int formadepago;  //efectivo 1 tarjeta 0

    public OrdenDeCompra() {
        fecha = "Cuatro";
        hora = 3;
        cliente = "Pedro";
        cantidadtotaldeproductos = 23;
        formadepago = 1;
    }
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(final String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(final int hora) {
        this.hora = hora;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(final String cliente) {
        this.cliente = cliente;
    }

    public int getCantidadtotaldeproductos() {
        return cantidadtotaldeproductos;
    }

    public void setCantidadtotaldeproductos(final int cantidadtotaldeproductos) {
        this.cantidadtotaldeproductos = cantidadtotaldeproductos;
    }

    public int getFormadepago() {
        return formadepago;
    }

    public void setFormadepago(final int formadepago) {
        this.formadepago = formadepago;
    }

    public boolean mayorq(int valor){
        if(valor < 255){
            return true;
        }
        return false;
    }
    public int efectivo(int valor2){
        if(valor2 == 1){
            System.out.println("Efectivo");
            return 1;
        }
        System.out.println("Tarjeta");
        return 0;
    }
}

