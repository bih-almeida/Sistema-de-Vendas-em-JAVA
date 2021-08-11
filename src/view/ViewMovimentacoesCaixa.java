package view;
import DAO.DAOVendas;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowFilter.ComparisonType;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.ModelAgua;
import model.ModelAluguel;
import model.ModelCaixa;
import model.ModelEnergia;
import model.ModelExtras;
import model.ModelProdutosVendasProdutos;
import model.ModelSalario;
import model.ModelSangria;
import model.ModelTelefone;
import model.ModelUsuario;
import model.ModelVendas;
import model.ModelVendasClientes;
import util.BLMascaras;
public class ViewMovimentacoesCaixa extends javax.swing.JFrame {
    ControllerVendasCliente controllerVendasCliente = new ControllerVendasCliente();
    ControllerAgua controllerAgua = new ControllerAgua();
    ControllerCaixa controllerCaixa = new ControllerCaixa();
    ControllerProdutosVendasProdutos controllerProdutosVendasProdutos = new ControllerProdutosVendasProdutos();
    ControllerSangria controllersangria = new ControllerSangria();
    ControllerVendas controllerVendas = new ControllerVendas();
    Controllerenergia controllerEnergia = new Controllerenergia();
    Controllertelefone controllerTelefone = new Controllertelefone();
    ControllerAluguel controllerAluguel = new ControllerAluguel();
    Controllerextras controllerExtras = new Controllerextras();
    Controllersalario controllerSalario = new Controllersalario();
    ControllerUsuario controllerUsuario = new ControllerUsuario();
    ModelVendas modelVendas = new ModelVendas();
    ModelSangria modelsangria = new ModelSangria();
    ArrayList<ModelVendasClientes> listaModelVendasClientes = new ArrayList<>();
    ArrayList<ModelSangria> listaSangria = new ArrayList<>();
    ArrayList<ModelVendas> listaModelVendases = new ArrayList<>();
    ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutoses = new ArrayList<>();
    ArrayList<ModelCaixa> listaCaixa = new ArrayList<>();
    ArrayList<ModelUsuario> listaUsu = new ArrayList<>();
    BLMascaras BLm = new BLMascaras();
    private ViewVisualizarConta viewVisualizarConta;
    public ViewMovimentacoesCaixa() {
        initComponents();
        carregarMovimentos();
        carregarSANGRIA();
        setLocationRelativeTo(null);
        carregarCaixa();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        total3 = new javax.swing.JFormattedTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        total2 = new javax.swing.JFormattedTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        total4 = new javax.swing.JFormattedTextField();
        jbAbrirCaixa6 = new javax.swing.JButton();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jPanel3 = new javax.swing.JPanel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        total0 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        aaa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fromdate01 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        todate01 = new com.toedter.calendar.JDateChooser();
        btn01 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        dateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        total1 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        dateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton7 = new javax.swing.JButton();
        eee = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimentações");

        jPanel14.setBackground(new java.awt.Color(0, 204, 0));

        jLabel75.setText("Total Mensal: R$");

        total3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                total3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                total3FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(total3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(total3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(0, 204, 0));

        jLabel74.setText("Total de Despesas: R$");

        total2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                total2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                total2FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(total2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(total2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 204, 0));

        jLabel11.setText("Total de Vendas: R$");

        total4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                total4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                total4FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(total4)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(total4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jbAbrirCaixa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-selecionado-50.png"))); // NOI18N
        jbAbrirCaixa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAbrirCaixa6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jbAbrirCaixa6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbAbrirCaixa6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMonthChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fluxo de Caixa", jPanel7);

        jButton1.setText("Definir pela data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código da Venda", "Código do Cliente", "Data", "Valor", "Código do Caixa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(0, 204, 0));

        jLabel4.setText("Valor Total:R$");

        total0.setEditable(false);
        total0.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                total0FocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total0, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(total0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-melting-ice-cream-50.png"))); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-impressão-50.png"))); // NOI18N
        jButton5.setText("Imprimir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 204, 0));

        jLabel5.setText("Código para Visualizar Conta:");

        aaa.setEditable(false);
        aaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aaaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Após:");

        jLabel10.setText("Até:");

        btn01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pesquisar-50.png"))); // NOI18N
        btn01.setToolTipText("");
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromdate01, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(todate01, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fromdate01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10))
                                .addComponent(todate01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Movimentações Vendas", jPanel3);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Valor", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-melting-ice-cream-50.png"))); // NOI18N

        jButton4.setText("Definir pela data");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 204, 0));

        total1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                total1FocusGained(evt);
            }
        });

        jLabel9.setText("Valor Total: R$");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 193, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Movimentações Sangria", jPanel1);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Caixa", "Data de Abertura", "Data de Fechamento", "Código Usuário", "Valor de Abertura"
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-melting-ice-cream-50.png"))); // NOI18N

        jButton7.setText("Definir pela data de Abertura");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Definir pelo Código do caixa");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(eee, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(dateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)))
                .addContainerGap(507, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(eee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addContainerGap(263, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jLabel2)
                    .addGap(38, 38, 38)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Informações Caixa", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
        String date = sDate.format(dateChooser1.getDate());
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        jTable2.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(date.trim()));
        total1.setText(somaValorTotal1()+"");
    }//GEN-LAST:event_jButton4ActionPerformed
    private void aaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aaaActionPerformed
    }//GEN-LAST:event_aaaActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
        String date = sDate.format(dateChooser.getDate());
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(date.trim()));
        total0.setText(somaValorTotal()+"");
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
        String date = sDate.format(dateChooser2.getDate());
        DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        jTable3.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(date.trim(), 1));
    }//GEN-LAST:event_jButton7ActionPerformed
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String date = eee.getText();
        DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        jTable3.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(date.trim(), 0));
    }//GEN-LAST:event_jButton8ActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
           int linha = jTable1.getSelectedRow();
           int codigoVenda = (int) jTable1.getValueAt(linha, 0);
           final ViewAguarde carregando = new ViewAguarde();
           carregando.setVisible(true);
           Thread t = new Thread(){
           public void run(){
                try{
                   controllerVendas.gerarRelatorioMovimentosVendas(codigoVenda);
                   carregando.dispose();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao gerar Relatório! /n "+e, "Erro", JOptionPane.ERROR_MESSAGE);
                }
           }
           };
           t.start(); 
    }//GEN-LAST:event_jButton5ActionPerformed
    private void total0FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_total0FocusGained
       total0.setText(BLm.converterVirgulaParaPonto(total0.getText()));
       total0.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total0.getText())));
    }//GEN-LAST:event_total0FocusGained
    private void total1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_total1FocusGained
        total1.setText(BLm.converterVirgulaParaPonto(total1.getText()));
        total1.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total1.getText())));
    }//GEN-LAST:event_total1FocusGained
    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        Date date = fromdate01.getDate();
        Date date1 = todate01.getDate();       
        Set<RowFilter<Object, Object>> filtrosTabela = new HashSet<>();
                if (date() != null) {
                    Set<RowFilter<Object, Object>> datas = new HashSet<>();
                    datas.add(RowFilter.dateFilter(RowFilter.ComparisonType.EQUAL,date, 2));
                    datas.add(RowFilter.dateFilter(RowFilter.ComparisonType.AFTER,date, 2));
                    filtrosTabela.add(RowFilter.orFilter(datas));
		}
                if (date1 != null) {
                    Set<RowFilter<Object, Object>> datas = new HashSet<>();
                    datas.add(RowFilter.dateFilter(RowFilter.ComparisonType.BEFORE,date1, 2));
                    datas.add(RowFilter.dateFilter(RowFilter.ComparisonType.EQUAL,date1, 2));
                    filtrosTabela.add(RowFilter.orFilter(datas));
		}
