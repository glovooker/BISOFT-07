import java.time.LocalDate;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int tipo;
    private char tamanio;
    private double peso;
    private LocalDate fechaVencimiento;

    //2. Métodos de acceso
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public char getTamanio() {
        return tamanio;
    }

    public void setTamanio(char tamanio) {
        this.tamanio = tamanio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String toString() {
        return  "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", tipo=" + tipo +
                ", tamanio=" + tamanio +
                ", peso=" + peso +
                ", fechaVencimiento=" + fechaVencimiento;
    }
}