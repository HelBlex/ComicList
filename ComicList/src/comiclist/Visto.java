/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *<h2>Clase que se encarga de visualiazr la lista Visto</h2>
 * @author Radu Pascaru 
 *@version 03/06/2018
 */
public class Visto extends javax.swing.JFrame {

    
    DefaultTableModel modeloLista =new DefaultTableModel();
    
    /**
     * Metodo que se encarga de iniciar los componentes
     * @throws java.sql.SQLException   lanza una exepcion tipo SQL  
     * @throws javax.swing.UnsupportedLookAndFeelException    lanza una excepcion de no poder visualizar 
     * @throws java.lang.InstantiationException    lanza una exepcion de lanzamiento
     * @throws java.lang.IllegalAccessException    lanza una excepcion de acceso
     * @throws java.lang.ClassNotFoundException    lanza una excepcion de clase no encontrada
     */
    public Visto()throws SQLException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, ClassNotFoundException {
   
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
        BAViendo = new javax.swing.JButton();
        BIPVer = new javax.swing.JButton();
        BIViendo = new javax.swing.JButton();
        BVvolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NombreUser = new javax.swing.JTextField();
        BElimComic = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 550, 470));

        BAPVer.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BAPVer.setText("Añadir A Por Ver");
        BAPVer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAPVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAPVerActionPerformed(evt);
            }
        });
        jPanel1.add(BAPVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 140, 40));

        BAViendo.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BAViendo.setText("Añadir a Viendo");
        BAViendo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAViendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAViendoActionPerformed(evt);
            }
        });
        jPanel1.add(BAViendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 140, 40));

        BIPVer.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BIPVer.setText("Por Ver");
        BIPVer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BIPVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIPVerActionPerformed(evt);
            }
        });
        jPanel1.add(BIPVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, 30));

        BIViendo.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BIViendo.setText("Viendo");
        BIViendo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BIViendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIViendoActionPerformed(evt);
            }
        });
        jPanel1.add(BIViendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 30));

        BVvolver.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BVvolver.setText("Volver");
        BVvolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BVvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVvolverActionPerformed(evt);
            }
        });
        jPanel1.add(BVvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 110, 30));

        jLabel1.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabel1.setText("Nombre Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 65, -1, 30));

        NombreUser.setEditable(false);
        NombreUser.setBackground(new java.awt.Color(204, 204, 204));
        NombreUser.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        NombreUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(NombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 30));

        BElimComic.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BElimComic.setText("Eliminar Comic");
        BElimComic.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BElimComic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BElimComicActionPerformed(evt);
            }
        });
        jPanel1.add(BElimComic, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 140, 40));

        jButton1.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jButton1.setText("Salir");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cropped-807-867-872239.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
 * Boron encargado de añadir un comic a la lista de Viendo
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
        }
        eliminarcomic();
    }//GEN-LAST:event_BAViendoActionPerformed
/**
 * Boton encargado de abrir la ventana de la lista PorVer
 */
    private void BIPVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIPVerActionPerformed
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
    }//GEN-LAST:event_BIPVerActionPerformed
/**
 * Boton encargado de abrir la ventana de la lista Viendo
 */
    private void BIViendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIViendoActionPerformed
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

    }//GEN-LAST:event_BIViendoActionPerformed
/**
 * Boton encargado de volver a la pagina principal
 */
    private void BVvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVvolverActionPerformed
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
    }//GEN-LAST:event_BVvolverActionPerformed
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
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed

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
     * @throws java.sql.SQLException lanza una excepcion sql
     */
    public void rellenartabla() throws SQLException{
      try{
        ArrayList<Object[]  > comics = new ArrayList<Object[] >();
        BBDDClase JDBC = new BBDDClase();
        String usr = LogScreen.nombreUsuario;
        String sql;
        sql = "SELECT Visto FROM tvisto WHERE usuario='" + usr + "';";
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
            JOptionPane.showMessageDialog(null, "Error al mostrar el listado de Visto");
    }
    }
    /**
     * Metodo que se encarga de guardar el nombre del usuario
     */
    public static void rellenausuario() {
       
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
                        JOptionPane.showMessageDialog(null, "¡Comic eliminado correctamente!");
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
    private javax.swing.JButton BAViendo;
    private javax.swing.JButton BElimComic;
    private javax.swing.JButton BIPVer;
    private javax.swing.JButton BIViendo;
    private javax.swing.JButton BVvolver;
    public static javax.swing.JTextField NombreUser;
    private javax.swing.JTable datos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
