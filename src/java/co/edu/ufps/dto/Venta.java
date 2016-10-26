package co.edu.ufps.dto;

/**
 *
 * @author Manuel Florez
 */
public class Venta {
    
    private int numerofactura;
    private float valortotal;
    private float valordescuento;
    private float valoriva;
    private int idcliente;

    public Venta(int numerofactura, float valortotal, float valordescuento, float valoriva, int idcliente) {
        this.numerofactura = numerofactura;
        this.valortotal = valortotal;
        this.valordescuento = valordescuento;
        this.valoriva = valoriva;
        this.idcliente = idcliente;
    }

    public int getNumerofactura() {
        return numerofactura;
    }

    public void setNumerofactura(int numerofactura) {
        this.numerofactura = numerofactura;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    public float getValordescuento() {
        return valordescuento;
    }

    public void setValordescuento(float valordescuento) {
        this.valordescuento = valordescuento;
    }

    public float getValoriva() {
        return valoriva;
    }

    public void setValoriva(float valoriva) {
        this.valoriva = valoriva;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    
}
