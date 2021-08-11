package view;
import DAO.DAO1;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import conexoes.ConexaoMySql;
import controller.ControllerCaixa;
import controller.ControllerCaixa1;
import controller.ControllerCliente;
import controller.ControllerProdutos;
import controller.ControllerUsuario;
import controller.ControllerVendas;
import controller.ControllerVendasProdutos;
import controller.Controllerfornecedor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCaixa;
import model.ModelCliente;
import model.ModelSessaoUsuario;
import model.ModelUsuario;
import model.ModelVendas;
import util.BLDatas;
import view.ViewUsuario;
public class ViewPrincipal extends javax.swing.JFrame {
      private ViewUsuario viewUsuario;
      private ViewLogin viewLogin;
      ModelSessaoUsuario modelSessaoUsuario;
      ModelUsuario modelUsuario;
      private Object childsize;
      private Object parentSize;
      private String senha;
      private String usuario;
      ControllerCaixa controllerCaixa = new ControllerCaixa();
      ModelCaixa modelCaixa = new ModelCaixa();
      ArrayList<ModelVendas> listaModelVendases = new ArrayList<>();
      ControllerVendas controllerVendas = new ControllerVendas();
      ModelVendas modelVendas = new ModelVendas();
      ControllerCliente controllerCliente = new ControllerCliente();
      BLDatas blDatas = new BLDatas();
      ControllerCaixa1 caixa1 = new ControllerCaixa1();
      ControllerProdutos controllerProduto = new ControllerProdutos();
      ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
      Controllerfornecedor controllerFornecedor = new Controllerfornecedor();
      public void setUsuario (String usuario){
          this.usuario = usuario;
      }
      public void setSenha(String senha){
          this.senha = senha;
      }
    public ViewPrincipal() {
       initComponents();
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       verificaStatus();
       ModelCaixa model = controllerCaixa.getUltimoStatusController(modelCaixa);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        uJPanelImagem1 = new componentes.UJPanelImagem();
        jPanel1 = new javax.swing.JPanel();
        jbProdutos = new javax.swing.JButton();
        jbClientes = new javax.swing.JButton();
        jbVendas = new javax.swing.JButton();
        jbUsuarios = new javax.swing.JButton();
        jbPDV1 = new javax.swing.JButton();
        jbPDV = new javax.swing.JButton();
        jbPDV2 = new javax.swing.JButton();
        jbProdutos1 = new javax.swing.JButton();
        jbProdutos2 = new javax.swing.JButton();
        jbPromocoes = new javax.swing.JButton();
        jbProdutos4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jmProdutos = new javax.swing.JMenuItem();
        jmUsuarios = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmSair = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        jMenuItem12.setText("jMenuItem12");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Vendas");
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        uJPanelImagem1.setImagem(new java.io.File("C:\\Vendas2\\src\\imagens\\PSet02.jpg"));
        uJPanelImagem1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uJPanelImagem1FocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jbProdutos.setBackground(new java.awt.Color(204, 204, 204));
        jbProdutos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-melting-ice-cream-50.png"))); // NOI18N
        jbProdutos.setText("Produtos");
        jbProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProdutosActionPerformed(evt);
            }
        });

        jbClientes.setBackground(new java.awt.Color(204, 204, 204));
        jbClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-girl-and-ice-cream-50.png"))); // NOI18N
        jbClientes.setText("Clientes");
        jbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClientesActionPerformed(evt);
            }
        });

        jbVendas.setBackground(new java.awt.Color(204, 204, 204));
        jbVendas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-baú-do-tesouro-50.png"))); // NOI18N
        jbVendas.setText("Abrir Caixa");
        jbVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVendasActionPerformed(evt);
            }
        });

        jbUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        jbUsuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-usuário-homem-com-círculo-50.png"))); // NOI18N
        jbUsuarios.setText("Usuários");
        jbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuariosActionPerformed(evt);
            }
        });

        jbPDV1.setBackground(new java.awt.Color(204, 204, 204));
        jbPDV1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbPDV1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cofre-50.png"))); // NOI18N
        jbPDV1.setText("Fechar Caixa");
        jbPDV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPDV1ActionPerformed(evt);
            }
        });

        jbPDV.setBackground(new java.awt.Color(204, 204, 204));
        jbPDV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbPDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-o-carrinho-de-compras-50.png"))); // NOI18N
        jbPDV.setText("PDV");
        jbPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPDVActionPerformed(evt);
            }
        });

        jbPDV2.setBackground(new java.awt.Color(204, 204, 204));
        jbPDV2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbPDV2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cofrinho-50.png"))); // NOI18N
        jbPDV2.setText("Sangria");
        jbPDV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPDV2ActionPerformed(evt);
            }
        });

        jbProdutos1.setBackground(new java.awt.Color(204, 204, 204));
        jbProdutos1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbProdutos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-caixa-registradora-50.png"))); // NOI18N
        jbProdutos1.setText("Movimentações");
        jbProdutos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProdutos1ActionPerformed(evt);
            }
        });

        jbProdutos2.setBackground(new java.awt.Color(204, 204, 204));
        jbProdutos2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbProdutos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-empresa-cliente-50.png"))); // NOI18N
        jbProdutos2.setText("Fornecedor");
        jbProdutos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProdutos2ActionPerformed(evt);
            }
        });

        jbPromocoes.setBackground(new java.awt.Color(204, 204, 204));
        jbPromocoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbPromocoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-eleições-50.png"))); // NOI18N
        jbPromocoes.setText("Promoções");
        jbPromocoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPromocoesActionPerformed(evt);
            }
        });

        jbProdutos4.setBackground(new java.awt.Color(204, 204, 204));
        jbProdutos4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbProdutos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-contabilidade-50.png"))); // NOI18N
        jbProdutos4.setText("Despesas");
        jbProdutos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProdutos4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbPDV1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbPDV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbPDV2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbProdutos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jbProdutos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbPromocoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbProdutos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jbVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jbPDV1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbPDV2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbProdutos2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbPromocoes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbProdutos4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(440, Short.MAX_VALUE))
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 204, 255));
        jMenuBar1.setForeground(new java.awt.Color(51, 153, 255));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-fatura-50.png"))); // NOI18N
        jMenu1.setText("Arquivos");

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-editar-utilizador-50.png"))); // NOI18N
        jMenu4.setText("Cadastros");

        jmProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-melting-ice-cream-50.png"))); // NOI18N
        jmProdutos.setText("Produtos");
        jmProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProdutosActionPerformed(evt);
            }
        });
        jMenu4.add(jmProdutos);

        jmUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-usuário-homem-com-círculo-50.png"))); // NOI18N
        jmUsuarios.setText("Usuários");
        jmUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuariosActionPerformed(evt);
            }
        });
        jMenu4.add(jmUsuarios);

        jmClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-girl-and-ice-cream-50.png"))); // NOI18N
        jmClientes.setText("Clientes");
        jmClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClientesActionPerformed(evt);
            }
        });
        jMenu4.add(jmClientes);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-empresa-cliente-50.png"))); // NOI18N
        jMenuItem17.setText("Cadastro de Fornecedor");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenu1.add(jMenu4);
        jMenu1.add(jSeparator1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-trancar-50.png"))); // NOI18N
        jMenuItem3.setText("Trocar Usuário");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator2);

        jmSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-sair-50.png"))); // NOI18N
        jmSair.setText("Sair");
        jmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSairActionPerformed(evt);
            }
        });
        jMenu1.add(jmSair);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-melting-ice-cream-50.png"))); // NOI18N
        jMenu3.setText("Vendas");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-o-carrinho-de-compras-50.png"))); // NOI18N
        jMenuItem5.setText("PDV");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-eleições-50.png"))); // NOI18N
        jMenuItem1.setText("Promoções");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-lista-50.png"))); // NOI18N
        jMenu2.setText("Relatórios");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-girl-and-ice-cream-50.png"))); // NOI18N
        jMenuItem8.setText("Relatório de Clientes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-caixa-registradora-50.png"))); // NOI18N
        jMenuItem7.setText("Relatório de Vendas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-produto-50.png"))); // NOI18N
        jMenuItem2.setText("Relatório de Estoque");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-melting-ice-cream-50.png"))); // NOI18N
        jMenuItem15.setText("Relatório de Produtos");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-empresa-cliente-50.png"))); // NOI18N
        jMenuItem16.setText("Relatório de Fornecedores");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-saco-de-dinheiro-50.png"))); // NOI18N
        jMenuItem14.setText("Relatório de Produtos Vendidos");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuBar1.add(jMenu2);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-performance-de-vendas-50.png"))); // NOI18N
        jMenu6.setText("Financeiro");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-baú-do-tesouro-50.png"))); // NOI18N
        jMenuItem9.setText("Abrir Caixa");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cofre-50.png"))); // NOI18N
        jMenuItem11.setText("Fechar Caixa");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cofrinho-50.png"))); // NOI18N
        jMenuItem13.setText("Sangria");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-contabilidade-50.png"))); // NOI18N
        jMenuItem18.setText("Despesas");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem18);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-caixa-registradora-50.png"))); // NOI18N
        jMenuItem10.setText("Movimentações");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuBar1.add(jMenu6);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-ajuda-50.png"))); // NOI18N
        jMenu5.setText("Ajuda");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-sobre-50.png"))); // NOI18N
        jMenuItem6.setText("Sobre");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSairActionPerformed
    private void jmUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuariosActionPerformed
        new ViewUsuario().setVisible(true);
    }//GEN-LAST:event_jmUsuariosActionPerformed
    private void jmClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClientesActionPerformed
        new ViewCliente().setVisible(true);
    }//GEN-LAST:event_jmClientesActionPerformed
    private void jmProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProdutosActionPerformed
        new viewProduto().setVisible(true);
    }//GEN-LAST:event_jmProdutosActionPerformed
    private void jbProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProdutosActionPerformed
        new viewProduto().setVisible(true);
    }//GEN-LAST:event_jbProdutosActionPerformed
    private void jbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClientesActionPerformed
        new ViewCliente().setVisible(true);
    }//GEN-LAST:event_jbClientesActionPerformed
    private void jbVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVendasActionPerformed
        ModelCaixa modelo = controllerCaixa.getUltimoStatusController(modelCaixa);
            if(modelo.getStatus_caixa() == 0){
                 new ViewAbrirCaixa().setVisible(true);
        dispose();
            }else{
                JOptionPane.showMessageDialog(this, "O Caixa já está aberto!", "Erro", JOptionPane.ERROR_MESSAGE);
            }    
    }//GEN-LAST:event_jbVendasActionPerformed
    private void jbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuariosActionPerformed
        new ViewUsuario().setVisible(true);
    }//GEN-LAST:event_jbUsuariosActionPerformed
    private void jbPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPDVActionPerformed
        new ViewPDV().setVisible(true);
    }//GEN-LAST:event_jbPDVActionPerformed
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(modelSessaoUsuario.login.equals("adm")){
        }
        if(modelSessaoUsuario.login.equals("estoque")){
          jmUsuarios.setEnabled(false); 
          jmClientes.setEnabled(false);
          jbClientes.setEnabled(false);
          jbPDV.setEnabled(false);
          jMenuItem5.setEnabled(false);
          jMenuItem7.setEnabled(false);
          jMenuItem14.setEnabled(false);
          jMenuItem9.setEnabled(false);
          jMenuItem11.setEnabled(false);
          jbVendas.setEnabled(false);
          jbPDV1.setEnabled(false);
          jbUsuarios.setEnabled(false);
          jMenuItem13.setEnabled(false);
          jbPDV2.setEnabled(false);
          jMenuItem18.setEnabled(false);
          jbProdutos4.setEnabled(false);
          jMenuItem10.setEnabled(false);
          jbProdutos1.setEnabled(false);
          jbPromocoes.setEnabled(false);
          jMenuItem1.setEnabled(false);
          jMenu3.setEnabled(false);
          jMenu6.setEnabled(false);
        }
        if(!modelSessaoUsuario.login.equals("adm") && !modelSessaoUsuario.login.equals("estoque")){
          jmUsuarios.setEnabled(false);
          jMenuItem17.setEnabled(false);
          jMenuItem7.setEnabled(false);
          jMenuItem2.setEnabled(false);
          jMenuItem16.setEnabled(false);
          jMenuItem14.setEnabled(false);
          jMenuItem18.setEnabled(false);
          jMenuItem10.setEnabled(false);
          jbUsuarios.setEnabled(false);
          jbProdutos2.setEnabled(false);
          jbPromocoes.setEnabled(false);
          jMenuItem1.setEnabled(false);
          jbProdutos.setEnabled(false);
          jbProdutos4.setEnabled(false);
          jbProdutos1.setEnabled(false);
          jmProdutos.setEnabled(false);
          jMenu2.setEnabled(false);
          jMenuItem15.setEnabled(false);                       
        }
        verificaStatus();  
    }//GEN-LAST:event_formWindowOpened
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ViewSobre mSobre = new ViewSobre(this, rootPaneCheckingEnabled);
        mSobre.setLocationRelativeTo(this);
        mSobre.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       this.setVisible(false);
       ViewLogin mLogin = new ViewLogin();
       mLogin.setLocationRelativeTo(null);
       mLogin.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        final ViewAguarde carregando = new ViewAguarde();
        carregando.setVisible(true);
        Thread t = new Thread(){
        public void run(){
        //metodo de imprimir
        try{
                
           controllerCliente.gerarRelatorioCliente();
           carregando.dispose();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Erro ao gerar Relatório! /n "+e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        }
        };
        t.start();
    }//GEN-LAST:event_jMenuItem8ActionPerformed
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        ModelCaixa modelo = controllerCaixa.getUltimoStatusController(modelCaixa);
            if(modelo.getStatus_caixa() == 0){
                 new ViewAbrirCaixa().setVisible(true);
        dispose();
            }else{
                JOptionPane.showMessageDialog(this, "O Caixa já está aberto!", "Erro", JOptionPane.ERROR_MESSAGE); 
            }
    }//GEN-LAST:event_jMenuItem9ActionPerformed
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
   //Fechar CAIXA
       int dialogButton = JOptionPane.showConfirmDialog(null, "Deseja mesmo Fechar o caixa?","WARNING", JOptionPane.YES_NO_CANCEL_OPTION);
       if(dialogButton == JOptionPane.YES_OPTION) {
           new ViewFecharCaixa().setVisible(true);
           dispose();
       } else{
           try{
            remove(dialogButton);
           }catch(Exception e){
           }
       }
    }//GEN-LAST:event_jMenuItem11ActionPerformed
    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        new ViewSangria().setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        new ViewMovimentacoesCaixa().setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        final ViewAguarde carregando = new ViewAguarde();
           carregando.setVisible(true);
           Thread t = new Thread(){
               public void run(){
                   //metodo de imprimir
                    try{
                controllerProduto.gerarRelatorioEstoque();
           carregando.dispose();
           }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao gerar Relatório! /n "+e, "Erro", JOptionPane.ERROR_MESSAGE);
           }
               }
           };
           t.start();
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new ViewPDV().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    private void jbPDV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPDV1ActionPerformed
       //Fechar CAIXA
       int dialogButton = JOptionPane.showConfirmDialog(null, "Deseja mesmo Fechar o caixa?","WARNING", JOptionPane.YES_NO_CANCEL_OPTION);
       if(dialogButton == JOptionPane.YES_OPTION) {
           new ViewFecharCaixa().setVisible(true);
           dispose();
       } else{
           try{
            remove(dialogButton);
           }catch(Exception e){
           }
       }
    }//GEN-LAST:event_jbPDV1ActionPerformed
    private void jbPDV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPDV2ActionPerformed
        new ViewSangria().setVisible(true);
    }//GEN-LAST:event_jbPDV2ActionPerformed
    private void jbProdutos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProdutos1ActionPerformed
        new ViewMovimentacoesCaixa().setVisible(true);
    }//GEN-LAST:event_jbProdutos1ActionPerformed
    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        final ViewAguarde carregando = new ViewAguarde();
           carregando.setVisible(true);
           Thread t = new Thread(){
               public void run(){
                   //metodo de imprimir
                    try{
            controllerVendasProdutos.gerarRelatorioProdutosVendidos();
           carregando.dispose();
           }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao gerar Relatório! /n "+e, "Erro", JOptionPane.ERROR_MESSAGE);
           }
           }
           };
           t.start();
    }//GEN-LAST:event_jMenuItem14ActionPerformed
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        final ViewAguarde carregando = new ViewAguarde();
           carregando.setVisible(true);
           Thread t = new Thread(){
               public void run(){
                   //metodo de imprimir
                    try{
           controllerVendas.gerarRelatorioVendas();
           carregando.dispose();
           }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao gerar Relatório! /n "+e, "Erro", JOptionPane.ERROR_MESSAGE);
           }
           }
           };
           t.start();
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        final ViewAguarde carregando = new ViewAguarde();
           carregando.setVisible(true);
           Thread t = new Thread(){
               public void run(){
                   //metodo de imprimir
                    try{
                
                        controllerProduto.gerarRelatorioProdutos();
                        carregando.dispose();
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Erro ao gerar Relatório! /n "+e, "Erro", JOptionPane.ERROR_MESSAGE);
                    }
               }
           };
           t.start();
    }//GEN-LAST:event_jMenuItem15ActionPerformed
    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        final ViewAguarde carregando = new ViewAguarde();
           carregando.setVisible(true);
           Thread t = new Thread(){
               public void run(){
                   //metodo de imprimir
                    try{
           controllerFornecedor.gerarRelatorioFornecedor();
           carregando.dispose();
           }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao gerar Relatório! /n "+e, "Erro", JOptionPane.ERROR_MESSAGE);
           }
           }
           };
           t.start();
    }//GEN-LAST:event_jMenuItem16ActionPerformed
    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        new ViewFornecedor().setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed
    private void jbProdutos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProdutos2ActionPerformed
        new ViewFornecedor().setVisible(true);
    }//GEN-LAST:event_jbProdutos2ActionPerformed
    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        verificaStatus();
    }//GEN-LAST:event_formFocusGained
    private void uJPanelImagem1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uJPanelImagem1FocusGained
        verificaStatus();
    }//GEN-LAST:event_uJPanelImagem1FocusGained
    private void jbPromocoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPromocoesActionPerformed
        new ViewPromoção().setVisible(true);
    }//GEN-LAST:event_jbPromocoesActionPerformed
    private void jbProdutos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProdutos4ActionPerformed
        new ViewDespesas().setVisible(true);
    }//GEN-LAST:event_jbProdutos4ActionPerformed
    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        new ViewDespesas().setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new ViewPromoção().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }
        private void pegaMovimentacoes(){
        try{
            listaModelVendases = controllerVendas.getListaVendasController();
        }catch(Exception e){
            
        }
    }
         private void verificaStatus(){
            ModelCaixa modelo = controllerCaixa.getUltimoStatusController(modelCaixa);
            if(modelo.getStatus_caixa() == 0){
                        jMenuItem5.setEnabled(false);
                        jMenuItem11.setEnabled(false);
                           jMenuItem13.setEnabled(false);
                           jbPDV1.setEnabled(false);
                           jbPDV.setEnabled(false);
                           jbPDV2.setEnabled(false);
            }else if(modelo.getStatus_caixa() == 1){
                jbVendas.setEnabled(false);
                        jMenuItem9.setEnabled(false);
            }
          } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JButton jbClientes;
    private javax.swing.JButton jbPDV;
    private javax.swing.JButton jbPDV1;
    private javax.swing.JButton jbPDV2;
    private javax.swing.JButton jbProdutos;
    private javax.swing.JButton jbProdutos1;
    private javax.swing.JButton jbProdutos2;
    private javax.swing.JButton jbProdutos4;
    private javax.swing.JButton jbPromocoes;
    private javax.swing.JButton jbUsuarios;
    private javax.swing.JButton jbVendas;
    private javax.swing.JMenuItem jmClientes;
    private javax.swing.JMenuItem jmProdutos;
    private javax.swing.JMenuItem jmSair;
    private javax.swing.JMenuItem jmUsuarios;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
