import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static Cajero[] infoCajeros = new Cajero[5];
    static int posicion = 0;

    public static void main(String[] args) throws Exception{
        mostrarMenu();
    }

    public static void mostrarMenu() throws Exception {
        int opcion = -1;
        do{
            System.out.println("**** Sistema Bancario ****");
            System.out.println("1. Registrar Cajero.");
            System.out.println("2. Imprimir Cajero.");
            System.out.println("0. Salir.");
            System.out.println("Seleccione una opción: ");
            opcion = Integer.parseInt(in.readLine());
            procesarOpcion(opcion);

        }while(opcion != 0);
    }

    public static void procesarOpcion(int opcion) throws Exception {
        switch(opcion){
            case 1:
                registrarCajero();
                break;
            case 2:
                imprimirCajero();
                break;
            case 0: System.out.println("Gracias por su visita");
                break;
            default:
                System.out.println("¡Opción invalida!");
        }
    }

    public static void registrarCajero() throws Exception {
        // Creando objeto Cajero
        Cajero cajeroRegistrado = new Cajero();

        System.out.println("*** Registrar un cajero ***");
        System.out.println("Digite la identificación: ");
        cajeroRegistrado.identificacion = Integer.parseInt(in.readLine());
        System.out.println("Digite el nombre: ");
        cajeroRegistrado.nombre = in.readLine();
        System.out.println("Digite el puesto: ");
        cajeroRegistrado.puesto = in.readLine();
        System.out.println("Digite el nivel de acceso (A,B,C): ");
        cajeroRegistrado.nivelAcceso = in.readLine().charAt(0);
        System.out.println("Digite el usuario: ");
        cajeroRegistrado.usuario = in.readLine();
        System.out.println("Digite la contraseña: ");
        cajeroRegistrado.contrasenna = in.readLine();

        infoCajeros[posicion] = cajeroRegistrado;
        posicion++;

        System.out.println("¡El cajero fue registrado correctamente!");
    }

    public static void imprimirCajero() {

        for (int i = 0; i < infoCajeros.length; i++) {

            if (infoCajeros[i] != null){
                Cajero cajeroImprimir = infoCajeros[i];

                System.out.println("Cajero: " + cajeroImprimir.identificacion + ", " + cajeroImprimir.nombre  + ", " + cajeroImprimir.puesto + ", " + cajeroImprimir.nivelAcceso + ", " + cajeroImprimir.usuario + ", " + cajeroImprimir.contrasenna);
            }


        }

    }

}
