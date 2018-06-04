
package comiclist;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.json.JSONException;

/**
 * <h2>Clse que se encarga de mostrar la pandaya de inicio de sesion </h2>
 * @author Radu Pascaru
 * @version 03/06/2018
 */
public class LogScreen extends javax.swing.JFrame {

        /**
         * Metodo que se encarga de inicializar los componentes  
         * @throws javax.swing.UnsupportedLookAndFeelException    lanza una excepcion de no poder visualizar 
         * @throws java.lang.InstantiationException    lanza una exepcion de lanzamiento
         * @throws java.lang.IllegalAccessException    lanza una excepcion de acceso
        * @throws java.lang.ClassNotFoundException    lanza una excepcion de clase no encontrada
         */ 
    
    public LogScreen() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
       // setUndecorated(true);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
       
        
    }
    
    /**
     * Atributo nombreUsuario:se guarda el nombre del usuario introducido
     */
static String nombreUsuario;
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtUser = new javax.swing.JTextField();
        BAcceptar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        BRegistrar = new javax.swing.JButton();
        RPass = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TxtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setName("ComicList"); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jLabel1.setText("Usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));
        jPanel2.add(TxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 210, -1));

        BAcceptar.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BAcceptar.setText("Acceptar");
        BAcceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAcceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAcceptarActionPerformed(evt);
            }
        });
        jPanel2.add(BAcceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 90, 30));

        BCancelar.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BCancelar.setText("Cancelar");
        BCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(BCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 90, 30));

        BRegistrar.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BRegistrar.setText("Registrar");
        BRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(BRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 170, 30));

        RPass.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        RPass.setText("Restablecer Contraseña");
        RPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPassActionPerformed(evt);
            }
        });
        jPanel2.add(RPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 230, 30));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Comic LIST");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 40));
        jPanel2.add(TxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 210, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/322835162_baa5596007.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Boton Acceptar que se encarga de comprobar si el usuario es corecto y darle acceso a la APP
 */
    private void BAcceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAcceptarActionPerformed
        // TODO add your handling code here:
        nombreUsuario = TxtUser.getText();
       /**
        * Atributo password:se encarga de guardar la contraseña que el usuario a introducido
            */
        String password = String.valueOf(TxtPass.getPassword());
        /**
         * Atributo sql:guarda la sentencia mysql
        */
        String sql;
        sql = "SELECT COUNT(nombre) ";
        sql += "FROM usuario ";
        sql += "WHERE nombre='" + nombreUsuario + "' and password='" + password + "'";
        if (nombreUsuario.equals("administrador") && password.equals("admin12345")) {       
            try {
                AdminScreen AD = new AdminScreen();
                AD.setLocationRelativeTo(null);
                AD.setVisible(true);
                AdminScreen.main();
                this.dispose();
            } catch (SQLException | UnsupportedLookAndFeelException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                Logger.getLogger(LogScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                System.out.println(sql);
                BBDDClase JDBC = new BBDDClase();
                ResultSet temp = JDBC.consulta1(sql);
                int a = 0;
                if (temp.next()) {
                    System.out.println(temp.getInt(1));
                    a = temp.getInt(1);
                }
                if (a == 1) {
                    try {
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

                } else {
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null, "¡El usuario no existe!");
                    this.setVisible(true);
                    TxtUser.setText(null);
                    TxtPass.setText(null);
                    nombreUsuario = null;
                    password = null;
                }
                BBDDClase.state.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error en el SQL");
            }
        }
        
    }//GEN-LAST:event_BAcceptarActionPerformed
/**
 * Boton Cancelar:se encarga se cerrar la applicacion
 */
    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_BCancelarActionPerformed
/**
 * Boton Registrar se encarga de lanzar la pantalla de registro
 */
    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
        // TODO add your handling code here:
         try {
            NewUser regscreen = new NewUser();
            regscreen.setLocationRelativeTo(null);
            regscreen.setVisible(true);
            this.dispose();
        } catch (SQLException | UnsupportedLookAndFeelException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(LogScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BRegistrarActionPerformed

    private void RPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPassActionPerformed
        // TODO add your handling code here:
       
        nombreUsuario = TxtUser.getText();
     
        if(TxtUser.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "¡Introduzca el nombre de usuario");
        }else{
            try{
                RestablecerPass rpas= new RestablecerPass();
                rpas.setLocationRelativeTo(null);
                rpas.setVisible(true);
                this.dispose();
            }catch (SQLException | UnsupportedLookAndFeelException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(LogScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
        }
      
    }//GEN-LAST:event_RPassActionPerformed
   
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAcceptar;
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BRegistrar;
    private javax.swing.JButton RPass;
    private javax.swing.JPasswordField TxtPass;
    public static javax.swing.JTextField TxtUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
