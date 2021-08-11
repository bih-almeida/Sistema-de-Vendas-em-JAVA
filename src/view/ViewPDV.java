package view;
import controller.ControllerCaixa;
import controller.ControllerCliente;
import controller.ControllerProdutos;
import controller.ControllerProdutosVendasProdutos;
import controller.ControllerPromocao;
import controller.ControllerVendas;
import controller.ControllerVendasCliente;
import controller.ControllerVendasProdutos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCaixa;
import model.ModelCliente;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelPromocao;
import model.ModelSessaoUsuario;
import model.ModelVendas;
import model.ModelVendasClientes;
import model.ModelVendasProdutos;
import util.BLDatas;
import util.BLMascaras;
import util.Formatador;
public class ViewPDV extends javax.swing.JFrame {
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ControllerVendas controllerVendas = new ControllerVendas();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ControllerCliente controllerCliente = new ControllerCliente();
    ControllerPromocao controllerPromocao = new ControllerPromocao();
    ControllerCaixa controllerCaixa = new ControllerCaixa();
    ControllerVendasCliente controllerVendasCliente = new ControllerVendasCliente();
    ControllerProdutosVendasProdutos controllerProdutosVendasProdutos = new ControllerProdutosVendasProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    ModelPromocao modelPromocao;
    ModelVendas modelVendas = new ModelVendas();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();
    ModelCaixa modelCaixa = new ModelCaixa();
    ModelCliente modelCliente = new ModelCliente();
    ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
    ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
    ArrayList<ModelPromocao> listaModelPromo = new ArrayList<>();
    ArrayList<ModelVendasClientes> listaModelVendasClientes = new ArrayList<>();
    ArrayList<ModelProdutos> listaModelProdutoses = new ArrayList<>();
    ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutoses = new ArrayList<>();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutoses = new ArrayList<>();
    BLDatas blDatas = new BLDatas();
    BLMascaras blMascaras = new BLMascaras();
    BLMascaras bl = new BLMascaras();
    Formatador formatador = new Formatador();
    private ViewPagamentoPDV viewPagamentoPDV;
    BLMascaras BLm = new BLMascaras();

    public ViewPDV() {
        
        this.modelPromocao = new ModelPromocao();
        initComponents();
        setLocationRelativeTo(null);
        listarCliente();
        listarLimite();
        listarProdutos();
        setarOperador();
        limparTela();
        desabilitaHabilitaCampos(false);
        preencherCodigoClientePeloComboBox();
        preencherCodigoProdutoPeloComboBox();
        jtfCodigoCliente.setText("0");
        carregarPorCodigo();
        carregarTicket();
    }@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbRemoverProdutos = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jbAdicionar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfCodigoProduto = new javax.swing.JFormattedTextField();
        jtfCodigoCliente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlCaixa = new javax.swing.JLabel();
        jlOperador = new javax.swing.JLabel();
        jlStatus = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jbRemoverProdutos2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfValorBruto = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jcbNomeCliente = new componentes.UJComboBox();
        jtfCodigoProduto1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbNomeProduto = new componentes.UJComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtfQuantidade = new javax.swing.JTextField();
        kgBalanca = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        aaa = new javax.swing.JTextField();
        ccc = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        bbb = new javax.swing.JTextField();
        ccc1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiVenda = new javax.swing.JMenuItem();
        jmiExcluir = new javax.swing.JMenuItem();

