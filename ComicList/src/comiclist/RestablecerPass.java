
package comiclist;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *  <h2>Clase que se encarga de restablecer la contraseña</h2>  
 * @author Radu Pascaru
 * @version 03/06/2018
 */
public class RestablecerPass extends javax.swing.JFrame {

   /**
    * Mrtodo encargado de cargar los componentes
     @throws java.sql.SQLException   lanza una exepcion tipo SQL  
     * @throws javax.swing.UnsupportedLookAndFeelException    lanza una excepcion de no poder visualizar 
     * @throws java.lang.InstantiationException    lanza una exepcion de lanzamiento
     * @throws java.lang.IllegalAccessException    lanza una excepcion de acceso
     * @throws java.lang.ClassNotFoundException    lanza una excepcion de clase no encontrada
    * 
    */
    public RestablecerPass() throws SQLException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException, ClassNotFoundException {
      //  setUndecorated(true);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        initComponents();
        rellenausuario();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtNewPass = new javax.swing.JTextField();
        BAcceptar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();
        NombreUser = new javax.swing.JTextField();
        TxtRPass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jLabel1.setText("Nueva Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        jLabel2.setText("Repita la Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        TxtNewPass.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jPanel1.add(TxtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, -1));

        BAcceptar.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        BAcceptar.setText("Acceptar");
        BAcceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAcceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAcceptarActionPerformed(evt);
            }
        });
        jPanel1.add(BAcceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 90, 30));

        BCancelar.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        BCancelar.setText("Cancelar");
        BCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 90, 30));

        NombreUser.setEditable(false);
        NombreUser.setBackground(new java.awt.Color(204, 204, 204));
        NombreUser.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jPanel1.add(NombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, -1));

        TxtRPass.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jPanel1.add(TxtRPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 210, -1));

        jLabel4.setFont(new java.awt.Font("Rubik", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cambiar la contraseña");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 50));

        jLabel5.setFont(new java.awt.Font("Rubik", 1, 12)); // NOI18N
        jLabel5.setText("Nombre de Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, 20));

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
 * Boton que se encarga  de guardar la nueva contrasseña en la base de daros
 */
    private void BAcceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAcceptarActionPerformed
        // TODO add your handling code here:
        if (TxtNewPass.getText().isEmpty() || TxtRPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Introduzca todos los datos!");
        }else if(TxtNewPass.getText().equals(TxtRPass.getText())){
        try {  
             BBDDClase JDBC = new BBDDClase();
            String nombreUser=NombreUser.getText();
            String password = String.valueOf(TxtNewPass.getText());
            String sql;
            sql = "UPDATE usuario SET password='" + password + "' WHERE nombre='" + nombreUser + "';";
            System.out.println(sql);
             
                BBDDClase.consulta3(sql);
                JOptionPane.showMessageDialog(null, "¡Modificacion realizada correctamente!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede modificar el usuario");
            }
            TxtNewPass.setText(null);
            TxtRPass.setText(null);
        } 
         else {
              JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }
     

    }//GEN-LAST:event_BAcceptarActionPerformed
/**
 * Boton que se encarga de cancelar la operacion de restablecer la contraseña
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
            Logger.getLogger(RestablecerPass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BCancelarActionPerformed
 /**
     * Metodo que se encarga de guardar el nombre del usuario
     */
    public static void rellenausuario(){
       /**
        * Atributo que se encarga de guardar el nombre de usuario
        */
        
        String usr = LogScreen.nombreUsuario;
        NombreUser.setText(usr);
        
        
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAcceptar;
    private javax.swing.JButton BCancelar;
    public static javax.swing.JTextField NombreUser;
    private javax.swing.JTextField TxtNewPass;
    private javax.swing.JTextField TxtRPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
