/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import Modelo.Controle;
import Modelo.Estaticos;
import Modelo.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class frmPesquisarFabricanteEditarExcluir extends javax.swing.JDialog
{

    /**
     * Creates new form frmPesquisarEditarExcluir
     */
    public frmPesquisarFabricanteEditarExcluir(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        txvID = new javax.swing.JTextField();
        btnPesquisarporfabricante = new javax.swing.JButton();
        txvFabricante = new javax.swing.JTextField();
        btnPesquisarpormodelo = new javax.swing.JButton();
        txvModelo = new javax.swing.JTextField();
        txvCor = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        lblFabricante = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        lblAno = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txvAno = new javax.swing.JTextField();
        txvValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar, Editar e Excluir");

        btnPesquisarporfabricante.setText("Pesquisar Por Fabricante");
        btnPesquisarporfabricante.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarporfabricanteActionPerformed(evt);
            }
        });

        btnPesquisarpormodelo.setText("Pesquisar por Modelo");
        btnPesquisarpormodelo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarpormodeloActionPerformed(evt);
            }
        });

        lblID.setText("ID");

        lblFabricante.setText("Fabricante");

        lblModelo.setText("Modelo");

        lblCor.setText("Cor");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditarActionPerformed(evt);
            }
        });

        lblAno.setText("Ano");

        lblValor.setText("Valor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txvFabricante)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblID)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(56, 56, 56))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txvID, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFabricante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                        .addComponent(btnPesquisarporfabricante)
                                        .addGap(30, 30, 30)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPesquisarpormodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCor)
                                    .addComponent(txvCor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txvModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblModelo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txvAno)
                                        .addGap(62, 62, 62)))
                                .addGap(161, 161, 161)
                                .addComponent(txvValor)
                                .addGap(29, 29, 29)))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblValor)
                        .addGap(217, 217, 217))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txvID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarporfabricante)
                    .addComponent(btnPesquisarpormodelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFabricante)
                .addGap(4, 4, 4)
                .addComponent(txvFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txvCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txvModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAno)
                    .addComponent(lblValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txvAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txvValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarporfabricanteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarporfabricanteActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarporfabricanteActionPerformed
        Controle controle = new Controle();
        Pessoa pessoa = controle.pesquisarPessoaPorId(txvID.getText());
        if (controle.getMensagem().equals(""))
        {
            txvFabricante.setText(pessoa.getNome());
            txvModelo.setText(pessoa.getRg());
            txvCor.setText(pessoa.getCpf());
        }
        else
        {
            txvFabricante.setText("");
            txvModelo.setText("");
            txvCor.setText("");
            JOptionPane.showMessageDialog(null, controle.getMensagem());
        }
    }//GEN-LAST:event_btnPesquisarporfabricanteActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditarActionPerformed
    {//GEN-HEADEREND:event_btnEditarActionPerformed
        Controle controle = new Controle();
        List<String> dadosPessoa = new ArrayList<>();
        dadosPessoa.add(txvID.getText());
        dadosPessoa.add(txvFabricante.getText());
        dadosPessoa.add(txvModelo.getText());
        dadosPessoa.add(txvCor.getText());
        controle.editarPessoa(dadosPessoa);
        JOptionPane.showMessageDialog(null, controle.getMensagem());
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExcluirActionPerformed
    {//GEN-HEADEREND:event_btnExcluirActionPerformed
        Controle controle = new Controle();
        
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esta pessoa ?",
                "Exclusão", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION)
        {
            controle.excluirPessoa(txvID.getText());
            JOptionPane.showMessageDialog(null, controle.getMensagem());
            txvID.setText("");
            txvFabricante.setText("");
            txvModelo.setText("");
            txvCor.setText("");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarpormodeloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarpormodeloActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarpormodeloActionPerformed
        Controle controle = new Controle();
        List<Pessoa>listaPessoas = controle.pesquisarPessoaPorNome(txvFabricante.getText());
        if (listaPessoas.size() == 0)
        {
            JOptionPane.showMessageDialog(null, "Não existe registros com esta pesquisa");
        }
        if (listaPessoas.size() == 1)
        {
            txvID.setText(String.valueOf(listaPessoas.get(0).getId()));
            txvFabricante.setText(listaPessoas.get(0).getNome());
            txvModelo.setText(listaPessoas.get(0).getRg());
            txvCor.setText(listaPessoas.get(0).getCpf());
        }
        if (listaPessoas.size() >1)
        {
            Estaticos.listaPessoas = listaPessoas;
            frmSelecao frmS = new frmSelecao(null,true);
            frmS.setVisible(true);
            txvID.setText(String.valueOf(Estaticos.pessoa.getId()));
            txvFabricante.setText(String.valueOf(Estaticos.pessoa.getNome()));
            txvModelo.setText(String.valueOf(Estaticos.pessoa.getRg()));
            txvCor.setText(String.valueOf(Estaticos.pessoa.getCpf()));
        }
        if (!controle.getMensagem().equals(""))
        {
            JOptionPane.showMessageDialog(null, controle.getMensagem());
        }
    }//GEN-LAST:event_btnPesquisarpormodeloActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisarFabricanteEditarExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisarFabricanteEditarExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisarFabricanteEditarExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisarFabricanteEditarExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPesquisarFabricanteEditarExcluir dialog = new frmPesquisarFabricanteEditarExcluir(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisarporfabricante;
    private javax.swing.JButton btnPesquisarpormodelo;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txvAno;
    private javax.swing.JTextField txvCor;
    private javax.swing.JTextField txvFabricante;
    private javax.swing.JTextField txvID;
    private javax.swing.JTextField txvModelo;
    private javax.swing.JTextField txvValor;
    // End of variables declaration//GEN-END:variables
}
