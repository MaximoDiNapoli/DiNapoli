public class Main {
    
    //Estimada profesora no encontre una manera para verificar si el producto estaba vencido ya que es de tipo string
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
    public boolean pesomenora5(int valor3){
        if(valor3 > 5){
            return true;
        }
        return false;

    }
    public static void main(String[] argum){
        Main nuevoMain = new Main();
        OrdenDeCompra orden1 = new OrdenDeCompra();
        boolean resultado = nuevoMain.mayorq(orden1.getCantidadtotaldeproductos());
        System.out.println(resultado);
        OrdenDeCompra tarjeta = new OrdenDeCompra();
        int resultado2 = nuevoMain.efectivo(tarjeta.getFormadepago());
        System.out.println(resultado2);
        ProductoAlimenticio kiwi = new ProductoAlimenticio();
        boolean resultado3 = nuevoMain.pesomenora5(kiwi.getPeso());
        System.out.println(resultado3);
    }
}