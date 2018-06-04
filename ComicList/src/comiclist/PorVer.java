
package comiclist;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import org.json.JSONException;

/**
 *<h2>Clase que se encarga de visualizar la vista PorVer</h2>
 * @author Radu Pascaru 
 * @version 03/06/2018s
 */
public class PorVer extends javax.swing.JFrame {

    
    DefaultTableModel modeloLista =new DefaultTableModel();
    /**
     * Metodo encargado de cargar los componentes y el usuario
     * @throws java.sql.SQLException   lanza una exepcion tipo SQL  
     * @throws javax.swing.UnsupportedLookAndFeelException    lanza una excepcion de no poder visualizar 
     * @throws java.lang.InstantiationException    lanza una exepcion de lanzamiento
     * @throws java.lang.IllegalAccessException    lanza una excepcion de acceso
     * @throws java.lang.ClassNotFoundException    lanza una excepcion de clase no encontrada
     */
    public PorVer()throws SQLException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, ClassNotFoundException {
    //  setUndecorated(true);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
       // rellenartabla();
       rellenausuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        BAViendo = new javax.swing.JButton();
        BAVisto = new javax.swing.JButton();
        BIRViendo = new javax.swing.JButton();
        BIrVisto = new javax.swing.JButton();
        Bvolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NombreUser = new javax.swing.JTextField();
        BElComic = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        ));
        jScrollPane1.setViewportView(datos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 550, 470));

        BAViendo.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BAViendo.setText("Añadir Viendo");
        BAViendo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAViendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAViendoActionPerformed(evt);
            }
        });
        jPanel1.add(BAViendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 140, 30));

        BAVisto.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BAVisto.setText("Añadir a Visto");
        BAVisto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAVisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAVistoActionPerformed(evt);
            }
        });
        jPanel1.add(BAVisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 140, 30));

        BIRViendo.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BIRViendo.setText("Viendo");
        BIRViendo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BIRViendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIRViendoActionPerformed(evt);
            }
        });
        jPanel1.add(BIRViendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 231, 120, 30));

        BIrVisto.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BIrVisto.setText("Visto");
        BIrVisto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BIrVisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIrVistoActionPerformed(evt);
            }
        });
        jPanel1.add(BIrVisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 191, 120, 30));

        Bvolver.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        Bvolver.setText("Volver");
        Bvolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvolverActionPerformed(evt);
            }
        });
        jPanel1.add(Bvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 271, 120, 30));

        jLabel1.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, 30));

        NombreUser.setEditable(false);
        NombreUser.setBackground(new java.awt.Color(204, 204, 204));
        NombreUser.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        NombreUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(NombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, 30));

        BElComic.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BElComic.setText("Eliminar Comic");
        BElComic.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BElComic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BElComicActionPerformed(evt);
            }
        });
        jPanel1.add(BElComic, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 170, 30));

        BSalir.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BSalir.setText("Salir");
        BSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 321, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image (3).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Boton encargado de añadir un comic a la lista de Viendo
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
           
                String sql;
                sql = "INSERT INTO tviendo(Viendo,usuario) VALUES ('"+nom+"','"+usr+"');";
              //  System.out.println(sql);
                        BBDDClase.consulta3(sql);
                        JOptionPane.showMessageDialog(null, "Comic Añadido a la lista Viendo!");
                
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede añadir el comic");
        }
            eliminarcomic();
        }
    }//GEN-LAST:event_BAViendoActionPerformed
/**
 * Boton encargado de añadir un comic a la lista de Visto
 */
    private void BAVistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAVistoActionPerformed
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
                        JOptionPane.showMessageDialog(null, "Comic Añadido a la lista Visto!");
                
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede añadir el comic");
        }
        }
              eliminarcomic();
    }//GEN-LAST:event_BAVistoActionPerformed
/**
 * Boton encargado de lanzar la ventana de la lista Viendo
 */
    private void BIRViendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIRViendoActionPerformed
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
    }//GEN-LAST:event_BIRViendoActionPerformed
