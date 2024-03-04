/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Viwes;

import Controllers.ComandaController;
import Controllers.ProdutoController;
import Controllers.ProdutosComandaController;
import Models.Produtos;
import Models.TableModel;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author andre
 */
public class EditarComanda extends javax.swing.JFrame {

    private ProdutoController ProdutoControl = new ProdutoController();
    private static List<Produtos> listaDeProdutos = new ArrayList<>();
       private static TableModel modelo;
    private ComandaController Control = new ComandaController();
    private ProdutosComandaController ProdutoComandacontroller = new ProdutosComandaController();

    /**
     * Creates new form EditarComanda
     */
    public EditarComanda(int ComandaId, String NomeComanda) {
       listaDeProdutos = ProdutoControl.FindProdutosComanda(ComandaId);
        
         modelo = new TableModel(listaDeProdutos);
        initComponents();
        NomeCliente.setText(NomeComanda);
        JTable tabela = new JTable(modelo);
        tabela.setFont(new Font("Arial", Font.PLAIN, 18));
        tabela.setShowVerticalLines(true);
        tabela.setShowHorizontalLines(true);
        tabela.setGridColor(Color.gray);
        // Adicione a tabela a um JScrollPane (opcional)
        jScrollPane1.setViewportView(tabela);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NomeCliente = new javax.swing.JLabel();
        InputCodigoProduto = new javax.swing.JTextField();
        PesquisarCodigoBtn = new javax.swing.JButton();
        PesquisarNomeBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        ProdutosLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        InputNomeProduto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Comanda");
        setResizable(false);

        TituloLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TituloLabel.setText("Fechar ou editar comanda");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Alef", 0, 18)); // NOI18N
        jLabel1.setText("Comanda:");

        NomeCliente.setFont(new java.awt.Font("Alef", 0, 18)); // NOI18N
        NomeCliente.setForeground(new java.awt.Color(255, 204, 0));
        NomeCliente.setText("jLabel2");

        PesquisarCodigoBtn.setText("Pesquisar com código");
        PesquisarCodigoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarCodigoBtnActionPerformed(evt);
            }
        });

        PesquisarNomeBtn.setText("Pesquisar por nome");
        PesquisarNomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarNomeBtnActionPerformed(evt);
            }
        });

        ProdutosLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ProdutosLabel.setText("Adicionar Produtos");

        jButton1.setText("Salvar");

        jButton2.setText("Encerrar Comanda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ProdutosLabel)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(InputNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(PesquisarNomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(NomeCliente))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(InputCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(PesquisarCodigoBtn))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(TituloLabel)))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(TituloLabel)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NomeCliente))
                        .addGap(42, 42, 42)
                        .addComponent(ProdutosLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InputNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PesquisarNomeBtn))
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PesquisarCodigoBtn)
                            .addComponent(InputCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void PesquisarCodigoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarCodigoBtnActionPerformed

        try {
            String PesquisaCodigo = InputCodigoProduto.getText();

            int codigo = Integer.parseInt(PesquisaCodigo);
            Produtos Produto = ProdutoControl.findProdutoByCodigo(codigo);

            JanelaAddEditComanda Edit = new JanelaAddEditComanda(Produto);
            Edit.setVisible(rootPaneCheckingEnabled);
            Edit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            Edit.setLocationRelativeTo(this);

        } catch (Exception Ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu um error ao adicionar produto.\nOu ele não pode ser encontrado\nDetalhes do error:\n\n" + Ex.getMessage(), "Ops! ocorreu um error", JOptionPane.YES_OPTION);
        }

    }//GEN-LAST:event_PesquisarCodigoBtnActionPerformed
        public static void adicionarProduto(Produtos produto, int Quantidade) {
        Produtos NovoProduto = new Produtos();
        NovoProduto.setCodigo(produto.getCodigo());
        NovoProduto.setNome(produto.getNome());
        NovoProduto.setUnidade(produto.getUnidade());
        NovoProduto.setPreco(produto.getPreco());
        NovoProduto.setQuantidadeDisponivel(produto.getQuantidadeDisponivel());
        NovoProduto.setDataUltimaVenda(produto.getDataUltimaVenda());
        NovoProduto.setQuantidade(Quantidade);

        listaDeProdutos.add(NovoProduto);
        modelo.fireTableDataChanged();

    }
    private void PesquisarNomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarNomeBtnActionPerformed

        try {
            String PesquisaPorNome = InputNomeProduto.getText();
            Produtos Produto = ProdutoControl.findProdutoByNome(PesquisaPorNome);
            JanelaAddEditComanda Edit = new JanelaAddEditComanda(Produto);
            Edit.setVisible(rootPaneCheckingEnabled);
            Edit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            Edit.setLocationRelativeTo(this);
        } catch (Exception Ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu um error ao adicionar produto.\nOu ele não pode ser encontrado\nDetalhes do error:\n\n" + Ex.getMessage(), "Ops! ocorreu um error", JOptionPane.YES_OPTION);
        }
    }//GEN-LAST:event_PesquisarNomeBtnActionPerformed
    /* */
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
            java.util.logging.Logger.getLogger(EditarComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new EditarComanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputCodigoProduto;
    private javax.swing.JTextField InputNomeProduto;
    private javax.swing.JLabel NomeCliente;
    private javax.swing.JButton PesquisarCodigoBtn;
    private javax.swing.JButton PesquisarNomeBtn;
    private javax.swing.JLabel ProdutosLabel;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
