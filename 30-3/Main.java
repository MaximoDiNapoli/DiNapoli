import java.util.Scanner;

public class Main{
    static void programa3(){
        Scanner ingreso = new Scanner(System.in);
        int cantidadNumeros = 0;
        int longitud = 999999;
        int[] vector = new int[longitud];
        int sumaTotal = 0;
        for(int i=0; i < 99999; i++) {
            vector[i] = ingreso.nextInt();
            if(vector[i] == -1){
                System.out.println("Suma total:" + sumaTotal);
                System.out.println("numeros total:" + cantidadNumeros);
                return;
            }
            cantidadNumeros = cantidadNumeros + 1;
            sumaTotal = sumaTotal + vector[i];
        }
    }
    static void programa1(){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = ingreso.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = ingreso.nextInt();
        if(num1 > num2){
            System.out.println("El numero mas grande es: "+ num1 );
        }
        else if(num2 > num1){
            System.out.println("El numero mas grande es: "+ num2 );
        }
        else{
            System.out.println("Son iguales");
        }
    }
    static void programa2(){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese numero de numeros");
        int numeroDeNumeros = ingreso.nextInt();
        int[] vector = new int[numeroDeNumeros];
        for(int i=0; i<numeroDeNumeros; i++) {
            System.out.println("Ingrese numero:"+ i);
            vector[i] = ingreso.nextInt();
        }
        for(int i=0; i<numeroDeNumeros; i++) {
            if((vector[i] % 2 == 0)){
                System.out.print(vector[i]+" ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        System.out.println("Que programa desea ejecutar?");
        int eleccion = ingreso.nextInt();
        if(eleccion == 1){
            programa1();
        }
        else if(eleccion == 2){
            programa2();
        }
        else{
            programa3();
        }
    }
}