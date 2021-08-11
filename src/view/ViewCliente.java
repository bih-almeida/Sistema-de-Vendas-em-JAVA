package view;
import controller.ControllerCliente;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCaixa;
import model.ModelCliente;

public class ViewCliente extends javax.swing.JFrame {
    ControllerCliente controllerCliente = new ControllerCliente();
    ModelCliente modelCliente = new ModelCliente();
    ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
    String salvarAlterar;
  
    public ViewCliente() {
        initComponents();
        carregarCliente();
        setLocationRelativeTo(null);
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbUF = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jtfCep = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jbPesquisa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jbNovo1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nascimento = new com.toedter.calendar.JDateChooser();
        cpf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

        jLabel1.setText("Código Cliente:");

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

        jtfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEnderecoActionPerformed(evt);
            }
        });
        jtfEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEnderecoKeyTyped(evt);
            }
        });

        jLabel3.setText("Endereço:");

        jtfCodigo.setEditable(false);
        jtfCodigo.setEnabled(false);
        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });

        jLabel4.setText("Bairro:");

        jtfBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBairroActionPerformed(evt);
            }
        });
        jtfBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfBairroKeyTyped(evt);
            }
        });

        jLabel5.setText("Cidade:");

        jLabel6.setText("Estado:");

        jcbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel7.setText("CEP:");

        jtfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefoneActionPerformed(evt);
            }
        });
        jtfTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTelefoneKeyTyped(evt);
            }
        });

        jLabel8.setText("Telefone:");

        jtfCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCidadeActionPerformed(evt);
            }
        });
        jtfCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCidadeKeyTyped(evt);
            }
        });

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código:", "Nome:", "CPF:", "Nascimento:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(jtCliente);
        if (jtCliente.getColumnModel().getColumnCount() > 0) {
            jtCliente.getColumnModel().getColumn(0).setMinWidth(20);
            jtCliente.getColumnModel().getColumn(0).setPreferredWidth(20);
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

        try {
            jtfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCepActionPerformed(evt);
            }
        });
        jtfCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCepKeyTyped(evt);
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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-girl-and-ice-cream-50.png"))); // NOI18N

        jbNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-50.png"))); // NOI18N
        jbNovo1.setText("Novo");
        jbNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovo1ActionPerformed(evt);
            }
        });

        jLabel11.setText("CPF:");

        jLabel12.setText("Data de Nascimento:");

        cpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfFocusLost(evt);
            }
        });
        cpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpfKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jbAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jbNovo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalvar))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodigo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(419, 419, 419)
                                .addComponent(jLabel9))
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(209, 209, 209))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfEndereco)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jbNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovo1ActionPerformed
        this.desabilitaHabilitaCampos(true);
        this.limparCampos();
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovo1ActionPerformed
    private void jbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jtCliente.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtCliente.setRowSorter(classificador);
        String texto = jtfPesquisa.getText().toUpperCase();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jbPesquisaActionPerformed
    private void jtfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisaActionPerformed
    }//GEN-LAST:event_jtfPesquisaActionPerformed
    private void jtfCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCepActionPerformed
    }//GEN-LAST:event_jtfCepActionPerformed
    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        int linha = jtCliente.getSelectedRow();
        int codigoCliente = (int) jtCliente.getValueAt(linha, 0);
        salvarAlterar = "alterar";

        modelCliente = controllerCliente.getClienteController(codigoCliente);
        jtfCodigo.setText(String.valueOf(modelCliente.getIdCliente()));
        jtfNome.setText(modelCliente.getCliNome());
        jtfEndereco.setText(modelCliente.getCliEndereco());
        jtfBairro.setText(modelCliente.getCliBairro());
        jtfCidade.setText(modelCliente.getCliCidade());
        jcbUF.setSelectedItem(modelCliente.getCliUF());
        jtfCep.setText(modelCliente.getCliCep());
        jtfTelefone.setText(modelCliente.getCliTelefone());
        cpf.setText(modelCliente.getCpf());
        nascimento.setDate(modelCliente.getNascimento());
        this.desabilitaHabilitaCampos(true);
        
        if(!"".equals(cpf.getText())){
            cpf.setEnabled(false);
        }
    }//GEN-LAST:event_jbAlterarActionPerformed
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
    Date date = nascimento.getDate();
    Date local = Date.from(Instant.now());
    if("".equals(jtfNome.getText())){  
       JOptionPane.showMessageDialog(this, "Nome não deve estar vazio");
    return;
    }
    if(nascimento.getDate() == null){
       JOptionPane.showMessageDialog(this, "Data não foi selecionada", "ERRO", JOptionPane.ERROR_MESSAGE );
       return;
    }
    if(date.after(local)){
         JOptionPane.showMessageDialog(this, "Data superior a data atual", "ERRO", JOptionPane.ERROR_MESSAGE );
        return;
    }
    try{
       modelCliente.setIdCliente(Integer.parseInt(this.jtfCodigo.getText()));
    }catch(NumberFormatException e){}
    try{
        modelCliente.setCliNome(this.jtfNome.getText().toUpperCase());
        modelCliente.setCliEndereco(this.jtfEndereco.getText().toUpperCase());
        modelCliente.setCliBairro(this.jtfBairro.getText().toUpperCase());
        modelCliente.setCliCidade(this.jtfCidade.getText().toUpperCase());
        modelCliente.setCliUF(this.jcbUF.getSelectedItem().toString());
        modelCliente.setCliCep(this.jtfCep.getText());
        modelCliente.setCliTelefone(this.jtfTelefone.getText());
        modelCliente.setCpf(this.cpf.getText());
        modelCliente.setCliAcumulado(0);
        modelCliente.setCliQuantidade("0");
    }catch(Exception e){}
    //setando data
    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    String dataFormatada = formatter.format(nascimento.getDate());
    try{
        java.sql.Date sqlDate = java.sql.Date.valueOf(dataFormatada); // Magic happens here!
        modelCliente.setNascimento(sqlDate);
    }catch(Exception e ){}
    
    if(salvarAlterar.equals("salvar")){
        String validaCPF = cpf.getText();
        ModelCliente modelo = controllerCliente.getClientecpfController(validaCPF);
        if(!validaCPF.equals("")){
            if(validaCPF.equals(modelo.getCpf())){
                JOptionPane.showMessageDialog(this, "CPF já cadastrado!");
                return;
            }
        }
        if(controllerCliente.salvarClienteController(modelCliente)>0){
            JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
            //carregar os clientes na tabela
            carregarCliente();
            this.desabilitaHabilitaCampos(false);
            this.limparCampos();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao salvar o cliente");
        }
    }else{
        if(controllerCliente.atualizarClienteController(modelCliente)){
            if ("".equals(cpf.getText())){
                 String validaCPF = cpf.getText();
                 ModelCliente modelo = controllerCliente.getClientecpfController(validaCPF);
   
                if(validaCPF == null ? modelo.getCpf() == null : validaCPF.equals(modelo.getCpf())){
                    JOptionPane.showMessageDialog(this, "CPF já cadastrado!");
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Cliente alterado com sucesso!");
            //carregar os clientes na tabela
            carregarCliente();
            this.desabilitaHabilitaCampos(false);
            this.limparCampos();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao salvar o cliente");
        }
    }
    }//GEN-LAST:event_jbSalvarActionPerformed
    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = jtCliente.getSelectedRow();
        int codigoCliente = (int) jtCliente.getValueAt(linha, 0);
        if(controllerCliente.excluirClienteController(codigoCliente)){
            JOptionPane.showMessageDialog(this, "Cliente excluido com sucesso");
            this.carregarCliente();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir o cliente", "ERRO", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jbExcluirActionPerformed
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed
    private void jtfCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCidadeActionPerformed
    }//GEN-LAST:event_jtfCidadeActionPerformed
    private void jtfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefoneActionPerformed
    }//GEN-LAST:event_jtfTelefoneActionPerformed
    private void jtfBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBairroActionPerformed
    }//GEN-LAST:event_jtfBairroActionPerformed
    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
    }//GEN-LAST:event_jtfCodigoActionPerformed
    private void jtfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEnderecoActionPerformed
    }//GEN-LAST:event_jtfEnderecoActionPerformed
    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
          
    }//GEN-LAST:event_jtfNomeActionPerformed
    private void jtfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomeKeyTyped
          String caracteres="0987654321.,";
                if(caracteres.contains(evt.getKeyChar()+"")){
                    evt.consume();
                    JOptionPane.showMessageDialog(this, "Números e caracteres especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
    }//GEN-LAST:event_jtfNomeKeyTyped
    private void jtfEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEnderecoKeyTyped
       String caracteres="0987654321.,";
                if(caracteres.contains(evt.getKeyChar()+"")){
                    evt.consume();
                    JOptionPane.showMessageDialog(this, "Números e caracteres especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
    }//GEN-LAST:event_jtfEnderecoKeyTyped
    private void jtfBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBairroKeyTyped
        String caracteres="0987654321.,";
                if(caracteres.contains(evt.getKeyChar()+"")){
                    evt.consume();
                    JOptionPane.showMessageDialog(this, "Números e caracteres especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
    }//GEN-LAST:event_jtfBairroKeyTyped
    private void jtfCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCidadeKeyTyped
        String caracteres="0987654321.,";
                if(caracteres.contains(evt.getKeyChar()+"")){
                    evt.consume();
                    JOptionPane.showMessageDialog(this, "Números e caracteres especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
    }//GEN-LAST:event_jtfCidadeKeyTyped
    private void jtfCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCepKeyTyped
       String caracteres="0987654321.,";
                if(!caracteres.contains(evt.getKeyChar()+"")){
                    evt.consume();
                    JOptionPane.showMessageDialog(this, "Letras e caracteres especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
    }//GEN-LAST:event_jtfCepKeyTyped
    private void jtfTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTelefoneKeyTyped
        String caracteres="0987654321.,";
                if(!caracteres.contains(evt.getKeyChar()+"")){
                    evt.consume();
                    JOptionPane.showMessageDialog(this, "Letras e caracteres especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
    }//GEN-LAST:event_jtfTelefoneKeyTyped
    private void cpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfFocusLost
        String CPF = cpf.getText();
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
                    JOptionPane.showMessageDialog(this, "CPF Inválido", "Atenção", JOptionPane.ERROR_MESSAGE );
        char dig10, dig11;
        int sm, i, r, num, peso;
        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
        // converte o i-esimo caractere do CPF em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posicao de '0' na tabela ASCII)
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);
        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
            } else{
                return;
            };
                } catch (InputMismatchException erro) {
            }
    }//GEN-LAST:event_cpfFocusLost
    private void cpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfKeyTyped
        String caracteres="0987654321.,";
                if(!caracteres.contains(evt.getKeyChar()+"")){
                    evt.consume();
                    JOptionPane.showMessageDialog(this, "Letras e caracteres especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
    }//GEN-LAST:event_cpfKeyTyped
    private void desabilitaHabilitaCampos(boolean condicao){
        jtfNome.setEnabled(condicao);
        jtfEndereco.setEnabled(condicao);
        jtfBairro.setEnabled(condicao);
        jtfCidade.setEnabled(condicao);
        jcbUF.setEnabled(condicao);
        jtfCep.setEnabled(condicao);
        jtfTelefone.setEnabled(condicao);
        jbSalvar.setEnabled(condicao);
        cpf.setEnabled(condicao);
        nascimento.setEnabled(condicao);
    }
    private void limparCampos(){
        jtfNome.setText("");
        jtfEndereco.setText("");
        jtfBairro.setText("");
        jtfCidade.setText("");
        jtfCep.setText("");
        jtfTelefone.setText("");
        jbSalvar.setText("");
        cpf.setText("");
    }
        private void carregarCliente(){
        listaModelClientes = controllerCliente.getListaClienteController();
        DefaultTableModel modelo = (DefaultTableModel) jtCliente.getModel();
        modelo.setNumRows(0);
        int cont = listaModelClientes.size();
        for (int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
                listaModelClientes.get(i).getIdCliente(),
                listaModelClientes.get(i).getCliNome(),
                listaModelClientes.get(i).getCpf(),
                listaModelClientes.get(i).getNascimento()
            });     
        }
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo1;
    private javax.swing.JButton jbPesquisa;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbUF;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JFormattedTextField jtfCep;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTextField jtfTelefone;
    private com.toedter.calendar.JDateChooser nascimento;
    // End of variables declaration//GEN-END:variables
}
