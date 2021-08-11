//test 1 = quantidade
//test 2 = opcao 1, 2 ou 3
package view;
import controller.ControllerCliente;
import controller.ControllerPromocao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCliente;
import model.ModelPromocao;
import util.BLMascaras;
public class ViewPromoção extends javax.swing.JFrame {
    ControllerCliente controllerCliente = new ControllerCliente();
    ControllerPromocao controllerPromo = new ControllerPromocao();
    ModelCliente modelCliente = new ModelCliente();
    ModelPromocao modelPromocao = new ModelPromocao();
    ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
    ArrayList<ModelPromocao> listaModelPromo = new ArrayList<>();
    String salvarAlterar;
    BLMascaras BLm = new BLMascaras();
    public ViewPromoção() {
        initComponents();
        carregarPromocao();
        carregarCliente1();
        listarClientes();
        setLocationRelativeTo(null);
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
        codigo1.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfEndereco2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jcbUF2 = new javax.swing.JComboBox<>();
        Cliente = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfLimite1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbDisponibilidade1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPromocao = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jbPesquisa = new javax.swing.JButton();
        jbNovo1 = new javax.swing.JButton();
        selected1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        codigo1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jcbNomeCliente = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtClientePromo = new javax.swing.JTable();
        jbPesquisar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();

        jtfEndereco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEndereco2ActionPerformed(evt);
            }
        });

        jLabel13.setText("Limite:");

        jRadioButton3.setText("Ticket Médio");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel14.setText("Ativo:");

        jcbUF2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Desativado" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Promoção");

        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });
        jtfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNomeKeyTyped(evt);
            }
        });

        jLabel2.setText("Nome:");

        jtfLimite1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfLimite1FocusGained(evt);
            }
        });
        jtfLimite1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLimite1ActionPerformed(evt);
            }
        });
        jtfLimite1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfLimite1KeyTyped(evt);
            }
        });

        jLabel3.setText("Quantidade:");

        jLabel6.setText("Disponibilidade:");

        jcbDisponibilidade1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Desativado" }));

        jtPromocao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código:", "Nome:", "Quantidade:", "Disponibilidade:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(jtPromocao);
        if (jtPromocao.getColumnModel().getColumnCount() > 0) {
            jtPromocao.getColumnModel().getColumn(0).setResizable(false);
            jtPromocao.getColumnModel().getColumn(0).setPreferredWidth(20);
            jtPromocao.getColumnModel().getColumn(1).setResizable(false);
            jtPromocao.getColumnModel().getColumn(2).setResizable(false);
            jtPromocao.getColumnModel().getColumn(3).setResizable(false);
        }

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cancelar-50.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-excluir-50.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-salvar-50.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-crie-um-novo-50.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jLabel10.setText("Pesquisar:");

        jtfPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisaActionPerformed(evt);
            }
        });

        jbPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-50.png"))); // NOI18N
        jbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisaActionPerformed(evt);
            }
        });

        jbNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-50.png"))); // NOI18N
        jbNovo1.setText("Novo");
        jbNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovo1ActionPerformed(evt);
            }
        });

        selected1.setText("Ticket Médio");
        selected1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selected1ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-verificar-50.png"))); // NOI18N

        jLabel5.setText("Código:");

        codigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jbCancelar)
                            .addGap(18, 18, 18)
                            .addComponent(jbExcluir)
                            .addGap(18, 18, 18)
                            .addComponent(jbAlterar)
                            .addGap(18, 18, 18)
                            .addComponent(jbNovo1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSalvar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jtfLimite1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(selected1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(317, 317, 317)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbDisponibilidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(selected1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfLimite1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbDisponibilidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Cliente.addTab("Promoção", jPanel2);

        jcbNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNomeClienteActionPerformed(evt);
            }
        });

        jtClientePromo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Cliente:", "Nome do Cliente:", "Quantidade:", "Valor Ticket Médio:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtClientePromo);

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-50.png"))); // NOI18N
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jLabel27.setText("Nome:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(jcbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        Cliente.addTab("Ticket Médio Cliente", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cliente)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cliente)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jtfEndereco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEndereco2ActionPerformed
    }//GEN-LAST:event_jtfEndereco2ActionPerformed
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
    }//GEN-LAST:event_jRadioButton3ActionPerformed
    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        String query = jcbNomeCliente.getSelectedItem().toString();
            DefaultTableModel modelo = (DefaultTableModel) jtClientePromo.getModel();
            TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
            jtClientePromo.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(query));
    }//GEN-LAST:event_jbPesquisarActionPerformed
    private void jcbNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeClienteActionPerformed
    }//GEN-LAST:event_jcbNomeClienteActionPerformed
    private void codigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo1ActionPerformed
    }//GEN-LAST:event_codigo1ActionPerformed
    private void selected1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selected1ActionPerformed
        if(selected1.isSelected()){
            jtfLimite1.setEnabled(true);
            jcbDisponibilidade1.setEnabled(true);
            codigo1.setEnabled(false);
        }
    }//GEN-LAST:event_selected1ActionPerformed
    private void jbNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovo1ActionPerformed
        this.desabilitaHabilitaCampos(true);
        this.limparCampos();
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovo1ActionPerformed
    private void jbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jtPromocao.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtPromocao.setRowSorter(classificador);
        String texto = jtfPesquisa.getText().toUpperCase();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jbPesquisaActionPerformed
    private void jtfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisaActionPerformed
    }//GEN-LAST:event_jtfPesquisaActionPerformed
    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        try{
            int linha = jtPromocao.getSelectedRow();
            int codigoCliente = (int) jtPromocao.getValueAt(linha, 0);
            salvarAlterar = "alterar";
            jbSalvar.setEnabled(true);
            modelPromocao = controllerPromo.getpromocaoController(codigoCliente);

            if(modelPromocao.getTeste2().equals("Ticket")){
                codigo1.setText(String.valueOf(modelPromocao.getId_promocao()));
                jtfNome.setText(modelPromocao.getNome_promocao());
                jtfLimite1.setText(modelPromocao.getTeste1());
                jcbDisponibilidade1.setSelectedItem(modelPromocao.getDisponibilidade_promocao());
                 
                selected1.setEnabled(true);
                jtfLimite1.setEnabled(true);
                jcbDisponibilidade1.setEnabled(true);
                 jtfNome.setEnabled(true);
            }
        }catch(Exception e){}    
    }//GEN-LAST:event_jbAlterarActionPerformed
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
    if (!selected1.isSelected()){
        JOptionPane.showMessageDialog(this, "Promoção deve ser selecionado", "ERRO", JOptionPane.ERROR_MESSAGE );
        return;
    }
    if("".equals(jtfNome.getText())){
        JOptionPane.showMessageDialog(this, "Nome da promoção não deve estar vazio", "ERRO", JOptionPane.ERROR_MESSAGE );
        return;
    }
    if("".equals(jtfLimite1.getText()) && selected1.isSelected()){
        JOptionPane.showMessageDialog(this, "Quantidade não deve estar vazio", "ERRO", JOptionPane.ERROR_MESSAGE );
        return;
    }
    
    if(selected1.isSelected()){
            try{
                modelPromocao.setId_promocao(Integer.parseInt(this.codigo1.getText()));
            }catch(NumberFormatException e){}
            modelPromocao.setNome_promocao(this.jtfNome.getText().toUpperCase());
            modelPromocao.setTeste1(this.jtfLimite1.getText().toUpperCase());
            //setando data
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            modelPromocao.setDisponibilidade_promocao(this.jcbDisponibilidade1.getSelectedItem().toString());
            modelPromocao.setTeste2("Ticket");
        } 
        if(salvarAlterar.equals("salvar")){
            if(controllerPromo.salvarpromocaoController(modelPromocao)>0){
                JOptionPane.showMessageDialog(this, "Promoção salva com sucesso!");
                //carregar os clientes na tabela
                carregarPromocao();
                this.desabilitaHabilitaCampos(false);
                this.limparCampos();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar promoção");
            }
        }else{
            if(controllerPromo.atualizarpromocaoController(modelPromocao)){
                JOptionPane.showMessageDialog(this, "Promoção salva com sucesso!");
                //carregar os clientes na tabela
                carregarPromocao();
                this.desabilitaHabilitaCampos(false);
                this.limparCampos();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar promoção");
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed
    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = jtPromocao.getSelectedRow();
        int codigoCliente = (int) jtPromocao.getValueAt(linha, 0);
        if(controllerPromo.excluirpromocaoController(codigoCliente)){
            JOptionPane.showMessageDialog(this, "Excluido com sucesso");
            this.carregarPromocao();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir", "ERRO", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jbExcluirActionPerformed
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed
    private void jtfLimite1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLimite1ActionPerformed
    }//GEN-LAST:event_jtfLimite1ActionPerformed
    private void jtfLimite1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfLimite1FocusGained
    }//GEN-LAST:event_jtfLimite1FocusGained
    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
    }//GEN-LAST:event_jtfNomeActionPerformed
    private void jtfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomeKeyTyped
    }//GEN-LAST:event_jtfNomeKeyTyped
    private void jtfLimite1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfLimite1KeyTyped
        String caracteres="0987654321";
                if(!caracteres.contains(evt.getKeyChar()+"")){
                    evt.consume();
                    JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
    }//GEN-LAST:event_jtfLimite1KeyTyped
    private void desabilitaHabilitaCampos(boolean condicao){
        jtfNome.setEnabled(condicao);
        jtfLimite1.setEnabled(condicao);
        jcbDisponibilidade1.setEnabled(condicao);
        jbSalvar.setEnabled(condicao);
        selected1.setEnabled(condicao);
     }
    private void limparCampos(){
        jtfNome.setText("");
        jtfLimite1.setText("");
        jbSalvar.setText("");
    }
    private void carregarPromocao(){
        listaModelPromo = controllerPromo.getListapromocaoController();
        DefaultTableModel modelo = (DefaultTableModel) jtPromocao.getModel();
        modelo.setNumRows(0);
        int cont = listaModelPromo.size();
        for (int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
                listaModelPromo.get(i).getId_promocao(),
                listaModelPromo.get(i).getNome_promocao(),
                listaModelPromo.get(i).getTeste1(),
                listaModelPromo.get(i).getDisponibilidade_promocao(),
                listaModelPromo.get(i).getValidade_promocao()
            });
        }
    }
      private void carregarCliente1(){
        listaModelClientes = controllerCliente.getListaClienteController();
        DefaultTableModel modelo = (DefaultTableModel) jtClientePromo.getModel();
        modelo.setNumRows(0);
        int cont = listaModelClientes.size();
        for (int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
                listaModelClientes.get(i).getIdCliente(),
                listaModelClientes.get(i).getCliNome(),
                listaModelClientes.get(i).getCliQuantidade(),
                listaModelClientes.get(i).getCliAcumulado()
            });
        }
    }
     private void listarClientes(){
        listaModelClientes = controllerCliente.getListaClienteController();
        jcbNomeCliente.removeAllItems();
        for (int i = 0; i < listaModelClientes.size(); i++){
            jcbNomeCliente.addItem(listaModelClientes.get(i).getCliNome());
        }
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
            java.util.logging.Logger.getLogger(ViewPromoção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPromoção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPromoção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPromoção.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPromoção().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Cliente;
    private javax.swing.JTextField codigo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo1;
    private javax.swing.JButton jbPesquisa;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbDisponibilidade1;
    private javax.swing.JComboBox<String> jcbNomeCliente;
    private javax.swing.JComboBox<String> jcbUF2;
    private javax.swing.JTable jtClientePromo;
    private javax.swing.JTable jtPromocao;
    private javax.swing.JTextField jtfEndereco2;
    private javax.swing.JTextField jtfLimite1;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JRadioButton selected1;
    // End of variables declaration//GEN-END:variables
}
