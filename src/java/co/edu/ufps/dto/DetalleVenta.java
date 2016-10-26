package co.edu.ufps.dto;

/**
 *
 * @author Manuel Florez
 */
public class DetalleVenta {
    
    private String idproducto;
    private int idfactura;
    private int cantidad;
    private float valoriva;
    private float valordescuento;
    private float total;

    public DetalleVenta(String idproducto, int idfactura, int cantidad, float valoriva, float valordescuento, float total) {
        this.idproducto = idproducto;
        this.idfactura = idfactura;
        this.cantidad = cantidad;
        this.valoriva = valoriva;
        this.valordescuento = valordescuento;
        this.total = total;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getValoriva() {
        return valoriva;
    }

    public void setValoriva(float valoriva) {
        this.valoriva = valoriva;
    }

    public float getValordescuento() {
        return valordescuento;
    }

    public void setValordescuento(float valordescuento) {
        this.valordescuento = valordescuento;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}
