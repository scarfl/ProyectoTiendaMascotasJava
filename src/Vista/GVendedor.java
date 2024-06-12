package Vista;
import Controlador.ControladorBD;
import Controlador.ControladorBD2;
import Controlador.ControladorVendedor;
import Excepciones.CadenaAlphaException;
import Modelo.Vendedor;
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
public class GVendedor extends javax.swing.JFrame {
  
    
    ControladorVendedor conVen;
    DefaultTableModel model;
    Object[]arreglo;
    ControladorBD conBD;
    Connection con;
    private Vendedor ven;
    public GVendedor() {
        initComponents();
        conVen= new ControladorVendedor();
        conBD= new ControladorBD();
        con=conBD.mysqlConexion();
        arreglo = new Object[10];
        model = (DefaultTableModel)jTable1.getModel();
    }
    private void modifyControladorDB() {
        try
         {
            ControladorBD2 ControladorBD = new ControladorBD2();
            Connection  con = conBD.mysqlConexion();
            Statement   stmt=con.createStatement();
            ResultSet   rs=stmt.executeQuery("select * from Gato");
            while(rs.next())
            {
               ven = new Vendedor();
               
                arreglo[0]=rs.getInt(1);                 
                ven.setId(rs.getInt(1));
                arreglo[1]=rs.getString(2);                   
                ven.setNombre(rs.getString(2));                              
                arreglo[2]=rs.getString(3);                 
                ven.setApellido(rs.getString(3));                                    ;     
                arreglo[3]=rs.getString(4);
                ven.setcElectronico(rs.getString(4));
                arreglo[4]=rs.getString(5);                 
                ven.setDireccion(rs.getString(5));  
                arreglo[5]=rs.getString(6);
                ven.setTipo(rs.getString(6));
                arreglo[6]=rs.getInt(7);                  
                ven.setTelefono(rs.getInt(7));                                            
                arreglo[7]=rs.getInt(8);                 
                ven.setfNacimiento(rs.getInt(8)); 
                arreglo[8]=rs.getInt(9);                 
                ven.setfIngreso(rs.getInt(9));
                arreglo[9]=rs.getInt(10);                 
                ven.setSueldo(rs.getInt(10));
                
              
                
                
                
                model.addRow(arreglo);                  
                conVen.create(ven);
                                                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBD2.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    
    }
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextIngreso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextSueldo = new javax.swing.JTextField();
        CREAR = new javax.swing.JButton();
        ORDENARPORID = new javax.swing.JButton();
        BORRAR = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextNacimiento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MODIFICAR1 = new javax.swing.JButton();
        ORDENARPORNOMBRE = new javax.swing.JButton();
        Menu = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("VENDEDOR");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("TIPO");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setText("ID");

        jTextId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextIdFocusLost(evt);
            }
        });
        jTextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdActionPerformed(evt);
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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setText("INGRESO");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setText("SUELDO");

        CREAR.setBackground(new java.awt.Color(204, 204, 255));
        CREAR.setText("CREAR");
        CREAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREARActionPerformed(evt);
            }
        });

        ORDENARPORID.setBackground(new java.awt.Color(204, 204, 255));
        ORDENARPORID.setText("ORDENAR POR NOMBRE");
        ORDENARPORID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORDENARPORIDActionPerformed(evt);
            }
        });

        BORRAR.setBackground(new java.awt.Color(204, 204, 255));
        BORRAR.setText("BORRAR");
        BORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRARActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Usuario", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Email", "Dirección", "Tipo", "Telefono", "Nacimiento", "Ingreso", "Sueldo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        MODIFICAR1.setBackground(new java.awt.Color(204, 204, 255));
        MODIFICAR1.setText("MODIFICAR");
        MODIFICAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICAR1ActionPerformed(evt);
            }
        });

        ORDENARPORNOMBRE.setBackground(new java.awt.Color(204, 204, 255));
        ORDENARPORNOMBRE.setText("ORDENAR POR ID");
        ORDENARPORNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORDENARPORNOMBREActionPerformed(evt);
            }
        });

        Menu.setBackground(new java.awt.Color(204, 204, 255));
        Menu.setText("MENU");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
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
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel12))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                            .addComponent(jTextTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextIngreso, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextSueldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MODIFICAR1)
                                    .addComponent(ORDENARPORID)
                                    .addComponent(CREAR, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ORDENARPORNOMBRE)
                                    .addComponent(Menu)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel9)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(ORDENARPORID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ORDENARPORNOMBRE)
                        .addGap(1, 1, 1)))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(MODIFICAR1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CREAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BORRAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Menu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel9)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void tabla(){
       conVen.ordenar();
       Object rowData[][]=new Object[conVen.ListaVendedor.size()][10];
       if( conVen.ListaVendedor.size() == 0){
           jTable1.setModel(new javax.swing.table.DefaultTableModel(rowData,new String[]{"ID","NOMBRE","APELLIDO","EMAIL","DIRECCION","TIPO","TELEFONO","NACIMIENTO","INGRESO","SUELDO"}));
       }
       for(int i=0;i<conVen.ListaVendedor.size();i++){
           rowData[i][0]=conVen.ListaVendedor.get(i).getId();
           rowData[i][1]=conVen.ListaVendedor.get(i).getNombre();
           rowData[i][2]=conVen.ListaVendedor.get(i).getApellido();
           rowData[i][3]=conVen.ListaVendedor.get(i).getcElectronico();
           rowData[i][4]=conVen.ListaVendedor.get(i).getDireccion();
           rowData[i][5]=conVen.ListaVendedor.get(i).getTipo();
           rowData[i][6]=conVen.ListaVendedor.get(i).getTelefono();
           rowData[i][7]=conVen.ListaVendedor.get(i).getfNacimiento();
           rowData[i][8]=conVen.ListaVendedor.get(i).getfIngreso();
           rowData[i][9]=conVen.ListaVendedor.get(i).getSueldo();
            jTable1.setModel(new javax.swing.table.DefaultTableModel(rowData,new String[]{"ID","NOMBRE","APELLIDO","EMAIL","DIRECCION","TIPO","TELEFONO","NACIMIENTO","INGRESO","SUELDO"}));
        
           
           
       }
    }
    
    
    private void BORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRARActionPerformed
        Vendedor Ven = new Vendedor();
        Ven.setId(Integer.parseInt(jTextId.getText()));
        conVen.delete(Ven);
        tabla();
    }//GEN-LAST:event_BORRARActionPerformed

    private void CREARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREARActionPerformed

    Vendedor Ven = new Vendedor();
    Ven.setNombre(jTextNombre.getText());
    Ven.setApellido(jTextApellido.getText());
    Ven.setcElectronico(jTextCorreo.getText());
    Ven.setDireccion(jTextDireccion.getText());
    Ven.setId(Integer.parseInt(jTextId.getText()));
    Ven.setTelefono(Integer.parseInt(jTextTelefono.getText()));
    Ven.setfNacimiento(Integer.parseInt(jTextNacimiento.getText()));
    Ven.setfIngreso(Integer.parseInt(jTextIngreso.getText()));
    Ven.setSueldo(Integer.parseInt(jTextSueldo.getText()));
    
    Connection conexion = null;
    try {
        // Establecer la conexión con la base de datos
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/petshow", "root", "admin");

        // Crear la consulta SQL
        String sql = "INSERT INTO Vendedor (nombre, apellido, correo, direccion, id, telefono, nacimiento, ingreso, sueldo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        // Crear el PreparedStatement
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setString(1, Ven.getNombre());
        statement.setString(2, Ven.getApellido());
        statement.setString(3, Ven.getcElectronico());
        statement.setString(4, Ven.getDireccion());
        statement.setInt(5, Ven.getId());
        statement.setInt(6, Ven.getTelefono());
        statement.setInt(7, Ven.getfNacimiento());
        statement.setInt(8, Ven.getfIngreso());
        statement.setInt(9, Ven.getSueldo());

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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void ORDENARPORIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORDENARPORIDActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
         
        Vendedor ven= new Vendedor();
        
        conVen.ordenar(0, conVen.ListaVendedor.size()-1);
                
        for(Vendedor vendedor: conVen.ListaVendedor){
            arreglo[0]=ven.getId();    
            arreglo[1]=ven.getNombre();      
            arreglo[2]=ven.getApellido();        
            arreglo[3]=ven.getcElectronico();                        
            arreglo[4]=ven.getDireccion();                       
            arreglo[5]=ven.getTipo();                        
            arreglo[6]=ven.getTelefono();
            arreglo[7]=ven.getfNacimiento();
            arreglo[8]=ven.getfIngreso();
            arreglo[9]=ven.getSueldo();
            
            model.addRow(arreglo); 
        } 
   tabla();
        
    }//GEN-LAST:event_ORDENARPORIDActionPerformed

    private void MODIFICAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICAR1ActionPerformed
        Vendedor Ven= new Vendedor();
        Ven = (Vendedor)conVen.read(Ven);
        Ven.setNombre(jTextNombre.getText());
        if(conVen.modify(Ven)!=null)
        {
            JOptionPane.showMessageDialog(rootPane, "Objeto Modificado");
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Objeto con problemas al Modificar");
        tabla();
    }//GEN-LAST:event_MODIFICAR1ActionPerformed

    private void ORDENARPORNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORDENARPORNOMBREActionPerformed
        // TODO add your handling code here:
        conVen.ordenar();
                 
        Vendedor ven= new Vendedor();
        
       model.setRowCount(0);
        for(Vendedor vendedor: conVen.ListaVendedor){
            arreglo[0]=ven.getId();    
            arreglo[1]=ven.getNombre();      
            arreglo[2]=ven.getApellido();        
            arreglo[3]=ven.getcElectronico();                        
            arreglo[4]=ven.getDireccion();                       
            arreglo[5]=ven.getTipo();                        
            arreglo[6]=ven.getTelefono();
            arreglo[7]=ven.getfNacimiento();
            arreglo[8]=ven.getfIngreso();
            arreglo[9]=ven.getSueldo();
            
            model.addRow(arreglo); 
        }   
   tabla();
    }//GEN-LAST:event_ORDENARPORNOMBREActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        this.setVisible(false);
        Principal g1= new Principal();
        g1.setVisible(true);

    }//GEN-LAST:event_MenuActionPerformed

    private void jTextDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDireccionFocusLost


        // TODO add your handling code here:
         CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarDireccion(jTextDireccion.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
      jTextDireccion.setText("");
      jTextDireccion.requestFocus();
        }
    }//GEN-LAST:event_jTextDireccionFocusLost

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
            
    }//GEN-LAST:event_jTextIdFocusLost

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GVendedor().setVisible(true);
            }
        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GAdministrador().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BORRAR;
    private javax.swing.JButton CREAR;
    private javax.swing.JButton MODIFICAR1;
    private javax.swing.JButton Menu;
    private javax.swing.JButton ORDENARPORID;
    private javax.swing.JButton ORDENARPORNOMBRE;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextIngreso;
    private javax.swing.JTextField jTextNacimiento;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextSueldo;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}
