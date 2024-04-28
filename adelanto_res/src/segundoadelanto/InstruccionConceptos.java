/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package segundoadelanto;

import proyecto.Principal;

/**
 *
 * @author USUARIO
 */
public class InstruccionConceptos extends javax.swing.JFrame {

    /**
     * Creates new form InstruccionCoceptos
     */
    public InstruccionConceptos() {
        initComponents();
        setLocationRelativeTo(null);
        TextAreaconcep.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelinstruccion = new javax.swing.JPanel();
        LabelINS = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaconcep = new javax.swing.JTextArea();
        ButtonIniciar = new javax.swing.JButton();
        Buttonregresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panelinstruccion.setBackground(new java.awt.Color(51, 51, 51));

        LabelINS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LabelINS.setForeground(new java.awt.Color(255, 255, 255));
        LabelINS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelINS.setText("Conceptos");

        TextAreaconcep.setBackground(new java.awt.Color(51, 51, 51));
        TextAreaconcep.setColumns(20);
        TextAreaconcep.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        TextAreaconcep.setForeground(new java.awt.Color(255, 255, 255));
        TextAreaconcep.setRows(5);
        TextAreaconcep.setText("Acontinuacion se muestran algunos\nterminos vistos durante el curso,\ndar click sobre el termino para ver\nsu concepto");
        jScrollPane1.setViewportView(TextAreaconcep);

        ButtonIniciar.setText("Iniciar");
        ButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIniciarActionPerformed(evt);
            }
        });

        Buttonregresar.setText("Regresar");
        Buttonregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelinstruccionLayout = new javax.swing.GroupLayout(Panelinstruccion);
        Panelinstruccion.setLayout(PanelinstruccionLayout);
        PanelinstruccionLayout.setHorizontalGroup(
            PanelinstruccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelinstruccionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Buttonregresar)
                .addGap(15, 15, 15))
            .addGroup(PanelinstruccionLayout.createSequentialGroup()
                .addGroup(PanelinstruccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelinstruccionLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(LabelINS, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelinstruccionLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelinstruccionLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(ButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        PanelinstruccionLayout.setVerticalGroup(
            PanelinstruccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelinstruccionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LabelINS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(ButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Buttonregresar)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(Panelinstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panelinstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIniciarActionPerformed
        conceptos s =new conceptos();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonIniciarActionPerformed

    private void ButtonregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonregresarActionPerformed
        Principal principalFrame = new Principal();
        principalFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonregresarActionPerformed

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
            java.util.logging.Logger.getLogger(InstruccionConceptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstruccionConceptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstruccionConceptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstruccionConceptos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstruccionConceptos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonIniciar;
    private javax.swing.JButton Buttonregresar;
    private javax.swing.JLabel LabelINS;
    private javax.swing.JPanel Panelinstruccion;
    private javax.swing.JTextArea TextAreaconcep;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
