package co.edu.ufps.connection;

import java.sql.*;

/**
 *
 * @author Manuel Florez
 */
public class conexion {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);
        return this.con;
    }

    public void cerrarConnection() throws SQLException {
        if (this.con != null) {
            this.con.close();
        }
    }

    public conexion() {
    }

    private final String url = "jdbc:mysql://sandbox2.ufps.edu.co/inventario";
    private final String user = "proyectoweb";
    private final String password = "proyectoweb";
    private Connection con = null;

}
