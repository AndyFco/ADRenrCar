package RentCar;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FNuevoCliente extends javax.swing.JFrame {
    
    Conexion cc =new Conexion();
    Connection cn = cc.getConection();
 
    public FNuevoCliente() {
        initComponents();
        this.setLocation(300, 200);
    }

    public void AgregarCliente()
    {
        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO clientes"
            + "(Nombre,Apellido,Cedula,Direccion,Telefono)VALUES (?,?,?,?,?)");
            pst.setString(1, jTextNombre.getText());
            pst.setString(2, jTextApellido.getText());
            pst.setString(3, jTextCedula.getText());
            pst.setString(4, jTextDireccion.getText());
            pst.setString(5, jTextTelefono.getText());
            pst.executeUpdate();
        
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        JOptionPane.showMessageDialog(null,"Agregado ");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextCedula = new javax.swing.JTextField();
        jTextDireccion = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        BTNAgregar = new javax.swing.JButton();
        BTNCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("NUEVO CLIENTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 39));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Cedula:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Direccion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Telefono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        getContentPane().add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 57, 266, -1));
        getContentPane().add(jTextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 88, 266, -1));
        getContentPane().add(jTextCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 266, -1));
        getContentPane().add(jTextDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 266, -1));
        getContentPane().add(jTextTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 266, -1));

        BTNAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNAgregar.setText("Agregar");
        BTNAgregar.setBorder(null);
        BTNAgregar.setBorderPainted(false);
        BTNAgregar.setContentAreaFilled(false);
        BTNAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        BTNCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTNCancelar.setText("Cancelar");
        BTNCancelar.setBorder(null);
        BTNCancelar.setBorderPainted(false);
        BTNCancelar.setContentAreaFilled(false);
        BTNCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 3));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LimpiarText()
   {
        jTextNombre.setText(null);
        jTextApellido.setText(null);
        jTextCedula.setText(null);
        jTextDireccion.setText(null);
        jTextTelefono.setText(null);
   }
    private void BTNAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgregarActionPerformed
        AgregarCliente();
        LimpiarText();
    }//GEN-LAST:event_BTNAgregarActionPerformed

    private void BTNCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCancelarActionPerformed
      
       dispose();
    }//GEN-LAST:event_BTNCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAgregar;
    private javax.swing.JButton BTNCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}