// outros filtros.....
DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(modelo);
jTable1.setRowSorter(tr);     
tr.setRowFilter(RowFilter.andFilter(filtrosTabela));
total0.setText(somaValorTotal()+"");
    }//GEN-LAST:event_btn01ActionPerformed
    private void total3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_total3FocusGained
        total3.setText(BLm.converterVirgulaParaPonto(total3.getText()));
        total3.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total3.getText())));
    }//GEN-LAST:event_total3FocusGained
    private void total3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_total3FocusLost
        total3.setText(BLm.converterVirgulaParaPonto(total3.getText()));
        total3.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total3.getText())));
    }//GEN-LAST:event_total3FocusLost
    private void total2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_total2FocusGained
        total2.setText(BLm.converterVirgulaParaPonto(total2.getText()));
        total2.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total2.getText())));
    }//GEN-LAST:event_total2FocusGained
    private void total2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_total2FocusLost
        total2.setText(BLm.converterVirgulaParaPonto(total2.getText()));
        total2.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total2.getText())));
    }//GEN-LAST:event_total2FocusLost
    private void total4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_total4FocusGained
        total1.setText(BLm.converterVirgulaParaPonto(total1.getText()));
        total1.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total1.getText())));
    }//GEN-LAST:event_total4FocusGained
    private void total4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_total4FocusLost
        total1.setText(BLm.converterVirgulaParaPonto(total1.getText()));
        total1.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total1.getText())));
    }//GEN-LAST:event_total4FocusLost
    private void jbAbrirCaixa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAbrirCaixa6ActionPerformed
        int date = jYearChooser1.getYear();
        int date1 = jMonthChooser1.getMonth()+1;
        ModelVendas model = controllerVendas.getVendas1Controller(date, date1);
        total4.setText(String.valueOf(model.getVenValorLiquido()));
        //pegar valor referente a aquela data agua
        ModelAgua modelagua1 = controllerAgua.getAgua1Controller(date, date1);
        ModelEnergia energia1 = controllerEnergia.getenergia1Controller(date, date1);
        ModelTelefone telefone1 = controllerTelefone.gettelefone1Controller(date, date1);
        ModelAluguel aluguel1 = controllerAluguel.getAluguel1Controller(date, date1);
        ModelExtras extras1 = controllerExtras.getextras1Controller(date, date1);
        ModelSalario salario1 = controllerSalario.getsalario1Controller(date, date1);
        float agua = modelagua1.getValor_agua();
        float energia = energia1.getValor_energia();
        float telefone = telefone1.getValor_telefone();
        float aluguel = aluguel1.getValor_aluguel();
        float extras = extras1.getValor_extras();
        float salario = salario1.getTotal_salario_mes();
        float totalDespesa = agua + energia + telefone + aluguel + extras + salario;
        String totalVendas = total4.getText();
        float lucro = Float.parseFloat(totalVendas) - totalDespesa;
        total2.setText(totalDespesa+"");
        total3.setText(lucro+"");
        total3.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total3.getText())));
        total2.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total2.getText())));
        total4.setText(BLm.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total4.getText())));
    }//GEN-LAST:event_jbAbrirCaixa6ActionPerformed
        private void carregarSANGRIA(){
            DefaultTableModel modelo1 = (DefaultTableModel) jTable2.getModel();
            listaSangria = controllersangria.getListaSangriaController();
            int cont = listaSangria.size();
        modelo1.setNumRows(0);
        for(int i = 0; i < cont; i++){
            modelo1.addRow(new Object[]{
            listaSangria.get(i).getPk_sangria(),    
            listaSangria.get(i).getValor_sangria(),
            listaSangria.get(i).getDate_sangria(),
            }); 
            total1.setText(somaValorTotal1()+"");
        }
        }
        private void carregarMovimentos(){
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            listaModelVendases = controllerVendas.getListaVendasController();
            int cont = listaModelVendases.size();
            modelo.setNumRows(0);
            for(int i = 0; i < cont; i++){
                modelo.addRow(new Object[]{
                listaModelVendases.get(i).getIdVenda(),
                listaModelVendases.get(i).getCliente(),
                listaModelVendases.get(i).getVenDataVenda(),
                listaModelVendases.get(i).getVenValorLiquido(),
                listaModelVendases.get(i).getIdCaixa(),        
                });
            total0.setText(somaValorTotal()+"");
            } 
    }
        private void carregarCaixa(){
        DefaultTableModel modelo = (DefaultTableModel) jTable3.getModel();
        listaCaixa = controllerCaixa.getListaCaixaController();
        int cont = listaCaixa.size();
        modelo.setNumRows(0);
        for(int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
            listaCaixa.get(i).getPk_caixa(),
            listaCaixa.get(i).getData_abertura(),
            listaCaixa.get(i).getData_fechamento(),
            listaCaixa.get(i).getFk_funcionario(),
            listaCaixa.get(i).getValor_abertura(), 
        }); 
        }
        }
        private float somaSangria(){
            float soma = 0, valor = 0;
            int cont = jTable1.getRowCount();
            for(int i = 0; i < cont; i++){
                valor = Float.parseFloat(String.valueOf(jTable1.getValueAt(i, 4)));
                soma += valor;
            }
            return soma;
        }  
        private float somaValorTotal(){
            float soma = 0, valor = 0;
            int cont = jTable1.getRowCount();
            for(int i = 0; i < cont; i++){
                valor = Float.parseFloat(String.valueOf(jTable1.getValueAt(i, 3)));
                soma += valor;
            }
            return soma;
        } 
        private float somaValorTotal1(){
            float soma = 0, valor = 0;
            int cont = jTable2.getRowCount();
            for(int i = 0; i < cont; i++){
                valor = Float.parseFloat(String.valueOf(jTable2.getValueAt(i, 1)));
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
            java.util.logging.Logger.getLogger(ViewMovimentacoesCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMovimentacoesCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMovimentacoesCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMovimentacoesCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMovimentacoesCaixa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aaa;
    private javax.swing.JButton btn01;
    private com.toedter.calendar.JDateChooser dateChooser;
    private com.toedter.calendar.JDateChooser dateChooser1;
    private com.toedter.calendar.JDateChooser dateChooser2;
    private javax.swing.JTextField eee;
    private com.toedter.calendar.JDateChooser fromdate01;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JButton jbAbrirCaixa6;
    private com.toedter.calendar.JDateChooser todate01;
    private javax.swing.JFormattedTextField total0;
    private javax.swing.JFormattedTextField total1;
    private javax.swing.JFormattedTextField total2;
    private javax.swing.JFormattedTextField total3;
    private javax.swing.JFormattedTextField total4;
    // End of variables declaration//GEN-END:variables
}
