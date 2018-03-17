/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormEncapsulamento;

/**
 *
 * @author bbrog
 */
public class FormControleRemoto extends javax.swing.JFrame {

    int volume = 0;
    int canal = 0;

    /**
     * Creates new form FormControleRemoto
     */
    public FormControleRemoto() {
        initComponents();

        lblImagem.setVisible(false);
        lblLigado.setVisible(false);
        lblACanal.setVisible(false);
        lblCanal.setVisible(false);
        lblAVolume.setVisible(false);
        lblVolume.setVisible(false);
        lblMudo.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnON = new javax.swing.JToggleButton();
        btnOFF = new javax.swing.JToggleButton();
        btnVolMenos = new javax.swing.JButton();
        btnVolMais = new javax.swing.JButton();
        btnMudoON = new javax.swing.JButton();
        btnMudoOFF = new javax.swing.JButton();
        btnCanalMais = new javax.swing.JButton();
        btnCanalMenos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblAVolume = new javax.swing.JLabel();
        lblLigado = new javax.swing.JLabel();
        lblACanal = new javax.swing.JLabel();
        lblVolume = new javax.swing.JLabel();
        lblMudo = new javax.swing.JLabel();
        lblCanal = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini TV");
        setLocation(new java.awt.Point(300, 100));

        btnON.setText("On");
        btnON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnONActionPerformed(evt);
            }
        });

        btnOFF.setText("OFF");
        btnOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOFFActionPerformed(evt);
            }
        });

        btnVolMenos.setText("Volume -");
        btnVolMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolMenosActionPerformed(evt);
            }
        });

        btnVolMais.setText("Volume +");
        btnVolMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolMaisActionPerformed(evt);
            }
        });

        btnMudoON.setText("Mudo ON");
        btnMudoON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMudoONActionPerformed(evt);
            }
        });

        btnMudoOFF.setText("Mudo OFF");
        btnMudoOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMudoOFFActionPerformed(evt);
            }
        });

        btnCanalMais.setText("Canal +");
        btnCanalMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanalMaisActionPerformed(evt);
            }
        });

        btnCanalMenos.setText("Canal -");
        btnCanalMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanalMenosActionPerformed(evt);
            }
        });

        lblAVolume.setText("Volume:");

        lblLigado.setText("Ligado");

        lblACanal.setText("Canal:");

        lblVolume.setText("10");

        lblMudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMudo.setText("Mudo");

        lblCanal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCanal.setText("0");

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simuladortv/TV fora do ar.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMudo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(lblAVolume)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblACanal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblLigado)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblImagem)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAVolume)
                    .addComponent(lblLigado)
                    .addComponent(lblACanal)
                    .addComponent(lblMudo)
                    .addComponent(lblCanal)
                    .addComponent(lblVolume))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnON, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMudoOFF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMudoON, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVolMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolMais))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCanalMais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCanalMenos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnOFF)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnON)
                            .addGap(27, 27, 27))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnVolMais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCanalMais))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnVolMenos)
                                        .addComponent(btnCanalMenos)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnMudoON)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnMudoOFF)))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnOFF)
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnONActionPerformed
        // TODO add your handling code here:

        lblImagem.setVisible(true);
        lblLigado.setVisible(true);
        lblACanal.setVisible(true);
        lblCanal.setVisible(true);
        lblCanal.setText("0");
        lblAVolume.setVisible(true);
        lblVolume.setVisible(true);
        lblVolume.setText("0");

    }//GEN-LAST:event_btnONActionPerformed

    private void btnOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOFFActionPerformed
        // TODO add your handling code here:

        lblImagem.setVisible(false);
        lblLigado.setVisible(false);
        lblACanal.setVisible(false);
        lblCanal.setVisible(false);
        lblAVolume.setVisible(false);
        lblVolume.setVisible(false);
        lblMudo.setVisible(false);

    }//GEN-LAST:event_btnOFFActionPerformed

    private void btnMudoONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMudoONActionPerformed
        // TODO add your handling code here:

        lblMudo.setVisible(true);
        lblAVolume.setVisible(true);
        lblVolume.setText(" ");
        btnVolMais.setEnabled(false);
        btnVolMenos.setEnabled(false);
    }//GEN-LAST:event_btnMudoONActionPerformed

    private void btnMudoOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMudoOFFActionPerformed
        // TODO add your handling code here:

        lblMudo.setVisible(false);
        lblAVolume.setVisible(true);
        lblVolume.setText("0");
        btnVolMais.setEnabled(true);
        btnVolMenos.setEnabled(true);
    }//GEN-LAST:event_btnMudoOFFActionPerformed

    private void btnVolMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolMaisActionPerformed
        // TODO add your handling code here:

        while (volume < 20) {

            volume = volume + 1;
            
            lblVolume.setText(Integer.toString(volume));

            break;

        }

        //int volume = Integer.parseInt(lblVolume.getText());

    }//GEN-LAST:event_btnVolMaisActionPerformed

    private void btnVolMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolMenosActionPerformed
        // TODO add your handling code here:

        while (volume > 0) {

            volume = volume - 1;
            
            lblVolume.setText(Integer.toString(volume));
            
            break;

        }
    }//GEN-LAST:event_btnVolMenosActionPerformed

    private void btnCanalMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanalMaisActionPerformed
        // TODO add your handling code here:

        while (canal < 20) {

            canal = canal + 1;
            
            lblCanal.setText(Integer.toString(canal));

            break;

        }

    }//GEN-LAST:event_btnCanalMaisActionPerformed

    private void btnCanalMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanalMenosActionPerformed
        // TODO add your handling code here:

        while (canal > 0) {

            canal = canal - 1;
            
            lblCanal.setText(Integer.toString(canal));

            break;

        }
    }//GEN-LAST:event_btnCanalMenosActionPerformed

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
            java.util.logging.Logger.getLogger(FormControleRemoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormControleRemoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormControleRemoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormControleRemoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormControleRemoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanalMais;
    private javax.swing.JButton btnCanalMenos;
    private javax.swing.JButton btnMudoOFF;
    private javax.swing.JButton btnMudoON;
    private javax.swing.JToggleButton btnOFF;
    private javax.swing.JToggleButton btnON;
    private javax.swing.JButton btnVolMais;
    private javax.swing.JButton btnVolMenos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblACanal;
    private javax.swing.JLabel lblAVolume;
    private javax.swing.JLabel lblCanal;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblLigado;
    private javax.swing.JLabel lblMudo;
    private javax.swing.JLabel lblVolume;
    // End of variables declaration//GEN-END:variables
}
