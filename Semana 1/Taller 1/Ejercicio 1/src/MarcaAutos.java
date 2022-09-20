import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarcaAutos {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static String[] marcasAutos = new String[5];
    static int indiceMarca = 0;

    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() throws Exception {
        int option = 0;
        do {
            System.out.println("▒▒▒▒▒▒▒▒▒<<Bienvenido al Sistema de Selección de marca No ande a Pie>>▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╔══════════════════════════════════════════════╗▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒║     1. Ingresar un vehículo                  ║▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒║     2. Imprimir el listado de marcas         ║▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒║     0. Salir del sistema                     ║▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╚══════════════════════════════════════════════╝▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.print("                   Introduzca el número del item:");
            option= Integer.parseInt(in.readLine());
            procesarOpcion(option);
        }
        while(option != 0);
    }

    public static void procesarOpcion(int option) throws Exception {
        switch(option){
            case 1:
                registrarMarca();
                break;

            case 2:
                imprimirMarcas();
                break;

            case 0:
                System.out.println("¡Gracias por su visita!");
            default:
                System.out.println("Opción inválida, inténtelo de nuevo.");
        }
    }

    public static void registrarMarca() throws Exception {
        System.out.println("Por favor ingrese la marca: ");
        String marca = in.readLine();

        if (indiceMarca < marcasAutos.length) {
            marcasAutos[indiceMarca] = marca;
            indiceMarca++;
        } else {
            System.out.println("No hay espacio para agregar más marcas.");
        }
    }

    public static void imprimirMarcas() throws Exception {
        for (int i = 0; i < marcasAutos.length; i++) {
            if (marcasAutos[i] != null){
                System.out.println("Posición " + (i+1) + ": " + marcasAutos[i]);
            }
        }
    }

}
