package view;
import controller.ControllerCaixa;
import controller.ControllerCliente;
import controller.ControllerFormaPagamento;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelCaixa;
import model.ModelCliente;
import model.ModelFormaPagamento;
import model.ModelVendas;
import util.BLMascaras;
public class ViewPagamentoPDV extends javax.swing.JDialog {
    ArrayList<ModelFormaPagamento> listaModelFormaPagamento = new ArrayList<>();
    ControllerFormaPagamento controllerFormaPagamento = new ControllerFormaPagamento();
    ControllerCliente controllerCliente = new ControllerCliente();
    ControllerCaixa controllerCaixa = new ControllerCaixa();
    ModelCaixa modelCaixa = new ModelCaixa();
    ModelCliente modelCliente = new ModelCliente();
    BLMascaras blm = new BLMascaras();
    BLMascaras bl = new BLMascaras();
    BLMascaras BLm = new BLMascaras();
    private double valorTotal;
    private float ticket;
    private float desconto;
    private float valorRecebido;
    private float troco;
    private float valorRecebido2;
    private float valorRecebido3;
    private String formaPagamento;
    private String formaPagamento2;
    private String formaPagamento3;
    private int cliente;
    private String parcela;
    private String parcela2;
    private String parcela3;
    private boolean pago;
     public int getCliente() {
        return cliente;
    }
    public void setCliente(int cliente) {
        this.cliente = cliente;
    }
    
