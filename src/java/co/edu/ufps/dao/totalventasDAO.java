package co.edu.ufps.dao;

import co.edu.ufps.connection.conexion;
import co.edu.ufps.dto.totalventas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Clair
 */
public class totalventasDAO {

    public List<totalventas> totalVentas() throws ClassNotFoundException, SQLException {
        List<totalventas> lista = new ArrayList<>();
        conexion con = new conexion();

        Statement s = con.getConnection().createStatement();
        ResultSet rs = s.executeQuery("SELECT `total` * (select `precioventa` from `producto` where"
                + " `detalleventa`.`idproducto` = `producto`.`id`) precio, `idproducto`, (select `nombre` from"
                + " `producto` where `detalleventa`.`idproducto` = `producto`.`id`) nombreProducto from `detalleventa`;");
        while (rs.next()) {
            totalventas tv = new totalventas(
                    rs.getString("precio"),
                    rs.getString("idproducto"),
                    rs.getString("nombreProducto")
            );
            lista.add(tv);
        }
        rs.close();
        s.close();
        con.cerrarConnection();
        return lista;
    }
}
