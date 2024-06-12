package Vista;

import Controlador.ControladorBD;
import Controlador.ControladorBD2;
import Controlador.ControladorPerro;
import Excepciones.CadenaAlphaException;
import Modelo.Perro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel M.A
 */
public class GPerro extends javax.swing.JFrame {
    ControladorPerro contPerr;
    Object[] arreglo;
    DefaultTableModel model;
    ControladorBD conBD;
    Connection con;
    private Perro perr;
    /**
     * Creates new form GPerro
     */
    public GPerro() {
        initComponents();
        contPerr = new ControladorPerro();
        conBD= new ControladorBD();
        con=conBD.mysqlConexion();
        arreglo = new Object[15];
        perr = new Perro();
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
        jLabel15 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTRaza = new javax.swing.JTextField();
        jTextColor = new javax.swing.JTextField();
        jTextAlimento = new javax.swing.JTextField();
        jTextID = new javax.swing.JTextField();
        jTextVida = new javax.swing.JTextField();
        jTextVenta = new javax.swing.JTextField();
        jTextTamano = new javax.swing.JTextField();
        jTextEdad = new javax.swing.JTextField();
        jTextPeso = new javax.swing.JTextField();
        jTextCosto = new javax.swing.JTextField();
        Modificar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jTextPelaje = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextLadrar = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextRoncar = new javax.swing.JTextField();
        jTextBabear = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        OrID = new javax.swing.JButton();
        OrdenarNombre = new javax.swing.JButton();
        CREAR = new javax.swing.JButton();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("PERROS");

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
        jLabel10.setText("EDAD");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setText("PESO");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setText("COSTO");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel15.setText("TAMAÑO");

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

        jTextVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextVentaFocusLost(evt);
            }
        });
        jTextVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextVentaActionPerformed(evt);
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
                "Nombre", "Raza", "Color", "Alimento", "ID", "Vida", "Fecha de venta", "Tamaño", "Pelaje", "Ladrar", "Roncar", "Peso", "Edad", "Costo", "Babear"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
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

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel16.setText("LADRAR");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel17.setText("PELAJE");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel18.setText("RONCAR");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel14.setText("BABEAR");

        OrID.setBackground(new java.awt.Color(204, 204, 255));
        OrID.setText("ORDENAR POR ID");
        OrID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrIDActionPerformed(evt);
            }
        });

        OrdenarNombre.setBackground(new java.awt.Color(204, 204, 255));
        OrdenarNombre.setText("ORDENAR POR NOMBRE");
        OrdenarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarNombreActionPerformed(evt);
            }
        });

        CREAR.setBackground(new java.awt.Color(204, 204, 255));
        CREAR.setText("CREAR");
        CREAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREARActionPerformed(evt);
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
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(308, 308, 308))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextAlimento, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jTextID)
                                    .addComponent(jTextVida)
                                    .addComponent(jTextVenta)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(75, 75, 75)
                                .addComponent(jTextColor))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNombre)
                                    .addComponent(jTRaza))))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18)
                            .addComponent(jLabel14))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTamano, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jTextPelaje)
                            .addComponent(jTextLadrar)
                            .addComponent(jTextRoncar)
                            .addComponent(jTextPeso)
                            .addComponent(jTextEdad)
                            .addComponent(jTextCosto)
                            .addComponent(jTextBabear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrdenarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Modificar)
                            .addComponent(CREAR, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Menu))
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(jTextVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextTamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(OrdenarNombre))
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextPelaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextLadrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(OrID)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(jTextRoncar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Menu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Modificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CREAR)
                                .addGap(18, 18, 18)
                                .addComponent(Borrar)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jTextBabear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void tabla(){
       contPerr.ordenar();
       Object rowData[][]=new Object[contPerr.ListaPerro.size()][14];
       if( contPerr.ListaPerro.size() == 0){
           jTable1.setModel(new javax.swing.table.DefaultTableModel(rowData,new String[]{"ID","NOMBRE","RAZA","COLOR","ALIMENTO","ESPERANZA DE VIDA","TAMAÑO","FECHA DE VENTA","PELAJE","PESO","EDAD","COSTO","TENDENCIA A LADRAR","TENDENDIA A RONCAR","TENDENCIA A BABEAR"}));
       }
       for(int i=0;i<contPerr.ListaPerro.size();i++){
           rowData[i][0]=contPerr.ListaPerro.get(i).getIdMascota();
           rowData[i][1]=contPerr.ListaPerro.get(i).getNombre();
           rowData[i][2]=contPerr.ListaPerro.get(i).getRaza();
           rowData[i][3]=contPerr.ListaPerro.get(i).getColor();
           rowData[i][4]=contPerr.ListaPerro.get(i).gettAlimento();
           rowData[i][5]=contPerr.ListaPerro.get(i).gettVida();
           rowData[i][6]=contPerr.ListaPerro.get(i).getTamano();
           rowData[i][7]=contPerr.ListaPerro.get(i).getfVenta();
           rowData[i][8]=contPerr.ListaPerro.get(i).getPelaje();
           rowData[i][9]=contPerr.ListaPerro.get(i).getPesoK();
           rowData[i][10]=contPerr.ListaPerro.get(i).getEdad();
           rowData[i][11]=contPerr.ListaPerro.get(i).getCosto();
           rowData[i][12]=contPerr.ListaPerro.get(i).gettLadrar();
           rowData[i][13]=contPerr.ListaPerro.get(i).gettRoncar();
           
           
            jTable1.setModel(new javax.swing.table.DefaultTableModel(rowData,new String[]{"ID","NOMBRE","RAZA","COLOR","ALIMENTO",
                "ESPERANZA DE VIDA","TAMAÑO","FECHA DE VENTA","PELAJE","PESO","EDAD","COSTO"
                    ,"TENDENCIA A LADRAR","TENDENDIA A RONCAR","TENDENCIA A BABEAR"}));
       
           
           
       }
    }
    
    
    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        Perro perro = new Perro();
        perro = (Perro)contPerr.read(perro);
        perro.setNombre(jTextNombre.getText());
        if(contPerr.modify(perro)!=null)
        {
            JOptionPane.showMessageDialog(rootPane, "Objeto Modificado");
        }
        else
        JOptionPane.showMessageDialog(rootPane, "Objeto con problemas al Modificar");
        tabla();
    }//GEN-LAST:event_ModificarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
   // Obtener el texto del campo de texto
