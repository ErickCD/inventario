package co.edu.ufps.dto;

/**
 *
 * @author Manuel Florez
 */
public class Producto {
    
    private int id;
    private String nombre;
    private String tipo;
    private float precioVenta;
    private int existencias;
    private float costoUnitario;
    private float saldoInventario;

    public Producto(int id, String nombre, String tipo, float precioVenta, int existencias, float costoUnitario, float saldoInventario) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioVenta = precioVenta;
        this.existencias = existencias;
        this.costoUnitario = costoUnitario;
        this.saldoInventario = saldoInventario;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public float getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(float costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public float getSaldoInventario() {
        return saldoInventario;
    }

    public void setSaldoInventario(float saldoInventario) {
        this.saldoInventario = saldoInventario;
    }
    
}
