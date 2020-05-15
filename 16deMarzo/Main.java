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

    /*
     *
     * Hola, Di Napoli!
     *
     * Buen trabajo!
     *
     * Con respecto al método para saber si el producto está vencido,
     * una forma rebuscada que funcionaría es usando el método "charAt" de la clase String
     * y luego hacer un casteo manual de los valores en string a int, con un método que ustedes
     * mismos debían crear, para luego poder comparar.
     * Me pareció bueno ponerles esa limitación para que desarrollen más la creatividad.
     * De todas formas, no hay ningún problema si no lo hacés!
     *
     * Recordar:
     * - si los atributos tienen sólo una palabra, éstos deben escribirse
     * sólo con minúsculas.
     * - si tienen más de una palabra, la primer debe comenzar con minúscula y
     * las demás deben comenzar con mayúsculas
     * - los métodos deben tener nombres que se escriben con el mismo
     * criterio que se aplica con los atributos
     * - El nombre de esta clase debe tener relación con los métodos.
     *
     */
}