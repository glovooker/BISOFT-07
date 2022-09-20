import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        mostrarDatos();
        int opcion = obtenerOpcion();
        System.out.println("El usuario digitó la opción: " + opcion);
    }

    // Procedimiento
    public static void mostrarDatos() {
        System.out.println("*** Bienvenido al Sistema ***");
        System.out.println("1. Registrar datos.");
        System.out.println("2. Imprimir datos.");
    }

    public static int obtenerOpcion() throws IOException {
        System.out.println("Seleccione una opción: ");
        int opcion = Integer.parseInt(in.readLine());
        return opcion;
    }


    // Función
    public static int calcularEdad(int anio) {
        int edad = 2022 - anio;
        return edad;
    }
}
