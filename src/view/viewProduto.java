/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerProdutos;
import controller.Controllerfornecedor;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelProdutos;
import model.Modelfornecedor;
import util.BLMascaras;
import util.Formatador;

/**
 *
 * @author GABRIELA
 */
public class viewProduto extends javax.swing.JFrame {
    ArrayList<ModelProdutos> listaModelProduto = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos(); //instancia fora dos métodos para não estanciar em todos os métodos
    Formatador formatador = new Formatador();
    String salvarAlterar;
    Controllerfornecedor controllerfornecedor = new Controllerfornecedor();
    Modelfornecedor modelfornecedor = new Modelfornecedor();
    ArrayList<Modelfornecedor> listaModelfornecedors = new ArrayList<>();
    BLMascaras BLm = new BLMascaras();
    public viewProduto() {
        initComponents();
        carregarProdutos();
        setLocationRelativeTo(null); //executa no centro
        habilitarDesabilitarCampos(false);
        listarClientes();
        preencherCodigoClientePeloComboBox();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProdutos = new javax.swing.JTable();
        jtfPesquisa = new javax.swing.JTextField();
        jbPesquisa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jbNovo = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jtfEstoque = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        codigo = new javax.swing.JTextField();
        jtfValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");

        jLabel1.setText("Código:");

        jLabel2.setText("Nome do Produto:");

        jLabel3.setText("Estoque:");

        jtfCodigo.setEditable(false);
        jtfCodigo.setEnabled(false);

        jLabel4.setText("Valor:");

        jtableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableProdutos);
        if (jtableProdutos.getColumnModel().getColumnCount() > 0) {
            jtableProdutos.getColumnModel().getColumn(1).setMinWidth(300);
            jtableProdutos.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jbPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-50.png"))); // NOI18N
        jbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisaActionPerformed(evt);
            }
        });

        jLabel5.setText("Pesquisar:");

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-arquivo-50.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-excluir-50.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-salvar-e-fechar-50.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-fechar-janela-50.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-crie-um-novo-50.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jtfEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtfEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEstoqueActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-melting-ice-cream-50.png"))); // NOI18N

        jLabel7.setText("Código Fornecedor:");

        jLabel8.setText("Fornecedor:");

        combo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        codigo.setText("0");
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        jtfValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfValorFocusLost(evt);
            }
        });
        jtfValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfValorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbExcluir)
                        .addGap(86, 86, 86)
                        .addComponent(jbSalvar))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPesquisa)))
                        .addGap(18, 18, 18)
                        .addComponent(jbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jtableProdutos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtableProdutos.setRowSorter(classificador);
        String texto = jtfPesquisa.getText().toUpperCase();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jbPesquisaActionPerformed
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.habilitarDesabilitarCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
         if(jtfNome.getText() == null || "".equals(jtfNome.getText()) ){
            JOptionPane.showMessageDialog(this, "Nome não deve estar vazio", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        if(jtfEstoque.getText() == null || "".equals(jtfEstoque.getText()) ){
            JOptionPane.showMessageDialog(this, "Estoque não deve estar vazio", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        if(jtfValor.getText() == null || "".equals(jtfValor.getText()) ){
            JOptionPane.showMessageDialog(this, "Valor não deve estar vazio", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
         if(codigo.getText() == null || "".equals(codigo.getText()) || codigo.getText() == "0"){
            JOptionPane.showMessageDialog(this, "Selecione o fornecedor", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        try{
        if(salvarAlterar .equals("salvar")){
        this.salvarProduto();
        }else if(salvarAlterar .equals("alterar")){
        this.alterarProduto();
        }
        }catch(Exception e){
        }
    }//GEN-LAST:event_jbSalvarActionPerformed
    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        //Precisa obter o código do produto e depois chamar o método do banco de excluir
        int linha = jtableProdutos.getSelectedRow(); //Pega a linha selecionada
        int codigoProduto = (int) jtableProdutos.getValueAt(linha, 0);//pega o código da linha selecionada, coluna 0
        if(controllerProdutos.excluirProdutoController(codigoProduto)){
            JOptionPane.showMessageDialog(this, "Produto excluido com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.carregarProdutos();
            this.habilitarDesabilitarCampos(false);
        }else{
            JOptionPane.showMessageDialog(this, "Não foi possível excluir o produto", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed
    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        habilitarDesabilitarCampos(true);
        limparCampos();
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovoActionPerformed
    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        salvarAlterar = "alterar";
        habilitarDesabilitarCampos(true);
        int linha = this.jtableProdutos.getSelectedRow();
        try{
        int codigoProduto = (int) this.jtableProdutos.getValueAt(linha, 0);
            //recuperar dados no banco
            modelProdutos = controllerProdutos.retornarProdutoController(codigoProduto);
            //setar na interface
            this.jtfCodigo.setText(modelProdutos.getIdProduto()+"");
            this.jtfNome.setText(modelProdutos.getProNome());
            this.jtfEstoque.setText(String.valueOf(modelProdutos.getProEstoque()));
            this.jtfValor.setText(String.valueOf(modelProdutos.getProValor()));
            this.codigo.setText(String.valueOf(modelProdutos.getFkFornecedor()));
            this.combo.setSelectedItem(modelProdutos.getProNomeFornecedor());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado!", "Aviso", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_jbAlterarActionPerformed
    private void jtfEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEstoqueActionPerformed
    }//GEN-LAST:event_jtfEstoqueActionPerformed
    private void comboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboPopupMenuWillBecomeInvisible
             try{
           modelfornecedor = controllerfornecedor.getFornecedorController(combo.getSelectedItem().toString());
          codigo.setText(String.valueOf(modelfornecedor.getId_fornecedor()));
             }catch(Exception e){}
    }//GEN-LAST:event_comboPopupMenuWillBecomeInvisible
    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
    }//GEN-LAST:event_codigoActionPerformed
    private void jtfValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfValorFocusLost
        jtfValor.setText(BLm.converterVirgulaParaPonto(jtfValor.getText()));
         jtfValor.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(jtfValor.getText())));
    }//GEN-LAST:event_jtfValorFocusLost
    private void jtfValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfValorKeyTyped
          String caracteres="0987654321.,";
                if(!caracteres.contains(evt.getKeyChar()+"")){
                    evt.consume();
                    JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
    }//GEN-LAST:event_jtfValorKeyTyped
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
            java.util.logging.Logger.getLogger(viewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewProduto().setVisible(true);
            }
        });
    }
    private void salvarProduto(){ //dependendo do valor da variavel salvar e alterar, eu chamo esse metodo
        modelProdutos.setProNome(this.jtfNome.getText().toUpperCase());
        modelProdutos.setProEstoque(Integer.parseInt(this.jtfEstoque.getText())); //pega texto e converte pra inteiro
        modelProdutos.setProValor(formatador.converterVirgulaParaPonto(jtfValor.getText())); //pega texto e converte pra Double
        if (Integer.parseInt(codigo.getText()) == 0 &&
              combo != null){
                 try{
                     combo = null;
                     modelProdutos.setFkFornecedor(0);
                    modelProdutos.setProNomeFornecedor(null); 
                    
                  }catch (Exception ex){ }    
         }else{
             modelProdutos.setFkFornecedor(Integer.parseInt(codigo.getText()));
             modelProdutos.setProNomeFornecedor(combo.getSelectedItem().toString()); 
         }     
         if(controllerProdutos.salvarProdutosController(modelProdutos)>0){
            //maior que 0 pelo método do DaoProdutos onde retorna o código do produto que é sempre maior que 0, se retorna 0 é erro
            JOptionPane.showMessageDialog(this, "Produto Cadastrado com sucesso!");
            this.carregarProdutos(); //atualiza a tabela
            this.limparCampos();
            this.habilitarDesabilitarCampos(false);
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o produto", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
           }
    private void alterarProduto(){
        //cada campo(tributo) da minha classe, deve receber os dados da interface
        modelProdutos.setProNome(this.jtfNome.getText().toUpperCase());
        modelProdutos.setProEstoque(Integer.parseInt(this.jtfEstoque.getText())); //pega texto e converte pra inteiro
        modelProdutos.setProValor(formatador.converterVirgulaParaPonto(jtfValor.getText())); //pega texto e converte pra Double
        if (Integer.parseInt(codigo.getText()) == 0 && combo != null){
                    modelProdutos.setFkFornecedor(0);
                    modelProdutos.setProNomeFornecedor(null); 
        }else{
             modelProdutos.setFkFornecedor(Integer.parseInt(codigo.getText()));
              modelProdutos.setProNomeFornecedor(combo.getSelectedItem().toString()); 
        }     
        if(controllerProdutos.alterarProdutoController(modelProdutos)){
            JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!");
            this.carregarProdutos(); //atualiza a tabela
            this.limparCampos();
            this.habilitarDesabilitarCampos(false);
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao alterar o produto", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void preencherCodigoClientePeloComboBox(){
          modelfornecedor = controllerfornecedor.getFornecedorController(combo.getSelectedItem().toString());
          codigo.setText(String.valueOf(modelfornecedor.getId_fornecedor()));
    }
      private void listarClientes(){
        listaModelfornecedors = controllerfornecedor.getListafornecedorController();
        combo.removeAllItems();
        for (int i = 0; i < listaModelfornecedors.size(); i++){
            combo.addItem(listaModelfornecedors.get(i).getNome_fornecedor());
        }
    }
    private void habilitarDesabilitarCampos(boolean condicao){
        jtfNome.setEnabled(condicao);
        jtfValor.setEnabled(condicao);
        jtfEstoque.setEnabled(condicao);
        jbSalvar.setEnabled(condicao);
        codigo.setEnabled(condicao);
 }
    //método para limpar a interface
    private void limparCampos(){
        jtfNome.setText("");
        jtfValor.setText("");
        jtfEstoque.setText("");
        codigo.setText("");
        jtfCodigo.setText("");
    }
    private void carregarProdutos(){
        listaModelProduto = controllerProdutos.retornarListaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) jtableProdutos.getModel();
        modelo.setNumRows(0); //remove linhas em branco da tabela
        //Inserir Produtos na Tabela
        int cont = listaModelProduto.size();
        for (int i = 0; i < cont; i++){
          //  DecimalFormat df1 = new DecimalFormat("0.00");
          //     String valor = df1.format(listaModelProduto.get(i).getProValor());
            modelo.addRow(new Object[]{
                listaModelProduto.get(i).getIdProduto(),
                listaModelProduto.get(i).getProNome(),
                listaModelProduto.get(i).getProEstoque(),
               listaModelProduto.get(i).getProValor(),
            });
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisa;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable jtableProdutos;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JFormattedTextField jtfEstoque;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JFormattedTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}
