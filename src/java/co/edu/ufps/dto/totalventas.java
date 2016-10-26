package co.edu.ufps.dto;

/**
 *
 * @author Clair
 */
public class totalventas {

    private String precio, idproducto, nombreProducto;

    public totalventas(String precio, String idproducto, String nombreProducto) {
        this.precio = precio;
        this.idproducto = idproducto;
        this.nombreProducto = nombreProducto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

}
