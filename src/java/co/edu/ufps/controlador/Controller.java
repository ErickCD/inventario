package co.edu.ufps.controlador;

import co.edu.ufps.dto.Producto;
import java.util.List;

/**
 *
 * @author Manuel Florez
 */
public interface Controller {

    public List<Producto> listarProductos();

    public List<Producto> agregarProducto(int idProducto, int cantidad);

    public String validarPedido(int idProducto, int cantidad);

}
