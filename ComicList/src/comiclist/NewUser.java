
package comiclist;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *  <h2>Clase que se encarga de crear un usuario nuevo</h2>  
 * @author Radu Pascaru
 * @version 03/06/2018
 */
public class NewUser extends javax.swing.JFrame {

   /**
    * Mrtodo encargado de cargar los componentes
     @throws java.sql.SQLException   lanza una exepcion tipo SQL  
     * @throws javax.swing.UnsupportedLookAndFeelException    lanza una excepcion de no poder visualizar 
     * @throws java.lang.InstantiationException    lanza una exepcion de lanzamiento
     * @throws java.lang.IllegalAccessException    lanza una excepcion de acceso
     * @throws java.lang.ClassNotFoundException    lanza una excepcion de clase no encontrada
    * 
    */
    public NewUser() throws SQLException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, ClassNotFoundException {
      //  setUndecorated(true);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtUser = new javax.swing.JTextField();
        BAcceptar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        Pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel1.add(TxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 230, -1));

        BAcceptar.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BAcceptar.setText("Acceptar");
        BAcceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAcceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAcceptarActionPerformed(evt);
            }
        });
        jPanel1.add(BAcceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 90, 30));

        BCancelar.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        BCancelar.setText("Cancelar");
        BCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 90, 30));
        jPanel1.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 230, -1));

        jLabel4.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registrar nuevo usuario");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/322835162_baa5596007.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Boton que se encarga  de guardar el nuevo usuario en la base de daros
 */
    private void BAcceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAcceptarActionPerformed
        // TODO add your handling code here:
         try {
            BBDDClase JDBC = new BBDDClase();
            if (TxtUser.getText().isEmpty() ||  Pass.getPassword().length == 0 ) {
                JOptionPane.showMessageDialog(null, "¡Introduzca todos los datos!");
            } else {
               /**
                * Atributo que guarda el nombre de usuario
                */
                String nombreUsuario = TxtUser.getText();
                /**
                 * Atributo que se encarga de guardar la contraseña
                 */
                String password = String.valueOf(Pass.getPassword());
               /**
                * Atributo que se encarga de guarade la consula mysql
                */
                String sql1;
                sql1 = "SELECT COUNT(nombre) ";
                sql1 += "FROM usuario ";
                sql1 += "WHERE nombre='" + nombreUsuario + "';";
                ResultSet temp = JDBC.consulta1(sql1);
                int a = 0;
                if (temp.next()) {
                    System.out.println(temp.getInt(1));
                    a = temp.getInt(1);
                }
                if (a >= 1) {
                    JOptionPane.showMessageDialog(null, "¡El usuario ya existe!");
                    nombreUsuario = null;
                    password = null;
                } else {
                    try{
                    String sql;
                    sql = "INSERT INTO usuario(nombre,password) VALUES ('" + nombreUsuario + "','" + password + "');";
                    BBDDClase.consulta3(sql);
                    JOptionPane.showMessageDialog(null, "¡Creacion del usuario realizada correctamente!");
                    LogScreen Ls = new LogScreen();
                    Ls.setLocationRelativeTo(null);
                    Ls.setVisible(true);
                    this.dispose();
                    }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AdminScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
                BBDDClase.state.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡No se ha podido realizar la operacion!");
        }
    }//GEN-LAST:event_BAcceptarActionPerformed
/**
 * Boton que se encarga de cancelar la operacion de registro
 */
    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
           LogScreen Ls = new LogScreen();
            Ls.setLocationRelativeTo(null);
            Ls.setVisible(true);
            this.dispose();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BCancelarActionPerformed

    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAcceptar;
    private javax.swing.JButton BCancelar;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
