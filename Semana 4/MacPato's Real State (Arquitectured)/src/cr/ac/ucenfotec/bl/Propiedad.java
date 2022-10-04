package cr.ac.ucenfotec.bl;

public class Propiedad {

    private int codigo;
    private String nombre;
    private int cuartos;
    private String provincia;
    private double montoAlquiler;

    public Propiedad() {
    }

    public Propiedad(int codigo, String nombre, int cuartos, String provincia, double montoAlquiler) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cuartos = cuartos;
        this.provincia = provincia;
        this.montoAlquiler = montoAlquiler;
    }

    //get/set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getMontoAlquiler() {
        return montoAlquiler;
    }

    public void setMontoAlquiler(double montoAlquiler) {
        this.montoAlquiler = montoAlquiler;
    }


    public String toString() {
        return "Property Code: " + codigo +
                "\n Property Name: " + nombre +
                "\n Rooms: " + cuartos +
                "\n Province: " + provincia +
                "\n Monthly Rent Price: " + montoAlquiler;
    }
}
