/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import Modelo.Controle;
import Modelo.Estaticos;
import Modelo.Carro;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class frmPesquisarEditarExcluir extends javax.swing.JDialog
{

    /**
     * Creates new form frmPesquisarEditarExcluir
     */
    public frmPesquisarEditarExcluir(java.awt.Frame parent, boolean modal)
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
        btnPesquisarPorId = new javax.swing.JButton();

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

        txvValor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txvValorActionPerformed(evt);
            }
        });

        btnPesquisarPorId.setText("Pesquisar Por Id");
        btnPesquisarPorId.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarPorIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblFabricante)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblID)
                                    .addComponent(lblModelo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblAno)
                                                .addGap(104, 104, 104))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txvAno)
                                                .addGap(57, 57, 57)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txvCor)
                                            .addComponent(lblCor)))
                                    .addComponent(txvModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txvFabricante, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(107, 107, 107))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txvID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(267, 267, 267)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesquisarPorId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisarpormodelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisarporfabricante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txvValor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblValor))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txvID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarPorId))
                .addGap(21, 21, 21)
                .addComponent(lblFabricante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txvFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarporfabricante))
                .addGap(28, 28, 28)
                .addComponent(lblModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txvModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarpormodelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(lblCor)
                    .addComponent(lblAno))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txvAno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txvCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txvValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowMessageAndClearTxv(Component component, Object message)
    {
        JOptionPane.showMessageDialog(component, message);
        txvID.setText("");
        txvFabricante.setText("");
        txvModelo.setText("");
        txvCor.setText("");
        txvAno.setText("");
        txvValor.setText("");
    }
    private void btnPesquisarporfabricanteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarporfabricanteActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarporfabricanteActionPerformed
        Controle controle = new Controle();
        List<Carro> listaCarros = controle.pesquisarCarroPorFabricante(txvFabricante.getText());
        if (listaCarros.size() == 0 || !controle.getMensagem().equals(""))
        {
            ShowMessageAndClearTxv(null, "Não existe registros com esta pesquisa");
        }
        if (listaCarros.size() == 1)
        {
            txvID.setText(String.valueOf(listaCarros.get(0).getId()));
            txvFabricante.setText(listaCarros.get(0).getFabricante());
            txvModelo.setText(listaCarros.get(0).getModelo());
            txvCor.setText(listaCarros.get(0).getCor());
            txvAno.setText(String.valueOf(listaCarros.get(0).getAnoFabricao()));
            txvValor.setText(String.valueOf(listaCarros.get(0).getValor()));
        }
        if (listaCarros.size() > 1)
        {
            Estaticos.listaCarro = listaCarros;
            frmSelecao frmS = new frmSelecao(null, true);
            frmS.setVisible(true);
            txvID.setText(String.valueOf(Estaticos.carro.getId()));
            txvFabricante.setText(String.valueOf(Estaticos.carro.getFabricante()));
            txvModelo.setText(String.valueOf(Estaticos.carro.getModelo()));
            txvCor.setText(String.valueOf(Estaticos.carro.getCor()));
            txvAno.setText(String.valueOf(Estaticos.carro.getAnoFabricao()));
            txvValor.setText(String.valueOf(Estaticos.carro.getValor()));
        }
    }//GEN-LAST:event_btnPesquisarporfabricanteActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditarActionPerformed
    {//GEN-HEADEREND:event_btnEditarActionPerformed

        Controle controle = new Controle();
        Carro PesquisaId = controle.pesquisarCarroPorId(txvID.getText());

        if (PesquisaId.equals("") || !controle.getMensagem().equals(""))
        {
            ShowMessageAndClearTxv(null, "Não existe registros com esta pesquisa");
        }
        else
        {
            List<String> dadosCarro = new ArrayList<>();
            dadosCarro.add(txvID.getText());
            dadosCarro.add(txvFabricante.getText());
            dadosCarro.add(txvModelo.getText());
            dadosCarro.add(txvCor.getText());
            dadosCarro.add(txvAno.getText());
            dadosCarro.add(txvValor.getText());
            controle.editarCarros(dadosCarro);
            JOptionPane.showMessageDialog(null, controle.getMensagem());
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExcluirActionPerformed
    {//GEN-HEADEREND:event_btnExcluirActionPerformed
        Controle controle = new Controle();
        Carro PesquisaId = controle.pesquisarCarroPorId(txvID.getText());

        if (PesquisaId.equals("") || !controle.getMensagem().equals(""))
        {
            ShowMessageAndClearTxv(null, "Não existe registros com esta pesquisa");
        }
        else
        {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este carro ?",
                    "Exclusão", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION)
            {
                controle.excluirCarro(txvID.getText());
                JOptionPane.showMessageDialog(null, controle.getMensagem());
                txvID.setText("");
                txvFabricante.setText("");
                txvModelo.setText("");
                txvCor.setText("");
                txvAno.setText("");
                txvValor.setText("");
            }
            else if (resp == JOptionPane.NO_OPTION)
            {
                JOptionPane.showMessageDialog(null, "ufa!");
            }
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarpormodeloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarpormodeloActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarpormodeloActionPerformed
        Controle controle = new Controle();
        List<Carro> listaCarros = controle.pesquisarCarroPorModelo(txvModelo.getText());
        if (listaCarros.size() == 0 || !controle.getMensagem().equals(""))
        {
            ShowMessageAndClearTxv(null, "Não existe registros com esta pesquisa");
        }
        if (listaCarros.size() == 1)
        {
            txvID.setText(String.valueOf(listaCarros.get(0).getId()));
            txvFabricante.setText(listaCarros.get(0).getFabricante());
            txvModelo.setText(listaCarros.get(0).getModelo());
            txvCor.setText(listaCarros.get(0).getCor());
            txvAno.setText(String.valueOf(listaCarros.get(0).getAnoFabricao()));
            txvValor.setText(String.valueOf(listaCarros.get(0).getValor()));
        }
        if (listaCarros.size() > 1)
        {
            Estaticos.listaCarro = listaCarros;
            frmSelecao frmS = new frmSelecao(null, true);
            frmS.setVisible(true);
            txvID.setText(String.valueOf(Estaticos.carro.getId()));
            txvFabricante.setText(String.valueOf(Estaticos.carro.getFabricante()));
            txvModelo.setText(String.valueOf(Estaticos.carro.getModelo()));
            txvCor.setText(String.valueOf(Estaticos.carro.getCor()));
            txvAno.setText(String.valueOf(Estaticos.carro.getAnoFabricao()));
            txvValor.setText(String.valueOf(Estaticos.carro.getValor()));
        }
    }//GEN-LAST:event_btnPesquisarpormodeloActionPerformed

    private void btnPesquisarPorIdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarPorIdActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarPorIdActionPerformed
        Controle controle = new Controle();
        Carro carro = controle.pesquisarCarroPorId(txvID.getText());
        if (controle.getMensagem().equals(""))
        {
            txvFabricante.setText(carro.getFabricante());
            txvModelo.setText(carro.getModelo());
            txvCor.setText(carro.getCor());
            txvAno.setText(String.valueOf(carro.getAnoFabricao()));
            txvValor.setText(String.valueOf(carro.getValor()));
        }
        else
        {
            ShowMessageAndClearTxv(null, "Não existe registros com esta pesquisa");
        }
    }//GEN-LAST:event_btnPesquisarPorIdActionPerformed

    private void txvValorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txvValorActionPerformed
    {//GEN-HEADEREND:event_txvValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txvValorActionPerformed

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
            java.util.logging.Logger.getLogger(frmPesquisarEditarExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisarEditarExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisarEditarExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisarEditarExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                frmPesquisarEditarExcluir dialog = new frmPesquisarEditarExcluir(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnPesquisarPorId;
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

    private String toString(int anoFabricacao)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
