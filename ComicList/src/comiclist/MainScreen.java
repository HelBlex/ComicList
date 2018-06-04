/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comiclist;

import com.placeholder.PlaceHolder;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *<h2>Clase que se encarga de mostrar la pantalla principal de la APP</h2>
 * @author Radu Pascaru
 * @version 03/06/2018
 * 
 */
public class MainScreen extends javax.swing.JFrame {
    
/**
 * Atributo modeloLista  se encarga de las forma al jTable
 */ 
DefaultTableModel modeloLista =new DefaultTableModel();
 /**
  * Metodo que se encarga de iniciar los componentes
     * @throws java.sql.SQLException   lanza una exepcion tipo SQL  
     * @throws javax.swing.UnsupportedLookAndFeelException    lanza una excepcion de no poder visualizar 
     * @throws java.lang.InstantiationException    lanza una exepcion de lanzamiento
     * @throws java.lang.IllegalAccessException    lanza una excepcion de acceso
     * @throws java.lang.ClassNotFoundException    lanza una excepcion de clase no encontrada
     * @throws org.json.JSONException              lanza una excepcion de no poder procesar el json
  */
    public MainScreen() throws SQLException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, ClassNotFoundException, JSONException {
       // setUndecorated(true);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        rellenausuario();

        PlaceHolder holder = new PlaceHolder(TxtBuscar, "Intoduce el nompre del personaje a buscar");
       
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BViendo = new javax.swing.JButton();
        BVisto = new javax.swing.JButton();
        BPVer = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        TxtBuscar = new javax.swing.JTextField();
        Bbuscar = new javax.swing.JButton();
        BAViendo = new javax.swing.JButton();
        BAvisto = new javax.swing.JButton();
        BAPVer = new javax.swing.JButton();
        Bvolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NombreUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BViendo.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BViendo.setText("Viendo");
        BViendo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BViendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BViendoActionPerformed(evt);
            }
        });
        jPanel1.add(BViendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, 30));

        BVisto.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BVisto.setText("Visto");
        BVisto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BVisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVistoActionPerformed(evt);
            }
        });
        jPanel1.add(BVisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 211, 120, 30));

        BPVer.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BPVer.setText("Por Ver");
        BPVer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BPVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPVerActionPerformed(evt);
            }
        });
        jPanel1.add(BPVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 251, 120, 30));

        BSalir.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BSalir.setText("Salir");
        BSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 120, 40));

        datos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datos.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        datos.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(datos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        TxtBuscar.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        TxtBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(TxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 300, 30));

        Bbuscar.setFont(new java.awt.Font("Rubik", 1, 10)); // NOI18N
        Bbuscar.setText("Buscar");
        Bbuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Bbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 70, 30));

        BAViendo.setFont(new java.awt.Font("Rubik", 1, 10)); // NOI18N
        BAViendo.setText("Añadir a Viendo");
        BAViendo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAViendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAViendoActionPerformed(evt);
            }
        });
        jPanel1.add(BAViendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 120, 30));

        BAvisto.setFont(new java.awt.Font("Rubik", 1, 10)); // NOI18N
        BAvisto.setText("Añadir a Visto");
        BAvisto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAvisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAvistoActionPerformed(evt);
            }
        });
        jPanel1.add(BAvisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 120, 30));

        BAPVer.setFont(new java.awt.Font("Rubik", 1, 10)); // NOI18N
        BAPVer.setText("Añadir a Por Ver");
        BAPVer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAPVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAPVerActionPerformed(evt);
            }
        });
        jPanel1.add(BAPVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 120, 30));

        Bvolver.setFont(new java.awt.Font("Rubik", 1, 10)); // NOI18N
        Bvolver.setText("Volver");
        Bvolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvolverActionPerformed(evt);
            }
        });
        jPanel1.add(Bvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 60, 30));

        jLabel1.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("Nombre De Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 40));

        NombreUser.setEditable(false);
        NombreUser.setBackground(new java.awt.Color(204, 204, 204));
        NombreUser.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        NombreUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(NombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cropped-1366-768-480085.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Boton que se encarga de lanzar la panta de Viendo
 */
    private void BViendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BViendoActionPerformed
        // TODO add your handling code here:
        try {
         
            
           Viendo viendo = new Viendo();
           viendo.setLocationRelativeTo(null);
            viendo.setVisible(true);
            viendo.tabla();
            viendo.rellenartabla();
            this.dispose();
            
    }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException |SQLException ex) {
            Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BViendoActionPerformed
/**
 * Boton que se encarga de lanzar la pantalla de Visto
 */
    private void BVistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVistoActionPerformed
        // TODO add your handling code here:
         try {
         
        
           Visto visto = new Visto();
           visto.setLocationRelativeTo(null);
            visto.setVisible(true);
            visto.tabla();
            visto.rellenartabla();
            this.dispose();
            
    }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException |SQLException ex) {
            Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BVistoActionPerformed
/**
 * Boton que se encarga de lanzar la pantalla de PorVer
*/
    private void BPVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPVerActionPerformed
        // TODO add your handling code here:
         try {
         
           PorVer pver = new PorVer();
           pver.setLocationRelativeTo(null);
            pver.setVisible(true);
            pver.tabla();
            pver.rellenartabla();
            this.dispose();
            
    }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException |SQLException ex) {
            Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BPVerActionPerformed
/**
 * Boton que se encarga de cerrar sesion
 */
    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        // TODO add your handling code here:
        
        try {
            // TODO add your handling code here:
            dispose();
            LogScreen lg = new LogScreen();
            lg.setLocationRelativeTo(null);
            lg.setVisible(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    

    }//GEN-LAST:event_BSalirActionPerformed
/**
 * Boton que se encarga de buscar un personaje
 */
    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
    
        try {
      
       
        charactersrequest();
    } catch (JSONException ex) {
        Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    }//GEN-LAST:event_BbuscarActionPerformed

    private void TxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarActionPerformed
/**
 * Boton que se encarga de vover a la lista principal despues de buscar un personaje
 */
    private void BvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvolverActionPerformed
        // TODO add your handling code here:
        try {
        
       eliminar();
        cargarInterfaz();
    } catch (JSONException ex) {
        Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BvolverActionPerformed
/**
 * Boton que se encarga de añadir un comic a la lista Viendo
 */
    private void BAViendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAViendoActionPerformed
        // TODO add your handling code here:
        
        if (datos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "¡Selecciona un comic!");
        } else {
            try {
                String usr=NombreUser.getText();
                BBDDClase JDBC = new BBDDClase();
                String nom = String.valueOf(datos.getValueAt(datos.getSelectedRow(), 0));
              //  System.out.print(nom);
                String sql;
                sql = "INSERT INTO tviendo(Viendo,usuario) VALUES ('"+nom+"','"+usr+"');";
              //  System.out.println(sql);
                        BBDDClase.consulta3(sql);
                        JOptionPane.showMessageDialog(null, "Comic Añadido a la lista Viendo!");
                
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede añadir el comic");
        }
        }
    }//GEN-LAST:event_BAViendoActionPerformed
/**
 * Boton que se encarga de añadir un comic a la lista de Visto
 */
    private void BAvistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAvistoActionPerformed
        // TODO add your handling code here:
                if (datos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "¡Selecciona un comic!");
        } else {
            try {
                String usr=NombreUser.getText();
                BBDDClase JDBC = new BBDDClase();
                String nom = String.valueOf(datos.getValueAt(datos.getSelectedRow(), 0));
              //  System.out.print(nom);
                String sql;
                sql = "INSERT INTO tvisto(Visto,usuario) VALUES ('"+nom+"','"+usr+"');";
                System.out.println(sql);
                        BBDDClase.consulta3(sql);
                        JOptionPane.showMessageDialog(null, "Comic Añadido a la lista Viendo!");
                
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede añadir el comic");
        }
        }
    }//GEN-LAST:event_BAvistoActionPerformed
