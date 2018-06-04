
package comiclist;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * <h2>Clase que se encarga de hacer la comunicacion con la base de datos</h2>
 * @author Radu Pascaru
 * @version 03/06/2018
 */
public class BBDDClase {
	/**
         * Atributi url:se encarga de guardar la url de acceso a la base de datos
         */
    private static String url = "jdbc:mysql://localhost:3306/comiclist" ;
    /**
     * Atributo user:se engarga de guardar el usuario
     */
    private static String user = "root";
    /**
     * Atributo pass:se encarga de guardar la contraseña
     */
    private static String pass = "Radu1997.";
    /**     
     * Atributo con :por defecto nullo
     */
    private static Connection conn = null;
    /**
     * Atributo state de tipo Statment
     */
    public static Statement state;
   /**
    * Metodo que se encarga de hacel la conexion a la base de datos
    * @throws SQLException lanza una excepcion sql
    */
    public BBDDClase() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Connection");
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conexion establecida");
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al conectarse a la base de datos");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
     
        
    }
    /**
     * Funcion que se encarga de las consultas select
     * @param sql  paramentro donde se guarda la consulta
     * @return resultado:devuelve el resultado de la consulta
     * @throws java.sql.SQLException lanza una excepcion tipo sql
     */
    
    public ResultSet consulta1(String sql) throws SQLException {
        ResultSet resultado = null;
        state = (Statement) conn.createStatement();
        resultado = state.executeQuery(sql);
        return resultado;
    }
    
    /**
     * Funcion que se encarga de las consulas count
     * @param sql  paramentro donde se guarda la consulta
     * @return estado:en general devuelve true/false
     * @throws java.sql.SQLException lanza una excepcion tipo sql
     */
 
    public boolean consulta2(String sql) throws SQLException {
        boolean estado = false;
        state = (Statement) conn.createStatement();
        state.executeQuery(sql);
        return estado;
    }
    
    /**
     * Funcion que se encarga de las consutas delet/insert/update
     * 
     * @param sql paramentro donde se guarda la consulta
     * @throws java.sql.SQLException lanza una excepcion tipo sql
     */ 
    
    public static void consulta3(String sql) throws SQLException {
        state = (Statement) conn.createStatement();
        state.executeUpdate(sql);
    }
}

