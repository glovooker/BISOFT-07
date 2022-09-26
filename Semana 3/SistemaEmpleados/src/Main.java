import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static Empleado[] listaEmpleados = new Empleado[5];
    private static int posicion = 0;

    public static void main(String[] args) throws Exception {
        mostrarMenu();
    }

    public static void mostrarMenu() throws Exception {
        int opcion = -1;

        do{
            System.out.println("*** Sistema de Empleados ***");
            System.out.println("1. Registrar Empleado.");
            System.out.println("2. Listar Empleados.");
            System.out.println("0. Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(in.readLine());
            procesarOpcion(opcion);
        }while(opcion != 0);
    }

    public static void procesarOpcion(int opcion) throws Exception {
        switch (opcion) {
            case 1:
                registrarEmpleado();
                break;

            case 2:
                listarEmpleados();
                break;

            case 0:
                System.out.println("¡Gracias por su visita!");
                break;

            default:
                System.out.println("¡Opción Inválida!");
                break;
        }
    }

    public static void registrarEmpleado() throws Exception {
        System.out.print("Digite la identificación: ");
        int identificacion = Integer.parseInt(in.readLine());
        System.out.print("Digite el nombre: ");
        String nombre = in.readLine();
        System.out.print("Digite el género (M - Masculino, F - Femenino, O - Otros): ");
        char genero = in.readLine().charAt(0);
        System.out.print("Digite la edad: ");
        int edad = Integer.parseInt(in.readLine());
        System.out.print("Digite el puesto: ");
        String puesto = in.readLine();

        Empleado empleado = new Empleado();
        empleado.setIdentificacion(identificacion);
        empleado.setNombre(nombre);
        empleado.setGenero(genero);
        empleado.setEdad(edad);
        empleado.setPuesto(puesto);

        listaEmpleados[posicion] = empleado;
        posicion++;
    }

    public static void listarEmpleados() throws Exception {
        for (int i = 0; i < listaEmpleados.length; i++) {
            if (listaEmpleados[i] != null){
                System.out.println(listaEmpleados[i]);
            }
        }
    }

}
