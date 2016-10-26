package co.edu.ufps.controlador;

import co.edu.ufps.business.Business;
import co.edu.ufps.dto.Producto;
import co.edu.ufps.dto.totalventas;
import java.util.List;

/**
 *
 * @author Manuel Florez
 */
public class Controlador implements Controller {

    private final Business myBusiness = new Business();

    @Override
    public List<Producto> listarProductos() {
        return myBusiness.listarProductos();
    }

    public List<totalventas> totalVentas() {
        return myBusiness.verTotalVentas();
    }

    public String validarPedido(int idProducto, int cantidad) {
        return myBusiness.validarProducto(idProducto, cantidad);
    }

    @Override
    public List<Producto> agregarProducto(int idProducto, int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
