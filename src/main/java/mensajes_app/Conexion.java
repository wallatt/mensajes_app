package mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class Conexion {

    public Connection get_connection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/mensajes_app","root","");
            if(connection != null){
                System.out.println("Conexion exitosa");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return connection;
    }
}
