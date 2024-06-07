
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandrezamberlan
 */
public class JFrame_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_Cliente
     */
    public JFrame_Cliente() {
        initComponents();
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
        jTextField_portaServidor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_apelido = new javax.swing.JTextField();
        jButton_conectar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField_mensagem = new javax.swing.JTextField();
        jButton_enviar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_apelidoServidor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_enderecoServidor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_mensagens = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Porta do servidor: ");

        jLabel2.setText("Apelido:");

        jButton_conectar.setText("Conectar");
        jButton_conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_conectarActionPerformed(evt);
            }
        });

        jLabel3.setText("Mensagem: ");

        jTextField_mensagem.setEditable(false);
        jTextField_mensagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_mensagemKeyPressed(evt);
            }
        });

        jButton_enviar.setText("Enviar");
        jButton_enviar.setEnabled(false);
        jButton_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_enviarActionPerformed(evt);
            }
        });

        jLabel4.setText("Apelido do servidor: ");

        jTextField_apelidoServidor.setEditable(false);
        jTextField_apelidoServidor.setFocusable(false);

        jLabel5.setText("Endereço do servidor: ");

        jTextArea_mensagens.setEditable(false);
        jTextArea_mensagens.setColumns(20);
        jTextArea_mensagens.setRows(5);
        jTextArea_mensagens.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea_mensagens);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_mensagem)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_enviar)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField_portaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_apelidoServidor)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_conectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_enderecoServidor, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jTextField_apelido))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_portaServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_enderecoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_apelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_apelidoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_conectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_enviar))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void enviar() {
        if (jTextField_mensagem.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Antes de enviar, é preciso digitar!!");
        } else {
            Comunicador.enviarMensagem(cliente, jTextField_mensagem.getText());
            Date dataAtual = new Date();
            jTextArea_mensagens.append("["+ dataAtual + "] Você escreveu: " + jTextField_mensagem.getText() + "\n");
            jTextField_mensagem.setText("");
        }
    }
    
    private void jButton_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_enviarActionPerformed
        enviar();
        
    }//GEN-LAST:event_jButton_enviarActionPerformed

    private void jButton_conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_conectarActionPerformed
        if (jTextField_portaServidor.getText().isEmpty() || jTextField_enderecoServidor.getText().isEmpty() || jTextField_apelido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Para conectar é preciso definir porta, endereço e apelido");
        } else {
            
            try {
                //cria um socket TCP para se conectar ao servidor de ip "localhost" porta 1234
                cliente = new Socket(jTextField_enderecoServidor.getText(), Integer.parseInt(jTextField_portaServidor.getText()));
                jTextField_portaServidor.setEditable(false);
                jTextField_apelido.setEditable(false);
                jTextField_enderecoServidor.setEditable(false);
                jButton_conectar.setEnabled(false);
                
                jTextField_mensagem.setEditable(true);
                jButton_enviar.setEnabled(true);

                new Thread() {
                    @Override
                    public void run() {
                        Date dataAtual = new Date();
                        while (true) {
                            jTextArea_mensagens.append("["+ dataAtual + "]: " + Comunicador.receberMensagem(cliente) + "\n");  
                        }
                    }
                }.start();

            } catch (IOException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao conectar o servidor");
            }
        }
    }//GEN-LAST:event_jButton_conectarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            cliente.close();
        } catch (IOException ex) {
            Logger.getLogger(JFrame_Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jTextField_mensagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_mensagemKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enviar();
        }
            
    }//GEN-LAST:event_jTextField_mensagemKeyPressed

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
            java.util.logging.Logger.getLogger(JFrame_Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Cliente().setVisible(true);
            }
        });
    }
    
    Socket cliente;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_conectar;
    private javax.swing.JButton jButton_enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_mensagens;
    private javax.swing.JTextField jTextField_apelido;
    private javax.swing.JTextField jTextField_apelidoServidor;
    private javax.swing.JTextField jTextField_enderecoServidor;
    private javax.swing.JTextField jTextField_mensagem;
    private javax.swing.JTextField jTextField_portaServidor;
    // End of variables declaration//GEN-END:variables
}
