/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mcadastro = new javax.swing.JMenu();
        micadastrarturma = new javax.swing.JMenuItem();
        mimatricularaluno = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        misair = new javax.swing.JMenuItem();
        mbusca = new javax.swing.JMenu();
        mibuscaraluno = new javax.swing.JMenuItem();
        milistarturmaspcd = new javax.swing.JMenuItem();
        miimprimiralunos = new javax.swing.JMenuItem();
        miimprimirturmas = new javax.swing.JMenuItem();
        msobre = new javax.swing.JMenu();
        miajuda = new javax.swing.JMenuItem();
        misobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escola");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        mcadastro.setText("Cadastro");

        micadastrarturma.setText("Cadastrar Turma");
        micadastrarturma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                micadastrarturmaActionPerformed(evt);
            }
        });
        mcadastro.add(micadastrarturma);

        mimatricularaluno.setText("Matricular Aluno");
        mimatricularaluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimatricularalunoActionPerformed(evt);
            }
        });
        mcadastro.add(mimatricularaluno);
        mcadastro.add(jSeparator1);

        misair.setText("Sair");
        misair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                misairActionPerformed(evt);
            }
        });
        mcadastro.add(misair);

        jMenuBar1.add(mcadastro);

        mbusca.setText("Busca");

        mibuscaraluno.setText("Buscar Aluno");
        mibuscaraluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mibuscaralunoActionPerformed(evt);
            }
        });
        mbusca.add(mibuscaraluno);

        milistarturmaspcd.setText("Listar turmas com alunos PCD");
        milistarturmaspcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milistarturmaspcdActionPerformed(evt);
            }
        });
        mbusca.add(milistarturmaspcd);

        miimprimiralunos.setText("Imprimir lista de alunos");
        miimprimiralunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miimprimiralunosActionPerformed(evt);
            }
        });
        mbusca.add(miimprimiralunos);

        miimprimirturmas.setText("Imprimir lista de turmas");
        miimprimirturmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miimprimirturmasActionPerformed(evt);
            }
        });
        mbusca.add(miimprimirturmas);

        jMenuBar1.add(mbusca);

        msobre.setText("Sobre");

        miajuda.setText("Ajuda");
        msobre.add(miajuda);

        misobre.setText("Sobre");
        msobre.add(misobre);

        jMenuBar1.add(msobre);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(563, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void micadastrarturmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_micadastrarturmaActionPerformed
        new CadastrarTurma(null, true).setVisible(true);
    }//GEN-LAST:event_micadastrarturmaActionPerformed

    private void mimatricularalunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimatricularalunoActionPerformed
        new MatricularAluno(null, true).setVisible(true);
    }//GEN-LAST:event_mimatricularalunoActionPerformed

    private void mibuscaralunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mibuscaralunoActionPerformed
        new BuscarAluno(null, true).setVisible(true);
    }//GEN-LAST:event_mibuscaralunoActionPerformed

    private void milistarturmaspcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milistarturmaspcdActionPerformed
        new ListarTurmasPCD(null, true).setVisible(true);
    }//GEN-LAST:event_milistarturmaspcdActionPerformed

    private void miimprimiralunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miimprimiralunosActionPerformed
        new ImprimirAlunos(null, true).setVisible(true);
    }//GEN-LAST:event_miimprimiralunosActionPerformed

    private void miimprimirturmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miimprimirturmasActionPerformed
        new ImprimirTurmas(null, true).setVisible(true);
    }//GEN-LAST:event_miimprimirturmasActionPerformed

    private void misairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_misairActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(opcao == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_misairActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mbusca;
    private javax.swing.JMenu mcadastro;
    private javax.swing.JMenuItem miajuda;
    private javax.swing.JMenuItem mibuscaraluno;
    private javax.swing.JMenuItem micadastrarturma;
    private javax.swing.JMenuItem miimprimiralunos;
    private javax.swing.JMenuItem miimprimirturmas;
    private javax.swing.JMenuItem milistarturmaspcd;
    private javax.swing.JMenuItem mimatricularaluno;
    private javax.swing.JMenuItem misair;
    private javax.swing.JMenuItem misobre;
    private javax.swing.JMenu msobre;
    // End of variables declaration//GEN-END:variables
}
