//SEM USO   
package view;

import DAO.DAOCaixa;
import controller.ControllerCaixa;
import controller.ControllerCliente;
import controller.ControllerProdutos;
import controller.ControllerProdutosVendasProdutos;
import controller.ControllerVendas;
import controller.ControllerVendasCliente;
import controller.ControllerVendasProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCaixa;
import model.ModelCliente;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelSessaoUsuario;
import model.ModelVendas;
import model.ModelVendasClientes;
import model.ModelVendasProdutos;
import util.BLDatas;
import util.BLMascaras;

/**
 *
 * @author GABRIELA
 */
public class ViewVendas extends javax.swing.JFrame {
    ControllerCliente controllerCliente = new ControllerCliente();
    ModelCliente modelCliente = new ModelCliente();
    ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    ArrayList<ModelProdutos> listaModelProdutoses = new ArrayList<>();
    ArrayList<ModelVendasClientes> listaModelVendasClientes = new ArrayList<>();
    ControllerVendasCliente controllerVendasCliente = new ControllerVendasCliente();
    ControllerVendas controllerVendas = new ControllerVendas();
    ModelVendas modelVendas = new ModelVendas();
    BLDatas blDatas = new BLDatas();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos>listaModelVendasProdutoses = new ArrayList<>();
    ControllerProdutosVendasProdutos controllerProdutosVendasProdutos = new ControllerProdutosVendasProdutos();
    ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
    ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutoses = new ArrayList<>();
    ModelCaixa modelCaixa = new ModelCaixa();
    String alterarSalvar;
    ControllerCaixa controllerCaixa = new ControllerCaixa();
    BLMascaras bl = new BLMascaras();
    /**
     * Creates new form ViewVendas
     */
    public ViewVendas() {
        initComponents();
        listarClientes();
        listarProdutos();
        setLocationRelativeTo(null);
        carregarVendas();
        preencherCodigoClientePeloComboBox();
        preencherCodigoProdutoPeloComboBox();
        alterarSalvar = "salvar";
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfCodigoCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNumeroVendas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfValorTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutosVenda = new javax.swing.JTable();
        jtfDesconto = new javax.swing.JTextField();
        jtfCodigoProduto = new javax.swing.JTextField();
        jtfTaxa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbNomeProduto = new componentes.UJComboBox();
        jcbNomeCliente = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtVendas = new javax.swing.JTable();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-impressão-50.png"))); // NOI18N
        jButton6.setText("Imprimir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda");
        setResizable(false);

        jLabel1.setText("Código do Cliente: ");

        jtfCodigoCliente.setText("0");
        jtfCodigoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoClienteFocusLost(evt);
            }
        });

        jLabel2.setText("Nome do Cliente:");

        jLabel3.setText("Número da Venda:");

        jtfNumeroVendas.setBackground(new java.awt.Color(204, 255, 204));
        jtfNumeroVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumeroVendasActionPerformed(evt);
            }
        });

        jLabel4.setText("Código do Produto: ");

        jtfValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorTotalActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome do Produto:");

        jtProdutosVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Prod.", "Nome do Produto", "Quantidade", "Valor", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtProdutosVenda);
        if (jtProdutosVenda.getColumnModel().getColumnCount() > 0) {
            jtProdutosVenda.getColumnModel().getColumn(0).setMinWidth(90);
            jtProdutosVenda.getColumnModel().getColumn(0).setPreferredWidth(90);
            jtProdutosVenda.getColumnModel().getColumn(0).setMaxWidth(90);
            jtProdutosVenda.getColumnModel().getColumn(2).setMinWidth(70);
            jtProdutosVenda.getColumnModel().getColumn(2).setPreferredWidth(70);
            jtProdutosVenda.getColumnModel().getColumn(2).setMaxWidth(70);
            jtProdutosVenda.getColumnModel().getColumn(3).setMinWidth(90);
            jtProdutosVenda.getColumnModel().getColumn(3).setPreferredWidth(90);
            jtProdutosVenda.getColumnModel().getColumn(3).setMaxWidth(90);
            jtProdutosVenda.getColumnModel().getColumn(4).setMinWidth(90);
            jtProdutosVenda.getColumnModel().getColumn(4).setPreferredWidth(90);
            jtProdutosVenda.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        jtfDesconto.setText("0");
        jtfDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDescontoFocusLost(evt);
            }
        });
        jtfDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescontoActionPerformed(evt);
            }
        });

        jtfCodigoProduto.setText("0");
        jtfCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoProdutoActionPerformed(evt);
            }
        });

        jtfTaxa.setText("0");
        jtfTaxa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfTaxaFocusLost(evt);
            }
        });
        jtfTaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTaxaActionPerformed(evt);
            }
        });

        jLabel7.setText("Taxas: ");

        jLabel8.setText("Descontos:");

        jLabel9.setText("Valor Total:");

        jcbNomeProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbNomeProdutoFocusLost(evt);
            }
        });
        jcbNomeProduto.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbNomeProdutoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcbNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfCodigoCliente))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jtfNumeroVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumeroVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTaxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Visualizar", jPanel1);

        jLabel10.setText("Pesquisa:");

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-50.png"))); // NOI18N
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jtVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome Cliente", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtVendas);
        if (jtVendas.getColumnModel().getColumnCount() > 0) {
            jtVendas.getColumnModel().getColumn(0).setMinWidth(110);
            jtVendas.getColumnModel().getColumn(0).setPreferredWidth(110);
            jtVendas.getColumnModel().getColumn(0).setMaxWidth(110);
            jtVendas.getColumnModel().getColumn(2).setMinWidth(110);
            jtVendas.getColumnModel().getColumn(2).setPreferredWidth(110);
            jtVendas.getColumnModel().getColumn(2).setMaxWidth(110);
        }

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-apagar-para-sempre-50.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisa-propriedade-50.png"))); // NOI18N
        jbAlterar.setText("Visualizar Conta");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-dólar-americano-50.png"))); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-impressão-50.png"))); // NOI18N
        jButton5.setText("Imprimir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-impressão-50.png"))); // NOI18N
        jButton7.setText("Imprimir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jtfPesquisa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbExcluir)
                        .addGap(27, 27, 27)
                        .addComponent(jbAlterar)
                        .addGap(31, 31, 31)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addGap(89, 89, 89))))
        );

        jTabbedPane1.addTab("Consultar/Excluir/Visualizar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDescontoActionPerformed

    private void jtfTaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTaxaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTaxaActionPerformed

    private void jtfCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoProdutoActionPerformed

    private void jtfCodigoClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoClienteFocusLost
        modelCliente = controllerCliente.getClienteController(Integer.parseInt(jtfCodigoCliente.getText()));
        jcbNomeCliente.setSelectedItem(modelCliente.getCliNome());
    }//GEN-LAST:event_jtfCodigoClienteFocusLost

    private void jcbNomeProdutoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbNomeProdutoPopupMenuWillBecomeInvisible
        if(jcbNomeProduto.isPopupVisible()){
           preencherCodigoProdutoPeloComboBox();
            
        }
    }//GEN-LAST:event_jcbNomeProdutoPopupMenuWillBecomeInvisible

    private void jcbNomeProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbNomeProdutoFocusLost
        modelProdutos = controllerProdutos.retornarProdutoController(Integer.parseInt(jtfCodigoProduto.getText()));
        jcbNomeProduto.setSelectedItem(modelProdutos.getProNome());
    }//GEN-LAST:event_jcbNomeProdutoFocusLost
    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = jtVendas.getSelectedRow();
        int codigoVenda = (int) jtVendas.getValueAt(linha, 0);
        listaModelProdutoses = new ArrayList<>();
        listaModelProdutosVendasProdutoses = controllerProdutosVendasProdutos.getListaProdutosVendasProdutosController(codigoVenda);
        for (int i = 0; i < listaModelProdutosVendasProdutoses.size(); i++) {
            modelProdutos = new ModelProdutos();
            modelProdutos.setIdProduto(listaModelProdutosVendasProdutoses.get(i).getModelProdutos().getIdProduto());
            modelProdutos.setProEstoque((int) (listaModelProdutosVendasProdutoses.get(i).getModelProdutos().getProEstoque()
                    + listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProQuantidade()));
            
            listaModelProdutoses.add(modelProdutos); 
        }
        
        if(controllerProdutos.alterarEstoqueProdutoController(listaModelProdutoses)){
            controllerVendasProdutos.excluirVendasProdutosController(codigoVenda);
            if(controllerVendas.excluirVendasController(codigoVenda)){
            JOptionPane.showMessageDialog(this, "Venda Excluida com sucesso");
            this.carregarVendas();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir a venda", "Erro", JOptionPane.ERROR_MESSAGE); 
        }
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir a venda", "Erro", JOptionPane.ERROR_MESSAGE); 

        }
        
    }//GEN-LAST:event_jbExcluirActionPerformed

    private float somaValorTotal(){
            float soma = 0, valor = 0;
            int cont = jtProdutosVenda.getRowCount();
            for(int i = 0; i < cont; i++){
                valor = Float.parseFloat(String.valueOf(jtProdutosVenda.getValueAt(i, 4)));
                soma += valor;
            }
            return soma;
        }
        
    
    
    private void jtfDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDescontoFocusLost
       somarValorTotalProdutos();
     //aplicarDescontos();
    }//GEN-LAST:event_jtfDescontoFocusLost

    private void jtfTaxaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfTaxaFocusLost
        somarValorTotalProdutos();
     //aplicarTaxas();
    }//GEN-LAST:event_jtfTaxaFocusLost

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
       //habilitao botao novo para alterar
       // jbSalvar.setEnabled(true);
        
        alterarSalvar = "alterar";
        int linha = jtVendas.getSelectedRow();
        int codigoVenda = (int) jtVendas.getValueAt(linha, 0);
        listaModelProdutosVendasProdutoses = controllerProdutosVendasProdutos.getListaProdutosVendasProdutosController(codigoVenda);
        DefaultTableModel modelo = (DefaultTableModel) jtProdutosVenda.getModel();
        modelo.setNumRows(0);
        
        if(jtfCodigoProduto.getText().equals("10")){
        for (int i = 0; i < listaModelProdutosVendasProdutoses.size(); i++){
            jtfNumeroVendas.setText(String.valueOf(listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVendas()));
            modelo.addRow(new Object[]{
            listaModelProdutosVendasProdutoses.get(i).getModelProdutos().getIdProduto(),
            listaModelProdutosVendasProdutoses.get(i).getModelProdutos().getProNome(),
            listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProQuantidade(),
            listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProValor(),
            ( listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProQuantidade()
                *
            listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProValor())/1000
               });
        }
        somarValorTotalProdutos();
        jTabbedPane1.setSelectedIndex(0);
        }else{
             for (int i = 0; i < listaModelProdutosVendasProdutoses.size(); i++){
            jtfNumeroVendas.setText(String.valueOf(listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVendas()));
            modelo.addRow(new Object[]{
            listaModelProdutosVendasProdutoses.get(i).getModelProdutos().getIdProduto(),
            listaModelProdutosVendasProdutoses.get(i).getModelProdutos().getProNome(),
            listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProQuantidade(),
            listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProValor(),
            listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProQuantidade()
                *
            listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProValor()
               });
        }
        somarValorTotalProdutos();
        jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jtfValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorTotalActionPerformed

    private void jtfNumeroVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumeroVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumeroVendasActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int linha = jtVendas.getSelectedRow();
        int codigoVenda = (int) jtVendas.getValueAt(linha, 0);

        controllerVendas.gerarRelatorioVenda(codigoVenda);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        
        int linha = jtVendas.getSelectedRow();
           int codigoVenda = (int) jtVendas.getValueAt(linha, 0);
           final ViewAguarde carregando = new ViewAguarde();
           carregando.setVisible(true);
           Thread t = new Thread(){
               public void run(){
                   //metodo de imprimir
                    try{
                
            controllerVendas.gerarRelatorioVenda(codigoVenda);
           carregando.dispose();
           }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao gerar Relatório! /n "+e, "Erro", JOptionPane.ERROR_MESSAGE);
           }
               }
           };
           t.start();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVendas().setVisible(true);
            }
        });
    }
    
    private void preencherCodigoProdutoPeloComboBox(){
         modelProdutos = controllerProdutos.retornarProdutoController(jcbNomeProduto.getSelectedItem().toString());
         jtfCodigoProduto.setText(String.valueOf(modelProdutos.getIdProduto()));
    }
    
    private void preencherCodigoClientePeloComboBox(){
        
          modelCliente = controllerCliente.getClienteController(jcbNomeCliente.getSelectedItem().toString());
          jtfCodigoCliente.setText(String.valueOf(modelCliente.getIdCliente()));
    }
    
    private void recuperarId(){
        try{
            ModelCaixa model = controllerCaixa.getUltimoIdController(modelCaixa);
            modelVendas.setIdCaixa(model.getPk_caixa());
        
        }catch(Exception e){
            
        }
    }
    
    private void listarClientes(){
        
        listaModelClientes = controllerCliente.getListaClienteController();
        jcbNomeCliente.removeAllItems();
        for (int i = 0; i < listaModelClientes.size(); i++){
            jcbNomeCliente.addItem(listaModelClientes.get(i).getCliNome());
        }
    }
    
    private void listarProdutos(){
        listaModelProdutoses = controllerProdutos.retornarListaProdutoController();
        jcbNomeProduto.removeAllItems();
        for (int i = 0; i < listaModelProdutoses.size(); i++){
            jcbNomeProduto.addItem(listaModelProdutoses.get(i).getProNome());
    }
    }
    
     private void aplicarTaxas(){
         
      //   jtfTaxa.setText("0");
        try{
         if(Double.parseDouble(jtfTaxa.getText()) < 0){
             JOptionPane.showMessageDialog(this, "Taxa não pode ser menor que zero");
         }else{
         
        jtfValorTotal.setText(String.valueOf(Double.parseDouble(jtfValorTotal.getText()) + Double.parseDouble(jtfTaxa.getText())));
         }
        }catch(NumberFormatException e){
            
        }
         }
    
    //aplica descontos ao valor final  de venda
    private void aplicarDescontos(){
        //trata descontos maior que o ValorTotal
    //    jtfDesconto.setText("0");
    try{
        if(Double.parseDouble(jtfDesconto.getText()) > (Double.parseDouble(jtfValorTotal.getText()))) {
             JOptionPane.showMessageDialog(this, "Desconto não deve ser maior que valor total");
         }else{
           jtfValorTotal.setText(String.valueOf(Double.parseDouble(jtfValorTotal.getText()) - Double.parseDouble(jtfDesconto.getText())));
         }
    }catch (NumberFormatException e){
        
    }
    
    }
    
    private void somarValorTotalProdutos(){
        double soma = 0, valor;
        int cont = jtProdutosVenda.getRowCount();
        for(int i =0; i < cont; i++){
            valor = (double) jtProdutosVenda.getValueAt(i, 4);
            soma = soma + valor;
        }
        jtfValorTotal.setText(String.valueOf(soma));
        aplicarDescontos();
        aplicarTaxas();
    }
    
    private void carregarVendas(){
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        listaModelVendasClientes = controllerVendasCliente.getListaVendasClienteController();
        int cont = listaModelVendasClientes.size();
        modelo.setNumRows(0);
        for(int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
            listaModelVendasClientes.get(i).getModelVendas().getIdVenda(),
            listaModelVendasClientes.get(i).getModelCliente().getCliNome(),
            listaModelVendasClientes.get(i).getModelVendas().getVenDataVenda()
        });
        
        }
    }
    
    
    
    private void limparformulario(){
//        jtfQuantidade.setText("");
        jtfDesconto.setText("");
        jtfValorTotal.setText("");
        DefaultTableModel modelo = (DefaultTableModel) jtProdutosVenda.getModel();
        modelo.setNumRows(0);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JComboBox<String> jcbNomeCliente;
    private componentes.UJComboBox jcbNomeProduto;
    private javax.swing.JTable jtProdutosVenda;
    private javax.swing.JTable jtVendas;
    private javax.swing.JTextField jtfCodigoCliente;
    private javax.swing.JTextField jtfCodigoProduto;
    private javax.swing.JTextField jtfDesconto;
    private javax.swing.JTextField jtfNumeroVendas;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTextField jtfTaxa;
    private javax.swing.JTextField jtfValorTotal;
    // End of variables declaration//GEN-END:variables
}
