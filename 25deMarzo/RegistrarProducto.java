import java.util.Scanner;

public class RegistrarProducto {

    public static void main(String[] args) {

        Scanner precio = new Scanner(System.in);
        System.out.println("Precio:");
        float guardarPrecio = precio.nextFloat();

        Scanner nombre = new Scanner(System.in);
        System.out.println("Nombre:");
        String guardarNombre = nombre.nextLine();

        Scanner marca = new Scanner(System.in);
        System.out.println("Marca:");
        String guardarMarca = marca.nextLine();

        Scanner unidades = new Scanner(System.in);
        System.out.println("Unidades:");
        int guardarUnidades = unidades.nextInt();

    }

}