/**
 * Boton que se encarga de añadir un comic a la lista de PorVer
 */
    private void BAPVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAPVerActionPerformed
        // TODO add your handling code here:
                if (datos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "¡Selecciona un comic!");
        } else {
            try {
                String usr=NombreUser.getText();
                BBDDClase JDBC = new BBDDClase();
                String nom = String.valueOf(datos.getValueAt(datos.getSelectedRow(), 0));
              //  System.out.print(nom);
                String sql;
                sql = "INSERT INTO tporver(PorVer,usuario) VALUES ('"+nom+"','"+usr+"');";
                System.out.println(sql);
                        BBDDClase.consulta3(sql);
                        JOptionPane.showMessageDialog(null, "Comic Añadido a la lista Viendo!");
                
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede añadir el comic");
        }
        }
    }//GEN-LAST:event_BAPVerActionPerformed

    /**
     * Metodo que se encarga de limpiar el jTable
    */
    public void eliminar(){
       DefaultTableModel tb = (DefaultTableModel) datos.getModel();
     
        int a = datos.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        tb.removeRow(tb.getRowCount()-1);
        } 
        
    }
    /**
     * Metodo que se encarga de crear la tabla
     */
    public void tabla(){
      /**
       * ArrayList que guarda las columnas
       */
        ArrayList<Object> columna = new ArrayList<Object>();
        columna.add("Nombre");
  
        for(Object col:columna){
        modeloLista.addColumn(col);
      }
    }
  /**
   * Metodo que se encarga de guardar el nombre de usuario para su visualizacion
   */
    public static void rellenausuario() {
     
        /**
         * Atributo que se encarga de guardar el nombre de usuario introducido al iniciar sesion
         */
        String usr = LogScreen.nombreUsuario;
        NombreUser.setText(usr);
         
    }
