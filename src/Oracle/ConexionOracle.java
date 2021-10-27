
package Oracle;

import java.sql.*;

public class ConexionOracle {
    private Connection conexion;
    
    public ConexionOracle(String nombre,String contrasena) throws SQLException {
    
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        
        String nombre_servidor = "";
        String numero_puerto = "";
        String sid = "";
        
        String url = "jdbc:oracle:thin:@" + nombre_servidor + ":" + numero_puerto + ":" + sid;
        
        conexion = DriverManager.getConnection(url, nombre, contrasena);   
    }
    
    public void dml(String consulta) throws SQLException {
        Statement sentencia = conexion.createStatement();
        sentencia.executeUpdate(consulta);
        sentencia.close();
    }
    
    public String comprobar(String consulta) throws SQLException {
        Statement sentencia = conexion.createStatement();
        ResultSet resultado = sentencia.executeQuery(consulta);
        String resul = "";
        while(resultado.next()){
            resul += resultado.getString(1)+"\n";
        }
        sentencia.close();
        return resul;
    }
    
    
    
}
