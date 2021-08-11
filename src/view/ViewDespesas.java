package view;
import DAO.DAOVendas;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import com.toedter.calendar.JCalendar;
import controller.ControllerAgua;
import controller.ControllerAluguel;
import controller.ControllerCaixa;
import controller.ControllerCaixa1;
import controller.ControllerProdutosVendasProdutos;
import controller.ControllerSangria;
import controller.ControllerUsuario;
import controller.ControllerVendas;
import controller.ControllerVendasCliente;
import controller.Controllerenergia;
import controller.Controllerextras;
import controller.Controllersalario;
import controller.Controllertelefone;
import static java.lang.System.in;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowFilter.ComparisonType;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelAgua;
import model.ModelAluguel;
import model.ModelCaixa;
import model.ModelProdutosVendasProdutos;
import model.ModelSangria;
import model.ModelUsuario;
import model.ModelVendas;
import model.ModelVendasClientes;
import model.ModelEnergia;
import model.ModelExtras;
import model.ModelSalario;
import model.ModelTelefone;
import model.Modelfornecedor;
import org.joda.time.DateTime;
import util.BLMascaras;

public class ViewDespesas extends javax.swing.JFrame {
 ArrayList<ModelVendasClientes> listaModelVendasClientes = new ArrayList<>();
 ArrayList<ModelVendas> listaModelVendases = new ArrayList<>();
 ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutoses = new ArrayList<>();
 ArrayList<ModelAgua> listaAgua = new ArrayList<>();
 ArrayList<ModelSangria> listaSangria = new ArrayList<>();
 ArrayList<ModelUsuario> listaUsu = new ArrayList<>();
 ArrayList<ModelCaixa> listaCaixa = new ArrayList<>();
 ArrayList<ModelEnergia> listaEnergia = new ArrayList<>();
 ArrayList<ModelTelefone> listaTelefone = new ArrayList<>();
 ArrayList<ModelAluguel> listaAluguel = new ArrayList<>();
 ArrayList<ModelExtras> listaExtras = new ArrayList<>();
 ArrayList<ModelSalario> listaSalario = new ArrayList<>();
 ArrayList<ModelUsuario> listaModelusu = new ArrayList<>();
 ControllerUsuario controllerUsuario = new ControllerUsuario();
 ControllerAgua controllerAgua = new ControllerAgua();
 ControllerVendasCliente controllerVendasCliente = new ControllerVendasCliente();
 ControllerCaixa controllerCaixa = new ControllerCaixa();
 ControllerProdutosVendasProdutos controllerProdutosVendasProdutos = new ControllerProdutosVendasProdutos();
 ControllerSangria controllersangria = new ControllerSangria();
 ControllerVendas controllerVendas = new ControllerVendas();
 Controllerenergia controllerEnergia = new Controllerenergia();
 Controllertelefone controllerTelefone = new Controllertelefone();
 ControllerAluguel controllerAluguel = new ControllerAluguel();
 Controllerextras controllerExtras = new Controllerextras();
 Controllersalario controllerSalario = new Controllersalario();
 ModelSangria modelsangria = new ModelSangria();
 ModelAgua modelagua = new ModelAgua();
 ModelVendas modelVendas = new ModelVendas();
 ModelEnergia modelEnergia = new ModelEnergia();
 ModelTelefone modelTelefone = new ModelTelefone();
 ModelAluguel modelAluguel = new ModelAluguel();
 ModelExtras modelExtras = new ModelExtras();
 ModelSalario modelSalario = new ModelSalario();
 DAOVendas dv = new DAOVendas();
 BLMascaras BLm = new BLMascaras();
 String salvarAlterar;
 private ViewVisualizarConta viewVisualizarConta;
 public ViewDespesas() {
       initComponents();
       setLocationRelativeTo(null);
       listarFuncionario();    
       carregarAgua();
       carregarAluguel();
       carregarExtras();
       carregarLuz();
       carregarSalario();
       carregarTelefone();
       limparCamposAgua();
       limparCamposAluguel();
       limparCamposExtras();
       limparCamposLuz();
       limparCamposSalario();
       limparCamposTelefone();
       desabilitaHabilitaCamposAgua(false);
       desabilitaHabilitaCamposAluguel(false);
       desabilitaHabilitaCamposExtras(false);
       desabilitaHabilitaCamposLuz(false);
       desabilitaHabilitaCamposSalario(false);
       desabilitaHabilitaCamposTelefone(false);
       codigo1.setEnabled(false);
       codigo2.setEnabled(false);
       codigo3.setEnabled(false);
       codigo4.setEnabled(false);
       codigo5.setEnabled(false);
       codigo6.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooserBeanInfo1 = new com.toedter.calendar.JMonthChooserBeanInfo();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        validade2 = new com.toedter.calendar.JDateChooser();
        validade3 = new com.toedter.calendar.JDateChooser();
        ValorAbertura = new javax.swing.JFormattedTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jbAlterar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbNovo2 = new javax.swing.JButton();
        codigo1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        todate3 = new com.toedter.calendar.JDateChooser();
        btn3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        ValorAbertura2 = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        validade4 = new com.toedter.calendar.JDateChooser();
        validade5 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jbAlterar1 = new javax.swing.JButton();
        jbSalvar1 = new javax.swing.JButton();
        jbExcluir1 = new javax.swing.JButton();
        jbCancelar1 = new javax.swing.JButton();
        jbNovo3 = new javax.swing.JButton();
        codigo2 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        todate4 = new com.toedter.calendar.JDateChooser();
        btn4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        ValorAbertura4 = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        validade6 = new com.toedter.calendar.JDateChooser();
        validade7 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jbAlterar2 = new javax.swing.JButton();
        jbSalvar2 = new javax.swing.JButton();
        jbExcluir2 = new javax.swing.JButton();
        jbCancelar2 = new javax.swing.JButton();
        jbNovo4 = new javax.swing.JButton();
        codigo3 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        todate6 = new com.toedter.calendar.JDateChooser();
        btn5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        ValorAbertura6 = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        validade8 = new com.toedter.calendar.JDateChooser();
        validade9 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jbAlterar3 = new javax.swing.JButton();
        jbSalvar3 = new javax.swing.JButton();
        jbExcluir3 = new javax.swing.JButton();
        jbCancelar3 = new javax.swing.JButton();
        jbNovo5 = new javax.swing.JButton();
        codigo4 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        todate5 = new com.toedter.calendar.JDateChooser();
        btn6 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        validade10 = new com.toedter.calendar.JDateChooser();
        validade11 = new com.toedter.calendar.JDateChooser();
        ValorAbertura8 = new javax.swing.JFormattedTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jbAlterar4 = new javax.swing.JButton();
        jbSalvar4 = new javax.swing.JButton();
        jbExcluir4 = new javax.swing.JButton();
        jbCancelar4 = new javax.swing.JButton();
        jbNovo6 = new javax.swing.JButton();
        codigo5 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        todate7 = new com.toedter.calendar.JDateChooser();
        btn7 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        ValorAbertura10 = new javax.swing.JFormattedTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        validade13 = new com.toedter.calendar.JDateChooser();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        ValorAbertura13 = new javax.swing.JFormattedTextField();
        jLabel45 = new javax.swing.JLabel();
        ValorAbertura14 = new javax.swing.JFormattedTextField();
        jbPesquisa1 = new javax.swing.JButton();
        jtfPesquisa = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jbAlterar5 = new javax.swing.JButton();
        jbSalvar5 = new javax.swing.JButton();
        jbExcluir5 = new javax.swing.JButton();
        jbCancelar5 = new javax.swing.JButton();
        jbNovo7 = new javax.swing.JButton();
        codigo6 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        ValorAbertura12 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        ValorAbertura15 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Despesas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Água:");

        jLabel12.setText("Mês:");

        jLabel13.setText("Validade:");

        jLabel14.setText("Data de Pagamento:");

        jLabel15.setText("Valor: R$");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        validade2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validade2FocusLost(evt);
            }
        });
        validade2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validade2MouseClicked(evt);
            }
        });
        validade2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validade2KeyTyped(evt);
            }
        });

        validade3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validade3FocusLost(evt);
            }
        });
        validade3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validade3MouseClicked(evt);
            }
        });
        validade3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validade3KeyTyped(evt);
            }
        });

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

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código: ", "Mês:", "Validade:", "Data de Pagamento:", "Valor:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setMinWidth(100);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
        }

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-crie-um-novo-50.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-salvar-50.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-excluir-50.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cancelar-50.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbNovo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-50.png"))); // NOI18N
        jbNovo2.setText("Novo");
        jbNovo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovo2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Código:");

        btn3.setText("Filtrar por data de Pagamento");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jbCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbExcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbAlterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbNovo2)
                            .addGap(198, 198, 198)
                            .addComponent(jbSalvar))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(4, 4, 4)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(validade2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(validade3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ValorAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(66, 66, 66))
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(todate3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(ValorAbertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(validade3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(todate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbNovo2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btn3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Água", jPanel7);

        ValorAbertura2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ValorAbertura2FocusLost(evt);
            }
        });
        ValorAbertura2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorAbertura2ActionPerformed(evt);
            }
        });
        ValorAbertura2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorAbertura2KeyTyped(evt);
            }
        });

        jLabel17.setText("Mês:");

        jLabel18.setText("Validade:");

        jLabel19.setText("Data de Pagamento:");

        jLabel20.setText("Valor: R$");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        validade4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validade4FocusLost(evt);
            }
        });
        validade4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validade4MouseClicked(evt);
            }
        });
        validade4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validade4KeyTyped(evt);
            }
        });

        validade5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validade5FocusLost(evt);
            }
        });
        validade5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validade5MouseClicked(evt);
            }
        });
        validade5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validade5KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Luz:");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Caixa:", "Mês:", " Validade:", "Data de Pagamento:", "Valor:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setMinWidth(100);
            jTable5.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable5.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable5.getColumnModel().getColumn(1).setResizable(false);
            jTable5.getColumnModel().getColumn(2).setResizable(false);
        }

        jbAlterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-crie-um-novo-50.png"))); // NOI18N
        jbAlterar1.setText("Alterar");
        jbAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterar1ActionPerformed(evt);
            }
        });

        jbSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-salvar-50.png"))); // NOI18N
        jbSalvar1.setText("Salvar");
        jbSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvar1ActionPerformed(evt);
            }
        });

        jbExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-excluir-50.png"))); // NOI18N
        jbExcluir1.setText("Excluir");
        jbExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluir1ActionPerformed(evt);
            }
        });

        jbCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cancelar-50.png"))); // NOI18N
        jbCancelar1.setText("Cancelar");
        jbCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelar1ActionPerformed(evt);
            }
        });

        jbNovo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-50.png"))); // NOI18N
        jbNovo3.setText("Novo");
        jbNovo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovo3ActionPerformed(evt);
            }
        });

        jLabel37.setText("Código:");

        btn4.setText("Filtrar por data de Pagamento");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jbCancelar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAlterar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbNovo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                        .addComponent(jbSalvar1))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(todate4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(validade4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(validade5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ValorAbertura2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigo2)
                                .addGap(90, 90, 90))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btn4)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(26, 26, 26))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validade4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(ValorAbertura2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)
                        .addComponent(codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(validade5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(todate4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbNovo3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btn4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Luz", jPanel8);

        ValorAbertura4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ValorAbertura4FocusLost(evt);
            }
        });
        ValorAbertura4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorAbertura4ActionPerformed(evt);
            }
        });
        ValorAbertura4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorAbertura4KeyTyped(evt);
            }
        });

        jLabel22.setText("Mês:");

        jLabel23.setText("Validade:");

        jLabel24.setText("Data de Pagamento:");

        jLabel25.setText("Valor: R$");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        validade6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validade6FocusLost(evt);
            }
        });
        validade6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validade6MouseClicked(evt);
            }
        });
        validade6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validade6KeyTyped(evt);
            }
        });

        validade7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validade7FocusLost(evt);
            }
        });
        validade7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validade7MouseClicked(evt);
            }
        });
        validade7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validade7KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Telefone:");

        jbAlterar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-crie-um-novo-50.png"))); // NOI18N
        jbAlterar2.setText("Alterar");
        jbAlterar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterar2ActionPerformed(evt);
            }
        });

        jbSalvar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-salvar-50.png"))); // NOI18N
        jbSalvar2.setText("Salvar");
        jbSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvar2ActionPerformed(evt);
            }
        });

        jbExcluir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-excluir-50.png"))); // NOI18N
        jbExcluir2.setText("Excluir");
        jbExcluir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluir2ActionPerformed(evt);
            }
        });

        jbCancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cancelar-50.png"))); // NOI18N
        jbCancelar2.setText("Cancelar");
        jbCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelar2ActionPerformed(evt);
            }
        });

        jbNovo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-50.png"))); // NOI18N
        jbNovo4.setText("Novo");
        jbNovo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovo4ActionPerformed(evt);
            }
        });

        jLabel39.setText("Código:");

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Caixa:", "Mês:", " Validade:", "Data de Pagamento:", "Valor:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setMinWidth(100);
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable6.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable6.getColumnModel().getColumn(1).setResizable(false);
            jTable6.getColumnModel().getColumn(2).setResizable(false);
        }

        btn5.setText("Filtrar por data de Pagamento");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(validade6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(validade7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ValorAbertura4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel39)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(codigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(89, 89, 89))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jbCancelar2)
                            .addGap(18, 18, 18)
                            .addComponent(jbExcluir2)
                            .addGap(18, 18, 18)
                            .addComponent(jbAlterar2)
                            .addGap(18, 18, 18)
                            .addComponent(jbNovo4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSalvar2))
                        .addComponent(jScrollPane9))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(todate6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn5)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(jLabel23)
                        .addComponent(jLabel25)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ValorAbertura4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel39)
                        .addComponent(codigo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24))
                    .addComponent(validade6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validade7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(todate6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Telefone", jPanel9);

        ValorAbertura6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ValorAbertura6FocusLost(evt);
            }
        });
        ValorAbertura6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorAbertura6ActionPerformed(evt);
            }
        });
        ValorAbertura6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorAbertura6KeyTyped(evt);
            }
        });

        jLabel27.setText("Mês:");

        jLabel28.setText("Validade:");

        jLabel29.setText("Data de Pagamento:");

        jLabel30.setText("Valor: R$");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        validade8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validade8FocusLost(evt);
            }
        });
        validade8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validade8MouseClicked(evt);
            }
        });
        validade8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validade8KeyTyped(evt);
            }
        });

        validade9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validade9FocusLost(evt);
            }
        });
        validade9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validade9MouseClicked(evt);
            }
        });
        validade9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validade9KeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Aluguel:");

        jbAlterar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-crie-um-novo-50.png"))); // NOI18N
        jbAlterar3.setText("Alterar");
        jbAlterar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterar3ActionPerformed(evt);
            }
        });

        jbSalvar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-salvar-50.png"))); // NOI18N
        jbSalvar3.setText("Salvar");
        jbSalvar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvar3ActionPerformed(evt);
            }
        });

        jbExcluir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-excluir-50.png"))); // NOI18N
        jbExcluir3.setText("Excluir");
        jbExcluir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluir3ActionPerformed(evt);
            }
        });

        jbCancelar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cancelar-50.png"))); // NOI18N
        jbCancelar3.setText("Cancelar");
        jbCancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelar3ActionPerformed(evt);
            }
        });

        jbNovo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-50.png"))); // NOI18N
        jbNovo5.setText("Novo");
        jbNovo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovo5ActionPerformed(evt);
            }
        });

        jLabel42.setText("Código:");

        btn6.setText("Filtrar por data de Pagamento");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Caixa:", "Mês:", " Validade:", "Data de Pagamento:", "Valor:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setMinWidth(100);
            jTable7.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable7.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable7.getColumnModel().getColumn(1).setResizable(false);
            jTable7.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jbCancelar3)
                            .addGap(18, 18, 18)
                            .addComponent(jbExcluir3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbAlterar3)
                            .addGap(18, 18, 18)
                            .addComponent(jbNovo5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSalvar3))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(todate5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel28)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(validade8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(validade9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ValorAbertura6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel42)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(codigo4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btn6))
                            .addGap(51, 51, 51))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(jLabel28)
                        .addComponent(jLabel30)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ValorAbertura6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(codigo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42))
                    .addComponent(validade8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validade9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(todate5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Aluguel", jPanel10);

        validade10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validade10FocusLost(evt);
            }
        });
        validade10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validade10MouseClicked(evt);
            }
        });
        validade10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validade10KeyTyped(evt);
            }
        });

        validade11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validade11FocusLost(evt);
            }
        });
        validade11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validade11MouseClicked(evt);
            }
        });
        validade11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validade11KeyTyped(evt);
            }
        });

        ValorAbertura8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ValorAbertura8FocusLost(evt);
            }
        });
        ValorAbertura8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorAbertura8ActionPerformed(evt);
            }
        });
        ValorAbertura8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorAbertura8KeyTyped(evt);
            }
        });

        jLabel32.setText("Mês:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Despesas Variadas:");

        jLabel33.setText("Validade:");

        jLabel34.setText("Data de Pagamento:");

        jLabel35.setText("Valor: R$");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jbAlterar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-crie-um-novo-50.png"))); // NOI18N
        jbAlterar4.setText("Alterar");
        jbAlterar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterar4ActionPerformed(evt);
            }
        });

        jbSalvar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-salvar-50.png"))); // NOI18N
        jbSalvar4.setText("Salvar");
        jbSalvar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvar4ActionPerformed(evt);
            }
        });

        jbExcluir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-excluir-50.png"))); // NOI18N
        jbExcluir4.setText("Excluir");
        jbExcluir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluir4ActionPerformed(evt);
            }
        });

        jbCancelar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cancelar-50.png"))); // NOI18N
        jbCancelar4.setText("Cancelar");
        jbCancelar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelar4ActionPerformed(evt);
            }
        });

        jbNovo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-50.png"))); // NOI18N
        jbNovo6.setText("Novo");
        jbNovo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovo6ActionPerformed(evt);
            }
        });

        jLabel46.setText("Código:");

        btn7.setText("Filtrar por data de Pagamento");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Caixa:", "Mês:", " Validade:", "Data de Pagamento:", "Valor:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setMinWidth(100);
            jTable8.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable8.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable8.getColumnModel().getColumn(1).setResizable(false);
            jTable8.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jbCancelar4)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir4)
                        .addGap(18, 18, 18)
                        .addComponent(jbAlterar4)
                        .addGap(18, 18, 18)
                        .addComponent(jbNovo6)
                        .addGap(183, 183, 183)
                        .addComponent(jbSalvar4))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(todate7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn7))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(validade10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(validade11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ValorAbertura8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel46)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigo5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addGap(14, 14, 14)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel32)
                                .addComponent(jLabel33)
                                .addComponent(jLabel35)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ValorAbertura8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel46)
                                .addComponent(codigo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34))
                            .addComponent(validade11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(todate7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7)))
                    .addComponent(validade10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jTabbedPane1.addTab("Despesas Variadas", jPanel11);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código:", "Código do Funcionário:", "Data de Pagamento:", "Valor por hora:", "Total salário:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(100);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
        }

        ValorAbertura10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ValorAbertura10FocusLost(evt);
            }
        });
        ValorAbertura10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorAbertura10ActionPerformed(evt);
            }
        });
        ValorAbertura10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorAbertura10KeyTyped(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("Funcionários:");

        jLabel40.setText("Data de Pagamento:");

        jLabel41.setText("Valor por hora: R$");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        validade13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validade13FocusLost(evt);
            }
        });
        validade13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validade13MouseClicked(evt);
            }
        });
        validade13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validade13KeyTyped(evt);
            }
        });

        jLabel43.setText("Horas Trabalhadas:");

        jLabel44.setText("Hora Extra 50%");

        ValorAbertura13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ValorAbertura13FocusLost(evt);
            }
        });
        ValorAbertura13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorAbertura13ActionPerformed(evt);
            }
        });
        ValorAbertura13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorAbertura13KeyTyped(evt);
            }
        });

        jLabel45.setText("Hora Extra 100%");

        ValorAbertura14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ValorAbertura14FocusLost(evt);
            }
        });
        ValorAbertura14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorAbertura14ActionPerformed(evt);
            }
        });
        ValorAbertura14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorAbertura14KeyTyped(evt);
            }
        });

        jbPesquisa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-50.png"))); // NOI18N
        jbPesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisa1ActionPerformed(evt);
            }
        });

        jtfPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisaActionPerformed(evt);
            }
        });

        jLabel73.setText("Pesquisar:");

        jbAlterar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-crie-um-novo-50.png"))); // NOI18N
        jbAlterar5.setText("Alterar");
        jbAlterar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterar5ActionPerformed(evt);
            }
        });

        jbSalvar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-salvar-50.png"))); // NOI18N
        jbSalvar5.setText("Salvar");
        jbSalvar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvar5ActionPerformed(evt);
            }
        });

        jbExcluir5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-excluir-50.png"))); // NOI18N
        jbExcluir5.setText("Excluir");
        jbExcluir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluir5ActionPerformed(evt);
            }
        });

        jbCancelar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cancelar-50.png"))); // NOI18N
        jbCancelar5.setText("Cancelar");
        jbCancelar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelar5ActionPerformed(evt);
            }
        });

        jbNovo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-50.png"))); // NOI18N
        jbNovo7.setText("Novo");
        jbNovo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovo7ActionPerformed(evt);
            }
        });

        jLabel47.setText("Código:");

        jLabel48.setText("Descontos: R$");

        ValorAbertura15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ValorAbertura15FocusLost(evt);
            }
        });
        ValorAbertura15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorAbertura15ActionPerformed(evt);
            }
        });
        ValorAbertura15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ValorAbertura15KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jbCancelar5)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir5)
                        .addGap(18, 18, 18)
                        .addComponent(jbAlterar5)
                        .addGap(18, 18, 18)
                        .addComponent(jbNovo7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalvar5))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPesquisa))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ValorAbertura12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ValorAbertura13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ValorAbertura14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ValorAbertura15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(validade13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ValorAbertura10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigo6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(jbPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel38)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(codigo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel47)
                                .addComponent(jLabel41)
                                .addComponent(ValorAbertura10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel40))
                            .addComponent(validade13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(ValorAbertura13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)
                            .addComponent(ValorAbertura14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValorAbertura12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48)
                            .addComponent(ValorAbertura15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Funcionários", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void ValorAbertura15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorAbertura15KeyTyped
    }//GEN-LAST:event_ValorAbertura15KeyTyped
    private void ValorAbertura15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAbertura15ActionPerformed
    }//GEN-LAST:event_ValorAbertura15ActionPerformed
    private void ValorAbertura15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ValorAbertura15FocusLost
    }//GEN-LAST:event_ValorAbertura15FocusLost
    private void jbNovo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovo7ActionPerformed
        this.desabilitaHabilitaCamposSalario(true);
        this.limparCamposSalario();
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovo7ActionPerformed
    private void jbCancelar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelar5ActionPerformed
        this.desabilitaHabilitaCamposSalario(false);
        this.limparCamposSalario();
    }//GEN-LAST:event_jbCancelar5ActionPerformed
    private void jbExcluir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluir5ActionPerformed
        int linha = jTable3.getSelectedRow();
        int codigoCliente = (int) jTable3.getValueAt(linha, 0);
        if(controllerSalario.excluirsalarioController(codigoCliente)){
            JOptionPane.showMessageDialog(this, "Excluido com sucesso");
            this.carregarSalario();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir", "ERRO", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jbExcluir5ActionPerformed
    private void jbSalvar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvar5ActionPerformed
        if("".equals(ValorAbertura10.getText()) || "".equals(ValorAbertura12.getText()) ||
            "".equals(ValorAbertura13.getText()) || "".equals(ValorAbertura14.getText())
            || "".equals(ValorAbertura15.getText())){
            JOptionPane.showMessageDialog(this, "Campos não devem estar vazios", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        if(validade13.getDate() == null){
            JOptionPane.showMessageDialog(this, "Data não foi selecionada", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        try{
            modelSalario.setId_salario(Integer.parseInt(this.codigo6.getText()));
        }catch(NumberFormatException e){}
        modelSalario.setFk_funcionario(jComboBox6.getSelectedItem().toString());
        //setando data Validade
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        // String dataFormatada = formatter.format(validade2.getDate());
        String dataFormatada = formatter.format(validade13.getDate());
        try{
            java.sql.Date sqlDate = java.sql.Date.valueOf(dataFormatada); // Magic happens here!
            modelSalario.setData_pagamento(sqlDate);
        }catch(Exception e ){}
        modelSalario.setValor_salario_hora(Float.parseFloat(ValorAbertura10.getText()));
        //teste1 = total hora trabalhada
        modelSalario.setTeste1(ValorAbertura12.getText());
        modelSalario.setHe_100(ValorAbertura14.getText());
        modelSalario.setHe_50(ValorAbertura13.getText());
        //teste2 = desconto
        modelSalario.setTeste2(ValorAbertura15.getText());

        int horasTrabalhadas = Integer.parseInt(ValorAbertura12.getText());
        float valorHora = Float.parseFloat(ValorAbertura10.getText());
        int horas50 = Integer.parseInt(ValorAbertura13.getText());
        int horas100 = Integer.parseInt(ValorAbertura14.getText());
        float desconto = Float.parseFloat(ValorAbertura15.getText());

        if("".equals(horasTrabalhadas)){
            horasTrabalhadas = 0;
        }
        if("".equals(valorHora)){
            valorHora = 0;
        }
        if("".equals(horas50)){
            horas50 = 0;
        }
        if("".equals(horas100)){
            horas100 = 0;
        }
        if("".equals(desconto)){
            desconto = 0;
        }
        float totalSalario;
        float total50;
        float total100;
        float totalnormal;
        total50 = (valorHora + (valorHora/2))* horas50;
        total100 = (valorHora + valorHora)* horas100;
        totalnormal = valorHora * horasTrabalhadas;
        totalSalario = total50 + total100 + totalnormal - desconto;
        modelSalario.setTotal_salario_mes(totalSalario);
        if(salvarAlterar.equals("salvar")){
            if(controllerSalario.salvarsalarioController(modelSalario)>0){
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                //carregar os clientes na tabela
                carregarSalario();
                this.desabilitaHabilitaCamposSalario(false);
                this.limparCamposSalario();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar ");
            }
        }else{
            if(controllerSalario.atualizarsalarioController(modelSalario)){
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                //carregar os clientes na tabela
                carregarSalario();
                this.desabilitaHabilitaCamposSalario(false);
                this.limparCamposSalario();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar");
            }
        }
    }//GEN-LAST:event_jbSalvar5ActionPerformed
    private void jbAlterar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterar5ActionPerformed
        try{
            int linha = jTable3.getSelectedRow();
            int codigoCliente = (int) jTable3.getValueAt(linha, 0);
            salvarAlterar = "alterar";
            jbSalvar.setEnabled(true);
            modelSalario = controllerSalario.getsalarioController(codigoCliente);
            codigo5.setText(String.valueOf(modelSalario.getId_salario()));
            ValorAbertura10.setText(modelSalario.getValor_salario_hora()+"");
            ValorAbertura12.setText(modelSalario.getTeste1());
            jComboBox6.setSelectedItem(modelSalario.getFk_funcionario());
            validade13.setDate(modelSalario.getData_pagamento());
            ValorAbertura13.setText(modelSalario.getHe_50()+"");
            ValorAbertura14.setText(modelSalario.getHe_100()+"");
            desabilitaHabilitaCamposSalario(true);
        }catch(Exception e){
        }
    }//GEN-LAST:event_jbAlterar5ActionPerformed
    private void jtfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisaActionPerformed
    }//GEN-LAST:event_jtfPesquisaActionPerformed
    private void jbPesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisa1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jTable3.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jTable3.setRowSorter(classificador);
        String texto = jtfPesquisa.getText().toUpperCase();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jbPesquisa1ActionPerformed
    private void ValorAbertura14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorAbertura14KeyTyped
    }//GEN-LAST:event_ValorAbertura14KeyTyped
    private void ValorAbertura14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAbertura14ActionPerformed
    }//GEN-LAST:event_ValorAbertura14ActionPerformed
    private void ValorAbertura14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ValorAbertura14FocusLost
    }//GEN-LAST:event_ValorAbertura14FocusLost
    private void ValorAbertura13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorAbertura13KeyTyped
    }//GEN-LAST:event_ValorAbertura13KeyTyped
    private void ValorAbertura13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAbertura13ActionPerformed
    }//GEN-LAST:event_ValorAbertura13ActionPerformed
    private void ValorAbertura13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ValorAbertura13FocusLost
    }//GEN-LAST:event_ValorAbertura13FocusLost
    private void validade13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validade13KeyTyped
    }//GEN-LAST:event_validade13KeyTyped
    private void validade13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validade13MouseClicked
    }//GEN-LAST:event_validade13MouseClicked
    private void validade13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validade13FocusLost
    }//GEN-LAST:event_validade13FocusLost
    private void ValorAbertura10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorAbertura10KeyTyped
        String caracteres="0987654321.,";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_ValorAbertura10KeyTyped
    private void ValorAbertura10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAbertura10ActionPerformed
    }//GEN-LAST:event_ValorAbertura10ActionPerformed
    private void ValorAbertura10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ValorAbertura10FocusLost
        ValorAbertura10.setText(BLm.converterVirgulaParaPonto(ValorAbertura10.getText()));
        ValorAbertura10.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(ValorAbertura10.getText())));
    }//GEN-LAST:event_ValorAbertura10FocusLost
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
        String date = sDate.format(todate7.getDate());
        DefaultTableModel modelo = (DefaultTableModel) jTable8.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        jTable8.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(date.trim(),3));
    }//GEN-LAST:event_btn7ActionPerformed
    private void jbNovo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovo6ActionPerformed
        this.desabilitaHabilitaCamposExtras(true);
        this.limparCamposExtras();
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovo6ActionPerformed
    private void jbCancelar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelar4ActionPerformed
        this.desabilitaHabilitaCamposExtras(false);
        this.limparCamposExtras();
    }//GEN-LAST:event_jbCancelar4ActionPerformed
    private void jbExcluir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluir4ActionPerformed
        int linha = jTable8.getSelectedRow();
        int codigoCliente = (int) jTable8.getValueAt(linha, 0);
        if(controllerExtras.excluirextrasController(codigoCliente)){
            JOptionPane.showMessageDialog(this, "Excluido com sucesso");
            this.carregarExtras();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir", "ERRO", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jbExcluir4ActionPerformed
    private void jbSalvar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvar4ActionPerformed
        if("".equals(ValorAbertura8.getText())){
            JOptionPane.showMessageDialog(this, "Valor não deve estar vazio", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        if(validade10.getDate() == null || validade11.getDate() == null){
            JOptionPane.showMessageDialog(this, "Data não foi selecionada", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        try{
            modelExtras.setId_extras(Integer.parseInt(this.codigo5.getText()));
        }catch(NumberFormatException e){}
        modelExtras.setMes_extras(this.jComboBox5.getSelectedItem().toString());
        //setando data Validade
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = formatter.format(validade10.getDate());
        String dataFormatada1 = formatter.format(validade11.getDate());
        try{
            java.sql.Date sqlDate = java.sql.Date.valueOf(dataFormatada); // Magic happens here!
            modelExtras.setData_validade(sqlDate);
        }catch(Exception e ){}
        try{
            java.sql.Date sqlDate1 = java.sql.Date.valueOf(dataFormatada1); // Magic happens here!
            modelExtras.setData_pagamento(sqlDate1);
        }catch(Exception e ){}
        modelExtras.setValor_extras(Float.parseFloat(ValorAbertura8.getText()));
        if(salvarAlterar.equals("salvar")){
            if(controllerExtras.salvarextrasController(modelExtras)>0){
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                //carregar os clientes na tabela
                carregarExtras();
                this.desabilitaHabilitaCamposAgua(false);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar ");
            }
        }else{
            if(controllerExtras.atualizarextrasController(modelExtras)){
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                carregarExtras();
                this.desabilitaHabilitaCamposAgua(false);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar");
            }
        }
    }//GEN-LAST:event_jbSalvar4ActionPerformed
    private void jbAlterar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterar4ActionPerformed
        try{
            int linha = jTable8.getSelectedRow();
            int codigoCliente = (int) jTable8.getValueAt(linha, 0);
            salvarAlterar = "alterar";
            jbSalvar.setEnabled(true);
            modelExtras = controllerExtras.getextrasController(codigoCliente);
            codigo5.setText(String.valueOf(modelExtras.getId_extras()));
            ValorAbertura8.setText(modelExtras.getValor_extras()+"");
            jComboBox5.setSelectedItem(modelExtras.getMes_extras());
            validade10.setDate(modelExtras.getData_validade());
            validade11.setDate(modelExtras.getData_pagamento());
            desabilitaHabilitaCamposExtras(true);
        }catch(Exception e){
        }
    }//GEN-LAST:event_jbAlterar4ActionPerformed
    private void ValorAbertura8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorAbertura8KeyTyped
        String caracteres="0987654321.,";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_ValorAbertura8KeyTyped
    private void ValorAbertura8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAbertura8ActionPerformed
    }//GEN-LAST:event_ValorAbertura8ActionPerformed
    private void ValorAbertura8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ValorAbertura8FocusLost
        ValorAbertura8.setText(BLm.converterVirgulaParaPonto(ValorAbertura8.getText()));
        ValorAbertura8.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(ValorAbertura8.getText())));
    }//GEN-LAST:event_ValorAbertura8FocusLost
    private void validade11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validade11KeyTyped
    }//GEN-LAST:event_validade11KeyTyped
    private void validade11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validade11MouseClicked
    }//GEN-LAST:event_validade11MouseClicked
    private void validade11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validade11FocusLost
    }//GEN-LAST:event_validade11FocusLost
    private void validade10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validade10KeyTyped
    }//GEN-LAST:event_validade10KeyTyped
    private void validade10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validade10MouseClicked
    }//GEN-LAST:event_validade10MouseClicked
    private void validade10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validade10FocusLost
    }//GEN-LAST:event_validade10FocusLost
    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
        String date = sDate.format(todate5.getDate());
        DefaultTableModel modelo = (DefaultTableModel) jTable7.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        jTable7.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(date.trim(),3));
    }//GEN-LAST:event_btn6ActionPerformed
    private void jbNovo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovo5ActionPerformed
        this.desabilitaHabilitaCamposAluguel(true);
        this.limparCamposAluguel();
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovo5ActionPerformed
    private void jbCancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelar3ActionPerformed
        this.desabilitaHabilitaCamposAluguel(false);
        this.limparCamposAluguel();
    }//GEN-LAST:event_jbCancelar3ActionPerformed
    private void jbExcluir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluir3ActionPerformed
        int linha = jTable7.getSelectedRow();
        int codigoCliente = (int) jTable7.getValueAt(linha, 0);
        if(controllerAluguel.excluirAluguelController(codigoCliente)){
            JOptionPane.showMessageDialog(this, "Excluido com sucesso");
            this.carregarAluguel();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir", "ERRO", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jbExcluir3ActionPerformed
    private void jbSalvar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvar3ActionPerformed
        if("".equals(ValorAbertura6.getText())){
            JOptionPane.showMessageDialog(this, "Valor não deve estar vazio", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        if(validade8.getDate() == null || validade9.getDate() == null){
            JOptionPane.showMessageDialog(this, "Data não foi selecionada", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        try{
            modelAluguel.setId_aluguel(Integer.parseInt(this.codigo4.getText()));
        }catch(NumberFormatException e){}
        modelAluguel.setMes_aluguel(this.jComboBox4.getSelectedItem().toString());
        //setando data Validade
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = formatter.format(validade8.getDate());
        String dataFormatada1 = formatter.format(validade9.getDate());
        try{
            java.sql.Date sqlDate = java.sql.Date.valueOf(dataFormatada); // Magic happens here!
            modelAluguel.setData_validade(sqlDate);
        }catch(Exception e ){}
        try{
            java.sql.Date sqlDate1 = java.sql.Date.valueOf(dataFormatada1); // Magic happens here!
            modelAluguel.setData_pagamento(sqlDate1);
        }catch(Exception e ){}
        modelAluguel.setValor_aluguel(Float.parseFloat(ValorAbertura6.getText()));
        if(salvarAlterar.equals("salvar")){
            if(controllerAluguel.salvarAluguelController(modelAluguel)>0){
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                carregarAluguel();
                this.desabilitaHabilitaCamposAluguel(false);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar ");
            }
        }else{
            if(controllerAluguel.atualizarAluguelController(modelAluguel)){
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                carregarAluguel();
                this.desabilitaHabilitaCamposAluguel(false);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar");
            }
        }
    }//GEN-LAST:event_jbSalvar3ActionPerformed
    private void jbAlterar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterar3ActionPerformed
        try{
            int linha = jTable7.getSelectedRow();
            int codigoCliente = (int) jTable7.getValueAt(linha, 0);
            salvarAlterar = "alterar";
            jbSalvar.setEnabled(true);
            modelAluguel = controllerAluguel.getAluguelController(codigoCliente);
            codigo4.setText(String.valueOf(modelAluguel.getId_aluguel()));
            ValorAbertura6.setText(modelAluguel.getValor_aluguel()+"");
            jComboBox4.setSelectedItem(modelAluguel.getMes_aluguel());
            validade8.setDate(modelAluguel.getData_validade());
            validade9.setDate(modelAluguel.getData_pagamento());
            desabilitaHabilitaCamposAluguel(true);
        }catch(Exception e){
        }
    }//GEN-LAST:event_jbAlterar3ActionPerformed
    private void validade9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validade9KeyTyped
    }//GEN-LAST:event_validade9KeyTyped
    private void validade9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validade9MouseClicked
    }//GEN-LAST:event_validade9MouseClicked
    private void validade9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validade9FocusLost
    }//GEN-LAST:event_validade9FocusLost
    private void validade8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validade8KeyTyped
    }//GEN-LAST:event_validade8KeyTyped
    private void validade8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validade8MouseClicked
    }//GEN-LAST:event_validade8MouseClicked
    private void validade8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validade8FocusLost
    }//GEN-LAST:event_validade8FocusLost
    private void ValorAbertura6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorAbertura6KeyTyped
        String caracteres="0987654321.,";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_ValorAbertura6KeyTyped
    private void ValorAbertura6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAbertura6ActionPerformed
    }//GEN-LAST:event_ValorAbertura6ActionPerformed
    private void ValorAbertura6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ValorAbertura6FocusLost
        ValorAbertura6.setText(BLm.converterVirgulaParaPonto(ValorAbertura6.getText()));
        ValorAbertura6.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(ValorAbertura6.getText())));
    }//GEN-LAST:event_ValorAbertura6FocusLost
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
        String date = sDate.format(todate6.getDate());
        DefaultTableModel modelo = (DefaultTableModel) jTable6.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        jTable6.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(date.trim(),3));
    }//GEN-LAST:event_btn5ActionPerformed
    private void jbNovo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovo4ActionPerformed
        this.desabilitaHabilitaCamposTelefone(true);
        this.limparCamposTelefone();
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovo4ActionPerformed
    private void jbCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelar2ActionPerformed
        this.desabilitaHabilitaCamposTelefone(false);
        this.limparCamposTelefone();
    }//GEN-LAST:event_jbCancelar2ActionPerformed
    private void jbExcluir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluir2ActionPerformed
        int linha = jTable6.getSelectedRow();
        int codigoCliente = (int) jTable6.getValueAt(linha, 0);
        if(controllerTelefone.excluirtelefoneController(codigoCliente)){
            JOptionPane.showMessageDialog(this, "Excluido com sucesso");
            this.carregarTelefone();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir", "ERRO", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jbExcluir2ActionPerformed
    private void jbSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvar2ActionPerformed
        if("".equals(ValorAbertura4.getText())){
            JOptionPane.showMessageDialog(this, "Valor não deve estar vazio", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        if(validade6.getDate() == null || validade7.getDate() == null){
            JOptionPane.showMessageDialog(this, "Data não foi selecionada", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        try{
            modelTelefone.setId_telefone(Integer.parseInt(this.codigo3.getText()));
        }catch(NumberFormatException e){}
        modelTelefone.setMes_telefone(this.jComboBox3.getSelectedItem().toString());
        //setando data Validade
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = formatter.format(validade6.getDate());
        String dataFormatada1 = formatter.format(validade7.getDate());
        try{
            java.sql.Date sqlDate = java.sql.Date.valueOf(dataFormatada); // Magic happens here!
            modelTelefone.setData_validade(sqlDate);
        }catch(Exception e ){}
        try{
            java.sql.Date sqlDate1 = java.sql.Date.valueOf(dataFormatada1); // Magic happens here!
            modelTelefone.setData_pagamento(sqlDate1);
        }catch(Exception e ){}
        modelTelefone.setValor_telefone(Float.parseFloat(ValorAbertura4.getText()));
        if(salvarAlterar.equals("salvar")){
            if(controllerTelefone.salvartelefoneController(modelTelefone)>0){
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                //carregar os clientes na tabela
                carregarTelefone();
                this.desabilitaHabilitaCamposTelefone(false);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar ");
            }
        }else{
            if(controllerTelefone.atualizartelefoneController(modelTelefone)){
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                //carregar os clientes na tabela
                carregarTelefone();
                this.desabilitaHabilitaCamposTelefone(false);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar");
            }
        }
    }//GEN-LAST:event_jbSalvar2ActionPerformed
    private void jbAlterar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterar2ActionPerformed
        try{
            int linha = jTable6.getSelectedRow();
            int codigoCliente = (int) jTable6.getValueAt(linha, 0);
            salvarAlterar = "alterar";
            jbSalvar.setEnabled(true);
            modelTelefone = controllerTelefone.gettelefoneController(codigoCliente);

            codigo3.setText(String.valueOf(modelTelefone.getId_telefone()));
            ValorAbertura4.setText(modelTelefone.getValor_telefone()+"");
            jComboBox3.setSelectedItem(modelTelefone.getMes_telefone());
            validade6.setDate(modelTelefone.getData_validade());
            validade7.setDate(modelTelefone.getData_pagamento());
            desabilitaHabilitaCamposTelefone(true);
        }catch(Exception e){
        }
    }//GEN-LAST:event_jbAlterar2ActionPerformed
    private void validade7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validade7KeyTyped
    }//GEN-LAST:event_validade7KeyTyped
    private void validade7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validade7MouseClicked
    }//GEN-LAST:event_validade7MouseClicked
    private void validade7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validade7FocusLost
    }//GEN-LAST:event_validade7FocusLost
    private void validade6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validade6KeyTyped
    }//GEN-LAST:event_validade6KeyTyped
    private void validade6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validade6MouseClicked
    }//GEN-LAST:event_validade6MouseClicked
    private void validade6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validade6FocusLost
    }//GEN-LAST:event_validade6FocusLost
    private void ValorAbertura4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorAbertura4KeyTyped
        String caracteres="0987654321.,";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_ValorAbertura4KeyTyped
    private void ValorAbertura4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAbertura4ActionPerformed
    }//GEN-LAST:event_ValorAbertura4ActionPerformed
    private void ValorAbertura4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ValorAbertura4FocusLost
        ValorAbertura4.setText(BLm.converterVirgulaParaPonto(ValorAbertura4.getText()));
        ValorAbertura4.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(ValorAbertura4.getText())));
    }//GEN-LAST:event_ValorAbertura4FocusLost
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
        String date = sDate.format(todate4.getDate());
        DefaultTableModel modelo = (DefaultTableModel) jTable5.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        jTable5.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(date.trim(),3));
    }//GEN-LAST:event_btn4ActionPerformed
    private void jbNovo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovo3ActionPerformed
        this.desabilitaHabilitaCamposLuz(true);
        this.limparCamposLuz();
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovo3ActionPerformed
    private void jbCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelar1ActionPerformed
        this.desabilitaHabilitaCamposLuz(false);
        this.limparCamposLuz();
    }//GEN-LAST:event_jbCancelar1ActionPerformed
    private void jbExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluir1ActionPerformed
        int linha = jTable5.getSelectedRow();
        int codigoCliente = (int) jTable5.getValueAt(linha, 0);
        if(controllerEnergia.excluirenergiaController(codigoCliente)){
            JOptionPane.showMessageDialog(this, "Excluido com sucesso");
            this.carregarLuz();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir", "ERRO", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jbExcluir1ActionPerformed
    private void jbSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvar1ActionPerformed
        if("".equals(ValorAbertura2.getText())){
            JOptionPane.showMessageDialog(this, "Valor não deve estar vazio", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        if(validade4.getDate() == null || validade5.getDate() == null){
            JOptionPane.showMessageDialog(this, "Data não foi selecionada", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        try{
            modelEnergia.setId_energia(Integer.parseInt(this.codigo2.getText()));
        }catch(NumberFormatException e){}
        modelEnergia.setMes_energia(this.jComboBox2.getSelectedItem().toString());
        //setando data Validade
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = formatter.format(validade4.getDate());
        String dataFormatada1 = formatter.format(validade5.getDate());
        try{
            java.sql.Date sqlDate = java.sql.Date.valueOf(dataFormatada); // Magic happens here!
            modelEnergia.setData_validade(sqlDate);
        }catch(Exception e ){}
        try{
            java.sql.Date sqlDate1 = java.sql.Date.valueOf(dataFormatada1); // Magic happens here!
            modelEnergia.setData_pagamento(sqlDate1);
        }catch(Exception e ){}
        modelEnergia.setValor_energia(Float.parseFloat(ValorAbertura2.getText()));
        if(salvarAlterar.equals("salvar")){
            if(controllerEnergia.salvarenergiaController(modelEnergia)>0){
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                //carregar os clientes na tabela
                carregarLuz();
                this.desabilitaHabilitaCamposLuz(false);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar" );
            }
        }else{
            if(controllerEnergia.atualizarenergiaController(modelEnergia)){
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                //carregar os clientes na tabela
                carregarLuz();
                this.desabilitaHabilitaCamposLuz(false);
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar");
            }
        }
    }//GEN-LAST:event_jbSalvar1ActionPerformed

    private void jbAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterar1ActionPerformed
        try{
            int linha = jTable5.getSelectedRow();
            int codigoCliente = (int) jTable5.getValueAt(linha, 0);
            salvarAlterar = "alterar";
            jbSalvar.setEnabled(true);
            modelEnergia = controllerEnergia.getenergiaController(codigoCliente);
            codigo2.setText(String.valueOf(modelEnergia.getId_energia()));
            ValorAbertura2.setText(modelEnergia.getValor_energia()+"");
            jComboBox2.setSelectedItem(modelEnergia.getMes_energia());
            validade4.setDate(modelEnergia.getData_validade());
            validade5.setDate(modelEnergia.getData_pagamento());
            desabilitaHabilitaCamposLuz(true);
        }catch(Exception e){
        }
    }//GEN-LAST:event_jbAlterar1ActionPerformed
    private void validade5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validade5KeyTyped
    }//GEN-LAST:event_validade5KeyTyped
    private void validade5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validade5MouseClicked
    }//GEN-LAST:event_validade5MouseClicked
    private void validade5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validade5FocusLost
    }//GEN-LAST:event_validade5FocusLost
    private void validade4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validade4KeyTyped
    }//GEN-LAST:event_validade4KeyTyped
    private void validade4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validade4MouseClicked
    }//GEN-LAST:event_validade4MouseClicked
    private void validade4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validade4FocusLost
    }//GEN-LAST:event_validade4FocusLost
    private void ValorAbertura2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorAbertura2KeyTyped
        String caracteres="0987654321.,";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_ValorAbertura2KeyTyped
    private void ValorAbertura2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAbertura2ActionPerformed
    }//GEN-LAST:event_ValorAbertura2ActionPerformed
    private void ValorAbertura2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ValorAbertura2FocusLost
        ValorAbertura2.setText(BLm.converterVirgulaParaPonto(ValorAbertura2.getText()));
        ValorAbertura2.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(ValorAbertura2.getText())));
    }//GEN-LAST:event_ValorAbertura2FocusLost
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
        String date = sDate.format(todate3.getDate());
        DefaultTableModel modelo = (DefaultTableModel) jTable4.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        jTable4.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(date.trim(),3));
    }//GEN-LAST:event_btn3ActionPerformed
    private void jbNovo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovo2ActionPerformed
        this.desabilitaHabilitaCamposAgua(true);
        this.limparCamposAgua();
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovo2ActionPerformed
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.desabilitaHabilitaCamposAgua(false);
        this.limparCamposAgua();
    }//GEN-LAST:event_jbCancelarActionPerformed
    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = jTable4.getSelectedRow();
        int codigoCliente = (int) jTable4.getValueAt(linha, 0);
        if(controllerAgua.excluirAguaController(codigoCliente)){
            JOptionPane.showMessageDialog(this, "Excluido com sucesso");
            this.carregarAgua();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir", "ERRO", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jbExcluirActionPerformed
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if("".equals(ValorAbertura.getText())){
            JOptionPane.showMessageDialog(this, "Valor não deve estar vazio", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        if(validade2.getDate() == null || validade3.getDate() == null){
            JOptionPane.showMessageDialog(this, "Data não foi selecionada", "ERRO", JOptionPane.ERROR_MESSAGE );
            return;
        }
        try{
            modelagua.setId_agua(Integer.parseInt(this.codigo1.getText()));
        }catch(NumberFormatException e){}
        modelagua.setMes_agua(this.jComboBox1.getSelectedItem().toString());
        //setando data Validade
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = formatter.format(validade2.getDate());
        String dataFormatada1 = formatter.format(validade3.getDate());
        try{
            java.sql.Date sqlDate = java.sql.Date.valueOf(dataFormatada); // Magic happens here!
            modelagua.setData_validade(sqlDate);
        }catch(Exception e ){}
        try{
            java.sql.Date sqlDate1 = java.sql.Date.valueOf(dataFormatada1); // Magic happens here!
            modelagua.setData_pagamento(sqlDate1);
        }catch(Exception e ){}
        modelagua.setValor_agua(Float.parseFloat(ValorAbertura.getText()));
        if(salvarAlterar.equals("salvar")){
            if(controllerAgua.salvarAguaController(modelagua)>0){
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                //carregar os clientes na tabela
                carregarAgua();
                this.desabilitaHabilitaCamposAgua(false);
                this.limparCamposAgua();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar ");
            }
        }else{
            if(controllerAgua.atualizarAguaController(modelagua)){
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                //carregar os clientes na tabela
                carregarAgua();
                this.desabilitaHabilitaCamposAgua(false);
                this.limparCamposAgua();
            }else{
                JOptionPane.showMessageDialog(this, "Erro ao salvar");
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed
    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        try{
            int linha = jTable4.getSelectedRow();
            int codigoCliente = (int) jTable4.getValueAt(linha, 0);
            salvarAlterar = "alterar";
            jbSalvar.setEnabled(true);
            modelagua = controllerAgua.getAguaController(codigoCliente);
            codigo1.setText(String.valueOf(modelagua.getId_agua()));
            ValorAbertura.setText(modelagua.getValor_agua()+"");
            jComboBox1.setSelectedItem(modelagua.getMes_agua());
            validade2.setDate(modelagua.getData_validade());
            validade3.setDate(modelagua.getData_pagamento());
            desabilitaHabilitaCamposAgua(true);
        }catch(Exception e){
        }
    }//GEN-LAST:event_jbAlterarActionPerformed
    private void ValorAberturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorAberturaKeyTyped
        String caracteres="0987654321.,";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_ValorAberturaKeyTyped
    private void ValorAberturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAberturaActionPerformed
    }//GEN-LAST:event_ValorAberturaActionPerformed
    private void ValorAberturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ValorAberturaFocusLost
        ValorAbertura.setText(BLm.converterVirgulaParaPonto(ValorAbertura.getText()));
        ValorAbertura.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(ValorAbertura.getText())));
    }//GEN-LAST:event_ValorAberturaFocusLost
    private void validade3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validade3KeyTyped
    }//GEN-LAST:event_validade3KeyTyped
    private void validade3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validade3MouseClicked
    }//GEN-LAST:event_validade3MouseClicked
    private void validade3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validade3FocusLost
    }//GEN-LAST:event_validade3FocusLost
    private void validade2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validade2KeyTyped
    }//GEN-LAST:event_validade2KeyTyped
    private void validade2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validade2MouseClicked
    }//GEN-LAST:event_validade2MouseClicked
    private void validade2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validade2FocusLost
    }//GEN-LAST:event_validade2FocusLost
    private void limparCamposAgua(){
        codigo1.setText("");
        ValorAbertura.setText("");
    }
    private void limparCamposLuz(){
        codigo2.setText("");
        ValorAbertura2.setText("");
    }     
    private void limparCamposTelefone(){
        codigo3.setText("");
        ValorAbertura4.setText("");
    }          
      private void limparCamposAluguel(){
       codigo4.setText("");
       ValorAbertura6.setText("");
    }
     private void limparCamposExtras(){
        codigo5.setText("");
        ValorAbertura8.setText("");
    }                  
    private void limparCamposSalario(){
        codigo6.setText("");
        ValorAbertura12.setText("");
        ValorAbertura13.setText("");
        ValorAbertura14.setText("");
        ValorAbertura10.setText("");
        jtfPesquisa.setText("");
    }
    private void desabilitaHabilitaCamposAgua(boolean condicao){
        jComboBox1.setEnabled(condicao);
        ValorAbertura.setEnabled(condicao);
        validade2.setEnabled(condicao);
        validade3.setEnabled(condicao);
        jbSalvar.setEnabled(condicao);
    }
     private void desabilitaHabilitaCamposLuz(boolean condicao){
        jComboBox2.setEnabled(condicao);
        ValorAbertura2.setEnabled(condicao);
        validade4.setEnabled(condicao);
        validade5.setEnabled(condicao);
        jbSalvar1.setEnabled(condicao);
    }
     private void desabilitaHabilitaCamposTelefone(boolean condicao){
        jComboBox3.setEnabled(condicao);
        ValorAbertura4.setEnabled(condicao);
        validade6.setEnabled(condicao);
        validade7.setEnabled(condicao);
        jbSalvar2.setEnabled(condicao);
    }
      private void desabilitaHabilitaCamposAluguel(boolean condicao){
        jComboBox4.setEnabled(condicao);
        ValorAbertura6.setEnabled(condicao);
        validade8.setEnabled(condicao);
        validade9.setEnabled(condicao);
        jbSalvar3.setEnabled(condicao);
     }
      private void desabilitaHabilitaCamposExtras(boolean condicao){
        jComboBox5.setEnabled(condicao);
        ValorAbertura8.setEnabled(condicao);
        validade10.setEnabled(condicao);
        validade11.setEnabled(condicao);
        jbSalvar4.setEnabled(condicao);
    }
      private void desabilitaHabilitaCamposSalario(boolean condicao){
        ValorAbertura12.setEnabled(condicao);
        ValorAbertura13.setEnabled(condicao);
        ValorAbertura14.setEnabled(condicao);
        ValorAbertura10.setEnabled(condicao);
        validade13.setEnabled(condicao);
        jComboBox6.setEnabled(condicao);
        ValorAbertura15.setEnabled(condicao);
        jbSalvar5.setEnabled(condicao);
    }
      private void carregarAgua(){
        listaAgua = controllerAgua.getListaAguaController();
        DefaultTableModel modelo = (DefaultTableModel) jTable4.getModel();    
        int cont = listaAgua.size();
        modelo.setNumRows(0);
        for(int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
            listaAgua.get(i).getId_agua(),
            listaAgua.get(i).getMes_agua(),
            listaAgua.get(i).getData_validade(),
            listaAgua.get(i).getData_pagamento(),
            listaAgua.get(i).getValor_agua(),
            });
        }
    }
      private void carregarLuz(){
        DefaultTableModel modelo = (DefaultTableModel) jTable5.getModel();
        listaEnergia = controllerEnergia.getListaenergiaController();
        int cont = listaEnergia.size();
        modelo.setNumRows(0);
        for(int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
            listaEnergia.get(i).getId_energia(),
            listaEnergia.get(i).getMes_energia(),
            listaEnergia.get(i).getData_validade(),
            listaEnergia.get(i).getData_pagamento(),
            listaEnergia.get(i).getValor_energia(),    
        });    
        }
        }
        private void carregarTelefone(){
            DefaultTableModel modelo = (DefaultTableModel) jTable6.getModel();
            listaTelefone = controllerTelefone.getListatelefoneController();
            int cont = listaTelefone.size();
            modelo.setNumRows(0);
            for(int i = 0; i < cont; i++){
                modelo.addRow(new Object[]{
                listaTelefone.get(i).getId_telefone(),
                listaTelefone.get(i).getMes_telefone(),
                listaTelefone.get(i).getData_validade(),
                listaTelefone.get(i).getData_pagamento(),
                listaTelefone.get(i).getValor_telefone(),
                });
            }
        }
       
       private void carregarAluguel(){
         DefaultTableModel modelo = (DefaultTableModel) jTable7.getModel();
         listaAluguel = controllerAluguel.getListaAluguelController();
        
         int cont = listaAluguel.size();
         modelo.setNumRows(0);
         for(int i = 0; i < cont; i++){
           
            modelo.addRow(new Object[]{
            listaAluguel.get(i).getId_aluguel(),
            listaAluguel.get(i).getMes_aluguel(),
            listaAluguel.get(i).getData_validade(),
            listaAluguel.get(i).getData_pagamento(),
            listaAluguel.get(i).getValor_aluguel(),
        });
        }
       }
        private void listarFuncionario(){
            listaModelusu = controllerUsuario.getListaUsuarioController();
            jComboBox6.removeAllItems();
            for (int i = 0; i < listaModelusu.size(); i++){
                jComboBox6.addItem(listaModelusu.get(i).getIdUsuario()+"");
            }
        }
        private void carregarExtras(){
            DefaultTableModel modelo = (DefaultTableModel) jTable8.getModel();
            listaExtras = controllerExtras.getListaextrasController();
            int cont = listaExtras.size();
            modelo.setNumRows(0);
            for(int i = 0; i < cont; i++){
                modelo.addRow(new Object[]{
                listaExtras.get(i).getId_extras(),
                listaExtras.get(i).getMes_extras(),
                listaExtras.get(i).getData_validade(),
                listaExtras.get(i).getData_pagamento(),
                listaExtras.get(i).getValor_extras(), 
                });
            }
        }
        private void carregarSalario(){
        DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
        listaSalario = controllerSalario.getListasalarioController();
        int cont = listaSalario.size();
        modelo.setNumRows(0);
        for(int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
            listaSalario.get(i).getId_salario(),
            listaSalario.get(i).getFk_funcionario(),
            listaSalario.get(i).getData_pagamento(),
            listaSalario.get(i).getValor_salario_hora(),
            listaSalario.get(i).getTotal_salario_mes(),
        });
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
            java.util.logging.Logger.getLogger(ViewDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDespesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDespesas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ValorAbertura;
    private javax.swing.JFormattedTextField ValorAbertura10;
    private javax.swing.JTextField ValorAbertura12;
    private javax.swing.JFormattedTextField ValorAbertura13;
    private javax.swing.JFormattedTextField ValorAbertura14;
    private javax.swing.JFormattedTextField ValorAbertura15;
    private javax.swing.JFormattedTextField ValorAbertura2;
    private javax.swing.JFormattedTextField ValorAbertura4;
    private javax.swing.JFormattedTextField ValorAbertura6;
    private javax.swing.JFormattedTextField ValorAbertura8;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JTextField codigo1;
    private javax.swing.JTextField codigo2;
    private javax.swing.JTextField codigo3;
    private javax.swing.JTextField codigo4;
    private javax.swing.JTextField codigo5;
    private javax.swing.JTextField codigo6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private com.toedter.calendar.JMonthChooserBeanInfo jMonthChooserBeanInfo1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAlterar1;
    private javax.swing.JButton jbAlterar2;
    private javax.swing.JButton jbAlterar3;
    private javax.swing.JButton jbAlterar4;
    private javax.swing.JButton jbAlterar5;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCancelar1;
    private javax.swing.JButton jbCancelar2;
    private javax.swing.JButton jbCancelar3;
    private javax.swing.JButton jbCancelar4;
    private javax.swing.JButton jbCancelar5;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbExcluir1;
    private javax.swing.JButton jbExcluir2;
    private javax.swing.JButton jbExcluir3;
    private javax.swing.JButton jbExcluir4;
    private javax.swing.JButton jbExcluir5;
    private javax.swing.JButton jbNovo2;
    private javax.swing.JButton jbNovo3;
    private javax.swing.JButton jbNovo4;
    private javax.swing.JButton jbNovo5;
    private javax.swing.JButton jbNovo6;
    private javax.swing.JButton jbNovo7;
    private javax.swing.JButton jbPesquisa1;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JButton jbSalvar1;
    private javax.swing.JButton jbSalvar2;
    private javax.swing.JButton jbSalvar3;
    private javax.swing.JButton jbSalvar4;
    private javax.swing.JButton jbSalvar5;
    private javax.swing.JTextField jtfPesquisa;
    private com.toedter.calendar.JDateChooser todate3;
    private com.toedter.calendar.JDateChooser todate4;
    private com.toedter.calendar.JDateChooser todate5;
    private com.toedter.calendar.JDateChooser todate6;
    private com.toedter.calendar.JDateChooser todate7;
    private com.toedter.calendar.JDateChooser validade10;
    private com.toedter.calendar.JDateChooser validade11;
    private com.toedter.calendar.JDateChooser validade13;
    private com.toedter.calendar.JDateChooser validade2;
    private com.toedter.calendar.JDateChooser validade3;
    private com.toedter.calendar.JDateChooser validade4;
    private com.toedter.calendar.JDateChooser validade5;
    private com.toedter.calendar.JDateChooser validade6;
    private com.toedter.calendar.JDateChooser validade7;
    private com.toedter.calendar.JDateChooser validade8;
    private com.toedter.calendar.JDateChooser validade9;
    // End of variables declaration//GEN-END:variables
}
