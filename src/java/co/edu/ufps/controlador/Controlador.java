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

}
