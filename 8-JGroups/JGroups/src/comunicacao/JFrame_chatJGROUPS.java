
package comunicacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author alexandrezamberlan
 */
public class JFrame_chatJGROUPS extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_chatJGROUPS
     */
    public JFrame_chatJGROUPS() {
        initComponents();
        jButton_sairGrupo.setEnabled(false);
        jTextArea_mensagensGerais.setEditable(false);
        jTextArea_mensagensGerais.setFocusable(false);
        jTextField_mensagemParaGrupo.setEnabled(false);
        jButton_enviarMensagemGrupo.setEnabled(false);
        jComboBox_listaParticipantesGrupo.setEnabled(false);
        jTextField_mensagemParaParticipante.setEnabled(false);
        jButton_enviarParticipante.setEnabled(false);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_mensagensGerais = new javax.swing.JTextArea();
        jTextField_apelido = new javax.swing.JTextField();
        jButton_entrarGrupo = new javax.swing.JButton();
        jButton_sairGrupo = new javax.swing.JButton();
        jTextField_mensagemParaGrupo = new javax.swing.JTextField();
        jComboBox_listaParticipantesGrupo = new javax.swing.JComboBox<>();
        jTextField_mensagemParaParticipante = new javax.swing.JTextField();
        jButton_enviarMensagemGrupo = new javax.swing.JButton();
        jButton_enviarParticipante = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_listaMembros = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat com JGroups");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Apelido: ");

        jLabel2.setText("Mensagem para o grupo: ");

        jLabel3.setText("Mensagem excluiva para: ");

        jTextArea_mensagensGerais.setEditable(false);
        jTextArea_mensagensGerais.setColumns(20);
        jTextArea_mensagensGerais.setRows(5);
        jTextArea_mensagensGerais.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea_mensagensGerais);

        jButton_entrarGrupo.setText("Entrar");
        jButton_entrarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_entrarGrupoActionPerformed(evt);
            }
        });

        jButton_sairGrupo.setText("Sair");
        jButton_sairGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sairGrupoActionPerformed(evt);
            }
        });

        jComboBox_listaParticipantesGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o participante" }));

        jButton_enviarMensagemGrupo.setText("Enviar Grupo");
        jButton_enviarMensagemGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_enviarMensagemGrupoActionPerformed(evt);
            }
        });

        jButton_enviarParticipante.setText("Enviar Part.");
        jButton_enviarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_enviarParticipanteActionPerformed(evt);
            }
        });

        jTextArea_listaMembros.setEditable(false);
        jTextArea_listaMembros.setColumns(20);
        jTextArea_listaMembros.setRows(5);
        jTextArea_listaMembros.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea_listaMembros);

        jLabel4.setText("LISTA DE MEMBROS");

        jLabel5.setText("ÁREA DE MENSAGENS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_listaParticipantesGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_mensagemParaParticipante))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_apelido, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_entrarGrupo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_sairGrupo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_mensagemParaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_enviarParticipante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_enviarMensagemGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_apelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_entrarGrupo)
                    .addComponent(jButton_sairGrupo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_mensagemParaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_enviarMensagemGrupo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_listaParticipantesGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_mensagemParaParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_enviarParticipante))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_entrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_entrarGrupoActionPerformed
        // TODO add your handling code here:
        if (jTextField_apelido.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Você precisa informar um apelido!!!");
        } else {
            jButton_entrarGrupo.setEnabled(false);
            jButton_sairGrupo.setEnabled(true);
            jTextField_mensagemParaGrupo.setEnabled(true);
            jButton_enviarMensagemGrupo.setEnabled(true);
            jButton_enviarMensagemGrupo.setFocusable(true);
            jComboBox_listaParticipantesGrupo.setEnabled(true);
            jTextField_mensagemParaParticipante.setEnabled(true);
            jButton_enviarParticipante.setEnabled(true);
            jTextField_apelido.setText(jTextField_apelido.getText().toUpperCase());
            jTextField_apelido.setEditable(false);
            jTextField_apelido.setFocusable(false);

            try {
                comunicador = new Comunicador();
                comunicador.iniciar(JFrame_chatJGROUPS.this);               
            } catch (Exception ex) {
//                Logger.getLogger(JFrame_chatJGROUPS.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this,"Problema para entrar no grupo ou channel.....");
            }

        }
    }//GEN-LAST:event_jButton_entrarGrupoActionPerformed

    private void jButton_sairGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sairGrupoActionPerformed

        //comunicador.enviar("Saiu do grupo: " /*+ comunicador.mensagem.getSrc()*/,  null);
        comunicador.finalizar();
        jTextArea_listaMembros.setText("");
        jButton_entrarGrupo.setEnabled(true);
        jButton_sairGrupo.setEnabled(false);
        jTextField_apelido.setText("");
        jTextField_mensagemParaGrupo.setEnabled(false);
        jButton_enviarMensagemGrupo.setEnabled(false);
        jComboBox_listaParticipantesGrupo.setEnabled(false);
        jTextField_mensagemParaParticipante.setEnabled(false);
        jButton_enviarParticipante.setEnabled(false);
        jTextField_apelido.setEditable(true);
        jTextField_apelido.setFocusable(true);
    }//GEN-LAST:event_jButton_sairGrupoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (comunicador != null) {
            comunicador.finalizar();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton_enviarMensagemGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_enviarMensagemGrupoActionPerformed
        // TODO add your handling code here:
        if (!jTextField_mensagemParaGrupo.getText().equals("")) {
            comunicador.enviar(jTextField_mensagemParaGrupo.getText(), null);
            jTextField_mensagemParaGrupo.setText("");
        } else JOptionPane.showMessageDialog(this, "Antes de enviar, você precisa escrever uma mensagem");
    }//GEN-LAST:event_jButton_enviarMensagemGrupoActionPerformed

    private void jButton_enviarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_enviarParticipanteActionPerformed
        // TODO add your handling code here:
         if (!jTextField_mensagemParaParticipante.getText().equals("") && jComboBox_listaParticipantesGrupo.getSelectedIndex() != 0) {
            comunicador.enviar("[privado para " + jComboBox_listaParticipantesGrupo.getSelectedItem().toString() + "] "+ jTextField_mensagemParaParticipante.getText(), 
                    jComboBox_listaParticipantesGrupo.getSelectedItem().toString());
            
            jTextField_mensagemParaParticipante.setText("");
        } else JOptionPane.showMessageDialog(this, "Antes de enviar, você precisa escrever uma mensagem e selecionar um participante");
    }//GEN-LAST:event_jButton_enviarParticipanteActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_chatJGROUPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_chatJGROUPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_chatJGROUPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_chatJGROUPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_chatJGROUPS().setVisible(true);
            }
        });
    }

    public JButton getjButton_entrarGrupo() {
        return jButton_entrarGrupo;
    }

    public JButton getjButton_enviarMensagemGrupo() {
        return jButton_enviarMensagemGrupo;
    }

    public JButton getjButton_enviarParticipante() {
        return jButton_enviarParticipante;
    }

    public JButton getjButton_sairGrupo() {
        return jButton_sairGrupo;
    }

    public JComboBox<String> getjComboBox_listaParticipantesGrupo() {
        return jComboBox_listaParticipantesGrupo;
    }

    public JTextArea getjTextArea_mensagensGerais() {
        return jTextArea_mensagensGerais;
    }

    public JTextField getjTextField_apelido() {
        return jTextField_apelido;
    }

    public JTextField getjTextField_mensagemParaGrupo() {
        return jTextField_mensagemParaGrupo;
    }

    public JTextField getjTextField_mensagemParaParticipante() {
        return jTextField_mensagemParaParticipante;
    }

    public JTextArea getjTextArea_listaMembros() {
        return jTextArea_listaMembros;
    }
    
    
    
    Comunicador comunicador;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_entrarGrupo;
    private javax.swing.JButton jButton_enviarMensagemGrupo;
    private javax.swing.JButton jButton_enviarParticipante;
    private javax.swing.JButton jButton_sairGrupo;
    private javax.swing.JComboBox<String> jComboBox_listaParticipantesGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_listaMembros;
    private javax.swing.JTextArea jTextArea_mensagensGerais;
    private javax.swing.JTextField jTextField_apelido;
    private javax.swing.JTextField jTextField_mensagemParaGrupo;
    private javax.swing.JTextField jTextField_mensagemParaParticipante;
    // End of variables declaration//GEN-END:variables
}