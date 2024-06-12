/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorBD;
import Controlador.ControladorBD2;
import Controlador.ControladorPajaros;
import Excepciones.CadenaAlphaException;
import Modelo.Pajaros;
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
public class GPajaros extends javax.swing.JFrame {
    ControladorPajaros contpaj;
    Object[] arreglo;
    DefaultTableModel model;
    ControladorBD conBD;
    Connection con;
    private Pajaros pajj;
    /**
     * Creates new form GPerro
     */
    private void insertarDatosDefecto() {
        
    }
    public GPajaros() {
        initComponents();
        contpaj = new ControladorPajaros();
        conBD= new ControladorBD();
        con=conBD.mysqlConexion();
        arreglo = new Object[15];
        pajj = new Pajaros();
        model = (DefaultTableModel)jTable1.getModel();
        insertarDatosDefecto();
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
        jTextId = new javax.swing.JTextField();
        jTextVida = new javax.swing.JTextField();
        jTextfVenta = new javax.swing.JTextField();
        jTextVuelo = new javax.swing.JTextField();
        jTextAccesorios = new javax.swing.JTextField();
        jTextCosto = new javax.swing.JTextField();
        Crear = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextJaula = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        OrID = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextHabitat = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextPico = new javax.swing.JTextField();
        OrdenarNombre = new javax.swing.JButton();
        Dieta = new javax.swing.JLabel();
        jTextDieta = new javax.swing.JTextField();
        Pais = new javax.swing.JLabel();
        jTextPais = new javax.swing.JTextField();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("PÁJAROS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("RAZA");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("VIDA");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("COLOR");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("ALIMENTO");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setText("ID");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setText("FECHA DE VENTA");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setText("TIPO VUELO");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setText("ACCESORIOS");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setText("COSTO");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jTextId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextIdFocusLost(evt);
            }
        });

        jTextVida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextVidaFocusLost(evt);
            }
        });

        jTextfVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextfVentaFocusLost(evt);
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
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Raza", "Color", "Alimento", "ID", "Vida", "Fecha de venta", "Peso", "Edad", "Costo", "Jaula", "Accesorios", "Tipo vuelo", "Habitat", "Tipo pico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jLabel17.setText("TIPO JAULA");

        OrID.setBackground(new java.awt.Color(204, 204, 255));
        OrID.setText("ORDENAR POR ID");
        OrID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrIDActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel14.setText("HABITAT");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel15.setText("TIPO PICO");

        OrdenarNombre.setBackground(new java.awt.Color(204, 204, 255));
        OrdenarNombre.setText("ORDENAR POR NOMBRE");
        OrdenarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarNombreActionPerformed(evt);
            }
        });

        Dieta.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Dieta.setText("DIETA");

        jTextDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDietaActionPerformed(evt);
            }
        });

        Pais.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Pais.setText("PAIS");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(75, 75, 75)
                                    .addComponent(jTextColor))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel4)
                                        .addComponent(Dieta))
                                    .addGap(55, 55, 55)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextAlimento)
                                        .addComponent(jTextId)
                                        .addComponent(jTextVida)
                                        .addComponent(jTextDieta))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTRaza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextJaula, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextfVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextAccesorios, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel10)
                                    .addComponent(Pais))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextHabitat, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jTextPico, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jTextPais))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OrdenarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OrID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Modificar)
                                    .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Menu)
                                    .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(310, 310, 310))
            .addGroup(layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTextfVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dieta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jTextJaula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextAccesorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(OrID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrdenarNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Crear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Borrar)
                        .addGap(18, 18, 18)
                        .addComponent(Menu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public void tabla(){
       contpaj.ordenar();
       Object rowData[][]=new Object[contpaj.ListaPajaros.size()][14];
       if( contpaj.ListaPajaros.size() == 0){
           jTable1.setModel(new javax.swing.table.DefaultTableModel(rowData,new String[]{"ID","NOMBRE","RAZA","COLOR","ALIMENTO",
                "ESPERANZA DE VIDA","FECHA DE VENTA","ACCESORIOS","TIPO JAULA","TIPO DE VUELO","HABITAT","TIPO DE PICO","COSTO"}));
       }
       for(int i=0;i<contpaj.ListaPajaros.size();i++){
           rowData[i][0]=contpaj.ListaPajaros.get(i).getIdMascota();
           rowData[i][1]=contpaj.ListaPajaros.get(i).getNombre();
           rowData[i][2]=contpaj.ListaPajaros.get(i).getRaza();
           rowData[i][3]=contpaj.ListaPajaros.get(i).getColor();
           rowData[i][4]=contpaj.ListaPajaros.get(i).gettAlimento();
           rowData[i][5]=contpaj.ListaPajaros.get(i).gettVida();
           rowData[i][6]=contpaj.ListaPajaros.get(i).getfVenta();
           rowData[i][7]=contpaj.ListaPajaros.get(i).getHabitat();
           rowData[i][8]=contpaj.ListaPajaros.get(i).getAccJaula();
           rowData[i][9]=contpaj.ListaPajaros.get(i).gettJaula();
           rowData[i][10]=contpaj.ListaPajaros.get(i).getCosto();
           rowData[i][11]=contpaj.ListaPajaros.get(i).gettPico();
           rowData[i][12]=contpaj.ListaPajaros.get(i).gettVuelo();
           
           
            jTable1.setModel(new javax.swing.table.DefaultTableModel(rowData,new String[]{"ID","NOMBRE","RAZA","COLOR","ALIMENTO",
                "ESPERANZA DE VIDA","FECHA DE VENTA","ACCESORIOS","TIPO JAULA","TIPO DE VUELO","HABITAT","TIPO DE PICO","COSTO"}));
       }
       
    }
    
    
    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
         Pajaros paj = new Pajaros();
    paj.setNombre(jTextNombre.getText());
    paj.setRaza(jTRaza.getText());
    paj.setColor(jTextColor.getText());
    paj.settAlimento(jTextAlimento.getText());
    paj.setIdMascota(Integer.parseInt(jTextId.getText()));
    paj.settVida(Integer.parseInt(jTextVida.getText()));
    paj.setCosto(Integer.parseInt(jTextCosto.getText()));
    paj.setfVenta(Integer.parseInt(jTextfVenta.getText()));
    paj.settJaula(jTextJaula.getText());
    paj.setAccJaula(jTextAccesorios.getText());
    paj.settPico(jTextPico.getText());
    paj.settVuelo(jTextVuelo.getText());
    paj.setHabitat(jTextHabitat.getText());

    Connection conexion = null;
    try {
        // Establecer la conexión con la base de datos
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/petshow", "root", "admin");

        // Crear la consulta SQL
        String sql = "INSERT INTO Pajaros (nombre, raza, color, tAlimento, idMascota, tVida, costo, fVenta, tJaula, accJaula, tPico, tVuelo, habitat) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        // Crear el PreparedStatement
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setString(1, paj.getNombre());
        statement.setString(2, paj.getRaza());
        statement.setString(3, paj.getColor());
        statement.setString(4, paj.gettAlimento());
        statement.setInt(5, paj.getIdMascota());
        statement.setInt(6, paj.gettVida());
        statement.setInt(7, paj.getCosto());
        statement.setInt(8, paj.getfVenta());
        statement.setString(9, paj.gettJaula());
        statement.setString(10, paj.getAccJaula());
        statement.setString(11, paj.gettPico());
        statement.setString(12, paj.gettVuelo());
        statement.setString(13, paj.getHabitat());

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


    }//GEN-LAST:event_CrearActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Pajaros paj= new Pajaros();
        paj = (Pajaros)contpaj.read(paj);
        paj.setNombre(jTextNombre.getText());
        if(contpaj.modify(paj)!=null)
        {
            JOptionPane.showMessageDialog(rootPane, "Objeto Modificado");
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Objeto con problemas al Modificar");
        tabla();
    }//GEN-LAST:event_ModificarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        Pajaros paj = new Pajaros();
        paj.setIdMascota(Integer.parseInt(jTextId.getText()));
        contpaj.delete(paj);
        tabla();
            
    }//GEN-LAST:event_BorrarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void OrIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrIDActionPerformed
        // TODO add your handling code here:
         contpaj.ordenar();
         
        Pajaros paj = new Pajaros();
        
       model.setRowCount(0);
       for(Pajaros pajaros: contpaj.ListaPajaros){
            arreglo[0]=paj.getNombre();    
            arreglo[1]=paj.getRaza();      
            arreglo[2]=paj.getColor();        
            arreglo[3]=paj.gettAlimento();                        
            arreglo[4]=paj.getIdMascota();                       
            arreglo[5]=paj.gettVida();                        
            arreglo[6]=paj.getfVenta();
            arreglo[7]=paj.getCosto();
            arreglo[8]=paj.gettJaula();
            arreglo[9]=paj.getAccJaula();
            arreglo[10]=paj.gettVuelo();
            arreglo[11]=paj.getHabitat();
            
            model.addRow(arreglo); 
        } 
   tabla();
        

        
    }//GEN-LAST:event_OrIDActionPerformed

    private void OrdenarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarNombreActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
                
        contpaj.ordenar(0, contpaj.ListaPajaros.size()-1);
        
        Pajaros paj = new Pajaros();
       
       for(Pajaros pajaros: contpaj.ListaPajaros){
            arreglo[0]=paj.getNombre();    
            arreglo[1]=paj.getRaza();      
            arreglo[2]=paj.getColor();        
            arreglo[3]=paj.gettAlimento();                        
            arreglo[4]=paj.getIdMascota();                       
            arreglo[5]=paj.gettVida();                        
            arreglo[6]=paj.getfVenta();
            arreglo[7]=paj.getCosto();
            arreglo[8]=paj.gettJaula();
            arreglo[9]=paj.getAccJaula();
            arreglo[10]=paj.gettVuelo();
            arreglo[11]=paj.getHabitat();
            
            model.addRow(arreglo); 
        }
   tabla();
    }//GEN-LAST:event_OrdenarNombreActionPerformed

    private void jTextDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDietaActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
       this.setVisible(false);
        Principal g1= new Principal();
        g1.setVisible(true);

    }//GEN-LAST:event_MenuActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
       String input = jTextNombre.getText();
    try {
        if (!input.matches("[a-zA-Z0-9]+")) {
            throw new Exception("La entrada contiene caracteres especiales");
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextfVentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextfVentaFocusLost


        // TODO add your handling code here:
         CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarFecha(jTextfVenta.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
      jTextfVenta.setText("");
      jTextfVenta.requestFocus();
        }
    }//GEN-LAST:event_jTextfVentaFocusLost

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost


        // TODO add your handling code here:
         CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarNombreMascota(jTextNombre.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
      jTextNombre.setText("");
      jTextNombre.requestFocus();
        }
    }//GEN-LAST:event_formFocusLost

    private void jTextIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextIdFocusLost



 CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarCadena(jTextId.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
    jTextId.setText("");
     jTextId .requestFocus();
        }
             // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdFocusLost

    private void jTextVidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextVidaFocusLost
        // TODO add your handling code here:
        
 CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarCadena(jTextVida.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
    jTextVida.setText("");
     jTextVida .requestFocus();
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_jTextVidaFocusLost

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
             // TODO add your handling code here
    }//GEN-LAST:event_jTextCostoFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Gperro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Gperro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Gperro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Gperro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        </editor-fold>
//
//        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GPajaros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Crear;
    private javax.swing.JLabel Dieta;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton OrID;
    private javax.swing.JButton OrdenarNombre;
    private javax.swing.JLabel Pais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTRaza;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextAccesorios;
    private javax.swing.JTextField jTextAlimento;
    private javax.swing.JTextField jTextColor;
    private javax.swing.JTextField jTextCosto;
    private javax.swing.JTextField jTextDieta;
    private javax.swing.JTextField jTextHabitat;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextJaula;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPais;
    private javax.swing.JTextField jTextPico;
    private javax.swing.JTextField jTextVida;
    private javax.swing.JTextField jTextVuelo;
    private javax.swing.JTextField jTextfVenta;
    // End of variables declaration//GEN-END:variables
}
