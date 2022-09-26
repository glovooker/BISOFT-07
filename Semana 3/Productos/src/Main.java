import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Declara e inicializa un objeto
        Producto p1= new Producto();
        Producto p2= new Producto();
        Producto p3= new Producto();
        Producto p4= new Producto();

        //llenando un producto
        p1.setCodigo("COD-001");
        p1.setNombre("Pasta dental");
        p1.setPrecio(2500);
        p1.setTamanio('M');
        p1.setTipo(1);
        p1.setPeso(0.5);
        p1.setFechaVencimiento(LocalDate.of(2026,10,5));

        //llenando otro producto
        p2.setCodigo("COD-002");
        p2.setNombre("Arroz blanco");
        p2.setPrecio(4800);
        p2.setTamanio('G');
        p2.setTipo(2);
        p2.setPeso(4.0);
        p2.setFechaVencimiento(LocalDate.of(2022,11,18));

        // imprimiendo la información de los productos
        System.out.println("producto 1: " + p1);
        System.out.println("producto 2: " + p2);
        System.out.println("producto 3: " + p3);
        System.out.println("producto 4: " + p4);
        System.out.println();
        System.out.println("Nombre de P1: " + p1.getNombre());
        System.out.println("Precio de P2: " + p2.getPrecio());
    }

}