/**
 * Boton encargado de lanzar la venta de la lista Visto
 */
    private void BIrVistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIrVistoActionPerformed
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
    }//GEN-LAST:event_BIrVistoActionPerformed
/**
 * Boton encargado de volver a la pantalla principal
 */
    private void BvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvolverActionPerformed
        // TODO add your handling code here:
        try{ 
                        MainScreen MS = new MainScreen();
                        MS.setLocationRelativeTo(null);
                        MS.setVisible(true); 
                        MS.tabla();
                        MS.cargarInterfaz();
                        this.dispose();
                       } catch (SQLException | UnsupportedLookAndFeelException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                        Logger.getLogger(LogScreen.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (JSONException ex) {
                        Logger.getLogger(LogScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }//GEN-LAST:event_BvolverActionPerformed
/**
 * Boton encargado de eliminar un comic de la lista
 */
    private void BElComicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BElComicActionPerformed
        // TODO add your handling code here:
        if (datos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "¡Selecciona un Comic a borrar!");
        } else {
        eliminarcomic();
      }
      JOptionPane.showMessageDialog(null, "¡Comic eliminado correctamente!");
    }//GEN-LAST:event_BElComicActionPerformed
/**
 * Boton encargado de cerrar sesion
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
   * Metodo que se encarga de crear las columnda del jTable
   */
    public void tabla() {
       ArrayList<Object> columna = new ArrayList<Object>();
        columna.add("Nombre");
  
        for(Object col:columna){
        modeloLista.addColumn(col);
        
      }
      
    }
   /**
    * Metodo que se encarga de eliminar un comic s
    */ 
    public void eliminarcomic(){
             if (datos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "¡Selecciona un Comic a borrar!");
        } else {
            try {
               BBDDClase JDBC = new BBDDClase();
                String nombreComic = String.valueOf(datos.getValueAt(datos.getSelectedRow(), 0));
                if (nombreComic.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se puede eliminar el comic");
                } else {
                     String nombreUser=NombreUser.getText();
                        String sql;
                        sql = "DELETE FROM tporver WHERE PorVer='" + nombreComic + "';";
                        BBDDClase.consulta3(sql);
                        JOptionPane.showMessageDialog(null, "¡Comic eliminado correctamente!");
                        rellenartabla();
                     
                    }
               
                BBDDClase.state.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar el Comic");
            }
        }
         }
   /**
    * Metodo que se encarga de rellenar el jTable con los datos de la base de datos
    * 
     * @throws java.sql.SQLException llanza un excepcion tipo sql
    */
    public void rellenartabla() throws SQLException{
      try{
           ArrayList<Object[]  > comics = new ArrayList<Object[] >();
        BBDDClase JDBC = new BBDDClase();
        String usr = LogScreen.nombreUsuario;
        String sql;
        sql = "SELECT PorVer FROM tporver WHERE usuario='" + usr + "';";
        System.out.println(sql);
        ResultSet temporal = JDBC.consulta1(sql);
      
      while(temporal.next()){
          Object [] fila =new Object [1];
          
      for (int i=0;i<1;i++)
      fila[i] = temporal.getObject(i+1);
      
            modeloLista.addRow(fila);
      
              }
          datos.setModel(modeloLista);
       
    }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al mostrar el listado de  Por Ver");
    }
    }
    /**
     * Metodo encargado de guardar el nombre de usuario en un Atributo
     */
    public static void rellenausuario() {
       /**
        * Atributo que se encarga de guardar el nombre de usuario
        */
        String usr = LogScreen.nombreUsuario;
        NombreUser.setText(usr);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAViendo;
    private javax.swing.JButton BAVisto;
    private javax.swing.JButton BElComic;
    private javax.swing.JButton BIRViendo;
    private javax.swing.JButton BIrVisto;
    private javax.swing.JButton BSalir;
    private javax.swing.JButton Bvolver;
    public static javax.swing.JTextField NombreUser;
    private javax.swing.JTable datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}