package co.edu.ufps.dao;

import co.edu.ufps.connection.conexion;
import co.edu.ufps.dto.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel Florez
 */
public class ProductoDAO {

    public List<Producto> listarProductos() throws ClassNotFoundException, SQLException {

        List<Producto> l = new ArrayList<>();
        conexion con = new conexion();
        // Preparamos la consulta
        Statement s = con.getConnection().createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM producto");

        while (rs.next()) {
            Producto aux = new Producto(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("tipo"),
                    rs.getFloat("precioVenta"),
                    rs.getInt("existencias"),
                    rs.getFloat("costounitario"),
                    rs.getFloat("saldoinventario")
            );
            l.add(aux);
        }
        
        rs.close();
        s.close(); 
        con.cerrarConnection();
        return l;
    }

}