String idMascotaText = jTextID.getText();

// Verificar si el campo de texto está vacío
if (idMascotaText.isEmpty()) {
    // Mostrar un mensaje de error o realizar alguna otra acción
    JOptionPane.showMessageDialog(rootPane, "Ingrese un ID de mascota válido.");
    return; // Salir del método
}

// Convertir el texto a un entero
int idMascota;
try {
    idMascota = Integer.parseInt(idMascotaText);
} catch (NumberFormatException e) {
    // Mostrar un mensaje de error o realizar alguna otra acción
    JOptionPane.showMessageDialog(rootPane, "Ingrese un ID de mascota válido.");
    return; // Salir del método
}

// Eliminar el perro de la lista en memoria
contPerr.delete(idMascota);

// Actualizar la tabla en la interfaz gráfica
tabla();

// Eliminar el perro de la base de datos MySQL
eliminarPerroDeBD(idMascota);

            
    }//GEN-LAST:event_BorrarActionPerformed
private void eliminarPerroDeBD(int idMascota) {
   
    // Establecer la conexión con la base de datos
    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/petshow";
    String usuario = "root";
    String contraseña = "admin";

    try {
        conn = DriverManager.getConnection(url, usuario, contraseña);

        // Crear la consulta SQL para eliminar el perro por ID de mascota
        String sql = "DELETE FROM Perro WHERE idMascota = ?";

        // Crear el PreparedStatement
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, idMascota);

        // Ejecutar la consulta
        int filasEliminadas = statement.executeUpdate();

        // Cerrar el statement y la conexión
        statement.close();
        conn.close();

        // Verificar si se eliminó correctamente el perro de la base de datos
        if (filasEliminadas > 0) {
            JOptionPane.showMessageDialog(rootPane, "Perro eliminado de la base de datos.");
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se encontró un perro con el ID especificado en la base de datos.");
        }

    } catch (SQLException ex) {
        // Manejar cualquier error de conexión o consulta
        ex.printStackTrace();
        JOptionPane.showMessageDialog(rootPane, "Error al eliminar el perro de la base de datos.");
    }
}


    
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            int posicion =jTable1.getSelectedRow();
        jTextNombre.setText(contPerr.ListaPerro.get(posicion).getNombre());
        jTRaza.setText(contPerr.ListaPerro.get(posicion).getRaza());
        jTextColor.setText(contPerr.ListaPerro.get(posicion).getColor());
        jTextAlimento.setText(contPerr.ListaPerro.get(posicion).gettAlimento());
        jTextID.setText(String.valueOf(contPerr.ListaPerro.get(posicion).getIdMascota()));
        jTextVida.setText(String.valueOf((char) contPerr.ListaPerro.get(posicion).gettVida()));
        jTextVenta.setText(String.valueOf((char) contPerr.ListaPerro.get(posicion).getfVenta()));
        jTextPeso.setText(String.valueOf((char) contPerr.ListaPerro.get(posicion).getPesoK()));
        jTextCosto.setText(String.valueOf((char) contPerr.ListaPerro.get(posicion).getCosto()));
        jTextEdad.setText(String.valueOf((char) contPerr.ListaPerro.get(posicion).getEdad()));
        
        jTextLadrar.setText(contPerr.ListaPerro.get(posicion).gettLadrar());
        jTextRoncar.setText(contPerr.ListaPerro.get(posicion).gettRoncar());
        
        tabla();
    }//GEN-LAST:event_jTable1MouseClicked

    private void OrIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrIDActionPerformed
        // TODO add your handling code here:
        contPerr.ordenar();
        
        Perro per  =new Perro();
        
       model.setRowCount(0);
       for(Perro perro: contPerr.ListaPerro){
            arreglo[0]=per.getNombre();    
            arreglo[1]=per.getRaza();      
            arreglo[2]=per.getColor();        
            arreglo[3]=per.gettAlimento();                        
            arreglo[4]=per.getIdMascota();                       
            arreglo[5]=per.gettVida();                        
            arreglo[6]=per.getfVenta();
            arreglo[7]=per.getCosto();
            arreglo[8]=per.getTamano();
            arreglo[9]=per.getPelaje();
            arreglo[10]=per.gettLadrar();
            arreglo[11]=per.gettRoncar();
            arreglo[12]=per.getPesoK();
            arreglo[13]=per.getEdad();
                                  
            model.addRow(arreglo); 
        }
   tabla();
           
    }//GEN-LAST:event_OrIDActionPerformed

    private void OrdenarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarNombreActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        
        Perro per  =new Perro();
                
        contPerr.ordenar(0, contPerr.ListaPerro.size()-1);
        for(Perro perro: contPerr.ListaPerro){
            arreglo[0]=per.getNombre();    
            arreglo[1]=per.getRaza();      
            arreglo[2]=per.getColor();        
            arreglo[3]=per.gettAlimento();                        
            arreglo[4]=per.getIdMascota();                       
            arreglo[5]=per.gettVida();                        
            arreglo[6]=per.getfVenta();
            arreglo[7]=per.getCosto();
            arreglo[8]=per.getTamano();
            arreglo[9]=per.getPelaje();
            arreglo[10]=per.gettLadrar();
            arreglo[11]=per.gettRoncar();
            arreglo[12]=per.getPesoK();
            arreglo[13]=per.getEdad();
                                  
            model.addRow(arreglo); 
        }
   tabla();
    }//GEN-LAST:event_OrdenarNombreActionPerformed

    private void CREARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREARActionPerformed
        // TODO add your handling code here:
        Perro per = new Perro();
        per.setNombre(jTextNombre.getText());
        per.setRaza(jTRaza.getText());
        per.setColor(jTextColor.getText());
        per.settAlimento(jTextAlimento.getText());
        per.setIdMascota(Integer.parseInt(jTextID.getText()));
        per.settVida(Integer.parseInt(jTextVida.getText()));
        per.setfVenta(Integer.parseInt(jTextVenta.getText()));
        per.setTamano(jTextTamano.getText());
        per.setPelaje(jTextPelaje.getText());
        per.settLadrar(jTextLadrar.getText());
        per.settRoncar(jTextRoncar.getText());
        per.setPesoK(Integer.parseInt(jTextPeso.getText()));
        per.setEdad(Integer.parseInt(jTextEdad.getText()));
        per.setCosto(Integer.parseInt(jTextCosto.getText()));
        per.setBabear(jTextBabear.getText());
        
        contPerr.create(per);
        

    // ...
  
    // ... (asignar valores a las propiedades del objeto 'per')

    contPerr.create(per);

    // Establecer la conexión con la base de datos
    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/petshow";
    String usuario = "root";
    String contraseña = "admin";

    try {
        conn = DriverManager.getConnection(url, usuario, contraseña);

        // Crear la consulta SQL
        String sql = "INSERT INTO Perro (Nombre, raza, color, tAlimento, idMascota, tVida, fVenta, Tamano, Pelaje, Tladrar, Troncar, PesoK, Edad, Costo, Babear) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        // Crear el PreparedStatement
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, per.getNombre());
        statement.setString(2, per.getRaza());
        statement.setString(3, per.getColor());
        statement.setString(4, per.gettAlimento());
        statement.setInt(5, per.getIdMascota());
        statement.setInt(6, per.gettVida());
        statement.setInt(7, per.getfVenta());
        statement.setString(8, per.getTamano());
        statement.setString(9, per.getPelaje());
        statement.setString(10, per.gettLadrar());
        statement.setString(11, per.gettRoncar());
        statement.setInt(12, per.getPesoK());
        statement.setInt(13, per.getEdad());
        statement.setInt(14, per.getCosto());
        statement.setString(15, per.getBabear());
        

        // Ejecutar la consulta
        statement.executeUpdate();

        // Cerrar el statement y la conexión
        statement.close();
        conn.close();

        // Mostrar mensaje de éxito o realizar alguna otra acción

        // Actualizar la tabla en la interfaz de usuario
        tabla();

    } catch (SQLException ex) {
        // Manejar cualquier error de conexión o consulta
        ex.printStackTrace();
    
}



        
        tabla();
        
    }//GEN-LAST:event_CREARActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
         this.setVisible(false);
        Principal g1= new Principal();
        g1.setVisible(true);

    }//GEN-LAST:event_MenuActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
 String nombre = jTextNombre.getText();
    if (!validarNombre(nombre)) {
        JOptionPane.showMessageDialog(null, "Nombre inválido. Solo se permiten letras.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Realiza la acción deseada con el nombre válido
    // ...
    }

private boolean validarNombre(String nombre) {
    Pattern patron = Pattern.compile("^[a-zA-Z]+$");
    Matcher matcher = patron.matcher(nombre);
    return matcher.matches();


    }//GEN-LAST:event_jTextNombreActionPerformed

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

    private void jTextVentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextVentaFocusLost
        // TODO add your handling code here:
    CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarFecha(jTextVenta.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
      jTextVenta.setText("");
      jTextVenta.requestFocus();
        }
    }//GEN-LAST:event_jTextVentaFocusLost

    private void jTextVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextVentaActionPerformed

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
     jTextVida.requestFocus();
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_jTextVidaFocusLost

    private void jTextEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextEdadFocusLost
        // TODO add your handling code here:
        
 CadenaAlphaException cadena = new CadenaAlphaException();
        try {
            cadena.validarCadena(jTextEdad.getText());
        } catch (CadenaAlphaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()); 
    jTextEdad.setText("");
     jTextEdad.requestFocus();
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_jTextEdadFocusLost

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
            java.util.logging.Logger.getLogger(GPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GPerro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GPerro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton CREAR;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton OrID;
    private javax.swing.JButton OrdenarNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTextField jTextAlimento;
    private javax.swing.JTextField jTextBabear;
    private javax.swing.JTextField jTextColor;
    private javax.swing.JTextField jTextCosto;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextLadrar;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPelaje;
    private javax.swing.JTextField jTextPeso;
    private javax.swing.JTextField jTextRoncar;
    private javax.swing.JTextField jTextTamano;
    private javax.swing.JTextField jTextVenta;
    private javax.swing.JTextField jTextVida;
    // End of variables declaration//GEN-END:variables
}
