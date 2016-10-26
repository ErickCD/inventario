package co.edu.ufps.business;

import co.edu.ufps.dao.ProductoDAO;
import co.edu.ufps.dao.totalventasDAO;
import co.edu.ufps.dto.Producto;
import co.edu.ufps.dto.totalventas;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manuel Florez
 */
public class Business {

    public List<Producto> listarProductos() {
        ProductoDAO a = new ProductoDAO();
        try {
            return a.listarProductos();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Business.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<totalventas> verTotalVentas() {
        totalventasDAO totalDAO = new totalventasDAO();
        try {
            return totalDAO.totalVentas();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Business.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
