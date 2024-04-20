/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package segundoadelanto;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import proyecto.Principal;

/**
 *
 * @author USUARIO
 */
public class segundo extends javax.swing.JFrame {
    
    String [] preguntas= {"Que significan las siglas POO? ",
        "2+2",
        "3+3",
        "4+4",
        "5+5",
        "6+6",
        "7+7"};
    
    String[][] opciones={
        {"Programación Orientada a Objetos","Procesamiento de Objetos Orientado","Patrones de Optimización de Operaciones","Principios de Optimización de Objetos","Programación Orientada a Objetos"},
        
    {"5","1","4","10","4"},
    
    {"7","6","5","9","6"},
    
    {"9","10","11","8","8"},
    
    {"15","10","14","9","10"},
    
    {"12","10","6","21","12"},
    
    {"76","14","7","21","14"}};
    
    
    
    int index=0;
    int correcto=0;
    
    ButtonGroup bg= new ButtonGroup();
    
    
    
    


   
    public segundo() {
        initComponents();
        setLocationRelativeTo(null);
        
        bg.add(jRadioButtonR1);
        bg.add(jRadioButtonR2);
        bg.add(jRadioButtonR3);
        bg.add(jRadioButtonR4);
        
        
                
        jButtonsiguientActionPerformed(null);
        
      
    }
    
    public void getSelectedOption(JRadioButton rbtn){
        
        
        System.out.println(rbtn.getText());
        System.out.println(opciones[index][4]);
        
        if (rbtn.getText().equals(opciones[index][4])) {
            
            correcto++;
            
            
        }
       
        
        index++;
        
        enableRbuttons(false);
        
       
    }
    
    
    public void enableRbuttons(boolean yes_or_no){
        
        jRadioButtonR1.setEnabled(yes_or_no);
        jRadioButtonR2.setEnabled(yes_or_no);
        jRadioButtonR3.setEnabled(yes_or_no);
        jRadioButtonR4.setEnabled(yes_or_no);
        
       
        
        
    }
    
    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        jPanelpregunta = new javax.swing.JPanel();
        Labelpregunta = new javax.swing.JLabel();
        jRadioButtonR1 = new javax.swing.JRadioButton();
        jRadioButtonR2 = new javax.swing.JRadioButton();
        jRadioButtonR4 = new javax.swing.JRadioButton();
        jRadioButtonR3 = new javax.swing.JRadioButton();
        jButtonsiguient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(153, 204, 255));

        Labelpregunta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Labelpregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Labelpregunta.setText("jLabel1");

        javax.swing.GroupLayout jPanelpreguntaLayout = new javax.swing.GroupLayout(jPanelpregunta);
        jPanelpregunta.setLayout(jPanelpreguntaLayout);
        jPanelpreguntaLayout.setHorizontalGroup(
            jPanelpreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelpreguntaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Labelpregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelpreguntaLayout.setVerticalGroup(
            jPanelpreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelpreguntaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Labelpregunta)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jRadioButtonR1.setText("jRadioButton1");
        jRadioButtonR1.setOpaque(true);
        jRadioButtonR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonR1ActionPerformed(evt);
            }
        });

        jRadioButtonR2.setText("jRadioButton2");
        jRadioButtonR2.setOpaque(true);
        jRadioButtonR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonR2ActionPerformed(evt);
            }
        });

        jRadioButtonR4.setText("jRadioButton4");
        jRadioButtonR4.setOpaque(true);
        jRadioButtonR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonR4ActionPerformed(evt);
            }
        });

        jRadioButtonR3.setText("jRadioButton3");
        jRadioButtonR3.setOpaque(true);
        jRadioButtonR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonR3ActionPerformed(evt);
            }
        });

        jButtonsiguient.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonsiguient.setText("Siguiente");
        jButtonsiguient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsiguientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButtonR2, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                    .addComponent(jRadioButtonR3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButtonR4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelpregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButtonR1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonsiguient, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanelpregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jRadioButtonR1)
                .addGap(16, 16, 16)
                .addComponent(jRadioButtonR2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonR3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonR4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButtonsiguient, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonR4ActionPerformed
        getSelectedOption(jRadioButtonR4);
    }//GEN-LAST:event_jRadioButtonR4ActionPerformed

    private void jRadioButtonR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonR2ActionPerformed
        getSelectedOption(jRadioButtonR2);
    }//GEN-LAST:event_jRadioButtonR2ActionPerformed

    private void jRadioButtonR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonR3ActionPerformed
       getSelectedOption(jRadioButtonR3);
    }//GEN-LAST:event_jRadioButtonR3ActionPerformed

    private void jRadioButtonR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonR1ActionPerformed
     getSelectedOption(jRadioButtonR1);  
   
        
    }//GEN-LAST:event_jRadioButtonR1ActionPerformed

    private void jButtonsiguientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsiguientActionPerformed
         
        
        
        
        if (jButtonsiguient.getText().equals("Reiniciar")) {
             
             jButtonsiguient.setText("Siguente");
             index=0;
             correcto=0;
            
        }
         
        if (index==preguntas.length ) {
            Labelpregunta.setText("Correctas " + correcto + " / " + preguntas.length);
            
            if(correcto>=(float) preguntas.length/2){
                Panel1.setBackground(Color.green);
            }
            else{
                Panel1.setBackground(Color.red);
            }
            if (jButtonsiguient.getText().equals("Salir")) {
            
            Principal principalFrame = new Principal();
            principalFrame.setVisible(true);
            this.dispose(); 
            return; 
        }

            jButtonsiguient.setText("Salir");
        }
        
        
        
        else{
            
            
            enableRbuttons(true);
        
            Labelpregunta.setText(preguntas[index]);
         
            jRadioButtonR1.setText(opciones[index][0]);
            jRadioButtonR2.setText(opciones[index][1]);
            jRadioButtonR3.setText(opciones[index][2]);
            jRadioButtonR4.setText(opciones[index][3]);
         
            if(index== preguntas.length-1){
               jButtonsiguient.setText("Final, ver resultado");
            }
            
        }
        bg.clearSelection();
        
    }//GEN-LAST:event_jButtonsiguientActionPerformed

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
            java.util.logging.Logger.getLogger(segundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(segundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(segundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(segundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new segundo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labelpregunta;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton jButtonsiguient;
    private javax.swing.JPanel jPanelpregunta;
    private javax.swing.JRadioButton jRadioButtonR1;
    private javax.swing.JRadioButton jRadioButtonR2;
    private javax.swing.JRadioButton jRadioButtonR3;
    private javax.swing.JRadioButton jRadioButtonR4;
    // End of variables declaration//GEN-END:variables
}
