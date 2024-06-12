/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorBD;
import Controlador.ControladorBD2;
import Controlador.ControladorPeces;
import Excepciones.CadenaAlphaException;
import Modelo.Peces;
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
 * @author  Daniel M.A
 */
public class GPeces extends javax.swing.JFrame {
    ControladorPeces contPeces;
    Object[] arreglo;
    DefaultTableModel model;
    ControladorBD conBD;
    Connection con;
    private Peces pezz;
    /**
     * Creates new form GPerro
     */
    public GPeces() {
        initComponents();
        contPeces = new ControladorPeces();
        conBD= new ControladorBD();
        con=conBD.mysqlConexion();
        arreglo = new Object[13];
        pezz = new Peces();
        model = (DefaultTableModel)jTable1.getModel();
        modifyControladorDB();
    }

    private void modifyControladorDB()
    {
         try
         {
            ControladorBD2 ControladorBD = new ControladorBD2();
            Connection  con = conBD.mysqlConexion();
            Statement   stmt=con.createStatement();
            ResultSet   rs=stmt.executeQuery("select * from Peces");
            while(rs.next())
            {
               pezz = new Peces();
                
                arreglo[0]=rs.getInt(1);                   
                pezz.setIdMascota(rs.getInt(1));                                    
                arreglo[1]=rs.getString(2);                 
                pezz.setNombre(rs.getString(2));                                    ;     
                arreglo[2]=rs.getString(3);
                pezz.setRaza(rs.getString(3));
                arreglo[3]=rs.getString(4);                 
                pezz.setColor(rs.getString(4));                                        
                arreglo[4]=rs.getString(5);                 
                pezz.settAlimento(rs.getString(5));                                       
                arreglo[5]=rs.getInt(6);                  
                pezz.settVida(rs.getInt(6));                                            
                arreglo[6]=rs.getString(7);                 
                pezz.setfVenta(rs.getInt(7));                                                                  
                arreglo[7]=rs.getInt(8);
                pezz.setCosto(rs.getInt(8));
                arreglo[8]=rs.getString(9);
                pezz.settAcuario(rs.getString(9));
                arreglo[9]=rs.getInt(10);
                pezz.setnAletas(rs.getInt(10));                
                arreglo[10]=rs.getString(11);
                pezz.setHabitat(rs.getString(11));                                   
                arreglo[11]=rs.getString(12);
                pezz.setVenenoso(rs.getString(12));             
                arreglo[12]=rs.getString(13);
                pezz.setConvivencia(rs.getString(13));              
                
                
                model.addRow(arreglo);                  
                contPeces.create(pezz);
                                                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBD2.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jTextID = new javax.swing.JTextField();
        jTextVida = new javax.swing.JTextField();
        jTextfVenta = new javax.swing.JTextField();
        jTextAletas = new javax.swing.JTextField();
        jTextAcuario = new javax.swing.JTextField();
        jTextCosto = new javax.swing.JTextField();
        Crear = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextHabitat = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        OrID = new javax.swing.JButton();
        ORDENARPORNOMBRE = new javax.swing.JButton();
        Convive = new javax.swing.JLabel();
        Venenoso1 = new javax.swing.JLabel();
        jTextVenenoso = new javax.swing.JTextField();
        jTextConvive = new javax.swing.JTextField();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("PECES");

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
        jLabel10.setText("NUMERO ALETAS");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setText("TIPO ACUARIO");

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

        jTextID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextIDFocusLost(evt);
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
        jTextfVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextfVentaActionPerformed(evt);
            }
        });

        jTextAletas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAletasFocusLost(evt);
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
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Raza", "Color", "Alimento", "ID", "Vida", "Fecha de venta", "Habitat", "Tipo Acuario", "Costo", "Numero Aletas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        jLabel17.setText("HABITAT");

