import java.util.Scanner;

public class RegistrarPersona {

    public static void main(String[] args) {

        Scanner nombre = new Scanner(System.in);
        System.out.println("Nombre:");
        String guardarnombre = nombre.nextLine();

        Scanner apellido = new Scanner(System.in);
        System.out.println("Apellido:");
        String guardarApellido = apellido.nextLine();

        Scanner edad = new Scanner(System.in);
        System.out.println("Edad:");
        int guardarEdad = edad.nextInt();

        Scanner trabajo = new Scanner(System.in);
        System.out.println("Trabajo:");
        String guardarTrabajo = trabajo.nextLine();

    }

}
