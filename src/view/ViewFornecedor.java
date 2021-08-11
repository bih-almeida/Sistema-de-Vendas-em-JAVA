package view;
import controller.ControllerCliente;
import controller.ControllerProdutos;
import controller.Controllerfornecedor;
import java.util.ArrayList;
import java.lang.String;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCliente;
import model.ModelProdutos;
import model.Modelfornecedor;
public class ViewFornecedor extends javax.swing.JFrame {
    Controllerfornecedor controllerfornecedor = new Controllerfornecedor();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    Modelfornecedor modelfornecedor = new Modelfornecedor();
    ArrayList<Modelfornecedor> listaModelfornecedors = new ArrayList<>();
    ArrayList<ModelProdutos> listaModelProduto = new ArrayList<>();
    String salvarAlterar;    
     public ViewFornecedor() {
        initComponents();
        carregarFornecedor();
        setLocationRelativeTo(null);
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
        listarFornecedores();
        carregarProdutos();
        preencherCodigoFornecedorPeloComboBox();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbPesquisa = new javax.swing.JButton();
        jtfEndereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbUF = new javax.swing.JComboBox<>();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbNovo1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jcbcep = new javax.swing.JComboBox<>();
        jtfResponsavel = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        bbb = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        aaa = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jbPesquisa1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fornecedor");

        jLabel1.setText("Código Fornecedor:");

        jtfNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfNomeFocusLost(evt);
            }
        });
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
                "Código:", "Nome Fantasia:", "Cidade:", "Telefone:"
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

        jLabel10.setText("Pesquisar:");

        jtfPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome Fantasia:");

        jbPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-50.png"))); // NOI18N
        jbPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisaActionPerformed(evt);
            }
        });

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-empresa-cliente-50.png"))); // NOI18N

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
        jcbUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbUFActionPerformed(evt);
            }
        });

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

        jbNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-50.png"))); // NOI18N
        jbNovo1.setText("Novo");
        jbNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovo1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Ramo:");

        jLabel12.setText("Responsável:");

        jcbcep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimentício" }));

        jtfResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfResponsavelActionPerformed(evt);
            }
        });
        jtfResponsavel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfResponsavelKeyTyped(evt);
            }
        });

        jLabel15.setText("Razão Social:");

        bbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbbActionPerformed(evt);
            }
        });
        bbb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bbbKeyTyped(evt);
            }
        });

        jLabel16.setText("CNPJ:");

        try {
            aaa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        aaa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aaaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbNovo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalvar))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(154, 154, 154)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bbb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                        .addComponent(jcbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel16))))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbcep, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtfResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro", jPanel2);

        jLabel13.setText("Pesquisar:");

        jbPesquisa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-50.png"))); // NOI18N
        jbPesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisa1ActionPerformed(evt);
            }
        });

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                " Fornecedor", "Código Produto", "Produto", "Estoque", "Valor Unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(90);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setMinWidth(60);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(4).setMinWidth(80);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-empresa-cliente-50.png"))); // NOI18N

        codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoFocusLost(evt);
            }
        });

        jLabel14.setText("Código Fornecedor:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigo))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)))
                        .addGap(30, 30, 30)
                        .addComponent(jbPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jbPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Produtos por Fornecedor", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jtfCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCidadeActionPerformed
    }//GEN-LAST:event_jtfCidadeActionPerformed
    private void jtfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefoneActionPerformed
    }//GEN-LAST:event_jtfTelefoneActionPerformed
    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
    }//GEN-LAST:event_jtfCodigoActionPerformed
    private void jtfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEnderecoActionPerformed
    }//GEN-LAST:event_jtfEnderecoActionPerformed
    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
    }//GEN-LAST:event_jtfNomeActionPerformed
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if("".equals(jtfNome.getText()) || "".equals(jtfResponsavel.getText())){
            JOptionPane.showMessageDialog(this, "Valor não deve estar vazio", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        try{
            modelfornecedor.setId_fornecedor(Integer.parseInt(this.jtfCodigo.getText()));
        }catch(NumberFormatException e){
        }
        modelfornecedor.setNome_fornecedor(this.jtfNome.getText().toUpperCase());
        modelfornecedor.setEndereco_fornecedor(this.jtfEndereco.getText().toUpperCase());
        modelfornecedor.setBairro_fornecedor(this.jtfBairro.getText().toUpperCase());
        modelfornecedor.setCidade_fornecedor(this.jtfCidade.getText().toUpperCase());
        modelfornecedor.setEstado_fornecedor(this.jcbUF.getSelectedItem().toString());
        modelfornecedor.setRamo_fornecedor(this.jcbcep.getSelectedItem().toString());
        modelfornecedor.setResponsavel_fornecedor(this.jtfResponsavel.getText());
        modelfornecedor.setTelefone_fornecedor(this.jtfTelefone.getText());
        modelfornecedor.setCnpj(this.aaa.getText());
        modelfornecedor.setRazao(this.bbb.getText());
        if(salvarAlterar.equals("salvar")){
           if(controllerfornecedor.salvarfornecedorController(modelfornecedor)>0){
                JOptionPane.showMessageDialog(this, "Fornecedor cadastrado com sucesso!");
            //carregar os clientes na tabela
                carregarFornecedor();
                this.desabilitaHabilitaCampos(false);
                this.limparCampos();
            }else{
                    JOptionPane.showMessageDialog(this, "Erro ao salvar o Fornecedor");
            }
               }else{ 
            if(controllerfornecedor.atualizarfornecedorController(modelfornecedor)){
                 JOptionPane.showMessageDialog(this, "Fornecedor alterado com sucesso!");
            //carregar os clientes na tabela
                 carregarFornecedor();
                 this.desabilitaHabilitaCampos(false);
                 this.limparCampos();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar o Fornecedor");
            }
               }
    }//GEN-LAST:event_jbSalvarActionPerformed
    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = jtCliente.getSelectedRow();
        int codigoCliente = (int) jtCliente.getValueAt(linha, 0);
        if(controllerfornecedor.excluirfornecedorController(codigoCliente)){
            JOptionPane.showMessageDialog(this, "Fornecedor excluido com sucesso");
            this.carregarFornecedor();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir o Fornecedor", "ERRO", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jbExcluirActionPerformed
    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        int linha = jtCliente.getSelectedRow();
        int codigoCliente = (int) jtCliente.getValueAt(linha, 0);
        salvarAlterar = "alterar";
        modelfornecedor = controllerfornecedor.getfornecedorController(codigoCliente);
        jtfCodigo.setText(String.valueOf(modelfornecedor.getId_fornecedor()));
        jtfNome.setText(modelfornecedor.getNome_fornecedor());
        jtfEndereco.setText(modelfornecedor.getEndereco_fornecedor());
        jtfBairro.setText(modelfornecedor.getBairro_fornecedor());
        jtfCidade.setText(modelfornecedor.getCidade_fornecedor());
        jcbUF.setSelectedItem(modelfornecedor.getEstado_fornecedor());
        jcbcep.setSelectedItem(modelfornecedor.getRamo_fornecedor());
        jtfTelefone.setText(modelfornecedor.getTelefone_fornecedor());
        jtfResponsavel.setText(modelfornecedor.getResponsavel_fornecedor());
        aaa.setText(modelfornecedor.getCnpj());
        bbb.setText(modelfornecedor.getRazao());
        this.desabilitaHabilitaCampos(true);
    }//GEN-LAST:event_jbAlterarActionPerformed
    private void jbNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovo1ActionPerformed
        this.desabilitaHabilitaCampos(true);
        this.limparCampos();
        salvarAlterar = "salvar";    }//GEN-LAST:event_jbNovo1ActionPerformed
    private void jbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jtCliente.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtCliente.setRowSorter(classificador);
        String texto = jtfPesquisa.getText().toUpperCase();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jbPesquisaActionPerformed
    private void jtfBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBairroActionPerformed
    }//GEN-LAST:event_jtfBairroActionPerformed
    private void jtfResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfResponsavelActionPerformed
    }//GEN-LAST:event_jtfResponsavelActionPerformed
    private void jtfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisaActionPerformed
    }//GEN-LAST:event_jtfPesquisaActionPerformed
    private void jcbUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUFActionPerformed
    }//GEN-LAST:event_jcbUFActionPerformed
    private void jbPesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisa1ActionPerformed
        String query = jComboBox1.getSelectedItem().toString();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }//GEN-LAST:event_jbPesquisa1ActionPerformed
    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
      
    }//GEN-LAST:event_jComboBox1FocusLost
    private void codigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoFocusLost
       modelfornecedor = controllerfornecedor.getfornecedorController(Integer.parseInt(codigo.getText()));
       jComboBox1.setSelectedItem(modelfornecedor.getNome_fornecedor());
    }//GEN-LAST:event_codigoFocusLost
    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
       if(jComboBox1.isPopupVisible ()){
       preencherCodigoFornecedorPeloComboBox();}
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    private void bbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbbActionPerformed
    }//GEN-LAST:event_bbbActionPerformed
    private void jtfNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNomeFocusLost
    }//GEN-LAST:event_jtfNomeFocusLost
    private void jtfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomeKeyTyped
        String caracteres="0987654321.,";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Números e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jtfNomeKeyTyped
    private void bbbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bbbKeyTyped
        String caracteres="0987654321.,";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Números e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_bbbKeyTyped
    private void aaaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aaaKeyTyped
       String caracteres="0987654321.,";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_aaaKeyTyped
    private void jtfEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEnderecoKeyTyped
        String caracteres="0987654321.,";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Números e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jtfEnderecoKeyTyped
    private void jtfBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBairroKeyTyped
        String caracteres="0987654321.,";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Números e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jtfBairroKeyTyped
    private void jtfCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCidadeKeyTyped
        String caracteres="0987654321.,";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Números e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jtfCidadeKeyTyped
    private void jtfResponsavelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfResponsavelKeyTyped
        String caracteres="0987654321.,";
        if(caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Números e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jtfResponsavelKeyTyped
    private void jtfTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTelefoneKeyTyped
        String caracteres="0987654321.,";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jtfTelefoneKeyTyped
     private void listarFornecedores(){
        listaModelfornecedors = controllerfornecedor.getListafornecedorController();
        jComboBox1.removeAllItems();
        for (int i = 0; i < listaModelfornecedors.size(); i++){
            jComboBox1.addItem(listaModelfornecedors.get(i).getNome_fornecedor());
        }
    }
       
    private void preencherCodigoFornecedorPeloComboBox(){
          modelfornecedor = controllerfornecedor.getFornecedorController(jComboBox1.getSelectedItem().toString());
          codigo.setText(String.valueOf(modelfornecedor.getId_fornecedor()));
    }
    private void desabilitaHabilitaCampos(boolean condicao){
        jtfNome.setEnabled(condicao);
        jtfEndereco.setEnabled(condicao);
        jtfBairro.setEnabled(condicao);
        jtfCidade.setEnabled(condicao);
        jcbUF.setEnabled(condicao);
        jcbcep.setEnabled(condicao);
        jtfTelefone.setEnabled(condicao);
        jbSalvar.setEnabled(condicao);
        jtfResponsavel.setEnabled(condicao);
        aaa.setEnabled(condicao);
        bbb.setEnabled(condicao);
    }
    
    private void limparCampos(){
        jtfNome.setText("");
        jtfEndereco.setText("");
        jtfBairro.setText("");
        jtfCidade.setText("");
        aaa.setText("");
        jtfTelefone.setText("");
        jbSalvar.setText("");
        jtfResponsavel.setText("");
        bbb.setText("");
    }
    
    private void carregarFornecedor(){
        listaModelfornecedors = controllerfornecedor.getListafornecedorController();
        DefaultTableModel modelo = (DefaultTableModel) jtCliente.getModel();
        modelo.setNumRows(0);
        int cont = listaModelfornecedors.size();
        for (int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
                listaModelfornecedors.get(i).getId_fornecedor(),
                listaModelfornecedors.get(i).getNome_fornecedor(),
                listaModelfornecedors.get(i).getCidade_fornecedor(),
                listaModelfornecedors.get(i).getTelefone_fornecedor()
            }); 
        }
    }
    private void carregarProdutos(){
        listaModelProduto = controllerProdutos.retornarListaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0); //remove linhas em branco da tabela
        //Inserir Produtos na Tabela
        int cont = listaModelProduto.size();
        for (int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
                listaModelProduto.get(i).getProNomeFornecedor(),
                listaModelProduto.get(i).getIdProduto(),
                listaModelProduto.get(i).getProNome(),
                listaModelProduto.get(i).getProEstoque(),
                listaModelProduto.get(i).getProValor(),
            });
        }
    }
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
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFornecedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField aaa;
    private javax.swing.JTextField bbb;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo1;
    private javax.swing.JButton jbPesquisa;
    private javax.swing.JButton jbPesquisa1;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbUF;
    private javax.swing.JComboBox<String> jcbcep;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTextField jtfResponsavel;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}