    public ViewPagamentoPDV(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listaFormaPagamento();
        setLocationRelativeTo(null);
        this.pago = false;
        limparCampos();
        desabilitaHabilitaCampos(false);
    }
     private void desabilitaHabilitaCampos(boolean condicao){
        jcbPagamento1.setEnabled(false);
        jcbPagamento2.setEnabled(false);
        pagamento1.setEnabled(false);
        pagamento2.setEnabled(false);
        forma2.setEnabled(false);
        forma1.setEnabled(false);
        jComboBox1.setEnabled(false);
        jComboBox3.setEnabled(false);
        ti.setEnabled(false);
    }
    private void dividirValor(){
       float total, recebido, totalPagamento, recebido2, recebido3, resto, resto1, dividido;
       try{
       total = Float.parseFloat(jlValorTotal.getText());
       }catch(Exception e){
           total = 0;
       }
       try{
       recebido = Float.parseFloat(jtfValorRecebido.getText());
       }catch(Exception e){
           recebido = 0;
       }
       try{
       recebido2 = Float.parseFloat(pagamento1.getText());
       }catch(Exception e){
           recebido2 = 0;
       }
       try{
       recebido3 = Float.parseFloat(pagamento2.getText());
       }catch(Exception e){
           recebido3 = 0;
       }
       //uma forma de pagamento
       if(jComboBox2.getSelectedIndex()+1 == 1){
          jtfValorRecebido.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total+"")));
          calcularTroco();
       }
       if(jComboBox2.getSelectedIndex()+1 == 2){
           dividido = total/2;
          jtfValorRecebido.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(dividido+"")));
          pagamento1.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(dividido+"")));
          calcularTroco();
       }
       if(jComboBox2.getSelectedIndex()+1 == 3){
           dividido = total/3;
          jtfValorRecebido.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(dividido+"")));
          pagamento1.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(dividido+"")));
          pagamento2.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(dividido+"")));
          calcularTroco();
       }
        }
    private void calcularPagamento(){
       float total, desconto1, subtotal, ticket;
       int delivery = 0;
       try{
       subtotal = Float.parseFloat(jtfSubtotal.getText());
       }catch(Exception e){
           subtotal = 0;
       }
              try{
       ticket = Float.parseFloat(ti.getText());
       }catch(Exception e){
           ticket = 0;
       }
       try{
       //pegar delivery
       if(jRadioButton1.isSelected()){
            delivery = jComboBox3.getSelectedIndex()+1;
           switch (delivery) {
               case 1:
                   delivery = 4;
                   break;
               case 2:
                   delivery = 6;
                   break;
               case 3:
                   delivery = 8;
                   break;
               default:
                   delivery = 0;
                   break;
           }}
       }catch(Exception e){
        delivery = 0;
       }
       //pegar desconto
        try{
       desconto1 = Float.parseFloat(jtfDesconto.getText());    
        }catch(Exception e){
        desconto1 = 0;
        } 
       total = subtotal - desconto1 + delivery - ticket;
       jlValorTotal.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total+"")));
    }
    private void calcularTroco(){
       float total, total1, recebido, totalPagamento, recebido2, recebido3, resto, resto1, totalrecebido;
       try{
       total1 = Float.parseFloat(jlValorTotal.getText());
       }catch(Exception e){
           total1 = 0;
       }
       try{
       recebido = Float.parseFloat(jtfValorRecebido.getText());
       }catch(Exception e){
           recebido = 0;
       }
       try{
       recebido2 = Float.parseFloat(pagamento1.getText());
       }catch(Exception e){
           recebido2 = 0;
       }
       try{
       recebido3 = Float.parseFloat(pagamento2.getText());
       }catch(Exception e){
           recebido3 = 0;
       }
       //uma forma de pagamento
       if(jComboBox2.getSelectedIndex()+1 == 1){
          // totalrecebido = recebido;
           total = recebido - total1;
           jtfTroco.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total+"")));
       }
       if(jComboBox2.getSelectedIndex()+1 == 2){
           totalrecebido = recebido + recebido2;
           total = totalrecebido - total1;
           jtfTroco.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total+"")));
       }
       if(jComboBox2.getSelectedIndex()+1 == 3){
           
           totalrecebido = recebido + recebido2 + recebido3;
           total = totalrecebido - total1;
           jtfTroco.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(total+"")));
       }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfSubtotal = new javax.swing.JFormattedTextField();
        jtfDesconto = new javax.swing.JFormattedTextField();
        jcbPagamento = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlValorTotal = new javax.swing.JLabel();
        jlValorTotal1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfTroco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcbPagamento1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jcbPagamento2 = new javax.swing.JComboBox<>();
        pagamento1 = new javax.swing.JTextField();
        pagamento2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        forma1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        forma2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jlValorTotal3 = new javax.swing.JLabel();
        jlValorTotal4 = new javax.swing.JLabel();
        jlValorTotal5 = new javax.swing.JLabel();
        jlValorTotal7 = new javax.swing.JLabel();
        jlValorTotal8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jlValorTotal9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        ti = new javax.swing.JTextField();
        jtfValorRecebido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        acliente = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagamento");

        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Forma de Pagamento:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Subtotal:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Valor Recebido:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Desconto:");

        jtfSubtotal.setEnabled(false);

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
        jtfDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDescontoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDescontoKeyTyped(evt);
            }
        });

        jcbPagamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbPagamentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbPagamentoFocusLost(evt);
            }
        });
        jcbPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPagamentoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setToolTipText("Valor Total a Pagar:");

        jLabel3.setText("Valor Total a Pagar:");

        jlValorTotal.setText("10");
        jlValorTotal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jlValorTotalFocusGained(evt);
            }
        });

        jlValorTotal1.setText("R$:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jlValorTotal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlValorTotal)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorTotal)
                    .addComponent(jlValorTotal1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel7.setText("Troco:");

        jtfTroco.setEditable(false);
        jtfTroco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfTrocoFocusGained(evt);
            }
        });
        jtfTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTrocoActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-dólar-americano-50.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("3º Forma de pagamento :");

        jcbPagamento1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbPagamento1FocusLost(evt);
            }
        });
        jcbPagamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPagamento1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("2º Forma de pagamento :");

        jcbPagamento2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcbPagamento2FocusLost(evt);
            }
        });
        jcbPagamento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPagamento2ActionPerformed(evt);
            }
        });

        pagamento1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pagamento1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pagamento1FocusLost(evt);
            }
        });
        pagamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamento1ActionPerformed(evt);
            }
        });
        pagamento1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pagamento1KeyTyped(evt);
            }
        });

        pagamento2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pagamento2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pagamento2FocusLost(evt);
            }
        });
        pagamento2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pagamento2KeyTyped(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 x", "2 x", "3 x" }));
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });

        forma1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 x", "2 x", "3 x" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Parcelas:");

        forma2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 x", "2 x", "3 x" }));
        forma2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                forma2FocusLost(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Parcelas:");

        jlValorTotal3.setText("R$:");

        jlValorTotal4.setText("R$:");

        jlValorTotal5.setText("R$:");

        jlValorTotal7.setText("R$:");

        jlValorTotal8.setText("R$:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Parcelas:");

        jlValorTotal9.setText("R$:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Valor Recebido:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Valor Recebido:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jComboBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox2FocusLost(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Quantidade de Formas de Pagamento:");

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setText("Delivery");
        jRadioButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jRadioButton1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRadioButton1FocusLost(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Até 3 km - R$ 4,00", "4 km à 7 km - R$ 6,00", "8 km à 10 km - R$ 8,00" }));
        jComboBox3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox3FocusLost(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Ticket Médio R$:");

        ti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiActionPerformed(evt);
            }
        });

        jtfValorRecebido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfValorRecebidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfValorRecebidoFocusLost(evt);
            }
        });
        jtfValorRecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorRecebidoActionPerformed(evt);
            }
        });
        jtfValorRecebido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfValorRecebidoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Cliente ID:");

        acliente.setEnabled(false);
        acliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aclienteFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlValorTotal5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlValorTotal3))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jtfSubtotal)
                            .addComponent(acliente))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel11))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ti, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(jlValorTotal8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel6)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jcbPagamento, 0, 114, Short.MAX_VALUE)
                                            .addComponent(jcbPagamento1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel4)
                                                .addGap(6, 6, 6)
                                                .addComponent(jlValorTotal4)
                                                .addGap(4, 4, 4)
                                                .addComponent(pagamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel15)
                                                .addGap(6, 6, 6)
                                                .addComponent(jlValorTotal9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jcbPagamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jlValorTotal7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(pagamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(forma2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(10, 10, 10)
                                    .addComponent(forma1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel16)
                                    .addGap(10, 10, 10)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(acliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(ti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlValorTotal3)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton1)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlValorTotal5)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlValorTotal9)
                                    .addComponent(jtfValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbPagamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addComponent(pagamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jlValorTotal4))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbPagamento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel17)
                            .addComponent(jlValorTotal7)
                            .addComponent(pagamento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jlValorTotal8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtfTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel16))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(forma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel13)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(forma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jcbPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPagamentoActionPerformed
     if(jComboBox2.getSelectedIndex()+1 != 1){    
        int forma1 = jcbPagamento.getSelectedIndex()+1;
        int forma2 = jcbPagamento1.getSelectedIndex()+1;
        int forma3 = jcbPagamento2.getSelectedIndex()+1;
        
        if(forma1 == 3 && forma2 == 3 || forma1 == 3 && forma3 == 3 ){
           JOptionPane.showMessageDialog(this, "Forma de Pagamento igual: Dinheiro", "Erro", JOptionPane.ERROR_MESSAGE);
           jcbPagamento.setSelectedIndex(0);
        }        
        //se for == credito
        //setar combobox1 true
        if(jcbPagamento.getSelectedIndex()+1 == 2){ 
            jComboBox1.setEnabled(true);
            dividirValor();
            calcularTroco();
        }else{
           jComboBox1.setEnabled(false);
           dividirValor();
           calcularTroco();
        } 
     }
    }//GEN-LAST:event_jcbPagamentoActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        int codigoCliente = Integer.parseInt(acliente.getText());
        modelCliente = controllerCliente.getClienteController(codigoCliente);
        float ticket1 = Float.parseFloat(ti.getText()); 
        float valorTotal1 = Float.parseFloat(jlValorTotal.getText());
        float acumulado = modelCliente.getCliAcumulado();
        int quantidade = Integer.parseInt(modelCliente.getCliQuantidade());
        float somaValor = valorTotal1 + acumulado;
        int somaQtde = quantidade + 1;
        
        if(valorTotal1 <= 0 ){
            JOptionPane.showMessageDialog(this, "Pagamento Inválido, valor total não pode ser menor ou igual a R$ 00.00", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(ticket1 == 0 && codigoCliente > 0){
        //somar ticket
           //setar valor acumulado
           modelCliente.setCliAcumulado(somaValor);
           //setar quantidade
           modelCliente.setCliQuantidade(somaQtde+"");
           //salvar
           controllerCliente.atualizarClienteacumuladoController(modelCliente);
        
        }else{
        //zerar ticket
           //setar valor acumulado
           modelCliente.setCliAcumulado(0);
           //setar quantidade
           modelCliente.setCliQuantidade("0");
           //salvar
           controllerCliente.atualizarClienteacumuladoController(modelCliente);
        }
        }catch(Exception e){}
        int forma1 = jcbPagamento.getSelectedIndex()+1;
        int forma2 = jcbPagamento1.getSelectedIndex()+1;
        int forma3 = jcbPagamento2.getSelectedIndex()+1;
        float recebido1 = Float.parseFloat(jtfValorRecebido.getText());
        float recebido2 = Float.parseFloat(pagamento1.getText());
        float recebido3 = Float.parseFloat(pagamento2.getText());
        this.pago = true; 
        //pega ultimo id do caixa
        ModelCaixa modelo = controllerCaixa.getUltimoIdController(modelCaixa);
        //recupera ultima movimentacao
        ModelCaixa movimentacao = controllerCaixa.getUltimaMovimentacaoController(modelCaixa);
        //somar valor em total_movimentacoes/caixa
        modelo.setTotal_Movimentacoes(blm.arredondamentoComPontoDuasCasas(movimentacao.getTotal_Movimentacoes() + (float) this.valorTotal));
        ModelCaixa movimentacaoCredito = controllerCaixa.getUltimoCreditoController(modelCaixa);
        ModelCaixa movimentacaoDebito = controllerCaixa.getUltimoDebitoController(modelCaixa);
        ModelCaixa movimentacaoDinheiro = controllerCaixa.getUltimoDinheiroController(modelCaixa);
        ModelCaixa movimentacaoSangria = controllerCaixa.getUltimoDinheiroSangriaController(modelCaixa);
        ModelCaixa movimentacaoCaixa = controllerCaixa.getUltimaMovimentacaoCaixaController(modelCaixa);
        ModelCaixa movimentacaotroco = controllerCaixa.getUltimoTrocoController(modelCaixa);
        float total = Float.parseFloat(jlValorTotal.getText());
        //se combo for 1 
        if(jComboBox2.getSelectedIndex()+1 == 1){
           if (jtfValorRecebido.getText() == null  || recebido1 <= 0){
              JOptionPane.showMessageDialog(this, "Pagamento Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
              return;
           }else{
              //se for debito, seta total de debito no ultimo id caixa
               if(jcbPagamento.getSelectedIndex()+1 == 1){
                    modelo.setTotal_Debito(blm.arredondamentoComPontoDuasCasas(movimentacaoDebito.getTotal_Debito()+ total));
                    
                    modelo.setTotal_Credito(blm.arredondamentoComPontoDuasCasas(movimentacaoCredito.getTotal_Credito()));
                    modelo.setTotal_Dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoDinheiro.getTotal_Dinheiro()));
                    modelo.setCaixa_sangria_dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoSangria.getCaixa_sangria_dinheiro()));
                    modelo.setTotal_Caixa_sangria(blm.arredondamentoComPontoDuasCasas(movimentacaoCaixa.getTotal_Caixa_sangria()));
               }else if(jcbPagamento.getSelectedIndex()+1 == 2){
               //se for credito
                    modelo.setTotal_Credito(blm.arredondamentoComPontoDuasCasas(movimentacaoCredito.getTotal_Credito()+ total));
				
                    modelo.setTotal_Debito(blm.arredondamentoComPontoDuasCasas(movimentacaoDebito.getTotal_Debito()));
                    modelo.setTotal_Dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoDinheiro.getTotal_Dinheiro()));
                    modelo.setCaixa_sangria_dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoSangria.getCaixa_sangria_dinheiro()));
                    modelo.setTotal_Caixa_sangria(blm.arredondamentoComPontoDuasCasas(movimentacaoCaixa.getTotal_Caixa_sangria()));
               }if(jcbPagamento.getSelectedIndex()+1 == 3){
               //se for dinheiro
                    modelo.setTotal_Dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoDinheiro.getTotal_Dinheiro()+ total));
                    
                    modelo.setCaixa_sangria_dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoSangria.getCaixa_sangria_dinheiro() + (float) this.valorTotal));
                    modelo.setTotal_Debito(blm.arredondamentoComPontoDuasCasas(movimentacaoDebito.getTotal_Debito()));
                    modelo.setTotal_Credito(blm.arredondamentoComPontoDuasCasas(movimentacaoCredito.getTotal_Credito()));
                    modelo.setTotal_Caixa_sangria(blm.arredondamentoComPontoDuasCasas(movimentacaoCaixa.getTotal_Caixa_sangria()));
               }
            }    
           boolean codigoVenda;    
           codigoVenda = controllerCaixa.atualizar1CaixaController(modelo);
        }else if(jComboBox2.getSelectedIndex()+1 == 2){
           //se for duas formas de pagamento
           if (pagamento1.getText() == null  || recebido1 <= 0 ||
                   jtfValorRecebido.getText() == null  || recebido2<=0){
               //se for nulo
               JOptionPane.showMessageDialog(this, "Pagamento Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
               return;
           }else{
               //senao for nulo e for duas forlmas de pagamento
               if(jcbPagamento.getSelectedIndex()+1 == jcbPagamento1.getSelectedIndex()+1){
                   //se formas de pagamento for iguais
                   if(jcbPagamento.getSelectedIndex()+1 == 1 && jcbPagamento1.getSelectedIndex()+1 == 1){
                        //se for dois debitos
                        modelo.setTotal_Debito(blm.arredondamentoComPontoDuasCasas(movimentacaoDebito.getTotal_Debito() + recebido1 + recebido2));
                        modelo.setTotal_Dinheiro(blm.arredondamentoComPontoDuasCasas((float)movimentacaoDinheiro.getTotal_Dinheiro()));
                        modelo.setCaixa_sangria_dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoSangria.getCaixa_sangria_dinheiro()));
                        modelo.setTotal_Credito(blm.arredondamentoComPontoDuasCasas(movimentacaoCredito.getTotal_Credito()));
                        modelo.setTotal_Caixa_sangria(blm.arredondamentoComPontoDuasCasas(movimentacaoCaixa.getTotal_Caixa_sangria()));
                    }else if(jcbPagamento.getSelectedIndex()+1 == 2 && jcbPagamento1.getSelectedIndex()+1 == 2){
                        //se for dois credito
                        modelo.setTotal_Credito(blm.arredondamentoComPontoDuasCasas(movimentacaoCredito.getTotal_Credito() + recebido1 + recebido2));
                        modelo.setTotal_Debito(blm.arredondamentoComPontoDuasCasas(movimentacaoDebito.getTotal_Debito()));
                        modelo.setTotal_Dinheiro(blm.arredondamentoComPontoDuasCasas((float)movimentacaoDinheiro.getTotal_Dinheiro()));
                        modelo.setCaixa_sangria_dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoSangria.getCaixa_sangria_dinheiro()));
                        modelo.setTotal_Caixa_sangria(blm.arredondamentoComPontoDuasCasas(movimentacaoCaixa.getTotal_Caixa_sangria()));
                    }
                   boolean codigoVenda;    
                   codigoVenda = controllerCaixa.atualizar1CaixaController(modelo);
                }else{
                    //se duas formas de pagamento não for igual
                    if(jcbPagamento.getSelectedIndex()+1 == 1){
                        //se pagamento 1 for debito
                        modelo.setTotal_Debito(blm.arredondamentoComPontoDuasCasas(movimentacaoDebito.getTotal_Debito() + recebido1));
                        boolean codigoVenda;    
                        codigoVenda = controllerCaixa.atualizarDebitoController(modelo);
                    }
                    if(jcbPagamento.getSelectedIndex()+1 == 2){
                        //se pagamento 1 for credito
                        modelo.setTotal_Credito(blm.arredondamentoComPontoDuasCasas(movimentacaoCredito.getTotal_Credito() + recebido1));
                        boolean codigoVenda;    
                        codigoVenda = controllerCaixa.atualizarCreditoController(modelo);
                    } 
                    if(jcbPagamento1.getSelectedIndex()+1 == 1){
                        //se pagamento 2 fodebito
                        modelo.setTotal_Debito(blm.arredondamentoComPontoDuasCasas(movimentacaoDebito.getTotal_Debito() + recebido2));
                        boolean codigoVenda;    
                        codigoVenda = controllerCaixa.atualizarDebitoController(modelo);
                    }
                    if(jcbPagamento1.getSelectedIndex()+1 == 2){
                        //se pagamento 2 for credito
                        modelo.setTotal_Credito(blm.arredondamentoComPontoDuasCasas(movimentacaoCredito.getTotal_Credito() + recebido2));
                        boolean codigoVenda;    
                        codigoVenda = controllerCaixa.atualizarCreditoController(modelo);
                    } 
                }   
            }   
       }else if(jComboBox2.getSelectedIndex()+1 == 3){
           //se for 3 formas de pagamento
           if (pagamento1.getText() == null  || recebido2 <= 0 ||
                   pagamento2.getText() == null  || recebido3 <= 0 ||
                   jtfValorRecebido.getText() == null  || recebido1 <= 0){
               
               JOptionPane.showMessageDialog(this, "Pagamento Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
               return;
           }else{
               if(jcbPagamento.getSelectedIndex()+1 == jcbPagamento1.getSelectedIndex()+1 && jcbPagamento1.getSelectedIndex()+1 ==
                       jcbPagamento2.getSelectedIndex()+1){
                   if(jcbPagamento.getSelectedIndex()+1 == 1 && jcbPagamento1.getSelectedIndex()+1 == 1 && 
                       jcbPagamento2.getSelectedIndex()+1 == 1){
                        //se for tres debitos
                        modelo.setTotal_Debito(blm.arredondamentoComPontoDuasCasas(movimentacaoDebito.getTotal_Debito() + recebido1 + recebido2 + recebido3));
                        boolean codigoVenda;    
                        codigoVenda = controllerCaixa.atualizarDebitoController(modelo);
                    
                   }else if(jcbPagamento.getSelectedIndex()+1 == 2 && jcbPagamento1.getSelectedIndex()+1 == 2 && 
                       jcbPagamento2.getSelectedIndex()+1 == 2){
                        //se for tres credito
                        modelo.setTotal_Credito(blm.arredondamentoComPontoDuasCasas(movimentacaoCredito.getTotal_Credito() + recebido1 + recebido2 + recebido3));
                        boolean codigoVenda;    
                        codigoVenda = controllerCaixa.atualizarCreditoController(modelo);
                    }
               }else{
                  float debito1, debito2, debito3, credito1, credito2, credito3, dinheiro1, dinheiro2, dinheiro3;
                  //senao for formas iguais 
                  if(jcbPagamento.getSelectedIndex()+1 == 1){
                        //se pagamento 1 for debito
                       // modelo.setTotal_Debito(blm.arredondamentoComPontoDuasCasas(movimentacaoDebito.getTotal_Debito() + recebido1));
                       // boolean codigoVenda;    
                      //  codigoVenda = controllerCaixa.atualizarDebitoController(modelo);
                        debito1 = Float.parseFloat(jtfValorRecebido.getText());
                        //faz somas de debito no final
                  } else{
                       debito1 = 0;
                  }
                  if(jcbPagamento.getSelectedIndex()+1 == 2){
                      //se pagamento 1 for credito
                       // modelo.setTotal_Credito(blm.arredondamentoComPontoDuasCasas(movimentacaoCredito.getTotal_Credito() + recebido1));
                      //  boolean codigoVenda;    
                     //   codigoVenda = controllerCaixa.atualizarCreditoController(modelo);
                     credito1 = Float.parseFloat(jtfValorRecebido.getText());
                        //faz somas de debito no final
                  } else{
                       credito1 = 0;
                  }
                  if(jcbPagamento.getSelectedIndex()+1 == 3){
                        //se pagamento 1 for dinheiro
                       // modelo.setTotal_Dinheiro(blm.arredondamentoComPontoDuasCasas((float)movimentacaoDinheiro.getTotal_Dinheiro() + recebido1));
                   // modelo.setCaixa_sangria_dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoSangria.getCaixa_sangria_dinheiro() + recebido1));
                    dinheiro1 = Float.parseFloat(jtfValorRecebido.getText());
                        //faz somas de debito no final
                  } else{
                       dinheiro1 = 0;
                  }
                  if(jcbPagamento1.getSelectedIndex()+1 == 1){
                   //se pagamento 2 fodebito
                  // modelo.setTotal_Debito(blm.arredondamentoComPontoDuasCasas(movimentacaoDebito.getTotal_Debito() + recebido2));
                  // boolean codigoVenda;    
                  // codigoVenda = controllerCaixa.atualizarDebitoController(modelo);
                  debito2 = Float.parseFloat(pagamento1.getText());
                        //faz somas de debito no final
                  } else{
                       debito2 = 0;
                  } 
                  if(jcbPagamento1.getSelectedIndex()+1 == 2){
                   //se pagamento 2 for credito
                  // modelo.setTotal_Credito(blm.arredondamentoComPontoDuasCasas(movimentacaoCredito.getTotal_Credito() + recebido2));
                  // boolean codigoVenda;    
                  // codigoVenda = controllerCaixa.atualizarCreditoController(modelo);
                  credito2 = Float.parseFloat(pagamento1.getText());
                        //faz somas de debito no final
                  } else{
                       credito2 = 0;
                  } 
                  if(jcbPagamento1.getSelectedIndex()+1 == 3){
                   //se pagamento 2 for dinheiro
                  // modelo.setTotal_Dinheiro(blm.arredondamentoComPontoDuasCasas((float)movimentacaoDinheiro.getTotal_Dinheiro() + recebido2));
                  //  modelo.setCaixa_sangria_dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoSangria.getCaixa_sangria_dinheiro() + recebido2));
                  dinheiro2 = Float.parseFloat(pagamento1.getText());
                        //faz somas de debito no final
                  } else{
                       dinheiro2 = 0;
                  } 
                  if(jcbPagamento2.getSelectedIndex()+1 == 3){
                   //se pagamento 3 for dinheiro
                   dinheiro3 = Float.parseFloat(pagamento2.getText());
                        //faz somas de debito no final
                  } else{
                       dinheiro3 = 0;
                  } 
                  if(jcbPagamento2.getSelectedIndex()+1 == 2){
                   //se pagamento 3 for creito
                  // modelo.setTotal_Credito(blm.arredondamentoComPontoDuasCasas(movimentacaoCredito.getTotal_Credito() + recebido3));
                  // boolean codigoVenda;    
                  // codigoVenda = controllerCaixa.atualizarCreditoController(modelo);
                  credito3 = Float.parseFloat(pagamento2.getText());
                        //faz somas de debito no final
                  } else{
                       credito3 = 0;
                  } 
                  if(jcbPagamento2.getSelectedIndex()+1 == 1){
                      //se pagamento 3 for debito
                 // modelo.setTotal_Debito(blm.arredondamentoComPontoDuasCasas(movimentacaoDebito.getTotal_Debito() + recebido3));
                 // boolean codigoVenda;    
                 // codigoVenda = controllerCaixa.atualizarDebitoController(modelo);
                 debito3 = Float.parseFloat(pagamento2.getText());
                        //faz somas de debito no final
                  } else{
                       debito3 = 0;
                  } 
                  
                  float totaldebito = debito1 + debito2 + debito3;
                  float totalcredito = credito1 + credito2 + credito3;
                  float totaldinheiro = dinheiro1 + dinheiro2 + dinheiro3;
                  modelo.setTotal_Credito(blm.arredondamentoComPontoDuasCasas(movimentacaoCredito.getTotal_Credito() + totalcredito));
                  modelo.setTotal_Debito(blm.arredondamentoComPontoDuasCasas(movimentacaoDebito.getTotal_Debito() + totaldebito));
                  modelo.setTotal_Dinheiro(blm.arredondamentoComPontoDuasCasas((float)movimentacaoDinheiro.getTotal_Dinheiro() + totaldinheiro));
                  modelo.setCaixa_sangria_dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoSangria.getCaixa_sangria_dinheiro() + totaldinheiro));
                  
                  boolean codigoVenda;    
                  codigoVenda = controllerCaixa.atualizarCreditoController(modelo);
                  codigoVenda = controllerCaixa.atualizarDebitoController(modelo);
               }
            }
       }
     //encontrar uma forma de tirar troco do valor total se for dinheiro   
    if(troco >= 0 ){
        //se forma de pagamento1 for igual a dinheiro, pegar valor tirar troco e somat no banco
        //se pagamento 3 for debito
         if (forma1 == 3){
            total = recebido1 - troco;
            modelo.setTotal_Dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoDinheiro.getTotal_Dinheiro() + total));
            modelo.setCaixa_sangria_dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoSangria.getCaixa_sangria_dinheiro()) + total);
            boolean codigoVenda;    
            codigoVenda = controllerCaixa.atualizar1DinheiroController(modelo);
        
        }else if(forma2 == 3){
            total = recebido2 - troco;
            modelo.setTotal_Dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoDinheiro.getTotal_Dinheiro() + total));
            modelo.setCaixa_sangria_dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoSangria.getCaixa_sangria_dinheiro()) + total);
            boolean codigoVenda;    
            codigoVenda = controllerCaixa.atualizar1DinheiroController(modelo);
            
        }else if(forma3 == 3 ){
            total = recebido3 - troco;
            modelo.setTotal_Dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoDinheiro.getTotal_Dinheiro() + total));
            modelo.setCaixa_sangria_dinheiro(blm.arredondamentoComPontoDuasCasas(movimentacaoSangria.getCaixa_sangria_dinheiro()) + total);
            boolean codigoVenda;    
            codigoVenda = controllerCaixa.atualizar1DinheiroController(modelo);
        }
    }
    dispose();
    //new ViewPDV().setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed
    private void jtfDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDescontoFocusLost
        try{
            jtfDesconto.setText(BLm.converterVirgulaParaPonto(jtfDesconto.getText()));
        jtfDesconto.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(jtfDesconto.getText())));
        if(Float.parseFloat(jtfDesconto.getText()) < (Float.parseFloat(jlValorTotal.getText()))){
            calcularPagamento();
            dividirValor();
            calcularTroco();
        }else{
            JOptionPane.showMessageDialog(this, "Desconto maior que Valor Total", "Atenção", JOptionPane.ERROR_MESSAGE );
            jtfDesconto.setText(0+"");
            calcularPagamento();
            dividirValor();
            calcularTroco();
        }
        }catch(Exception e){}
    }//GEN-LAST:event_jtfDescontoFocusLost
    private void jtfDescontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDescontoKeyReleased
    }//GEN-LAST:event_jtfDescontoKeyReleased
    private void jtfDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescontoActionPerformed
        jtfValorRecebido.requestFocus();
    }//GEN-LAST:event_jtfDescontoActionPerformed
    private void jtfTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTrocoActionPerformed
    }//GEN-LAST:event_jtfTrocoActionPerformed
    private void jcbPagamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPagamento1ActionPerformed
        if(jComboBox2.getSelectedIndex()+1 != 1){
        int forma11 = jcbPagamento.getSelectedIndex()+1;
        int forma22 = jcbPagamento1.getSelectedIndex()+1;
        int forma33 = jcbPagamento2.getSelectedIndex()+1;

        if(forma11 == 3 && forma22 == 3 || forma22 == 3 && forma33 == 3 ){
           JOptionPane.showMessageDialog(this, "Forma de Pagamento igual: Dinheiro", "Erro", JOptionPane.ERROR_MESSAGE);
           jcbPagamento1.setSelectedIndex(0);
        }
         if(jcbPagamento1.getSelectedIndex()+1 == 2){
           forma1.setEnabled(true);
        }else{
            forma1.setEnabled(false);
                }
        } 
    }//GEN-LAST:event_jcbPagamento1ActionPerformed
    private void jcbPagamento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPagamento2ActionPerformed
        if(jComboBox2.getSelectedIndex()+1 != 1){
        int forma11 = jcbPagamento.getSelectedIndex()+1;
        int forma22 = jcbPagamento1.getSelectedIndex()+1;
        int forma33 = jcbPagamento2.getSelectedIndex()+1;
        if(forma11 == 3 && forma33 == 3 || forma22 == 3 && forma33 == 3){
           JOptionPane.showMessageDialog(this, "Forma de Pagamento igual: Dinheiro", "Erro", JOptionPane.ERROR_MESSAGE);
           jcbPagamento2.setSelectedIndex(0);
        }
        if(jcbPagamento2.getSelectedIndex()+1 == 2){
           forma2.setEnabled(true);
        }else{
           forma2.setEnabled(false);
       }
       }
    }//GEN-LAST:event_jcbPagamento2ActionPerformed
    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
    }//GEN-LAST:event_jPanel1FocusGained
    private void jtfTrocoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfTrocoFocusGained
    }//GEN-LAST:event_jtfTrocoFocusGained
    private void pagamento2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pagamento2FocusGained
    }//GEN-LAST:event_pagamento2FocusGained
    private void pagamento1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pagamento1FocusLost
       float total, recebido1, totalPagamento, recebido2, recebido3, resto, resto1, totalrecebido;
       try{
       total = Float.parseFloat(jlValorTotal.getText());
       }catch(Exception e){
           total = 0;
       }
       try{
       recebido1 = Float.parseFloat(jtfValorRecebido.getText());
       }catch(Exception e){
           recebido1 = 0;
       }
       try{
       recebido2 = Float.parseFloat(pagamento1.getText());
       }catch(Exception e){
           recebido2 = 0;
       }
       try{
       recebido3 = Float.parseFloat(pagamento2.getText());
       }catch(Exception e){
           recebido3 = 0;
       }
        totalrecebido = recebido1 + recebido2;
        int formaa1 = jcbPagamento.getSelectedIndex()+1;
        int formaa2 = jcbPagamento1.getSelectedIndex()+1;
        int formaa3 = jcbPagamento2.getSelectedIndex()+1;
       //se pagamento for duas formas e forem diferentes de dinheiro
       jtfValorRecebido.setText(BLm.converterVirgulaParaPonto(jtfValorRecebido.getText()));
        //if((Float.parseFloat(jtfValorRecebido.getText())  <  (Float.parseFloat(jlValorTotal.getText())))){
            // JOptionPane.showMessageDialog(this, "Valor Recebido menor que Valor Total", "Atenção", JOptionPane.ERROR_MESSAGE );
            // jtfValorRecebido.setText("0");
            // }else{
         if(jComboBox2.getSelectedIndex()+1 == 2){
             if(formaa1 != 3 && formaa2 != 3 ){
                 if(totalrecebido > total){
                    JOptionPane.showMessageDialog(this, "Valores maior que Total", "Atenção", JOptionPane.ERROR_MESSAGE );
                    pagamento1.setText("00.00");
                 }
             }
             pagamento2.setText("00.00");
             calcularTroco();
         }if(jComboBox2.getSelectedIndex()+1 == 3){
              totalPagamento = total - recebido1 - recebido2;
              pagamento2.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(totalPagamento+"")));
               calcularTroco();
         }
      calcularTroco();
    }//GEN-LAST:event_pagamento1FocusLost
    private void pagamento2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pagamento2FocusLost
       if(jComboBox2.getSelectedIndex()+1 != 3){
        float total, recebido1, totalPagamento, recebido2, recebido3, resto, resto1, totalrecebido;
       try{
       total = Float.parseFloat(jlValorTotal.getText());
       }catch(Exception e){
           total = 0;
       }
       try{
       recebido1 = Float.parseFloat(jtfValorRecebido.getText());
       }catch(Exception e){
           recebido1 = 0;
       }
       try{
       recebido2 = Float.parseFloat(pagamento1.getText());
       }catch(Exception e){
           recebido2 = 0;
       }
       try{
       recebido3 = Float.parseFloat(pagamento2.getText());
       }catch(Exception e){
           recebido3 = 0;
       }
       totalrecebido = recebido1 + recebido2 + recebido3; 
        int forma1 = jcbPagamento.getSelectedIndex()+1;
        int forma2 = jcbPagamento1.getSelectedIndex()+1;
        int forma3 = jcbPagamento2.getSelectedIndex()+1;
        float totalcartao1;
        float recebe1 = 0;
        float recebe2 = 0;
        float recebe3 = 0;
        float sub1 = 0;
        float sub2 = 0;
        float sub3 = 0;
        if(forma1 == 1 || forma1 == 2){
            recebe1 = Float.parseFloat(jtfValorRecebido.getText());
        } else{
            sub1 = Float.parseFloat(jtfValorRecebido.getText());
        }   
        if(forma2 == 1 || forma2 == 2){
            recebe2 = Float.parseFloat(pagamento1.getText());
        } else{
            sub2 = Float.parseFloat(jtfValorRecebido.getText());
        }
        if(forma3 == 1 || forma3 == 2){
            recebe3 = Float.parseFloat(pagamento2.getText());
        } else{
            sub3 = Float.parseFloat(jtfValorRecebido.getText());
        }
        totalcartao1 = recebe1 + recebe2 + recebe3;
        float total1 = Float.parseFloat(jlValorTotal.getText());
        total1 = total1 - sub1 - sub2 - sub3;
            if(total1 < totalcartao1){
                JOptionPane.showMessageDialog(this, "Soma de cartões não deve ser maior que restante da fatura" + totalcartao1, "Atenção", JOptionPane.ERROR_MESSAGE );
                pagamento2.setText("00.00");
            }
       }else{
           calcularTroco();
       }
    }//GEN-LAST:event_pagamento2FocusLost
    private void jcbPagamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbPagamentoFocusLost
         if(jcbPagamento.getSelectedIndex()+1 == 2){ 
            jComboBox1.setEnabled(true);
            dividirValor();
            calcularTroco();
        }else{
           jComboBox1.setEnabled(false);
           dividirValor();
           calcularTroco();
        }
    }//GEN-LAST:event_jcbPagamentoFocusLost
    private void jComboBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusGained
    }//GEN-LAST:event_jComboBox1FocusGained
    private void jcbPagamentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbPagamentoFocusGained
    }//GEN-LAST:event_jcbPagamentoFocusGained
    private void jcbPagamento1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbPagamento1FocusLost
        int forma1 = jcbPagamento.getSelectedIndex()+1;
        int forma2 = jcbPagamento1.getSelectedIndex()+1;
        int forma3 = jcbPagamento2.getSelectedIndex()+1;
        if(jComboBox2.getSelectedIndex()+1 == 2){
            if(forma1 == 2 || forma1 == 1 && forma2 == 1 && forma1 ==2 ){
                pagamento1.setEditable(false);
            }
        }
    }//GEN-LAST:event_jcbPagamento1FocusLost
    private void jcbPagamento2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbPagamento2FocusLost
             
    }//GEN-LAST:event_jcbPagamento2FocusLost
    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
    }//GEN-LAST:event_jComboBox1FocusLost
    private void forma2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_forma2FocusLost
    }//GEN-LAST:event_forma2FocusLost
    private void jtfDescontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDescontoKeyTyped
        String caracteres="0987654321.,";
                if(!caracteres.contains(evt.getKeyChar()+"")){
                    evt.consume();
                    JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
    }//GEN-LAST:event_jtfDescontoKeyTyped
    private void pagamento1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagamento1KeyTyped
        String caracteres="0987654321.,";
                if(!caracteres.contains(evt.getKeyChar()+"")){
                    evt.consume();
                    JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
    }//GEN-LAST:event_pagamento1KeyTyped
    private void pagamento2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagamento2KeyTyped
        String caracteres="0987654321.,";
                if(!caracteres.contains(evt.getKeyChar()+"")){
                    evt.consume();
                    JOptionPane.showMessageDialog(this, "Letras e caracteres Especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
                }
    }//GEN-LAST:event_pagamento2KeyTyped
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()){
          jComboBox3.setEnabled(true);
          calcularPagamento();
            dividirValor();
            calcularTroco();
        }else{
           jComboBox3.setEnabled(false);
          calcularPagamento();
            dividirValor();
            calcularTroco();
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
    }//GEN-LAST:event_jComboBox3ActionPerformed
    private void jRadioButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButton1FocusGained
    }//GEN-LAST:event_jRadioButton1FocusGained
    private void jlValorTotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlValorTotalFocusGained
       jlValorTotal.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(jlValorTotal.getText())));
    }//GEN-LAST:event_jlValorTotalFocusGained
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       //dividirValor();
        if(jComboBox2.getSelectedIndex()+1 == 1){
           jcbPagamento.setEnabled(true);
           jtfValorRecebido.setEnabled(true);
           jcbPagamento1.setEnabled(false);
           pagamento1.setEnabled(false);
           jcbPagamento2.setEnabled(false);
           pagamento2.setEnabled(false);
           jtfValorRecebido.setText("00.00");
           pagamento1.setText("00.00");
           pagamento2.setText("00.00");
           jtfTroco.setText("00.00");
           dividirValor();   
       }else if(jComboBox2.getSelectedIndex()+1 == 2){
           jcbPagamento.setEnabled(true);
           jtfValorRecebido.setEnabled(true);
           jcbPagamento1.setEnabled(true);
           pagamento1.setEnabled(true);
           jcbPagamento2.setEnabled(false);
           pagamento2.setEnabled(false);
           jtfValorRecebido.setText("00.00");
           pagamento1.setText("00.00");
           pagamento2.setText("00.00");
           jtfTroco.setText("00.00");
           dividirValor();
       }else if(jComboBox2.getSelectedIndex()+1 == 3){
           jcbPagamento.setEnabled(true);
           jtfValorRecebido.setEnabled(true);
           jcbPagamento1.setEnabled(true);
           pagamento1.setEnabled(true);
           jcbPagamento2.setEnabled(true);
           pagamento2.setEnabled(true);
           jtfValorRecebido.setText("00.00");
           pagamento1.setText("00.00");
           pagamento2.setText("00.00");
           jtfTroco.setText("00.00");
           dividirValor();
       }
    }//GEN-LAST:event_jComboBox2ActionPerformed
    private void pagamento1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pagamento1FocusGained
    }//GEN-LAST:event_pagamento1FocusGained
    private void jComboBox3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox3FocusGained
    }//GEN-LAST:event_jComboBox3FocusGained
    private void jComboBox3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox3FocusLost
        if(jRadioButton1.isSelected()){
          jComboBox3.setEnabled(true);
          calcularPagamento();
            dividirValor();
            calcularTroco();
        }else{
           jComboBox3.setEnabled(false);
          calcularPagamento();
            dividirValor();
            calcularTroco();
        }
    }//GEN-LAST:event_jComboBox3FocusLost
    private void jtfValorRecebidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfValorRecebidoFocusGained
    }//GEN-LAST:event_jtfValorRecebidoFocusGained
    private void jtfValorRecebidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfValorRecebidoFocusLost
       float total, recebido1, totalPagamento, recebido2, recebido3, resto, resto1, totalrecebido, dividido;
       try{
       total = Float.parseFloat(jlValorTotal.getText());
       }catch(Exception e){
           total = 0;
       }
       try{
       recebido1 = Float.parseFloat(jtfValorRecebido.getText());
       }catch(Exception e){
           recebido1 = 0;
       }
       try{
       recebido2 = Float.parseFloat(pagamento1.getText());
       }catch(Exception e){
           recebido2 = 0;
       }
       try{
       recebido3 = Float.parseFloat(pagamento2.getText());
       }catch(Exception e){
           recebido3 = 0;
       }
        
        jtfValorRecebido.setText(BLm.converterVirgulaParaPonto(jtfValorRecebido.getText()));
        if(jComboBox2.getSelectedIndex()+1 == 1){
             if(jcbPagamento.getSelectedIndex()+1 != 3 && recebido1>total){
                 JOptionPane.showMessageDialog(this, "Valor maior que o total!", "Atenção", JOptionPane.ERROR_MESSAGE );
                 jtfValorRecebido.setText("00.00");
             }else{
                pagamento2.setText("00.00"); 
                calcularTroco(); 
             }
         
         }if(jComboBox2.getSelectedIndex()+1 == 2){   
             pagamento2.setText("00.00");
             totalPagamento = total - recebido1;
             pagamento1.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(totalPagamento+"")));
             calcularTroco();
             if(jcbPagamento.getSelectedIndex()+1 == 3 ){
                 pagamento1.setEditable(false);
             }
             
         }if(jComboBox2.getSelectedIndex()+1 == 3){
              totalPagamento = total - recebido1;
              dividido = totalPagamento/2;
              pagamento1.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(dividido+"")));
              pagamento2.setText(bl.arredondamentoDoubleComPontoDuasCasasString(Double.parseDouble(dividido+"")));
              calcularTroco();
         }
    }//GEN-LAST:event_jtfValorRecebidoFocusLost
    private void jtfValorRecebidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfValorRecebidoKeyTyped
         String caracteres="0987654321.,";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Letras e caracteres especiais não são válidos", "Atenção", JOptionPane.ERROR_MESSAGE );
        }
    }//GEN-LAST:event_jtfValorRecebidoKeyTyped
    private void pagamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamento1ActionPerformed
    }//GEN-LAST:event_pagamento1ActionPerformed
    private void tiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiActionPerformed
    }//GEN-LAST:event_tiActionPerformed
    private void jtfValorRecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorRecebidoActionPerformed
    }//GEN-LAST:event_jtfValorRecebidoActionPerformed
    private void jComboBox2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusLost
         if(jComboBox2.getSelectedIndex()+1 == 1){
           jcbPagamento.setEnabled(true);
           jtfValorRecebido.setEnabled(true);
           jcbPagamento1.setEnabled(false);
           pagamento1.setEnabled(false);
           jcbPagamento2.setEnabled(false);
           pagamento2.setEnabled(false);
           jtfValorRecebido.setText("00.00");
           pagamento1.setText("00.00");
           pagamento2.setText("00.00");
           jtfTroco.setText("00.00");
           dividirValor();
           
       }else if(jComboBox2.getSelectedIndex()+1 == 2){
           jcbPagamento.setEnabled(true);
           jtfValorRecebido.setEnabled(true);
           jcbPagamento1.setEnabled(true);
           pagamento1.setEnabled(true);
           jcbPagamento2.setEnabled(false);
           pagamento2.setEnabled(false);
           jtfValorRecebido.setText("00.00");
           pagamento1.setText("00.00");
           pagamento2.setText("00.00");
           jtfTroco.setText("00.00");
           dividirValor();
       }else if(jComboBox2.getSelectedIndex()+1 == 3){
           jcbPagamento.setEnabled(true);
           jtfValorRecebido.setEnabled(true);
           jcbPagamento1.setEnabled(true);
           pagamento1.setEnabled(true);
           jcbPagamento2.setEnabled(true);
           pagamento2.setEnabled(true);
           jtfValorRecebido.setText("00.00");
           pagamento1.setText("00.00");
           pagamento2.setText("00.00");
           jtfTroco.setText("00.00");
           dividirValor();
       }
    }//GEN-LAST:event_jComboBox2FocusLost
    private void jComboBox2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox2FocusGained
        dividirValor();
    }//GEN-LAST:event_jComboBox2FocusGained
    private void aclienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aclienteFocusLost
    }//GEN-LAST:event_aclienteFocusLost
    private void jRadioButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButton1FocusLost
        
        
        
       calcularPagamento();
            dividirValor();
            calcularTroco();
    }//GEN-LAST:event_jRadioButton1FocusLost

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
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewPagamentoPDV dialog = new ViewPagamentoPDV(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    private void limparCampos(){
        jtfDesconto.setText("00.00");
        jtfValorRecebido.setText("00.00");
        pagamento1.setText("00.00");
        pagamento2.setText("00.00");         
    } 
    //preenche combobox com todas formas de pagamento 
    private void listaFormaPagamento() {
        listaModelFormaPagamento = controllerFormaPagamento.getListaFormaPagamentoController();
        jcbPagamento1.removeAllItems();
        jcbPagamento2.removeAllItems();
        for (int i = 0; i < listaModelFormaPagamento.size(); i++) {
            jcbPagamento.addItem(listaModelFormaPagamento.get(i).getDescricaoForPag());
            jcbPagamento1.addItem(listaModelFormaPagamento.get(i).getDescricaoForPag());
            jcbPagamento2.addItem(listaModelFormaPagamento.get(i).getDescricaoForPag());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField acliente;
    private javax.swing.JComboBox<String> forma1;
    private javax.swing.JComboBox<String> forma2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JComboBox<String> jcbPagamento;
    private javax.swing.JComboBox<String> jcbPagamento1;
    private javax.swing.JComboBox<String> jcbPagamento2;
    private javax.swing.JLabel jlValorTotal;
    private javax.swing.JLabel jlValorTotal1;
    private javax.swing.JLabel jlValorTotal3;
    private javax.swing.JLabel jlValorTotal4;
    private javax.swing.JLabel jlValorTotal5;
    private javax.swing.JLabel jlValorTotal7;
    private javax.swing.JLabel jlValorTotal8;
    private javax.swing.JLabel jlValorTotal9;
    private javax.swing.JFormattedTextField jtfDesconto;
    private javax.swing.JFormattedTextField jtfSubtotal;
    private javax.swing.JTextField jtfTroco;
    private javax.swing.JTextField jtfValorRecebido;
    private javax.swing.JTextField pagamento1;
    private javax.swing.JTextField pagamento2;
    private javax.swing.JTextField ti;
    // End of variables declaration//GEN-END:variables
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void setTicket(float ticket) {
        this.ticket = ticket;
    }
    public float getDesconto() {
        return desconto;
    }
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    public float getValorRecebido() {
        return valorRecebido;
    }
    public void setValorRecebido(float valorRecebido) {
        this.valorRecebido = valorRecebido;
    }
    
    public void setValorRecebido2(float valorRecebido2) {
        this.valorRecebido2 = valorRecebido2;
    }
    public float getTroco() {
        return troco;
    }
    public void setTroco(float troco) {
        this.troco = troco;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public void setTextFieldValorTotal(){
       this.jtfSubtotal.setText(blm.arredondamentoComPontoDuasCasasString(this.valorTotal));
       float sub = (float) this.valorTotal;
       float ticket1 = this.ticket;
       float valor = (float) (valorTotal - ticket);
       this.jlValorTotal.setText(blm.arredondamentoComPontoDuasCasasString(valor));
    } 
    public void setTextFieldticket(){
       this.ti.setText(blm.arredondamentoComPontoDuasCasasString(this.ticket));
    }
    public void setTextFieldticket1(){
        this.ti.setText(blm.arredondamentoComPontoDuasCasasString(00.00));
    }
    public void setTextFieldcliente(){
        this.acliente.setText(this.cliente+"");
        if(this.cliente == 0 ){
            ti.setText("00.00");
        }
    }
    public float getValorRecebido2() {
        return valorRecebido2;
    }
    public String getFormaPagamento2() {
        return formaPagamento2;
    }
    public void setFormaPagamento2(String formaPagamento2) {
        this.formaPagamento2 = formaPagamento2;
    }
    public String getParcela() {
        return parcela;
    }
    public void setParcela(String parcela) {
        this.parcela = parcela;
    }
    public String getParcela2() {
        return parcela2;
    }
    public void setParcela2(String parcela2) {
        this.parcela2 = parcela2;
    }
    public boolean isPago() {
        return pago;
    }
    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
