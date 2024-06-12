
package Vista;

import Controlador.ControladorBD;
import Controlador.ControladorBD2;
import Controlador.ControladorGato;
import Excepciones.CadenaAlphaException;
import Modelo.Gato;
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
 * @author Daniel M.A
 */
public class GGato extends javax.swing.JFrame {
    ControladorGato congato;
    Object[] arreglo;
    DefaultTableModel model;
    ControladorBD conBD;
    Connection con;
    private Gato gatt;
    /**
     * Creates new form GPerro
     */
    public GGato() {
        initComponents();
        congato = new ControladorGato();
        conBD= new ControladorBD();
        
        arreglo = new Object[13];
        gatt = new Gato();
        model = (DefaultTableModel)jTable1.getModel();
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTRaza = new javax.swing.JTextField();
        jTextColor = new javax.swing.JTextField();
        jTextAlimento = new javax.swing.JTextField();
        jTId = new javax.swing.JTextField();
        jTextVida = new javax.swing.JTextField();
        jTextFventa = new javax.swing.JTextField();
        jTextEdad = new javax.swing.JTextField();
        jTextPeso = new javax.swing.JTextField();
        jTextCosto = new javax.swing.JTextField();
        Crear = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextPelaje = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        OrID = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jCTcaza = new javax.swing.JComboBox<>();
        OrNOMBRE = new javax.swing.JButton();
        domestico = new javax.swing.JLabel();
        jTextdomestico = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("GATO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("RAZA");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("ESPERANZA VIDA");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("COLOR");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("ALIMENTO");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setText("ID");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setText("FECHA DE VENTA");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setText("EDAD");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setText("PESO");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setText("COSTO");

        jTextNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextNombreFocusLost(evt);
            }
        });
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jTId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTIdFocusLost(evt);
            }
        });

        jTextFventa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFventaFocusLost(evt);
            }
        });
        jTextFventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFventaActionPerformed(evt);
            }
        });

        jTextEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextEdadFocusLost(evt);
            }
        });

        jTextCosto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextCostoFocusLost(evt);
            }
        });

        Crear.setBackground(new java.awt.Color(204, 204, 255));
        Crear.setText("CREAR");
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });

        Modificar.setBackground(new java.awt.Color(204, 204, 255));
        Modificar.setText("MODIFICAR");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Borrar.setBackground(new java.awt.Color(204, 204, 255));
        Borrar.setText("BORRAR");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Raza", "Color", "Alimento", "ID", "Vida", "Fecha de venta", "Peso", "Edad", "Costo", "Pelaje", "Tendencia cazar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel17.setText("PELAJE");

        OrID.setBackground(new java.awt.Color(204, 204, 255));
        OrID.setText("ORDENAR POR ID");
        OrID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrIDActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel14.setText("TENDENCIA A LA CASA");

        jCTcaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", "" }));
        jCTcaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTcazaActionPerformed(evt);
            }
        });

        OrNOMBRE.setBackground(new java.awt.Color(204, 204, 255));
        OrNOMBRE.setText("ORDENAR POR NOMBRE");
        OrNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrNOMBREActionPerformed(evt);
            }
        });

        domestico.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        domestico.setText("DOMESTICO");

        jTextdomestico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdomesticoActionPerformed(evt);
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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(75, 75, 75)
                            .addComponent(jTextColor, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(64, 64, 64)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                .addComponent(jTRaza))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCTcaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextVida, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domestico, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextdomestico)
                    .addComponent(jTextEdad)
                    .addComponent(jTextCosto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextPelaje)
                    .addComponent(jTextFventa)
                    .addComponent(jTextPeso)
                    .addComponent(jTId))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(OrID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Modificar)
                            .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(OrNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(349, 349, 349))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jTextPelaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(OrID)
                                .addGap(14, 14, 14)
                                .addComponent(OrNOMBRE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Modificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Crear)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(domestico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Borrar)
                                    .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextdomestico)
                                        .addGap(56, 56, 56))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jCTcaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  public void tabla() {
   congato.ordenar();
   Object rowData[][] = new Object[congato.ListaGato.size()][12]; // Ajusta el tamaño del arreglo a 12 columnas
   if (congato.ListaGato.size() == 0) {
       jTable1.setModel(new javax.swing.table.DefaultTableModel(rowData,new String[]{"ID","NOMBRE","RAZA","COLOR","ALIMENTO","ESPERANZA DE VIDA","TENDENCIA A LA CAZA","FECHA DE VENTA","PELAJE","PESO","EDAD","COSTO"}));
   }
   for(int i = 0; i < congato.ListaGato.size(); i++) {
       rowData[i][0] = congato.ListaGato.get(i).getIdMascota();
       rowData[i][1] = congato.ListaGato.get(i).getNombre();
       rowData[i][2] = congato.ListaGato.get(i).getRaza();
       rowData[i][3] = congato.ListaGato.get(i).getColor();
       rowData[i][4] = congato.ListaGato.get(i).gettAlimento();
       rowData[i][5] = congato.ListaGato.get(i).gettVida();
       rowData[i][6] = congato.ListaGato.get(i).gettCaza();
       rowData[i][7] = congato.ListaGato.get(i).getfVenta();
       rowData[i][8] = congato.ListaGato.get(i).gettPelaje();
       rowData[i][9] = congato.ListaGato.get(i).getPesoK();
       rowData[i][10] = congato.ListaGato.get(i).getEdad();
       rowData[i][11] = congato.ListaGato.get(i).getCosto();
   }
   jTable1.setModel(new javax.swing.table.DefaultTableModel(rowData,new String[]{"ID","NOMBRE","RAZA","COLOR","ALIMENTO","ESPERANZA DE VIDA","TENDENCIA A LA CAZA","FECHA DE VENTA","PELAJE","PESO","EDAD","COSTO"}));
}

  
  
  
  
  
  
  
  
    
    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
   
    Gato gat = new Gato();
    gat.setNombre(jTextNombre.getText());
    gat.setRaza(jTRaza.getText());
    gat.setColor(jTextColor.getText());
    gat.settAlimento(jTextAlimento.getText());
    gat.setIdMascota(Integer.parseInt(jTId.getText()));
    gat.settVida(Integer.parseInt(jTextVida.getText()));
    gat.setCosto(Integer.parseInt(jTextCosto.getText()));
    gat.setfVenta(Integer.parseInt(jTextFventa.getText()));
    gat.settPelaje(jTextPelaje.getText());
    gat.setPesoK(Integer.parseInt(jTextPeso.getText()));
    gat.setEdad(Integer.parseInt(jTextEdad.getText()));

    Connection conexion = null;
    try {
        // Establecer la conexión con la base de datos
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/petshow", "root", "admin");

        // Crear la consulta SQL
        String sql = "INSERT INTO Gato (nombre, raza, color, tAlimento, idMascota, tVida, costo, fVenta, tPelaje, pesoK, edad) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        // Crear el PreparedStatement
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setString(1, gat.getNombre());
        statement.setString(2, gat.getRaza());
        statement.setString(3, gat.getColor());
        statement.setString(4, gat.gettAlimento());
        statement.setInt(5, gat.getIdMascota());
        statement.setInt(6, gat.gettVida());
        statement.setInt(7, gat.getCosto());
        statement.setInt(8, gat.getfVenta());
        statement.setString(9, gat.gettPelaje());
        statement.setInt(10, gat.getPesoK());
        statement.setInt(11, gat.getEdad());

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

    
        
        
        
        
        
        tabla();
    }//GEN-LAST:event_CrearActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Gato gat= new Gato();
        gat = (Gato)congato.read(gat);
        gat.setNombre(jTextNombre.getText());
        if(congato.modify(gat)!=null)
        {
            JOptionPane.showMessageDialog(rootPane, "Objeto Modificado");
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Objeto con problemas al Modificar");
        tabla();
    }//GEN-LAST:event_ModificarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        Gato gat = new Gato();
        gat.setIdMascota(Integer.parseInt(jTId.getText()));
        congato.delete(gat);
            
        tabla();
    }//GEN-LAST:event_BorrarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int posicion =jTable1.getSelectedRow();
        jTextNombre.setText(congato.ListaGato.get(posicion).getNombre());
        jTRaza.setText(congato.ListaGato.get(posicion).getRaza());
        jTextColor.setText(congato.ListaGato.get(posicion).getColor());
        jTextAlimento.setText(congato.ListaGato.get(posicion).gettAlimento());
        jTId.setText(String.valueOf(congato.ListaGato.get(posicion).getIdMascota()));
        jTextVida.setText(String.valueOf((char) congato.ListaGato.get(posicion).gettVida()));
        jTextFventa.setText(String.valueOf((char) congato.ListaGato.get(posicion).getfVenta()));
        jTextPeso.setText(String.valueOf((char) congato.ListaGato.get(posicion).getPesoK()));
        jTextCosto.setText(String.valueOf((char) congato.ListaGato.get(posicion).getCosto()));
        jTextEdad.setText(String.valueOf((char) congato.ListaGato.get(posicion).getEdad()));
        
        jTextPelaje.setText(congato.ListaGato.get(posicion).gettPelaje());
        tabla();
    }//GEN-LAST:event_jTable1MouseClicked

    private void OrIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrIDActionPerformed
        congato.ordenar();
        
        Gato gat= new Gato();
        
       model.setRowCount(0);
        for(Gato gato: congato.ListaGato){
            arreglo[0]=gat.getNombre();    
            arreglo[1]=gat.getRaza();      
            arreglo[2]=gat.getColor();        
            arreglo[3]=gat.gettAlimento();                        
            arreglo[4]=gat.getIdMascota();                       
            arreglo[5]=gat.gettVida();                        
            arreglo[6]=gat.getfVenta();
            arreglo[7]=gat.getPesoK();
            arreglo[8]=gat.getEdad();
            arreglo[9]=gat.getCosto();
            arreglo[10]=gat.gettPelaje();
            arreglo[11]=gat.gettCaza();
            
            model.addRow(arreglo); 
        }                               
        tabla();
       
    }//GEN-LAST:event_OrIDActionPerformed

    private void jTextFventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFventaActionPerformed
        // TODO add your handling code here:
        CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarFecha(jTextFventa.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
      jTextFventa.setText("");
      jTextFventa.requestFocus();
        }
        
        
    }//GEN-LAST:event_jTextFventaActionPerformed

    private void jCTcazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTcazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTcazaActionPerformed

    private void OrNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrNOMBREActionPerformed
     model.setRowCount(0);
        
        Gato gat= new Gato();
        
        congato.ordenar(0, congato.ListaGato.size()-1);
        
        for(Gato gato: congato.ListaGato){
            arreglo[0]=gat.getNombre();    
            arreglo[1]=gat.getRaza();      
            arreglo[2]=gat.getColor();        
            arreglo[3]=gat.gettAlimento();                        
            arreglo[4]=gat.getIdMascota();                       
            arreglo[5]=gat.gettVida();                        
            arreglo[6]=gat.getfVenta();
            arreglo[7]=gat.getPesoK();
            arreglo[8]=gat.getEdad();
            arreglo[9]=gat.getCosto();
            arreglo[10]=gat.gettPelaje();
            arreglo[11]=gat.gettCaza();
            
            model.addRow(arreglo); 
        }                               
        tabla();
  
    }//GEN-LAST:event_OrNOMBREActionPerformed

    private void jTextdomesticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdomesticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdomesticoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Principal g1= new Principal();
        g1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextFventaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFventaFocusLost
          CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarFecha(jTextFventa.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
      jTextFventa.setText("");
      jTextFventa.requestFocus();
        }
        
        
        
    }//GEN-LAST:event_jTextFventaFocusLost

    private void jTextNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNombreFocusLost
           CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarNombreMascota(jTextNombre.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
     jTextNombre.setText("");
      jTextNombre.requestFocus();
        }
    }//GEN-LAST:event_jTextNombreFocusLost

    private void jTIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTIdFocusLost



 CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarCadena(jTId.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
    jTId.setText("");
     jTId .requestFocus();
        }
             // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdFocusLost

    private void jTextCostoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextCostoFocusLost


        // TODO add your handling code here:
        
 CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarCadena(jTextCosto.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
    jTextCosto.setText("");
     jTextCosto .requestFocus();
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_jTextCostoFocusLost

    private void jTextEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextEdadFocusLost


        // TODO add your handling code here:
        
 CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarCadena(jTextEdad.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
    jTextEdad.setText("");
     jTextEdad .requestFocus();
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_jTextEdadFocusLost

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
            java.util.logging.Logger.getLogger(GGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GGato().setVisible(true);
            }
        });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton OrID;
    private javax.swing.JButton OrNOMBRE;
    private javax.swing.JLabel domestico;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCTcaza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTRaza;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextAlimento;
    private javax.swing.JTextField jTextColor;
    private javax.swing.JTextField jTextCosto;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextFventa;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPelaje;
    private javax.swing.JTextField jTextPeso;
    private javax.swing.JTextField jTextVida;
    private javax.swing.JTextField jTextdomestico;
    // End of variables declaration//GEN-END:variables
}
