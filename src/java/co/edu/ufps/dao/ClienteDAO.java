package co.edu.ufps.dao;

import co.edu.ufps.connection.conexion;
import co.edu.ufps.dto.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Manuel Florez
 */
public class ClienteDAO {
    
    public List<Cliente> listarClientes() throws ClassNotFoundException, SQLException {

        List<Cliente> l = new ArrayList<>();
        conexion con = new conexion();
        // Preparamos la consulta
        Statement s = con.getConnection().createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM cliente");

        while (rs.next()) {
            Cliente aux = new Cliente(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("direccion"),
                    rs.getString("telefono")
            );
            l.add(aux);
        }
        
        rs.close();
        s.close(); 
        con.cerrarConnection();
        return l;
    }
    
}
