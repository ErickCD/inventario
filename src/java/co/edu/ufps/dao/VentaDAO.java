package co.edu.ufps.dao;

import co.edu.ufps.connection.conexion;
import co.edu.ufps.dto.Venta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Manuel Florez
 */
public class VentaDAO {
    
    public List<Venta> listarDetalles() throws ClassNotFoundException, SQLException {

        List<Venta> l = new ArrayList<>();
        conexion con = new conexion();
        // Preparamos la consulta
        Statement s = con.getConnection().createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM venta");

        while (rs.next()) {
            Venta aux = new Venta(
                    rs.getInt("numerofactura"),
                    rs.getFloat("valortotal"),
                    rs.getFloat("valordescuentos"),
                    rs.getFloat("valoriva"),
                    rs.getInt("idcliente")
            );
            l.add(aux);
        }
        
        rs.close();
        s.close(); 
        con.cerrarConnection();
        return l;
    }
    
}
