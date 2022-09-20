import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static int [][] visitas;       // filas son los años, columnas son los museos
    static String[] nombresMuseos;
    static int[] anios;
    static final int ANIO_BASE = 2019;
    static boolean nombresEstaVacio = true;
    static boolean aniosEstaVacio   = true;

    public static void main(String[] args) throws Exception{
        definirCatidadMuseos();
        menu();
    }

    public static void definirCatidadMuseos() throws Exception{
        System.out.print("Digite la cantidad de museos: ");
        int cantidadMuseos = Integer.parseInt(in.readLine());

        System.out.print("Digite la cantida de años a registrar: ");
        int cantidadAnios= Integer.parseInt(in.readLine());

        visitas = new int[cantidadAnios][cantidadMuseos];
        nombresMuseos = new String[cantidadMuseos];
        anios = new int[cantidadAnios];
    }

    public static void menu() throws Exception {
        int option =-1;
        do {
            System.out.println("▒▒▒▒▒▒▒▒<<Bienvenido al sistema del Ministerio de Cultura y juventud>>▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╔══════════════════════════════════════════════╗▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒║     1. Registrar todas las visitas.          ║░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒║     2. Imprimir matriz de visitas.           ║░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒║     3. Registrar matriz por año.             ║░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒║     4. Registrar los nombres de los museos.  ║░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒║     5. Registrar visitas por museo.          ║░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒║     6. Registrar los años.                   ║░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒║     7. Registrar las vistas por año.         ║░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒║     0. Salir del sistema                     ║░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒║                                              ║░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╚══════════════════════════════════════════════╝░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.print("                   Introduzca el número del item:");
            option = Integer.parseInt(in.readLine());
            procesarOpcion(option);
        }while(option !=0);
    }

    public static void procesarOpcion(int option) throws Exception{
        switch(option){
            case 1: registrarVisitas();
                break;
            case 2: imprimirVisitas();
                break;
            case 3:
                break;
            case 4: registrarNombreMuseos();
                break;
            case 5: imprimirNombresDeMuseos();
                if(!nombresEstaVacio)
                    registarVisitasPorMuseo();
                break;
            case 6: registrarAnios();
                break;
            case 7: imprimirAnios();
                if(!aniosEstaVacio)
                    registrarVisitasPorAnio();
                break;
            case 0:
                System.out.println("Gracias por su visita!");
                break;
            default:
                System.out.println("Opción invalida, intentelo nuevamente!");
                break;
        }
    }

    public static void registrarVisitas() throws Exception{
        // este ciclo recorre las filas
        for(int fila = 0;fila < visitas.length;fila++){
            // este ciclo recorre las columnas
            System.out.println("Ingrese los datos del año "+(ANIO_BASE+fila));
            for(int columna =0;columna < visitas[fila].length;columna++){
                System.out.print(" Digite la cantidad de visitas del museo "+ nombresMuseos[columna] +": ");
                visitas[fila][columna] = Integer.parseInt(in.readLine());
            }
        }
    }

    public static void imprimirVisitas() throws Exception{
        for(int fila =0;fila < visitas.length;fila++){
            for(int columna =0;columna < visitas[fila].length;columna++){
                System.out.print(visitas[fila][columna] + "\t");
            }
            System.out.println("");
        }
    }

    public static void  registrarNombreMuseos() throws Exception{
        System.out.println("**** Registro de nombre de museos ******");
        for(int i =0; i < nombresMuseos.length;i++){
            System.out.print("Digite el nombre del museo " + (i+1) +": ");
            nombresMuseos[i] = in.readLine();
            nombresEstaVacio = false;
        }
    }

    public static void imprimirNombresDeMuseos(){
        System.out.println("*** Lista de Museos ***");

        if(nombresEstaVacio) {
            System.out.println("No hay museos registrados!");
        }

        for(int i =0; i < nombresMuseos.length ;i++){
            if(nombresMuseos[i] != null)
                System.out.println((i+1) + " - " + nombresMuseos[i]);
        }
    }

    public static void registarVisitasPorMuseo() throws Exception{
        System.out.print("Digite el número del museo: ");
        int numMuseo = Integer.parseInt(in.readLine());
        numMuseo -=1;

        for (int fila =0;fila < visitas.length;fila++){
            System.out.print("Digite la cantidad de vistas del museo "+
                    nombresMuseos[numMuseo] +" para el año " + anios[fila] +": ");
            visitas[fila][numMuseo] = Integer.parseInt(in.readLine());
        }
    }

    public static void registrarAnios() throws Exception{
        System.out.println("**** Registro de años ******");
        for(int i =0; i < anios.length;i++){
            System.out.print("Digite el año " + (i+1) +": ");
            anios[i] = Integer.parseInt(in.readLine());
            aniosEstaVacio = false;
        }
    }

    public static void imprimirAnios(){
        if(aniosEstaVacio)
            System.out.println("No hay museos registrados!");

        for(int i =0; i < anios.length ;i++){
            if(anios[i] != 0)
                System.out.println((i+1) + " - " + anios[i]);
        }
    }

    public static void registrarVisitasPorAnio() throws Exception{
        System.out.print("Digite el número del año: ");
        int numAnio = Integer.parseInt(in.readLine());
        numAnio -=1;

        for (int columna =0;columna < visitas[0].length;columna++){
            System.out.print("Digite la cantidad de vistas del museo "+
                    nombresMuseos[columna] +" para el año " + anios[numAnio] +": ");
            visitas[numAnio][columna] = Integer.parseInt(in.readLine());
        }
    }
}
