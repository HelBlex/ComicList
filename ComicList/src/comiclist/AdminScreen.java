/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comiclist;

import static comiclist.AdminScreen.jTable1;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *<h2>Clase que se encarga de mostrar la ventana de Administrador</h2>
 * @author Radu Pascaru
 * @version 03/06/2018
 * 
 */
public class AdminScreen extends javax.swing.JFrame {

  /**
   * metodo que se encarga de inicializar los componentes de la clase
   * @throws java.sql.SQLException   lanza una exepcion tipo SQL  
     * @throws javax.swing.UnsupportedLookAndFeelException    lanza una excepcion de no poder visualizar 
     * @throws java.lang.InstantiationException    lanza una exepcion de lanzamiento
     * @throws java.lang.IllegalAccessException    lanza una excepcion de acceso
     * @throws java.lang.ClassNotFoundException    lanza una excepcion de clase no encontrada
   */
    public AdminScreen() throws SQLException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, ClassNotFoundException {
      //  setUndecorated(true);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Contrasena = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BRegistrar = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        Nombre.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        Nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 150, -1));

        Contrasena.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        Contrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 150, -1));

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        BRegistrar.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BRegistrar.setText("Registrar nuevo User");
        BRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, 30));

        BEliminar.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BEliminar.setText("Eliminar Usuario");
        BEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 180, 30));

        BSalir.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BSalir.setText("Salir");
        BSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/911665.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * boton que se encarga de registrar un nuevo usuario
     */
    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
        // TODO add your handling code here:
        try {
            if (Nombre.getText().isEmpty() || Contrasena.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "¡Introduzca todos los datos!");
            } else {
                String nombreUsuario = Nombre.getText();
                String password = String.valueOf(Contrasena.getText());
               
                String sql1;
                BBDDClase JDBC = new BBDDClase();
                sql1 = "SELECT COUNT(nombre) ";
                sql1 += "FROM usuario ";
                sql1 += "WHERE nombre='" + nombreUsuario + "' or password='" + password + "';";
                ResultSet temp = JDBC.consulta1(sql1);
                int a = 0;
                if (temp.next()) {
                    System.out.println(temp.getInt(1));
                    a = temp.getInt(1);
                }
                if (a >= 1) {
                    JOptionPane.showMessageDialog(null, "¡El usuario ya existe!");
//                  
                   Nombre.setEnabled(true);   
                   Nombre.setText(null);
                   Contrasena.setText(null);
                } else {
                    String sql;
                    sql = "INSERT INTO usuario (nombre,password) ";
                    sql += "VALUES('" + nombreUsuario + "','" + password +"');";

                    BBDDClase.consulta3(sql);
                    JOptionPane.showMessageDialog(null, "¡Usuario creado correctamente!");
                    main();

                   Nombre.setEnabled(true);  
                   Nombre.setText(null);  
                   Contrasena.setText(null);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un problema");

            Nombre.setEnabled(true);
            Nombre.setText(null);
            Contrasena.setText(null);
        }
    }//GEN-LAST:event_BRegistrarActionPerformed

/**
 *  Boton que se encarga de eliminar un usuario        
 * 
 */
    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        // TODO add your handling code here:
         if (jTable1.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "¡Selecciona un usuario a borrar!");
        } else {
            try {
               BBDDClase JDBC = new BBDDClase();
                String nombreUsuario = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                if (nombreUsuario.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se puede eliminar el usuario");
                } else {
                 
                        String sql;
                        sql = "DELETE FROM usuario WHERE nombre='" + nombreUsuario + "';";
                        BBDDClase.consulta3(sql);
                        JOptionPane.showMessageDialog(null, "¡Usuario eliminado correctamente!");
                        main();
                       Nombre.setEnabled(true);
                       Nombre.setText(null);
                       Contrasena.setText(null);
                    }
               
                BBDDClase.state.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar el usuario");
            }
        }
    }//GEN-LAST:event_BEliminarActionPerformed
/**
 * Boton se encarga de cerar sesion
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
     * Metodo que se encarga de insertra los datos en el jTable
     */
    
    public void insertadatos() {
        if (jTable1.getSelectedRow() >= 0) {
            String usr = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            String pwd = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1));
           
           Nombre.setEnabled(false);
            Contrasena.setText(pwd);
            
        } else {
           Nombre.setEnabled(true);
            
        }
    }
   
    /**
     * Metodo que se encarga de rellenar el jTable con los datos de la base de datos
     * 
     */
    public static void main() {
         try {
            
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Nombre");
            modelo.addColumn("Password ");  
            jTable1.setModel(modelo);
            Object[] usuarios = new Object[2];
           /**
            * Atributo sql:guarda la informacion que devuelve la sentencia mysql
            */
            String sql;
            sql = "SELECT * FROM usuario; ";
            BBDDClase JDBC = new BBDDClase();
            ResultSet temporal = JDBC.consulta1(sql);
            while (temporal.next()) {
                String nombreUsuario = temporal.getString("nombre");
                String pass = temporal.getString("password");
                usuarios[0] = nombreUsuario;
                usuarios[1] = pass;
               
                modelo.addRow(usuarios);
            }
            BBDDClase.state.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un problema con la visualizacion de las tablas");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BRegistrar;
    private javax.swing.JButton BSalir;
    private javax.swing.JTextField Contrasena;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
