package comiclist;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import org.json.JSONException;
/**
 * <h2> Clase que se encarga de lanzar la APP</h2>
 * @author Radu Pascaru
 * @version 03/06/2018
 * 
 */
public class APP {
/**
 * Metodo MAIN que se encarga de lanzar la aplicacion
     * @param args    paramentro donde se guarda la consulta
     * @throws org.json.JSONException  lanze una excepcion de no poder procesar el Json
     * @throws java.sql.SQLException   lanza una exepcion tipo SQL
 */
	 public static void main(String[] args) throws JSONException, SQLException{
      try {
            //abre la pantalla de Login
            LogScreen logscreen = new LogScreen();
            logscreen.setLocationRelativeTo(null);
            logscreen.setVisible(true);
    }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
}
      
}
}
	

