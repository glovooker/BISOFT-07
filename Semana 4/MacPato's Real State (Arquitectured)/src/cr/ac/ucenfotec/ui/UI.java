package cr.ac.ucenfotec.ui;

import cr.ac.ucenfotec.bl.CL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UI {

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static CL gestor = new CL();

    public static void main(String[] args) throws Exception{
        mostrarMenu();
    }

    public static void mostrarMenu() throws Exception{
        int opcion = -1;
        do{
            System.out.println("*** MacPato's Real State ***");
            System.out.println("1. Register Property.");
            System.out.println("2. List Properties");
            System.out.println("3. Search Property.");
            System.out.println("4. Calculate Rent Incomes.");
            System.out.println("5. Exit.");
            System.out.print("Type an option: ");
            opcion = Integer.parseInt(in.readLine());
            procesarOpcion(opcion);
        }while(opcion !=0);
    }

    public static void procesarOpcion(int opcion) throws Exception{
        switch (opcion){
            case 1:
                registrarPropiedad();
                break;
            case 2:
                listarPropiedades();
                break;
            case 3:
                buscarPropiedad();
                break;
            case 4:
                //calcularIngresosAlquiler();
                break;
            case 0:
                System.out.println("Thanks for Supporting MacPato's Real State");
                break;
            default:
                System.out.println("Type a valid option!");
                break;
        }
    }

    public static void registrarPropiedad() throws Exception{
        System.out.print("Type the property's code: ");
        int codigo = Integer.parseInt(in.readLine());
        System.out.print("Type the property's name: ");
        String nombre = in.readLine();
        System.out.print("Type the amount of rooms: ");
        int cuartos = Integer.parseInt(in.readLine());
        System.out.print("Type the province: ");
        String provincia = in.readLine();
        System.out.print("Type the monthly rent fee: ");
        double montoAlquiler = Double.parseDouble(in.readLine());

        String mensaje = gestor.registrarPropiedad(codigo,nombre,cuartos,provincia,montoAlquiler);
        System.out.println(mensaje);
    }

    public static void listarPropiedades() throws Exception{
        String[] datos = gestor.listarPropiedades();
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]);
        }
    }

    public static void buscarPropiedad() throws Exception{
        System.out.println("*** Search Property ***");
        System.out.print("Type the name of the property you want to search: ");
        String nombre = in.readLine();

        String mensaje = gestor.buscarPropiedad(nombre);
        System.out.println(mensaje);
    }

}
