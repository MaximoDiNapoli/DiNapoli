package app;

import product.FoodProduct;

import java.util.ArrayList;
import java.util.Scanner;

public class AppDeposit {
    static String registroSuperemo;

    public static void main(String[] args){
        String registro= "";
        registroSuperemo = registro;
        ArrayList<FoodProduct> stockRegistrado = new ArrayList<>();

        while ("True" == "True"){
            Scanner ingresoOpcion = new Scanner(System.in);
            System.out.println("1 add producto");
            System.out.println("2 add stock");
            System.out.println("3 precio del stock");
            System.out.println("4 productos con menos de 15 de stock");
            System.out.println("5 stock de un producto por nombre");
            System.out.println("6 productos sin stock");
            System.out.println("7 mostrar registro");


            int option = ingresoOpcion.nextInt();

            switch (option)
            {
                case 1:     addProduct(stockRegistrado, registro);
                    break;
                case 2:     registroSuperemo = registroSuperemo + addStock(stockRegistrado, registro);
                    break;
                case 3:     System.out.println(calcPriceStock(stockRegistrado));
                    break;
                case 4:     productsLessThan15(stockRegistrado);
                    break;
                case 5:     productStockWhitName(stockRegistrado);
                    break;
                case 6:     productWhitnotStock(stockRegistrado);
                    break;
                case 7:     System.out.println(registroSuperemo);
                    break;
                default:    System.out.println("ya no queda nada");
                    break;
            }
        }


    }

    public static void productsLessThan15(ArrayList stockRegistrado){
        for (int i = 0; i < stockRegistrado.size(); i++) {
            FoodProduct temp = (FoodProduct) stockRegistrado.get(i);
            if (temp.getStock() < 15){
                System.out.println(temp.getName() + " de stock");
            }
        }
    }
    public static void productStockWhitName(ArrayList stockRegistrado){
        Scanner ingresoName = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String name = ingresoName.nextLine();
        for (int i = 0; i < stockRegistrado.size(); i++) {
            FoodProduct temp = (FoodProduct) stockRegistrado.get(i);
            if (temp.getName() == name){
                System.out.println(temp.getStock() + " de stock");
            }
        }
    }

    public static void productWhitnotStock(ArrayList stockRegistrado){
        for (int i = 0; i < stockRegistrado.size(); i++) {
            FoodProduct temp = (FoodProduct) stockRegistrado.get(i);
            if (temp.getStock() == 0){
                System.out.println(temp.getName() + " ya no queda nada");
            }
        }
    }
    public static int calcPriceStock(ArrayList stockRegistrado){
        int priceT = 0;
        for (int i = 0; i < stockRegistrado.size(); i++) {
            FoodProduct temp = (FoodProduct) stockRegistrado.get(i);
            priceT = priceT + (temp.getPrice() * temp.getStock());
        }
        return priceT;
    }

    public static String addStock(ArrayList stockRegistrado,String registro){
        Scanner ingresoId = new Scanner(System.in);
        System.out.println("Ingrese id");
        int id = ingresoId.nextInt();

        Scanner ingresoStock = new Scanner(System.in);
        System.out.println("Ingrese stock");
        int stock = ingresoStock.nextInt();

        for (int i = 0; i < stockRegistrado.size(); i++) {
            FoodProduct temp = (FoodProduct) stockRegistrado.get(i);
            if (temp.getId() == id){
                temp.setStock(temp.getStock() + stock);
                registro = registro + "se modifico el stock de, " + temp.getName() + " con " + stock + " unidades de stock";
            }
        }

        return registro;
    }
    public static ArrayList addProduct(ArrayList stockRegistrado, String registro) {
        boolean registrarDatos = true;

        System.out.println("Bienvenido al sistema de registro de datos personales.");
        System.out.println("Nuevo registro: \n");

        while (registrarDatos) {

            Scanner ingresoId = new Scanner(System.in);
            System.out.println("Ingrese id");
            int id = ingresoId.nextInt();

            Scanner ingresoName = new Scanner(System.in);
            System.out.println("Ingrese nombre");
            String name = ingresoName.nextLine();

            Scanner ingresopPrice = new Scanner(System.in);
            System.out.println("Ingrese precio");
            int price = ingresopPrice.nextInt();

            Scanner ingresoStock = new Scanner(System.in);
            System.out.println("Ingrese stock");
            int stock = ingresoStock.nextInt();

            FoodProduct nuevosDatos = new FoodProduct(id, name, price, stock);
            stockRegistrado.add(nuevosDatos);
            System.out.println("La registración ha sido un éxito!\n");

            Scanner ingresoDeOpcion = new Scanner(System.in);
            System.out.println("Quiere realizar un nuevo registro?");
            registro = (registro + "se añadio un producto nuevo, " + name + " con " + stock + "unidades de stock");
            System.out.println(registro);
            System.out.println("ingrese una opción: si / no ");
            String opcion = ingresoDeOpcion.nextLine();

            opcion = opcion.toLowerCase();

            if (opcion.equals("si")) {
                System.out.println("ok! \n");
                registrarDatos = true;
            } else {
                System.out.println("Bye!");
                registrarDatos = false;
            }
        }
        registroSuperemo = registroSuperemo + registro;
        return stockRegistrado;
    }
}