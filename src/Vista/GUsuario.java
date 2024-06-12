package Vista;
import Modelo.Usuario;
import Controlador.ControladorUsuario;
import Controlador.ControladorBD;
import Controlador.ControladorBD2;
import Excepciones.CadenaAlphaException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Luisa Lopez Castro
 */
public class GUsuario extends javax.swing.JFrame {
  
    
    ControladorUsuario conUs;
    Object[] arreglo;
    DefaultTableModel model;
    ControladorBD conBD;
    Connection con;
    private Usuario usu;
    private final ControladorUsuario conus;
    public GUsuario() {
        initComponents();
        conus= new ControladorUsuario();
        conBD = new ControladorBD();
        con=conBD.mysqlConexion();
        arreglo = new Object[8];
        usu = new Usuario();
        model = (DefaultTableModel)jTable1.getModel();
    }
    
    //private void consultarBD();
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CREAR = new javax.swing.JButton();
        ORDENARPORNOMBRE = new javax.swing.JButton();
        BORRAR = new javax.swing.JButton();
        jTextNacimiento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MODIFICAR1 = new javax.swing.JButton();
        ORDENARPORID1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("USUARIO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("APELLIDO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("EMAIL");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("DIRECCION");

        jTextDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextDireccionFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setText("ID");

        jTextId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextIdFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setText("TELEFONO");

        jTextTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextTelefonoFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setText("NACIMIENTO");

        CREAR.setBackground(new java.awt.Color(204, 204, 255));
        CREAR.setText("CREAR");
        CREAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREARActionPerformed(evt);
            }
        });

        ORDENARPORNOMBRE.setBackground(new java.awt.Color(204, 204, 255));
        ORDENARPORNOMBRE.setText("ORDENAR POR NOMBRE");
        ORDENARPORNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORDENARPORNOMBREActionPerformed(evt);
            }
        });

        BORRAR.setBackground(new java.awt.Color(204, 204, 255));
        BORRAR.setText("BORRAR");
        BORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRARActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Email", "Dirección", "Tipo", "Telefono", "Nacimiento"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        MODIFICAR1.setBackground(new java.awt.Color(204, 204, 255));
        MODIFICAR1.setText("MODIFICAR");
        MODIFICAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICAR1ActionPerformed(evt);
            }
        });

        ORDENARPORID1.setBackground(new java.awt.Color(204, 204, 255));
        ORDENARPORID1.setText("ORDENAR POR ID");
        ORDENARPORID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORDENARPORID1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                            .addComponent(jTextTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MODIFICAR1)
                                    .addComponent(ORDENARPORNOMBRE)
                                    .addComponent(CREAR, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ORDENARPORID1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(111, 111, 111))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ORDENARPORNOMBRE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ORDENARPORID1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MODIFICAR1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(4, 4, 4))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CREAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BORRAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jLabel9)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void tabla(){
       conUs.ordenar();
       Object rowData[][]=new Object[conUs.ListaUsuario.size()][7];
       if( conUs.ListaUsuario.size() == 0){
           jTable1.setModel(new javax.swing.table.DefaultTableModel(rowData,new String[]{"ID","NOMBRE","APELLIDO","DIRECCION"}));
       }
       for(int i=0;i<conUs.ListaUsuario.size();i++){
           rowData[i][0]=conUs.ListaUsuario.get(i).getId();
           rowData[i][1]=conUs.ListaUsuario.get(i).getNombre();
           rowData[i][2]=conUs.ListaUsuario.get(i).getApellido();
           rowData[i][4]=conUs.ListaUsuario.get(i).getDireccion();

           
            jTable1.setModel(new javax.swing.table.DefaultTableModel(rowData,new String[]{"ID","NOMBRE","APELLIDO","DIRECCION"}));
        
            
            
            
           
           
       }
    }

    
    private void BORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRARActionPerformed
        Usuario Us = new Usuario();
        Us.setId(Integer.parseInt(jTextId.getText()));
        conUs.delete(Us);
        tabla();
    }//GEN-LAST:event_BORRARActionPerformed

    private void CREARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREARActionPerformed

    
    Usuario usuario = new Usuario();
    usuario.setNombre(jTextNombre.getText());
    usuario.setApellido(jTextApellido.getText());
    //usuario.setcElectronico(jTextEmail.getText());
    usuario.setDireccion(jTextDireccion.getText());

    Connection conexion = null;
    try {
        // Establecer la conexión con la base de datos
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/petshow", "root", "admin");

        // Crear la consulta SQL
        String sql = "INSERT INTO Usuarios (nombre, apellido, cElectronico, direccion) VALUES (?, ?, ?, ?)";

        // Crear el PreparedStatement
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setString(1, usuario.getNombre());
        statement.setString(2, usuario.getApellido());
        statement.setString(3, usuario.getcElectronico());
        statement.setString(4, usuario.getDireccion());

        // Ejecutar la consulta
        statement.executeUpdate();

        // Cerrar el statement y la conexión
        statement.close();
        conexion.close();

        // Mostrar mensaje de éxito o realizar alguna otra acción

        // Actualizar la tabla en la interfaz de usuario
        tabla();

    } catch (SQLException ex) {
        // Manejar cualquier error de conexión o consulta
        ex.printStackTrace();
    }




    }//GEN-LAST:event_CREARActionPerformed

    private void ORDENARPORNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORDENARPORNOMBREActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
                
            Usuario us = new Usuario();
        conUs.ordenar(0, conUs.ListaUsuario.size()-1);
        for(Usuario usuario: conUs.ListaUsuario){
            arreglo[0]=us.getId();    
            arreglo[1]=us.getNombre();      
            arreglo[2]=us.getApellido();        
            arreglo[3]=us.getcElectronico();                        
            arreglo[4]=us.getDireccion();                       
            arreglo[5]=us.getTipo();                        
            arreglo[6]=us.getTelefono();
            arreglo[7]=us.getfNacimiento();
                                              
            model.addRow(arreglo); 
        }
   tabla();
    }//GEN-LAST:event_ORDENARPORNOMBREActionPerformed

    private void MODIFICAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICAR1ActionPerformed
        Usuario Us= new Usuario();
        Us = (Usuario)conUs.read(Us);
        Us.setNombre(jTextNombre.getText());
        if(conUs.modify(Us)!=null)
        {
            JOptionPane.showMessageDialog(rootPane, "Objeto Modificado");
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Objeto con problemas al Modificar");
        tabla();
    }//GEN-LAST:event_MODIFICAR1ActionPerformed

    private void ORDENARPORID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORDENARPORID1ActionPerformed
        // TODO add your handling code here:
        conUs.ordenar();
        
        Usuario us  =new Usuario();
        
       model.setRowCount(0);
       for(Usuario usuario: conUs.ListaUsuario){
            arreglo[0]=us.getId();    
            arreglo[1]=us.getNombre();      
            arreglo[2]=us.getApellido();        
            arreglo[3]=us.getcElectronico();                        
            arreglo[4]=us.getDireccion();                       
            arreglo[5]=us.getTipo();                        
            arreglo[6]=us.getTelefono();
            arreglo[7]=us.getfNacimiento();
                                              
            model.addRow(arreglo); 
        }
   tabla();
    }//GEN-LAST:event_ORDENARPORID1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Principal g1= new Principal();
        g1.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int posicion =jTable1.getSelectedRow();
        jTextNombre.setText(conUs.ListaUsuario.get(posicion).getNombre());
        jTextApellido.setText(conUs.ListaUsuario.get(posicion).getApellido());
        jTextDireccion.setText(conUs.ListaUsuario.get(posicion).getDireccion());
        jTextCorreo.setText(conUs.ListaUsuario.get(posicion).getcElectronico());
        jTextId.setText(String.valueOf(conUs.ListaUsuario.get(posicion).getId()));
        tabla();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDireccionFocusLost


 CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarDireccion(jTextDireccion.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
      jTextDireccion.setText("");
      jTextDireccion.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDireccionFocusLost

    private void jTextIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextIdFocusLost
        // TODO add your handling code here:
        
 CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarCadena(jTextId.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
    jTextId.setText("");
     jTextId .requestFocus();
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdFocusLost

    private void jTextTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTelefonoFocusLost
        // TODO add your handling code here:
        
 CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarCadena(jTextTelefono.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
    jTextTelefono.setText("");
     jTextTelefono .requestFocus();
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelefonoFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GAdministrador().setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUsuario().setVisible(true);
            }
     });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BORRAR;
    private javax.swing.JButton CREAR;
    private javax.swing.JButton MODIFICAR1;
    private javax.swing.JButton ORDENARPORID1;
    private javax.swing.JButton ORDENARPORNOMBRE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextNacimiento;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}
