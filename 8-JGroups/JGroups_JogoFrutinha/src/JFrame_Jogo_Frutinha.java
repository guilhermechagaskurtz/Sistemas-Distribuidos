import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author alexandrezamberlan
 */
public class JFrame_Jogo_Frutinha extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_chatJGROUPS
     */
    public JFrame_Jogo_Frutinha() {
        initComponents();
        jButton_sairGrupo.setEnabled(false);
       
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
        jTextField_apelido = new javax.swing.JTextField();
        jButton_entrarGrupo = new javax.swing.JButton();
        jButton_sairGrupo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_listaMembros = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel_area = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat com JGroups");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Apelido: ");

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

        jTextArea_listaMembros.setEditable(false);
        jTextArea_listaMembros.setColumns(20);
        jTextArea_listaMembros.setRows(5);
        jTextArea_listaMembros.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea_listaMembros);

        jLabel4.setText("LISTA DE MEMBROS");

        jLabel5.setText("ÁREA DO JOGO");

        jPanel_area.setBackground(new java.awt.Color(204, 255, 255));
        jPanel_area.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel_areaLayout = new javax.swing.GroupLayout(jPanel_area);
        jPanel_area.setLayout(jPanel_areaLayout);
        jPanel_areaLayout.setHorizontalGroup(
            jPanel_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_areaLayout.setVerticalGroup(
            jPanel_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_apelido, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_entrarGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_sairGrupo)
                        .addContainerGap(401, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(129, 129, 129))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel_area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel_area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_entrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_entrarGrupoActionPerformed
        // TODO add your handling code here:
        if (jTextField_apelido.getText().equals("") || jTextField_apelido.getText().length() > 6) {
            JOptionPane.showMessageDialog(this, "Digite um apelido primeiro com no máximo 6 caracteres");
        } else {
            jButton_entrarGrupo.setEnabled(false);
            jButton_sairGrupo.setEnabled(true);
            jTextField_apelido.setText(jTextField_apelido.getText().toUpperCase());
            jTextField_apelido.setEditable(false);
            jTextField_apelido.setFocusable(false);
            try {
                jTextField_apelido.requestFocus();
                Random gerador = new Random();
                int largura = 80;
                int altura = 40;
                int x = gerador.nextInt(this.jPanel_area.getBounds().width - largura);
                int y = gerador.nextInt(this.jPanel_area.getBounds().height - altura);
                Componente c = new Componente(this.jTextField_apelido.getText(), x, y, largura, altura);
                if (!listaJogadores.contains(c)) {
                    listaJogadores.add(c);
                    //adiciona o botao no jPane_area
                    this.jPanel_area.add(listaJogadores.get(listaJogadores.size() - 1).botao);
                    listaJogadores.get(listaJogadores.size() - 1).botao.setVisible(true);
                    listaJogadores.get(listaJogadores.size() - 1).botao.setBounds(x, y, largura, altura);
                } else {
                    JOptionPane.showMessageDialog(this, this.jTextField_apelido.getText() + " já foi inserido!!");
                }               
             
                //inicia o comunidador
                comunicador = new Comunicador();
                comunicador.iniciar(JFrame_Jogo_Frutinha.this);               
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
       
        jTextField_apelido.setEditable(true);
        jTextField_apelido.setFocusable(true);
    }//GEN-LAST:event_jButton_sairGrupoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (comunicador != null) {
            comunicador.finalizar();
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(JFrame_Jogo_Frutinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Jogo_Frutinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Jogo_Frutinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Jogo_Frutinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Jogo_Frutinha().setVisible(true);
            }
        });
    }

    public JButton getjButton_entrarGrupo() {
        return jButton_entrarGrupo;
    }

    public JButton getjButton_sairGrupo() {
        return jButton_sairGrupo;
    }
    
    public JTextField getjTextField_apelido() {
        return jTextField_apelido;
    }

    public JTextArea getjTextArea_listaMembros() {
        return jTextArea_listaMembros;
    }

    public JPanel getjPanel_area() {
        return jPanel_area;
    }
   
    
    
    private Comunicador comunicador;
    public List<Componente> listaJogadores = new LinkedList<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_entrarGrupo;
    private javax.swing.JButton jButton_sairGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel_area;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_listaMembros;
    private javax.swing.JTextField jTextField_apelido;
    // End of variables declaration//GEN-END:variables
}