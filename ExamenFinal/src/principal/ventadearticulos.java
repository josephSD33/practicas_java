/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;



import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class ventadearticulos extends javax.swing.JFrame {
    
    
    
   
    
    
    
    
   

    DefaultTableModel modeloTabla;
    public ventadearticulos() {
        initComponents();
        setLocationRelativeTo(null);
        modeloTabla =new DefaultTableModel();
        this.tablaventa.setModel(modeloTabla);
        this.modeloTabla.addColumn("Articulos Vendidos");
        this.modeloTabla.addColumn("Descripcion del articulo");
        this.modeloTabla.addColumn("Precio Unitario");
        this.modeloTabla.addColumn("Precio Total");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelventa = new javax.swing.JPanel();
        labelventa = new javax.swing.JLabel();
        labelcantidad = new javax.swing.JLabel();
        labeldescripcion = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        labelprecio = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        botonguardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaventa = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelventa.setBackground(new java.awt.Color(51, 51, 51));

        labelventa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelventa.setForeground(new java.awt.Color(255, 255, 255));
        labelventa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelventa.setText("Venta de Articulos");

        labelcantidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelcantidad.setForeground(new java.awt.Color(255, 255, 255));
        labelcantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcantidad.setText("Cantidad de articulos vendidos");

        labeldescripcion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labeldescripcion.setForeground(new java.awt.Color(255, 255, 255));
        labeldescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labeldescripcion.setText("Descripcion del articulo");

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });

        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });

        labelprecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelprecio.setForeground(new java.awt.Color(255, 255, 255));
        labelprecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelprecio.setText("Precio unitario");

        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });

        botonguardar.setText("Guardar");
        botonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarActionPerformed(evt);
            }
        });

        tablaventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaventa);

        javax.swing.GroupLayout panelventaLayout = new javax.swing.GroupLayout(panelventa);
        panelventa.setLayout(panelventaLayout);
        panelventaLayout.setHorizontalGroup(
            panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelventaLayout.createSequentialGroup()
                .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelventaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelventaLayout.createSequentialGroup()
                                .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labeldescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelcantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtcantidad))
                                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(124, 124, 124)
                                .addComponent(botonguardar))))
                    .addGroup(panelventaLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(labelventa)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelventaLayout.setVerticalGroup(
            panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelventaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(labelventa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelcantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelventaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labeldescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelventaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(botonguardar)))
                .addGap(18, 18, 18)
                .addComponent(labelprecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jMenu1.setText("salir");

        jMenuItem1.setText("salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        
    }//GEN-LAST:event_txtprecioActionPerformed

    private void botonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarActionPerformed
       
            
        
        
        
        int cantidad = Integer.parseInt(this.txtcantidad.getText());
        double precioUnitario = Double.parseDouble(this.txtprecio.getText());
        double precioTotal = cantidad * precioUnitario;
    
        double iva = precioTotal * 0.13;
        double precioTotalConIVA = precioTotal + iva;
        
        if (cantidad>=1) {
            
        
        this.modeloTabla.addRow(new Object[]{this.txtcantidad.getText(),txtdescripcion.getText(),txtprecio.getText(),precioTotalConIVA});
        
        this.txtcantidad.setText("");
        this.txtdescripcion.setText("");
        this.txtprecio.setText("");
        }else{
            JOptionPane.showMessageDialog(rootPane, "No se puede vender menos de un articulo");
            this.txtcantidad.setText("");
            this.txtdescripcion.setText("");
            this.txtprecio.setText("");
        }
        
    }//GEN-LAST:event_botonguardarActionPerformed

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        menu l =new menu();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(ventadearticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventadearticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventadearticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventadearticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventadearticulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonguardar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelcantidad;
    private javax.swing.JLabel labeldescripcion;
    private javax.swing.JLabel labelprecio;
    private javax.swing.JLabel labelventa;
    private javax.swing.JPanel panelventa;
    private javax.swing.JTable tablaventa;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
