
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
 * <h2>Clse que se encarga de visualizar la lista Viendo</h2>
 * @author Radu Pascaru 
 * @version 03/06/2018
 */
public class Viendo extends javax.swing.JFrame {

    
    DefaultTableModel modeloLista =new DefaultTableModel();
    
    /**
     * Metodo encargado de iniciar los componenete y el nobre de usuario
     * @throws java.sql.SQLException   lanza una exepcion tipo SQL  
     * @throws javax.swing.UnsupportedLookAndFeelException    lanza una excepcion de no poder visualizar 
     * @throws java.lang.InstantiationException    lanza una exepcion de lanzamiento
     * @throws java.lang.IllegalAccessException    lanza una excepcion de acceso
     * @throws java.lang.ClassNotFoundException    lanza una excepcion de clase no encontrada
     */
    
    public Viendo()throws SQLException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, ClassNotFoundException {
    
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
       
       rellenausuario();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        BAPVer = new javax.swing.JButton();
        BAVisto = new javax.swing.JButton();
        IrAPVer = new javax.swing.JButton();
        IrAVisto = new javax.swing.JButton();
        BVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NombreUser = new javax.swing.JTextField();
        BElimComic = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 550, 470));

        BAPVer.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BAPVer.setText("Añadir A Por Ver");
        BAPVer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAPVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAPVerActionPerformed(evt);
            }
        });
        jPanel1.add(BAPVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 160, 30));

        BAVisto.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BAVisto.setText("Añadir a Visto");
        BAVisto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAVisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAVistoActionPerformed(evt);
            }
        });
        jPanel1.add(BAVisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 160, 30));

        IrAPVer.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        IrAPVer.setText("Por Ver");
        IrAPVer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IrAPVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrAPVerActionPerformed(evt);
            }
        });
        jPanel1.add(IrAPVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 30));

        IrAVisto.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        IrAVisto.setText("Visto");
        IrAVisto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IrAVisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrAVistoActionPerformed(evt);
            }
        });
        jPanel1.add(IrAVisto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 30));

        BVolver.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BVolver.setText("Volver");
        BVolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 120, 30));

        jLabel1.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        NombreUser.setEditable(false);
        NombreUser.setBackground(new java.awt.Color(204, 204, 204));
        NombreUser.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        NombreUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(NombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 110, 30));

        BElimComic.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BElimComic.setText("Eliminar Comic");
        BElimComic.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BElimComic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BElimComicActionPerformed(evt);
            }
        });
        jPanel1.add(BElimComic, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 160, 30));

        BSalir.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BSalir.setText("Salir");
        BSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 120, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cropped-790-580-878070.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Boton encargado de añadir un comic a la lista de PorVer
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
                        JOptionPane.showMessageDialog(null, "Comic Añadido a la lista Por Ver!");
                
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede añadir el comic");
        }
        }
        eliminarcomic();
    }//GEN-LAST:event_BAPVerActionPerformed
/**
 * Boron encargado de añadir un comic a la lista de Visto
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
 * Boton encargado de abrir la ventana de la lista PorVer
 */
    private void IrAPVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrAPVerActionPerformed
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
    }//GEN-LAST:event_IrAPVerActionPerformed
/**
 * Boton encargado de abrir la ventana de la lista Visto
 */
    private void IrAVistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrAVistoActionPerformed
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
    }//GEN-LAST:event_IrAVistoActionPerformed
/**
 * Boton encargado de volver a la pagina principal
 */
    private void BVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVolverActionPerformed
        // TODO add your handling code here:
                      try{ 
                         MainScreen MS = new MainScreen();
                        MS.setLocationRelativeTo(null);
                        MS.setVisible(true); 
                        MS.tabla();
                        MS.cargarInterfaz();
                        this.dispose();
                       } catch (SQLException | UnsupportedLookAndFeelException | InstantiationException | IllegalAccessException | ClassNotFoundException | JSONException ex) {
                        Logger.getLogger(LogScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }

    }//GEN-LAST:event_BVolverActionPerformed
/**
 * Boton encargado de eliminar un comir de la lista
 */
    private void BElimComicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BElimComicActionPerformed
        // TODO add your handling code here:
      if (datos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "¡Selecciona un Comic a borrar!");
        } else {
        eliminarcomic();
      }
      JOptionPane.showMessageDialog(null, "¡Comic eliminado correctamente!");
    }//GEN-LAST:event_BElimComicActionPerformed
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
     * Metodo que crea las columnas del jTable
     */
    public void tabla() {
       ArrayList<Object> columna = new ArrayList<Object>();
        columna.add("Nombre");
  
        for(Object col:columna){
        modeloLista.addColumn(col);
        
      }
      
    }
    /**
     * Metodo que rellema el jTable con los datos pedidos a la base de datos
     * 
     * @throws java.sql.SQLException lanza una excempcion de sql
     */
    public void rellenartabla() throws SQLException{
      try{
           ArrayList<Object[]  > comics = new ArrayList<Object[] >();
        BBDDClase JDBC = new BBDDClase();
        String usr = LogScreen.nombreUsuario;
        String sql;
        sql = "SELECT Viendo FROM tviendo WHERE usuario='" + usr + "';";
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
            JOptionPane.showMessageDialog(null, "Error al mostrar el listado de Viendo");
    }
    }
    /**
     * Metodo que se encarga de guardar el nombre del usuario
     */
    public static void rellenausuario() {
       /**
        * Atributo que guarda el nombre del usuario
        */
        String usr = LogScreen.nombreUsuario;
        NombreUser.setText(usr);
        
        
    }
    /**
     * Metodo que se encarga de eliminar un comic
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
                      //  JOptionPane.showMessageDialog(null, "¡Comic eliminado correctamente!");
                        rellenartabla();
                     
                    }
               
                BBDDClase.state.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar el Comic");
            }
        }
         }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAPVer;
    private javax.swing.JButton BAVisto;
    private javax.swing.JButton BElimComic;
    private javax.swing.JButton BSalir;
    private javax.swing.JButton BVolver;
    private javax.swing.JButton IrAPVer;
    private javax.swing.JButton IrAVisto;
    public static javax.swing.JTextField NombreUser;
    private javax.swing.JTable datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