/**
 * Metodo que se encarga de rellenar el jTable
     * @throws org.json.JSONException  lanza una excepcion de no poder procesar el json
 */
    public void cargarInterfaz() throws JSONException {
    try{
      
   
        this.datos.setModel(modeloLista);
       /**
        * ArrayList que guarda los objetos que se inserta en el jTable
        */
        ArrayList<Object[]  > comics = new ArrayList<Object[] >();
        
        String url=" http://gateway.marvel.com/v1/public/comics?format=comic&dateDescriptor=thisMonth&limit=100&apikey=8c774e75425c3bf2c0d8d8d1286619a1&ts=9&hash=d4b72af139bf64b7813b7def1adba77b";
            
	
	String comicrecuest = comiclist.MiClienteREST.request(url);

	JSONObject obj =new JSONObject(comicrecuest);
	JSONObject data =obj.getJSONObject("data");
	JSONArray results =data.getJSONArray("results");
	
	for (int i=0;i<results.length();i++) {
		
		JSONObject comic = results.getJSONObject(i);
		String nombre = comic.getString("title");
                Object ncom =nombre;
  
          Object[] ncomics = new Object []{ncom};
           comics.add(ncomics);
           
          for (Object  [] nom:comics){
              modeloLista.addRow(nom);
          } 
          datos.setModel(modeloLista);
    }
    
   
    }catch (JSONException ex) {
            JOptionPane.showMessageDialog(null, "¡No se ha podido realizar la operacion!");
    }
    }
   /**
    * Metodo que se encarga de la busqueda de un personaje
     * @throws org.json.JSONException  lanza una excepcion de no poder procesar el json
    */
    public void charactersrequest() throws JSONException{
	 	
   try{
       
       /**
        * ArrayList que guarda los objetos buscados
        */
        ArrayList<Object[]  > comics = new ArrayList<Object[] >();
     
        String url="http://gateway.marvel.com/v1/public/characters?limit=100&apikey=8c774e75425c3bf2c0d8d8d1286619a1&ts=9&hash=d4b72af139bf64b7813b7def1adba77b";
		
               
              
            String nombre = TxtBuscar.getText();
            String s=nombre.replace(" ","%20");
            
                String charactersrequest = comiclist.MiClienteREST.request(url+"&name="+s);
           //     System.out.print(charactersrequest);
		
		
		JSONObject obj =  new JSONObject(charactersrequest);
		JSONObject data =obj.getJSONObject("data");
		JSONArray results =data.getJSONArray("results");
			if(results.isNull(0)){
                    JOptionPane.showMessageDialog(null, "Comprueba que hayas intoducido bien el nombre"
                                                 + " \nTen en cuenta que el nombre tiene que estar en ingles");
                }
                else{
                            eliminar();
                   for (int i=0;i<results.length();i++) {
		
			JSONObject hero = results.getJSONObject(i);
			JSONObject ncomics =hero.getJSONObject("comics");
			JSONArray items = ncomics.getJSONArray("items");
                        for (int c=0;c<items.length();c++) {
				JSONObject itemsname = items.getJSONObject(c);
				String comicname = itemsname.getString("name");
                                Object ncom =comicname;
  
                 Object[] nomcomics = new Object []{ncom};
                    comics.add(nomcomics);
           
         
              for (Object  [] nom:comics){
              modeloLista.addRow(nom);
              } 
                  datos.setModel(modeloLista);
            
                        }
                  }
                }
                  
                  }catch (JSONException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un problema al accedar a la informacion "
                    + "\n Intentalo mas tarde");
   }
                
}
              

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAPVer;
    private javax.swing.JButton BAViendo;
    private javax.swing.JButton BAvisto;
    private javax.swing.JButton BPVer;
    private javax.swing.JButton BSalir;
    private javax.swing.JButton BViendo;
    private javax.swing.JButton BVisto;
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton Bvolver;
    public static javax.swing.JTextField NombreUser;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTable datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
