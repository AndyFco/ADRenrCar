

package RentCar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class ReporteEmpleado extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Conexion cc =new Conexion();
    Connection cn = cc.getConection();
    public ReporteEmpleado() {
        initComponents();
        this.setLocation(200, 200);
        modelo = new DefaultTableModel();
        modelo.addColumn("Numero");
        modelo.addColumn("Cliente");
        modelo.addColumn("Placa");
        modelo.addColumn("Vendedor");
        this.ReporteEmpleado.setModel(modelo);
        llenarTabla();
    }
    public void llenarTabla()
    {
        String []Datos = new String[4];
        try {
            Statement st =cn.createStatement();
            ResultSet rs= st.executeQuery("SELECT * FROM factura f left join "
                    + "usuarios u ON f.Usuario =u.NombreU");
            while (rs.next())
            {
                Datos[0]=rs.getString(1);
                Datos[1]=rs.getString(2);
                Datos[2]=rs.getString(3);
                Datos[3]=rs.getString(8);
                modelo.addRow(Datos);
                
            }
            this.ReporteEmpleado.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(CatalogoDeVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBtnVerDetalles = new javax.swing.JButton();
        jBtnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReporteEmpleado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Reporte Empleado");

        jBtnVerDetalles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnVerDetalles.setText("Ver Detalles");
        jBtnVerDetalles.setBorder(null);
        jBtnVerDetalles.setBorderPainted(false);
        jBtnVerDetalles.setContentAreaFilled(false);
        jBtnVerDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerDetallesActionPerformed(evt);
            }
        });

        jBtnRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnRegresar.setText("Regresar");
        jBtnRegresar.setBorder(null);
        jBtnRegresar.setBorderPainted(false);
        jBtnRegresar.setContentAreaFilled(false);
        jBtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegresarActionPerformed(evt);
            }
        });

        ReporteEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ReporteEmpleado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jBtnVerDetalles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnRegresar)
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnRegresar)
                    .addComponent(jBtnVerDetalles))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegresarActionPerformed
     
        dispose();
    }//GEN-LAST:event_jBtnRegresarActionPerformed

    private void jBtnVerDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerDetallesActionPerformed
        
    }//GEN-LAST:event_jBtnVerDetallesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ReporteEmpleado;
    private javax.swing.JButton jBtnRegresar;
    private javax.swing.JButton jBtnVerDetalles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