        jbRemoverProdutos.setText("Remover Item");
        jbRemoverProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverProdutosActionPerformed(evt);
            }
        });

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PDV");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jbAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-50.png"))); // NOI18N
        jbAdicionar.setText("Adicionar");
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });

        jLabel5.setText("Código do Cliente: ");

        jtfCodigoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtfCodigoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfCodigoProdutoFocusGained(evt);
            }
        });
        jtfCodigoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfCodigoProdutoMouseClicked(evt);
            }
        });
        jtfCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoProdutoActionPerformed(evt);
            }
        });
        jtfCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodigoProdutoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCodigoProdutoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCodigoProdutoKeyTyped(evt);
            }
        });

        jtfCodigoCliente.setText("0");
        jtfCodigoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoClienteFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Operador:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Status:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Caixa:");

        jlCaixa.setText("01");

        jlOperador.setText("Indisponível");

        jlStatus.setText("Indisponível");

        jLabel13.setText("Valor Bruto:");

        jbRemoverProdutos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-apagar-para-sempre-50.png"))); // NOI18N
        jbRemoverProdutos2.setText("Remover Item");
        jbRemoverProdutos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverProdutos2ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-dólar-americano-50.png"))); // NOI18N
        jLabel9.setText("Finalizar Venda F4 ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-o-carrinho-de-compras-50.png"))); // NOI18N

        jtfValorBruto.setEditable(false);
        jtfValorBruto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jtfValorBruto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfValorBrutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfValorBrutoFocusLost(evt);
            }
        });

        jLabel12.setText("R$:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlStatus)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlOperador))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfValorBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbRemoverProdutos2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jlCaixa)
                                        .addGap(48, 48, 48)))))
                        .addContainerGap())))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jlCaixa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jlOperador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jlStatus))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfValorBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(6, 6, 6)))
                .addComponent(jbRemoverProdutos2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jcbNomeCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbNomeClienteFocusLost(evt);
            }
        });
        jcbNomeCliente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbNomeClientePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jcbNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNomeClienteActionPerformed(evt);
            }
        });

        jtfCodigoProduto1.setText("0");
        jtfCodigoProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoProduto1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Nome do Cliente:");

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
        jcbNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNomeProdutoActionPerformed(evt);
            }
        });

        jLabel7.setText("Código do Produto: ");

        jLabel14.setText("Nome do Produto:");

        jLabel15.setText("Quantidade:");

        jtfQuantidade.setText("0");
        jtfQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfQuantidadeFocusLost(evt);
            }
        });
        jtfQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfQuantidadeKeyTyped(evt);
            }
        });

        kgBalanca.setText("Balança  ");
        kgBalanca.setToolTipText("Digite a quantidade em grama");
        kgBalanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kgBalancaActionPerformed(evt);
            }
        });

        jLabel16.setText("Digite o código do Produto:");

        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Código", "Nome", "Quantidade", "Valor Unitário", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtProdutos);
        if (jtProdutos.getColumnModel().getColumnCount() > 0) {
            jtProdutos.getColumnModel().getColumn(0).setMinWidth(40);
            jtProdutos.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtProdutos.getColumnModel().getColumn(0).setMaxWidth(40);
            jtProdutos.getColumnModel().getColumn(1).setMinWidth(50);
            jtProdutos.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtProdutos.getColumnModel().getColumn(1).setMaxWidth(50);
            jtProdutos.getColumnModel().getColumn(3).setMinWidth(70);
            jtProdutos.getColumnModel().getColumn(3).setPreferredWidth(70);
            jtProdutos.getColumnModel().getColumn(3).setMaxWidth(70);
            jtProdutos.getColumnModel().getColumn(4).setMinWidth(80);
            jtProdutos.getColumnModel().getColumn(4).setPreferredWidth(80);
            jtProdutos.getColumnModel().getColumn(4).setMaxWidth(80);
            jtProdutos.getColumnModel().getColumn(5).setMinWidth(60);
            jtProdutos.getColumnModel().getColumn(5).setPreferredWidth(60);
            jtProdutos.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        aaa.setEditable(false);
        aaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aaaActionPerformed(evt);
            }
        });

        ccc.setEditable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        bbb.setEditable(false);

        ccc1.setEditable(false);
        ccc1.setText("/");
        ccc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccc1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Valor Médio Acumulado: R$");

        jLabel11.setText("Ticket Médio:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jtfCodigoProduto)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCodigoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbNomeProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jbAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(kgBalanca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel8))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ccc1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ccc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bbb, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCodigoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kgBalanca))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ccc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ccc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 204, 255));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-fatura-50.png"))); // NOI18N
        jMenu1.setText("Arquivo");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-sair-50.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-lista-de-tarefas-50.png"))); // NOI18N
        jMenu2.setText("Comandos");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jmiVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-dólar-americano-50.png"))); // NOI18N
        jmiVenda.setText("Finalizar Venda F4");
        jmiVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVendaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiVenda);

        jmiExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-apagar-para-sempre-50.png"))); // NOI18N
        jmiExcluir.setText("Excluir");
        jmiExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExcluirActionPerformed(evt);
            }
        });
        jMenu2.add(jmiExcluir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    private void jmiVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVendaActionPerformed
    try{
        this.viewPagamentoPDV = new ViewPagamentoPDV(this, true);
       // dispose();
        //setar ticket
        try{
            viewPagamentoPDV.setTextFieldcliente();    
            viewPagamentoPDV.setTextFieldticket1();  
            if(aaa.getText().equals(ccc.getText())){
                viewPagamentoPDV.setCliente(Integer.parseInt(jtfCodigoCliente.getText()));
                viewPagamentoPDV.setTicket(Float.parseFloat(bbb.getText()));
                viewPagamentoPDV.setTextFieldticket();
                viewPagamentoPDV.setTextFieldcliente();
            }else{
                viewPagamentoPDV.setCliente(Integer.parseInt(jtfCodigoCliente.getText()));
                viewPagamentoPDV.setTextFieldcliente();    
                viewPagamentoPDV.setTextFieldticket1();
            }
        }catch(Exception e){}
            viewPagamentoPDV.setValorTotal(Float.parseFloat(jtfValorBruto.getText()));
            viewPagamentoPDV.setTextFieldValorTotal();
            viewPagamentoPDV.setVisible(true);
            System.out.println(viewPagamentoPDV.getFormaPagamento());
            
            if (viewPagamentoPDV.isPago()){
                salvarVenda();
                //atualizar ticket
               carregarTicket();

                
       
            }else{
                JOptionPane.showMessageDialog(this, "Pagamento Cancelado");
               // new ViewPDV().setVisible(true);
               new ViewPDV().setVisible(true);
            }
    }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Não há produtos incluidos");
        }                       
    }//GEN-LAST:event_jmiVendaActionPerformed
    private void jmiExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExcluirActionPerformed
        try{
            int quantLinha = jtProdutos.getRowCount();
            if (quantLinha < 1){
                JOptionPane.showMessageDialog(this, "Não existe item para excluir");
            }else{
                DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
                //inclui um try
                int linha = Integer.parseInt(JOptionPane.showInputDialog("Informe o item que deseja excluir"));
                modelo.removeRow(linha-1);
                for (int i = 0; i < quantLinha; i++) {
                    modelo.setValueAt (i+1, i, 0);
                }
            }
        }catch(Exception e){}
    }//GEN-LAST:event_jmiExcluirActionPerformed
     private void pegarConteudo(java.awt.event.KeyEvent e){
        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            try{
                jlStatus.setText("Venda em Aberto");
                modelProdutos = controllerProdutos.retornarProdutoController(Integer.parseInt(jtfCodigoProduto.getText()));
                    if( modelProdutos.getProEstoque() > 0 ){
                     //formatando valor na tabela
                        if (jtfCodigoProduto.getText().equals("10") && !kgBalanca.isSelected() | jtfQuantidade.getText().equals("")){
                            JOptionPane.showMessageDialog(this, "Peso deve ser selecionado para este produto, e quantidade não deve ser menor que zero!", "Atenção", JOptionPane.WARNING_MESSAGE );
                        }else if (jtfCodigoProduto.getText().equals("10") && kgBalanca.isSelected() && 0 < Double.parseDouble(jtfQuantidade.getText()))  {
                            jtfQuantidade.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(jtfQuantidade.getText())));
                            Double quantidaderedondo = Double.parseDouble((jtfQuantidade.getText()));
                            double balanca  = (double) ((quantidaderedondo*modelProdutos.getProValor())/1000);
                            String totalredondo = bl.arredondamentoDoubleComPontoDuasCasasString(balanca); 
                            modelo.addRow(new Object[]{
                            modelo.getRowCount()+1, 
                            modelProdutos.getIdProduto(),
                            modelProdutos.getProNome(),
                            quantidaderedondo,
                            modelProdutos.getProValor(),
                            totalredondo
                            });
                            jtfValorBruto.setText(somaValorTotal()+"");
                            jtfCodigoProduto.setText("");
                            jtfQuantidade.setText("");  
                        }else if(Double.parseDouble(jtfCodigoProduto.getText()) != 10){
                            int quantidade = 1;
                            modelo.addRow(new Object[]{
                            modelo.getRowCount()+1, 
                            modelProdutos.getIdProduto(),
                            modelProdutos.getProNome(),
                            quantidade,
                            modelProdutos.getProValor(),
                            modelProdutos.getProValor() * quantidade
                            });
                            jtfValorBruto.setText(somaValorTotal()+"");
                            jtfCodigoProduto.setText("");
                            jtfQuantidade.setText("");
                        }
                    }else{
                      JOptionPane.showMessageDialog(this, "Este produto não tem em estoque!", "Atenção", JOptionPane.WARNING_MESSAGE );  
                    }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Item não existe, ou quantidade não definida", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }            
     }  
    private void pegarConteudo2(){
        jlStatus.setText("Venda em Aberto");
        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        modelProdutos = controllerProdutos.retornarProdutoController(Integer.parseInt(jtfCodigoProduto1.getText()));
        //se a balança for selecionada e produto não for nulo
            if(kgBalanca.isSelected() && jcbNomeProduto != null ){
                jtfQuantidade.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(jtfQuantidade.getText())));
                Double quantidade1 = Double.parseDouble((jtfQuantidade.getText())); 
                    if( modelProdutos.getProEstoque() > 0 ){
                        if( (0 >= Double.parseDouble(jtfQuantidade.getText())) || jtfQuantidade.getText().equals("")){
                           JOptionPane.showMessageDialog(this, "A quantidade em grama (maior que zero)", "Atenção", JOptionPane.WARNING_MESSAGE );
                        }else{
                            try{
                                if (jtfCodigoProduto1.getText().equals("1")){
                                    double balanca  = (double) ((quantidade1*modelProdutos.getProValor())/1000);
                                    String totalredondo = bl.arredondamentoDoubleComPontoDuasCasasString(balanca);            
                                        modelo.addRow(new Object[]{
                                        modelo.getRowCount()+1,
                                        modelProdutos.getIdProduto(),
                                        modelProdutos.getProNome(),
                                        quantidade1 , 
                  
                                        modelProdutos.getProValor(),
                                        totalredondo
                                        });
                                        jtfValorBruto.setText(somaValorTotal()+"");
                                        jtfQuantidade.setText("");
                                }else{
                                     JOptionPane.showMessageDialog(this, "O Produto não pode ser pesado!", "Atenção", JOptionPane.WARNING_MESSAGE );}
                            }catch (Exception ex){}
                      }
                    }else{
                        JOptionPane.showMessageDialog(this, "Este produto não tem em estoque!", "Atenção", JOptionPane.WARNING_MESSAGE );
                    }
            } //se não for peso a quantidade deve ser inteiro
            else if (Integer.parseInt(jtfCodigoCliente.getText()) == 0 | jcbNomeProduto != null && !kgBalanca.isSelected() && !jtfCodigoProduto1.getText().equals("1")){
                if( modelProdutos.getProEstoque() > 0 ){     
                        int quantidade = Integer.parseInt(((jtfQuantidade.getText()))); 
                            if( (0 >= Float.parseFloat(jtfQuantidade.getText())) || jtfQuantidade.getText().equals("")){
                                JOptionPane.showMessageDialog(this, "A quantidade deve ser maior que zero e sem Vírgula!", "Atenção", JOptionPane.WARNING_MESSAGE );
                            } else{
                                try{
                                    double total  = (quantidade*modelProdutos.getProValor());
                                    String totalredondo = bl.arredondamentoDoubleComPontoDuasCasasString(total);   
                                     
                                    jcbNomeCliente = null;
                     
                                    modelo.addRow(new Object[]{
                                    modelo.getRowCount()+1,
                                    modelProdutos.getIdProduto(),
                                    modelProdutos.getProNome(),
                                    quantidade,
                   
                                    modelProdutos.getProValor(),
                                    modelProdutos.getProValor() * quantidade
                                    
                                    });
                                    
                                    jtfValorBruto.setText(somaValorTotal()+"");
                                    jtfQuantidade.setText(""); 
                                }catch (Exception ex){ }
                            }
                    }else{
                      JOptionPane.showMessageDialog(this, "Este produto não tem em estoque!", "Atenção", JOptionPane.WARNING_MESSAGE );
                    }
            } else if (jtfCodigoProduto1.getText().equals("1") && !kgBalanca.isSelected()){
                JOptionPane.showMessageDialog(this, "Peso deve ser selecionado para este produto!", "Atenção", JOptionPane.WARNING_MESSAGE );
            }   
            }
    private void jbRemoverProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverProdutosActionPerformed
       
    }//GEN-LAST:event_jbRemoverProdutosActionPerformed
    private void jcbNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeClienteActionPerformed
        try{
            modelCliente = controllerCliente.getClienteController(Integer.parseInt(jcbNomeCliente.getSelectedItem().toString()));
            jcbNomeCliente.setSelectedItem(modelCliente.getCliNome());
           carregarTicket();
        } catch(Exception e){}
    }//GEN-LAST:event_jcbNomeClienteActionPerformed
    private void jcbNomeClientePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbNomeClientePopupMenuWillBecomeInvisible
        try{
            if(jcbNomeCliente.isPopupVisible ()){

                preencherCodigoClientePeloComboBox();
                carregarTicket();
            }
    }catch(Exception e){}
    }//GEN-LAST:event_jcbNomeClientePopupMenuWillBecomeInvisible
    private void jtfCodigoClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoClienteFocusLost
        try{
            carregarPorCodigo();
            carregarTicket();
        }catch(Exception e){}
    }//GEN-LAST:event_jtfCodigoClienteFocusLost
    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        try{
            pegarConteudo2();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "A quantidade deve ser maior que zero e sem virgula!", "Atenção", JOptionPane.WARNING_MESSAGE );}
    }//GEN-LAST:event_jbAdicionarActionPerformed
    private void jcbNomeProdutoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbNomeProdutoPopupMenuWillBecomeInvisible
        if(jcbNomeProduto.isPopupVisible()){
            preencherCodigoProdutoPeloComboBox();
        }
    }//GEN-LAST:event_jcbNomeProdutoPopupMenuWillBecomeInvisible
    private void jcbNomeProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbNomeProdutoFocusLost
        try{
            modelProdutos = controllerProdutos.retornarProdutoController(Integer.parseInt(jtfCodigoProduto.getText()));
            jcbNomeProduto.setSelectedItem(modelProdutos.getProNome());}
        catch(Exception e){}
    }//GEN-LAST:event_jcbNomeProdutoFocusLost
    private void jtfCodigoProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoProduto1ActionPerformed
    }//GEN-LAST:event_jtfCodigoProduto1ActionPerformed
    private void jbRemoverProdutos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverProdutos2ActionPerformed
        int linha = jtProdutos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        modelo.removeRow(linha);
        jtfValorBruto.setText(somaValorTotal()+"");
    }//GEN-LAST:event_jbRemoverProdutos2ActionPerformed
    private void jtfCodigoProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoKeyTyped
        pegarConteudo(evt);
    }//GEN-LAST:event_jtfCodigoProdutoKeyTyped
    private void jtfCodigoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoKeyReleased
    }//GEN-LAST:event_jtfCodigoProdutoKeyReleased
    private void jtfCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoKeyPressed
        pegarConteudo(evt);
    }//GEN-LAST:event_jtfCodigoProdutoKeyPressed
    private void jtfCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoActionPerformed
    }//GEN-LAST:event_jtfCodigoProdutoActionPerformed
    private void jtfCodigoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoMouseClicked
    }//GEN-LAST:event_jtfCodigoProdutoMouseClicked
    private void jtfCodigoProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoFocusGained
    }//GEN-LAST:event_jtfCodigoProdutoFocusGained
    private void kgBalancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kgBalancaActionPerformed
    }//GEN-LAST:event_kgBalancaActionPerformed

    private void jtfQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfQuantidadeFocusLost
        jtfQuantidade.setText(bl.converterVirgulaParaPonto(jtfQuantidade.getText()));
    }//GEN-LAST:event_jtfQuantidadeFocusLost
    private void jtfValorBrutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfValorBrutoFocusLost
        jtfValorBruto.setText(bl.converterVirgulaParaPonto(jtfValorBruto.getText()));
    }//GEN-LAST:event_jtfValorBrutoFocusLost
    private void jtfValorBrutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfValorBrutoFocusGained
        try{
        jtfValorBruto.setText(BLm.converterVirgulaParaPonto(jtfValorBruto.getText()));
        jtfValorBruto.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(jtfValorBruto.getText())));
        }catch(Exception e){}   
    }//GEN-LAST:event_jtfValorBrutoFocusGained
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
    }//GEN-LAST:event_formWindowOpened
    private void aaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aaaActionPerformed
    }//GEN-LAST:event_aaaActionPerformed
    private void ccc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccc1ActionPerformed
    }//GEN-LAST:event_ccc1ActionPerformed
    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
      String promo = jComboBox1.getSelectedItem().toString();
      ccc.setText(promo);
    }//GEN-LAST:event_jComboBox1FocusLost
    private void jcbNomeClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbNomeClienteFocusLost
        //carregarTicket();
    }//GEN-LAST:event_jcbNomeClienteFocusLost
    private void jtfQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfQuantidadeKeyTyped
        String caracteres="0987654321.,";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jtfQuantidadeKeyTyped
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jcbNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNomeProdutoActionPerformed
    private void salvarVenda(){
        int cont;
        int codigoProduto = 0, codigoVenda = 0;
        modelVendas = new ModelVendas();
        //setar cliente em modelVendas
        modelVendas.setCliente(Integer.parseInt(jtfCodigoCliente.getText()));
        //setar Data
        try {
            modelVendas.setVenDataVenda(blDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception ex) {
            Logger.getLogger(ViewPDV.class.getName()).log(Level.SEVERE, null, ex);
        }
        //setar valor produto
        try{
        modelVendas.setVenValorBruto(Double.parseDouble(jtfValorBruto.getText()));
        }catch(Exception e){
        }
        //setar Desconto
        modelVendas.setVenDesconto(viewPagamentoPDV.getDesconto());
        //setar valor liquido
        modelVendas.setVenValorLiquido(blMascaras.arredondamentoComPontoDuasCasasDouble(viewPagamentoPDV.getValorTotal()));
        try{
            modelVendas.setFormaPagamento((viewPagamentoPDV.getFormaPagamento()));
        }catch(Exception e){}
        try{
            modelVendas.setFormaPagamento2((viewPagamentoPDV.getFormaPagamento2()));
        }catch(Exception e){}
        try{  
            modelVendas.setValorRecebido(blMascaras.arredondamentoComPontoDuasCasas(viewPagamentoPDV.getValorRecebido()));
        }catch(Exception e){}
        try{
            modelVendas.setValorRecebido2(blMascaras.arredondamentoComPontoDuasCasas(viewPagamentoPDV.getValorRecebido2()));
        }catch(Exception e){}
        try{
            modelVendas.setParcela(viewPagamentoPDV.getParcela());
        }catch(Exception e){}
        try{
            modelVendas.setParcela2(viewPagamentoPDV.getParcela2());
        }catch(Exception e){}
        recuperarId();
        //salvar venda
        codigoVenda = controllerVendas.salvarVendasController(modelVendas);
        cont = jtProdutos.getRowCount();
        for (int i = 0; i < cont; i++) {
           codigoProduto = (int) jtProdutos.getValueAt(i, 1);
           modelVendasProdutos = new ModelVendasProdutos();
           modelProdutos = new ModelProdutos();
           modelVendasProdutos.setProduto(codigoProduto);
           modelVendasProdutos.setVendas(codigoVenda);
           modelVendasProdutos.setVenProValor((double) jtProdutos.getValueAt(i, 4));
           modelVendasProdutos.setVenProQuantidade(Double.parseDouble(jtProdutos.getValueAt(i, 3).toString()));
           //produto
           modelProdutos.setIdProduto(codigoProduto);
           modelProdutos.setProEstoque((int) (controllerProdutos.retornarProdutoController(codigoProduto).getProEstoque()- Double.parseDouble(jtProdutos.getValueAt(i, 3).toString())));
           listaModelVendasProdutoses.add(modelVendasProdutos);
           listaModelProdutoses.add(modelProdutos);
        }
        //salvar os produtos da venda
        if(controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutoses)){
           //alterar estoque de produtos
           controllerProdutos.alterarEstoqueProdutoController(listaModelProdutoses);
           
           JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
           limparTela();
           
           //JOptionPane.showMessageDialog(this, "Produtos da venda salvo com sucesso");
       }else{
           JOptionPane.showMessageDialog(this, "Erro ao salvar a venda", "Erro", JOptionPane.ERROR_MESSAGE);
       }
    }
    //limpar tela após pagamento
        private void limparTela(){
            //
            jtfValorBruto.setText("");
            DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
            modelo.setNumRows(0);
            jlStatus.setText("Caixa Livre");
        }
        
         private void limparTela1(){
            jtfValorBruto.setText("");
           
            DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
            
            modelo.setNumRows(0);
            jlStatus.setText("Caixa Livre");
             carregarTicket();
             
        }
         private float somaValorTotal(){
            float soma = 0, valor = 0;
            int cont = jtProdutos.getRowCount();
            for(int i = 0; i < cont; i++){
                valor = Float.parseFloat(String.valueOf(jtProdutos.getValueAt(i, 5)));
                soma += valor;
            }
            return soma;
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
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPDV().setVisible(true);
            }
        });
    }
    private void setarOperador(){
         jlOperador.setText(ModelSessaoUsuario.nome);
    }
     
    private void preencherCodigoProdutoPeloComboBox(){
        try{
            modelProdutos = controllerProdutos.retornarProdutoController(jcbNomeProduto.getSelectedItem().toString());
            jtfCodigoProduto1.setText(String.valueOf(modelProdutos.getIdProduto()));
        }catch(Exception e){}
    }
    private void preencherCodigoClientePeloComboBox(){
        try{
          modelCliente = controllerCliente.getClienteController(jcbNomeCliente.getSelectedItem().toString());
          jtfCodigoCliente.setText(String.valueOf(modelCliente.getIdCliente()));
        }catch(Exception e){}
    }
    private void carregarPorCodigo(){
        try{
          modelCliente = controllerCliente.getClienteController(Integer.parseInt(jtfCodigoCliente.getText()));
          jcbNomeCliente.setSelectedItem(modelCliente.getCliNome());
        }catch(Exception e){}
    }
    private void desabilitaHabilitaCampos(boolean condicao){
        jComboBox1.setEnabled(condicao);
        bbb.setEnabled(condicao);
        ccc.setEnabled(condicao);
        aaa.setEnabled(condicao);
        ccc1.setEnabled(condicao);
    }
    private void listarLimite(){
        listaModelPromo = controllerPromocao.getListapromocaoController();
        jComboBox1.removeAllItems();
        for (int i = 0; i < listaModelPromo.size(); i++){
            if(!"Desativado".equals(listaModelPromo.get(i).getDisponibilidade_promocao())){
               jComboBox1.addItem(listaModelPromo.get(i).getTeste1());
            }
        }
    }
    private void listarCliente(){
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
    private void limparCampos(){
        aaa.setText("");
        bbb.setText("");   
    }
    private void carregarTicket(){
        
       try{ 
       if(jtfCodigoCliente.getText() == null || "0".equals(jtfCodigoCliente.getText())){
           desabilitaHabilitaCampos(false);
           limparCampos();
           

        }else{
           desabilitaHabilitaCampos(true);
            String cliente1;
            cliente1 = jcbNomeCliente.getSelectedItem().toString(); 
            //JOptionPane.showMessageDialog(this, cliente1, "Erro", JOptionPane.ERROR_MESSAGE);

            ModelCliente model = controllerCliente.getClienteController(cliente1);
            //pegar valor combo e setar no campo 
            String promo = jComboBox1.getSelectedItem().toString();
            ccc.setText(promo);
            //pegar qusntidade acumulada
            aaa.setText(model.getCliQuantidade());
           
           
            if("0".equals(model.getCliAcumulado())){
                bbb.setText("0.00");
              
            }else{
                //pegar valor acumulado
                Float valorAcumulado = (model.getCliAcumulado());
                Float qtdeAcumulado = Float.parseFloat(model.getCliQuantidade());
                Float ParcialAcumulado = valorAcumulado/qtdeAcumulado;
                if (valorAcumulado <= 0 || qtdeAcumulado <= 0){
                    bbb.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble("00.00")));
                }else{
                    bbb.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(ParcialAcumulado+"")));
                }
            } 
       }
      
     }catch(Exception e){}
    }
    private void recuperarId(){
        try{
            ModelCaixa model = controllerCaixa.getUltimoIdController(modelCaixa);
            modelVendas.setIdCaixa(model.getPk_caixa());
        }catch(Exception e){}
    }
public void keyReleased(KeyEvent arg0) {}
public void keyTyped(KeyEvent arg0) {}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aaa;
    private javax.swing.JTextField bbb;
    private javax.swing.JTextField ccc;
    private javax.swing.JTextField ccc1;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbRemoverProdutos;
    private javax.swing.JButton jbRemoverProdutos2;
    private componentes.UJComboBox jcbNomeCliente;
    private componentes.UJComboBox jcbNomeProduto;
    private javax.swing.JLabel jlCaixa;
    private javax.swing.JLabel jlOperador;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JMenuItem jmiExcluir;
    private javax.swing.JMenuItem jmiVenda;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JTextField jtfCodigoCliente;
    private javax.swing.JFormattedTextField jtfCodigoProduto;
    private javax.swing.JTextField jtfCodigoProduto1;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JFormattedTextField jtfValorBruto;
    private javax.swing.JRadioButton kgBalanca;
    // End of variables declaration//GEN-END:variables
    private static class KeyAdapterImpl extends KeyAdapter {
        public KeyAdapterImpl() {
        }
    }
}
