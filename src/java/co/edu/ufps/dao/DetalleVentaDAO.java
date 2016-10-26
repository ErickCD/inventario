package co.edu.ufps.dao;

import co.edu.ufps.connection.conexion;
import co.edu.ufps.dto.DetalleVenta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Manuel Florez
 */
public class DetalleVentaDAO {
    
    public List<DetalleVenta> listarDetalles() throws ClassNotFoundException, SQLException {

        List<DetalleVenta> l = new ArrayList<>();
        conexion con = new conexion();
        // Preparamos la consulta
        Statement s = con.getConnection().createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM detalleventa");

        while (rs.next()) {
            DetalleVenta aux = new DetalleVenta(
                    rs.getString("idproducto"),
                    rs.getInt("idfactura"),
                    rs.getInt("cantidad"),
                    rs.getFloat("valoriva"),
                    rs.getFloat("valordescuento"),
                    rs.getFloat("total")
            );
            l.add(aux);
        }
        
        rs.close();
        s.close(); 
        con.cerrarConnection();
        return l;
    }
    
}
