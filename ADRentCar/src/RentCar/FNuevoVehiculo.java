package RentCar;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class FNuevoVehiculo extends javax.swing.JFrame {

    Conexion cc =new Conexion();
    Connection cn = cc.getConection();
    String Estado = "Disponible";
   
    public FNuevoVehiculo() {
        initComponents();
        this.setLocation(300, 200);    
    }
    
    public void AgregarVehiculo()
    {
        try {
        PreparedStatement pst = cn.prepareStatement("INSERT INTO vehiculos"
                + "(placa,marca,modelo,color,año,categoria,kilometraje,Estado)"
                + " VALUES (?,?,?,?,?,?,?,?)");
        pst.setString(1, jTextPlaca.getText());
        pst.setString(2, jTextMarca.getText());
        pst.setString(3, jTextModelo.getText());
        pst.setString(4, jTextColor.getText());
        pst.setString(5, jTextYear.getText());
        pst.setString(6, jTextTipo.getText());
        pst.setString(7, jTextKM.getText());
        pst.setString(8,Estado);
        pst.executeUpdate();
        
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
            JOptionPane.showMessageDialog(null,"Agregado ");
   }
     public void LimpiarText()
   {
        jTextPlaca.setText(null);
        jTextMarca.setText(null);
        jTextModelo.setText(null);
        jTextColor.setText(null);
        jTextYear.setText(null);
        jTextTipo.setText(null);
        jTextKM.setText(null);
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextPlaca1 = new javax.swing.JTextField();
        jTextMarca1 = new javax.swing.JTextField();
        jTextModelo1 = new javax.swing.JTextField();
        jTextColor1 = new javax.swing.JTextField();
        jTextYear1 = new javax.swing.JTextField();
        jTextKM1 = new javax.swing.JTextField();
        jTextTipo1 = new javax.swing.JTextField();
        bAgregar1 = new javax.swing.JButton();
        bCancelar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextPlaca = new javax.swing.JTextField();
        jTextMarca = new javax.swing.JTextField();
        jTextModelo = new javax.swing.JTextField();
        jTextColor = new javax.swing.JTextField();
        jTextYear = new javax.swing.JTextField();
        jTextKM = new javax.swing.JTextField();
        jTextTipo = new javax.swing.JTextField();
        bAgregar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setBackground(new java.awt.Color(25, 208, 53));
        jFrame1.setFocusableWindowState(false);
        jFrame1.setForeground(new java.awt.Color(153, 255, 153));
        jFrame1.setName("NuevoVehiculo"); // NOI18N
        jFrame1.setUndecorated(true);
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0, 255, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Nuevo Vehiculo");
        jFrame1.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Placa");
        jFrame1.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Marca");
        jFrame1.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Modelo");
        jFrame1.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Year");
        jFrame1.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Tipo");
        jFrame1.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Color");
        jFrame1.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Kilometraje");
        jFrame1.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jTextPlaca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPlaca1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jTextPlaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        jFrame1.getContentPane().add(jTextMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        jFrame1.getContentPane().add(jTextModelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        jFrame1.getContentPane().add(jTextColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        jFrame1.getContentPane().add(jTextYear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        jFrame1.getContentPane().add(jTextKM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));
        jFrame1.getContentPane().add(jTextTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        bAgregar1.setText("Agregar");
        bAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregar1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(bAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        bCancelar1.setText("Cancelar");
        bCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelar1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(bCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(25, 208, 53));
        setForeground(new java.awt.Color(153, 255, 153));
        setLocationByPlatform(true);
        setName("NuevoVehiculo"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Nuevo Vehiculo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Placa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 71, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Marca");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 97, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Modelo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 125, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Year");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 182, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Tipo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 208, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Color");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 154, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Kilometraje");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 242, -1, -1));
        getContentPane().add(jTextPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 69, 120, -1));
        getContentPane().add(jTextMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 95, 120, -1));
        getContentPane().add(jTextModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 123, 120, -1));
        getContentPane().add(jTextColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 154, 120, -1));
        getContentPane().add(jTextYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 180, 120, -1));
        getContentPane().add(jTextKM, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 237, 120, -1));
        getContentPane().add(jTextTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 206, 120, -1));

        bAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bAgregar.setText("Agregar");
        bAgregar.setBorder(null);
        bAgregar.setBorderPainted(false);
        bAgregar.setContentAreaFilled(false);
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(bAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 275, -1, -1));

        bCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.setBorder(null);
        bCancelar.setBorderPainted(false);
        bCancelar.setContentAreaFilled(false);
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 275, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
       dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void jTextPlaca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPlaca1ActionPerformed
        
    }//GEN-LAST:event_jTextPlaca1ActionPerformed

    private void bAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregar1ActionPerformed
        
    }//GEN-LAST:event_bAgregar1ActionPerformed

    private void bCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelar1ActionPerformed
        
    }//GEN-LAST:event_bCancelar1ActionPerformed

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        AgregarVehiculo();
        LimpiarText();
    }//GEN-LAST:event_bAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bAgregar1;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bCancelar1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextColor;
    private javax.swing.JTextField jTextColor1;
    private javax.swing.JTextField jTextKM;
    private javax.swing.JTextField jTextKM1;
    private javax.swing.JTextField jTextMarca;
    private javax.swing.JTextField jTextMarca1;
    private javax.swing.JTextField jTextModelo;
    private javax.swing.JTextField jTextModelo1;
    private javax.swing.JTextField jTextPlaca;
    private javax.swing.JTextField jTextPlaca1;
    private javax.swing.JTextField jTextTipo;
    private javax.swing.JTextField jTextTipo1;
    private javax.swing.JTextField jTextYear;
    private javax.swing.JTextField jTextYear1;
    // End of variables declaration//GEN-END:variables
}