        OrID.setBackground(new java.awt.Color(204, 204, 255));
        OrID.setText("ORDENAR POR ID");
        OrID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrIDActionPerformed(evt);
            }
        });

        ORDENARPORNOMBRE.setBackground(new java.awt.Color(204, 204, 255));
        ORDENARPORNOMBRE.setText("ORDENAR POR NOMBRE");
        ORDENARPORNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORDENARPORNOMBREActionPerformed(evt);
            }
        });

        Convive.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Convive.setText("CONVIVE");

        Venenoso1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Venenoso1.setText("VENENOSO");

        jTextVenenoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextVenenosoActionPerformed(evt);
            }
        });

        jTextConvive.setText("jTextField1");
        jTextConvive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextConviveActionPerformed(evt);
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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jTextID)
                            .addComponent(jTextVida)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(75, 75, 75)
                        .addComponent(jTextColor))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTRaza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1)
                    .addComponent(Convive, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Venenoso1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextVenenoso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextAletas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(jTextHabitat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(jTextAcuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(jTextfVenta)
                            .addComponent(jTextConvive))
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ORDENARPORNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Modificar)
                                    .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Menu))))
                        .addGap(24, 24, 24)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                            .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(OrID)
                                .addGap(14, 14, 14)
                                .addComponent(ORDENARPORNOMBRE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jTextAcuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Venenoso1)
                                    .addComponent(jTextVenenoso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Modificar))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Convive)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextConvive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Crear)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextAletas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Borrar)))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(Menu))))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void tabla(){
       contPeces.ordenar();
       Object rowData[][]=new Object[contPeces.ListaPeces.size()][10];
       if( contPeces.ListaPeces.size() == 0){
            jTable1.setModel(new javax.swing.table.DefaultTableModel(rowData,new String[]{"ID","NOMBRE","RAZA","COLOR","ALIMENTO",
                "ESPERANZA DE VIDA","FECHA DE VENTA","HABITAT","TIPO ACUARIO","NUMERO ALETAS","COSTO"}));
       }
       for(int i=0;i<contPeces.ListaPeces.size();i++){
           rowData[i][0]=contPeces.ListaPeces.get(i).getIdMascota();
           rowData[i][1]=contPeces.ListaPeces.get(i).getNombre();
           rowData[i][2]=contPeces.ListaPeces.get(i).getRaza();
           rowData[i][3]=contPeces.ListaPeces.get(i).getColor();
           rowData[i][4]=contPeces.ListaPeces.get(i).gettAlimento();
           rowData[i][5]=contPeces.ListaPeces.get(i).gettVida();
           rowData[i][6]=contPeces.ListaPeces.get(i).getfVenta();
           rowData[i][7]=contPeces.ListaPeces.get(i).getHabitat();
           rowData[i][8]=contPeces.ListaPeces.get(i).gettAcuario();
           rowData[i][9]=contPeces.ListaPeces.get(i).getnAletas();
           rowData[i][10]=contPeces.ListaPeces.get(i).getCosto();
           
           
           
            jTable1.setModel(new javax.swing.table.DefaultTableModel(rowData,new String[]{"ID","NOMBRE","RAZA","COLOR","ALIMENTO",
                "ESPERANZA DE VIDA","FECHA DE VENTA","HABITAT","TIPO ACUARIO","NUMERO ALETAS","COSTO"}));
            
            
            
            
            
       
           
           
       }
    }
    
    
    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
       
        
     
    Peces pec = new Peces();
    pec.setNombre(jTextNombre.getText());
    pec.setRaza(jTRaza.getText());
    pec.setColor(jTextColor.getText());
    pec.settAlimento(jTextAlimento.getText());
    pec.setIdMascota(Integer.parseInt(jTextID.getText()));
    pec.settVida(Integer.parseInt(jTextVida.getText()));
    pec.setCosto(Integer.parseInt(jTextCosto.getText()));
    pec.setfVenta(Integer.parseInt(jTextfVenta.getText()));
    pec.setHabitat(jTextHabitat.getText());
    pec.settAcuario(jTextAcuario.getText());
    pec.setnAletas(Integer.parseInt(jTextAletas.getText()));

    Connection conexion = null;
    try {
        // Establecer la conexión con la base de datos
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/petshow", "root", "admin");

        // Crear la consulta SQL
        String sql = "INSERT INTO Peces (nombre, raza, color, tAlimento, idMascota, tVida, costo, fVenta, habitat, tAcuario, nAletas) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        // Crear el PreparedStatement
        PreparedStatement statement = conexion.prepareStatement(sql);
        statement.setString(1, pec.getNombre());
        statement.setString(2, pec.getRaza());
        statement.setString(3, pec.getColor());
        statement.setString(4, pec.gettAlimento());
        statement.setInt(5, pec.getIdMascota());
        statement.setInt(6, pec.gettVida());
        statement.setInt(7, pec.getCosto());
        statement.setInt(8, pec.getfVenta());
        statement.setString(9, pec.getHabitat());
        statement.setString(10, pec.gettAcuario());
        statement.setInt(11, pec.getnAletas());

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
        Peces pez= new Peces();
        pez = (Peces)contPeces.read(pez);
        pez.setNombre(jTextNombre.getText());
        if(contPeces.modify(pez)!=null)
        {
            JOptionPane.showMessageDialog(rootPane, "Objeto Modificado");
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Objeto con problemas al Modificar");
        tabla();
    }//GEN-LAST:event_ModificarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        Peces pez = new Peces();
        pez.setIdMascota(Integer.parseInt(jTextID.getText()));
        contPeces.delete(pez);
            tabla();
            
    }//GEN-LAST:event_BorrarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void OrIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrIDActionPerformed
        // TODO add your handling code here:
        contPeces.ordenar();
        
        Peces pez = new Peces();
        
       model.setRowCount(0);
       
       for(Peces peces: contPeces.ListaPeces){
            arreglo[0]=pez.getNombre();    
            arreglo[1]=pez.getRaza();      
            arreglo[2]=pez.getColor();        
            arreglo[3]=pez.gettAlimento();                        
            arreglo[4]=pez.getIdMascota();                       
            arreglo[5]=pez.gettVida();                        
            arreglo[6]=pez.getfVenta();
            arreglo[7]=pez.getCosto();
            arreglo[8]=pez.gettAcuario();
            arreglo[9]=pez.getnAletas();
            arreglo[10]=pez.getHabitat();
                       
            model.addRow(arreglo); 
        }
   tabla();
    }//GEN-LAST:event_OrIDActionPerformed

    private void ORDENARPORNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORDENARPORNOMBREActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
         
        Peces pez = new Peces();
        
        contPeces.ordenar(0, contPeces.ListaPeces.size()-1);
               
       for(Peces peces: contPeces.ListaPeces){
            arreglo[0]=pez.getNombre();    
            arreglo[1]=pez.getRaza();      
            arreglo[2]=pez.getColor();        
            arreglo[3]=pez.gettAlimento();                        
            arreglo[4]=pez.getIdMascota();                       
            arreglo[5]=pez.gettVida();                        
            arreglo[6]=pez.getfVenta();
            arreglo[7]=pez.getCosto();
            arreglo[8]=pez.gettAcuario();
            arreglo[9]=pez.getnAletas();
            arreglo[10]=pez.getHabitat();
                       
            model.addRow(arreglo); 
        }
   tabla();
    }//GEN-LAST:event_ORDENARPORNOMBREActionPerformed

    private void jTextVenenosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextVenenosoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextVenenosoActionPerformed

    private void jTextConviveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextConviveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextConviveActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        this.setVisible(false);
        Principal g1= new Principal();
        g1.setVisible(true);


    }//GEN-LAST:event_MenuActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNombreFocusLost
        // TODO add your handling code here:
        CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarNombreMascota(jTextNombre.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
      jTextNombre.setText("");
      jTextNombre.requestFocus();
        }
    }//GEN-LAST:event_jTextNombreFocusLost

    private void jTextfVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextfVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextfVentaActionPerformed

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

    private void jTextIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextIDFocusLost
        // TODO add your handling code here:
        
 CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarCadena(jTextID.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
    jTextID.setText("");
     jTextID .requestFocus();
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDFocusLost

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
     jTextCosto.requestFocus();
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_jTextCostoFocusLost

    private void jTextAletasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAletasFocusLost
        // TODO add your handling code here:
        
 CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarCadena(jTextAletas.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
    jTextAletas.setText("");
     jTextAletas .requestFocus();
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_jTextAletasFocusLost

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
            java.util.logging.Logger.getLogger(GPeces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GPeces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GPeces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GPeces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GPeces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JLabel Convive;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton ORDENARPORNOMBRE;
    private javax.swing.JButton OrID;
    private javax.swing.JLabel Venenoso1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField jTextAcuario;
    private javax.swing.JTextField jTextAletas;
    private javax.swing.JTextField jTextAlimento;
    private javax.swing.JTextField jTextColor;
    private javax.swing.JTextField jTextConvive;
    private javax.swing.JTextField jTextCosto;
    private javax.swing.JTextField jTextHabitat;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextVenenoso;
    private javax.swing.JTextField jTextVida;
    private javax.swing.JTextField jTextfVenta;
    // End of variables declaration//GEN-END:variables
}
