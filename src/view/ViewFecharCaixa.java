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
import model.ModelCliente;
import model.ModelSessaoUsuario;
import model.ModelUsuario;
import util.BLDatas;
import util.BLMascaras;
public class ViewFecharCaixa extends javax.swing.JFrame {
ControllerCaixa controllerCaixa = new ControllerCaixa();
ModelCaixa modelCaixa = new ModelCaixa();
ModelUsuario modelUsuario = new ModelUsuario();
BLDatas blDatas = new BLDatas();
ArrayList<ModelCaixa> listaModelAberturaaCaixa = new ArrayList<>();
private ViewPrincipal viewPrincipal;
BLMascaras BLm = new BLMascaras();
    public ViewFecharCaixa() {
        initComponents();
        setLocationRelativeTo(null); 
        carregarDados();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        b = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        e = new javax.swing.JFormattedTextField();
        d = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        c = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        f = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        aa = new javax.swing.JFormattedTextField();
        g = new javax.swing.JFormattedTextField();
        jlValorTotal7 = new javax.swing.JLabel();
        jlValorTotal9 = new javax.swing.JLabel();
        jlValorTotal10 = new javax.swing.JLabel();
        jlValorTotal11 = new javax.swing.JLabel();
        jlValorTotal12 = new javax.swing.JLabel();
        jlValorTotal13 = new javax.swing.JLabel();
        jbFecharCaixa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jlValorTotal14 = new javax.swing.JLabel();
        f1 = new javax.swing.JFormattedTextField();
        jlValorTotal15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fechar Caixa");
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
        jLabel2.setText("Valor de Fechamento:");

        b.setEditable(false);
        b.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bFocusLost(evt);
            }
        });
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-baú-do-tesouro-50.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Total de Sangria:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Total de Vendas:");

        e.setEditable(false);
        e.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eFocusLost(evt);
            }
        });
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });

        d.setEditable(false);
        d.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dFocusLost(evt);
            }
        });
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Total Crédito:");

        c.setEditable(false);
        c.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cFocusLost(evt);
            }
        });
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Total Débito:");

        f.setEditable(false);
        f.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fFocusLost(evt);
            }
        });
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Valor em Caixa disponível:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Total Dinheiro:");

        aa.setEditable(false);

        g.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                gFocusLost(evt);
            }
        });
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });
        g.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gKeyTyped(evt);
            }
        });

        jlValorTotal7.setText("R$:");

        jlValorTotal9.setText("R$:");

        jlValorTotal10.setText("R$:");

        jlValorTotal11.setText("R$:");

        jlValorTotal12.setText("R$:");

        jlValorTotal13.setText("R$:");

        jbFecharCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-selecionado-50.png"))); // NOI18N
        jbFecharCaixa.setText("Fechar Caixa");
        jbFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharCaixaActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-melting-ice-cream-50.png"))); // NOI18N

        jlValorTotal14.setText("R$:");

        f1.setEditable(false);
        f1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                f1FocusLost(evt);
            }
        });
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });

        jlValorTotal15.setText("R$:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Valor de Abertura:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbFecharCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlValorTotal14)
                        .addGap(10, 10, 10)
                        .addComponent(aa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlValorTotal7)
                        .addGap(10, 10, 10)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlValorTotal9)
                        .addGap(10, 10, 10)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlValorTotal10)
                        .addGap(10, 10, 10)
                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlValorTotal12)
                        .addGap(10, 10, 10)
                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(jlValorTotal11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(10, 10, 10)
                                .addComponent(jlValorTotal15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlValorTotal13)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(189, 189, 189))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlValorTotal14)
                            .addComponent(jLabel7)))
                    .addComponent(aa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlValorTotal7)
                            .addComponent(jLabel5))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlValorTotal9)
                            .addComponent(jLabel9))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlValorTotal10)
                            .addComponent(jLabel8)))
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlValorTotal12)
                            .addComponent(jLabel10))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlValorTotal11)
                        .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jlValorTotal15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlValorTotal13)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addComponent(jbFecharCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    }//GEN-LAST:event_formWindowClosed
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    ViewPrincipal main = new ViewPrincipal();
    main.setVisible(true);
    }//GEN-LAST:event_formWindowClosing
    private void bFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bFocusLost
    }//GEN-LAST:event_bFocusLost
    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
    }//GEN-LAST:event_bActionPerformed
    private void jbFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharCaixaActionPerformed
    try{
        if(Float.parseFloat(g.getText()) <= 0){
                JOptionPane.showMessageDialog(this, "Valor não deve ser igual ou menor a R$ 0.00", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }else{
        if(Float.parseFloat(g.getText()) <= 0 || g.getText() == null ){
            JOptionPane.showMessageDialog(this, "Valor de Fechamento Vazio ou menor ou igual a R$ 0.00", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //recuperar id insert no ultimo registro caixa
        ModelCaixa model = controllerCaixa.getUltimoIdController(modelCaixa);
        ModelCaixa modelo = controllerCaixa.getUltimoStatusController(modelCaixa);
         if(modelo.getStatus_caixa() > 0){
             //hora_fechamento
             model.setHora_fechamento(blDatas.retornarHora());
             //data_fechamento
             LocalDate local = LocalDate.now();
             java.sql.Date sqlDate2 = java.sql.Date.valueOf(local); // Magic happens here!
             // modelCaixa.setData_fechamento(sqlDate2);
             model.setData_fechamento(sqlDate2);
             //setar status
             model.setStatus_caixa(0);
             //valor fechamento
             model.setValor_fechamento(Float.parseFloat(g.getText()));
             //salvar no banco  
        boolean codigoVenda;    
        codigoVenda = controllerCaixa.atualizarCaixaController(model);
            if(codigoVenda == true){
               JOptionPane.showMessageDialog(this, "Caixa Fechado com sucesso");
               dispose();
               ViewPrincipal main = new ViewPrincipal();
               main.setVisible(true);
            }else{
               JOptionPane.showMessageDialog(this, "Erro ao fechar o caixa", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }else{
           JOptionPane.showMessageDialog(this, "Não há caixa aberto para fechar", "Erro", JOptionPane.ERROR_MESSAGE);
       }
    }   
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, "Valor deve ser maior que R$ 00.00 !", "Atenção", JOptionPane.WARNING_MESSAGE );}
    }//GEN-LAST:event_jbFecharCaixaActionPerformed
    private void eFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eFocusLost
    }//GEN-LAST:event_eFocusLost
    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
    }//GEN-LAST:event_eActionPerformed
    private void dFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dFocusLost
    }//GEN-LAST:event_dFocusLost
    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
    }//GEN-LAST:event_dActionPerformed
    private void cFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cFocusGained
    }//GEN-LAST:event_cFocusGained
    private void cFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cFocusLost
    }//GEN-LAST:event_cFocusLost
    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
    }//GEN-LAST:event_cActionPerformed
    private void fFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fFocusLost
    }//GEN-LAST:event_fFocusLost
    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
    }//GEN-LAST:event_fActionPerformed
    private void gFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gFocusLost
        g.setText(BLm.converterVirgulaParaPonto(g.getText()));
        g.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(g.getText())));
    }//GEN-LAST:event_gFocusLost
    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
    }//GEN-LAST:event_gActionPerformed
    private void gKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gKeyTyped
        String caracteres="0987654321.,";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_gKeyTyped
    private void f1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_f1FocusLost
    }//GEN-LAST:event_f1FocusLost
    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
    }//GEN-LAST:event_f1ActionPerformed
    private void carregarDados(){
        ModelCaixa modelo = controllerCaixa.getUltimoIdController(modelCaixa);
        ModelCaixa movimentacao = controllerCaixa.getUltimaMovimentacaoController(modelCaixa);
        ModelCaixa movimentacaoCredito = controllerCaixa.getUltimoCreditoController(modelCaixa);
        ModelCaixa movimentacaoDebito = controllerCaixa.getUltimoDebitoController(modelCaixa);
        ModelCaixa movimentacaoDinheiro = controllerCaixa.getUltimoDinheiroController(modelCaixa);
        ModelCaixa movimentacaoSangria = controllerCaixa.getUltimoDinheiroSangriaController(modelCaixa);
        ModelCaixa movimentacaoCaixa = controllerCaixa.getUltimaMovimentacaoCaixaController(modelCaixa);  
        ModelCaixa movimentacaoAbertura = controllerCaixa.getUltimaAberturaCaixaController(modelCaixa);
        aa.setText(BLm.arredondamentoComPontoDuasCasasString(movimentacao.getTotal_Movimentacoes()));
        b.setText(BLm.arredondamentoComPontoDuasCasasString(movimentacaoCaixa.getTotal_Caixa_sangria()));
        c.setText(BLm.arredondamentoComPontoDuasCasasString(movimentacaoDebito.getTotal_Debito())+"");
        d.setText(BLm.arredondamentoComPontoDuasCasasString(movimentacaoCredito.getTotal_Credito())+"");
        e.setText(BLm.arredondamentoComPontoDuasCasasString(movimentacaoDinheiro.getTotal_Dinheiro())+"");
        f.setText(BLm.arredondamentoComPontoDuasCasasString(movimentacaoSangria.getCaixa_sangria_dinheiro())+"");
        f1.setText(BLm.arredondamentoComPontoDuasCasasString(movimentacaoAbertura.getValor_abertura())+"");
    }
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
            java.util.logging.Logger.getLogger(ViewFecharCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFecharCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFecharCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFecharCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFecharCaixa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField aa;
    private javax.swing.JFormattedTextField b;
    private javax.swing.JFormattedTextField c;
    private javax.swing.JFormattedTextField d;
    private javax.swing.JFormattedTextField e;
    private javax.swing.JFormattedTextField f;
    private javax.swing.JFormattedTextField f1;
    private javax.swing.JFormattedTextField g;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbFecharCaixa;
    private javax.swing.JLabel jlValorTotal10;
    private javax.swing.JLabel jlValorTotal11;
    private javax.swing.JLabel jlValorTotal12;
    private javax.swing.JLabel jlValorTotal13;
    private javax.swing.JLabel jlValorTotal14;
    private javax.swing.JLabel jlValorTotal15;
    private javax.swing.JLabel jlValorTotal7;
    private javax.swing.JLabel jlValorTotal9;
    // End of variables declaration//GEN-END:variables
}
