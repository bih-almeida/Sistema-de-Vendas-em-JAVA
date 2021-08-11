
package view;

import controller.ControllerCaixa;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.ModelCaixa;
import model.ModelSessaoUsuario;
import model.ModelUsuario;
import util.BLDatas;
import util.BLMascaras;

public class ViewAbrirCaixa extends javax.swing.JFrame {
ControllerCaixa controllerCaixa = new ControllerCaixa();
ModelCaixa modelCaixa = new ModelCaixa();
ModelUsuario modelUsuario = new ModelUsuario();
BLDatas blDatas = new BLDatas();
ArrayList<ModelCaixa> listaModelAberturaaCaixa = new ArrayList<>();
private ViewPrincipal viewPrincipal;
BLMascaras BLm = new BLMascaras();
   
    public ViewAbrirCaixa() {
        initComponents();
       
        setLocationRelativeTo(null); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ValorAbertura = new javax.swing.JFormattedTextField();
        jbAbrirCaixa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Abrir Caixa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Valor de Abertura:  R$");

        ValorAbertura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ValorAberturaFocusLost(evt);
            }
        });
        ValorAbertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorAberturaActionPerformed(evt);
            }
        });
        ValorAbertura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorAberturaKeyTyped(evt);
            }
        });

        jbAbrirCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-selecionado-50.png"))); // NOI18N
        jbAbrirCaixa.setText("Abrir Caixa");
        jbAbrirCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAbrirCaixaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-baú-do-tesouro-50.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-melting-ice-cream-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ValorAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 148, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbAbrirCaixa)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(183, 183, 183))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ValorAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbAbrirCaixa)
                        .addGap(18, 18, 18)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValorAberturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAberturaActionPerformed
    }//GEN-LAST:event_ValorAberturaActionPerformed

    private void jbAbrirCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAbrirCaixaActionPerformed
        try{
          if(Float.parseFloat(ValorAbertura.getText()) >= 10){
            //setar Sessao funcionario no ModelCaixa que passa para controller
            modelCaixa.setFk_funcionario(ModelSessaoUsuario.codigo);
         
            //setar horario de abertura do caixa
            modelCaixa.setHora_abertuta(blDatas.retornarHora());
         
            //setar data de abertura do caixa 
            LocalDate locald = LocalDate.now();
            java.sql.Date sqlDate = java.sql.Date.valueOf(locald); // Magic happens here!
            modelCaixa.setData_abertura(sqlDate);
           
            //setar valor de aberturaa
            modelCaixa.setValor_abertura(Float.parseFloat(ValorAbertura.getText()));
         
            //data_fechamento
            LocalDate local = LocalDate.now();
            java.sql.Date sqlDate2 = java.sql.Date.valueOf(local); // Magic happens here!
            modelCaixa.setData_fechamento(sqlDate2);
          
            //setar status
            modelCaixa.setStatus_caixa(1);
          
            //salvar no banco  
            int codigoVenda = 0;    
            codigoVenda = controllerCaixa.salvarCaixaController(modelCaixa);
              if(codigoVenda >0){
                JOptionPane.showMessageDialog(this, "Caixa Aberto com sucesso");
                ViewPrincipal main = new ViewPrincipal();
                main.setVisible(true);
                dispose();
          
              }else{
                JOptionPane.showMessageDialog(this, "Erro ao abrir o caixa", "Erro", JOptionPane.ERROR_MESSAGE);
              }
    }else{
        JOptionPane.showMessageDialog(this, "Valor não pode ser menor que R$ 10,00 ", "Erro", JOptionPane.ERROR_MESSAGE); 
    }
        
    }catch(Exception e){
    JOptionPane.showMessageDialog(this, "Valor deve ser maior que R$ 00.00 !", "Atenção", JOptionPane.WARNING_MESSAGE );}
    
    }//GEN-LAST:event_jbAbrirCaixaActionPerformed

    private void ValorAberturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ValorAberturaFocusLost
        ValorAbertura.setText(BLm.converterVirgulaParaPonto(ValorAbertura.getText()));
        ValorAbertura.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(ValorAbertura.getText())));
    }//GEN-LAST:event_ValorAberturaFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ViewPrincipal main = new ViewPrincipal();
                 main.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void ValorAberturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorAberturaKeyTyped
        String caracteres="0987654321.,";
                if(!caracteres.contains(evt.getKeyChar()+"")){
                    evt.consume();
                    JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
    }//GEN-LAST:event_ValorAberturaKeyTyped

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
            java.util.logging.Logger.getLogger(ViewAbrirCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAbrirCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAbrirCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAbrirCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAbrirCaixa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ValorAbertura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAbrirCaixa;
    // End of variables declaration//GEN-END:variables
}
