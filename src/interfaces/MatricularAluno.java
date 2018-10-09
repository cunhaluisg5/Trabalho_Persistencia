/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Aluno;
import model.Turma;

/**
 *
 * @author Luis
 */
public class MatricularAluno extends javax.swing.JDialog {

    Turma turma;
    
    public MatricularAluno(java.awt.Frame parent, boolean modal) {
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
    private void initComponents() {

        grpcd = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbturma = new javax.swing.JLabel();
        tfturma = new javax.swing.JTextField();
        lbnome = new javax.swing.JLabel();
        tfnome = new javax.swing.JTextField();
        lbnascimento = new javax.swing.JLabel();
        tfnascimento = new javax.swing.JTextField();
        lbmatricula = new javax.swing.JLabel();
        tfmatricula = new javax.swing.JTextField();
        lbpcd = new javax.swing.JLabel();
        rbsim = new javax.swing.JRadioButton();
        rbnao = new javax.swing.JRadioButton();
        btmatricular = new javax.swing.JButton();
        btlimpar = new javax.swing.JButton();
        btsair = new javax.swing.JButton();
        btbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Matricular Aluno");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lbturma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbturma.setText("Turma:");

        lbnome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbnome.setText("Nome:");

        tfnome.setEnabled(false);

        lbnascimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbnascimento.setText("Ano de Nascimento:");

        tfnascimento.setEnabled(false);

        lbmatricula.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbmatricula.setText("Matrícula:");

        tfmatricula.setEnabled(false);

        lbpcd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbpcd.setText("PCD:");

        grpcd.add(rbsim);
        rbsim.setText("Sim");
        rbsim.setEnabled(false);

        grpcd.add(rbnao);
        rbnao.setText("Não");
        rbnao.setEnabled(false);

        btmatricular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btmatricular.setText("Matricular");
        btmatricular.setEnabled(false);
        btmatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmatricularActionPerformed(evt);
            }
        });

        btlimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });

        btsair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btsair.setText("Sair");
        btsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsairActionPerformed(evt);
            }
        });

        btbuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btbuscar.setText("Buscar");
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbnome)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbturma)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfturma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tfnome))
                            .addComponent(lbnascimento)
                            .addComponent(tfnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbmatricula)
                                    .addComponent(lbpcd)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbsim)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbnao))
                                    .addComponent(tfmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btbuscar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btmatricular)
                        .addGap(73, 73, 73)
                        .addComponent(btlimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(btsair)
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbturma)
                    .addComponent(tfturma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnome)
                    .addComponent(lbmatricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnascimento)
                    .addComponent(lbpcd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbsim)
                    .addComponent(rbnao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmatricular)
                    .addComponent(btlimpar)
                    .addComponent(btsair))
                .addGap(53, 53, 53))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(463, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsairActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(opcao == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_btsairActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        try{
           turma = Principal.daoturma.listarTurma(tfturma.getText());
           if(turma != null){
               tfnome.setEnabled(true);
               tfmatricula.setEnabled(true);
               tfnascimento.setEnabled(true);
               rbsim.setEnabled(true);
               rbnao.setEnabled(true);
               btmatricular.setEnabled(true);
           }else{
               JOptionPane.showMessageDialog(null, "Turma não encontrada!", "Atenção", JOptionPane.WARNING_MESSAGE);
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar turma!", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btbuscarActionPerformed

    private void btmatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmatricularActionPerformed
        Aluno aluno = new Aluno();
        aluno.setNome(tfnome.getText());
        aluno.setMatricula(Integer.parseInt(tfmatricula.getText()));
        aluno.setAnoNascimento(Integer.parseInt(tfnascimento.getText()));
        aluno.setPcd(retornarRadio());
        Principal.daoaluno.insereAluno(aluno);
        turma.getAlunos().add(aluno);
        Principal.daoturma.alterarTurma(turma);
        
        JOptionPane.showMessageDialog(null, "Aluno matriculado com sucesso!", "Concluído", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btmatricularActionPerformed

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btlimparActionPerformed

    private int retornarRadio(){
        JRadioButton radio; 
        String str = null; 
        int retorno = 0;
        Enumeration jr = grpcd.getElements(); 
        while ( jr.hasMoreElements() ) 
        { 
            radio = (JRadioButton) jr.nextElement(); 
            if (radio.isSelected()) 
            { 
                str = radio.getText(); 
                if(str.equals("Sim")){
                    retorno = 1;
                }else{
                    retorno = 0;
                }
            } 
        }
        return retorno;
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
            java.util.logging.Logger.getLogger(MatricularAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatricularAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatricularAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatricularAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MatricularAluno dialog = new MatricularAluno(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscar;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btmatricular;
    private javax.swing.JButton btsair;
    private javax.swing.ButtonGroup grpcd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbmatricula;
    private javax.swing.JLabel lbnascimento;
    private javax.swing.JLabel lbnome;
    private javax.swing.JLabel lbpcd;
    private javax.swing.JLabel lbturma;
    private javax.swing.JRadioButton rbnao;
    private javax.swing.JRadioButton rbsim;
    private javax.swing.JTextField tfmatricula;
    private javax.swing.JTextField tfnascimento;
    private javax.swing.JTextField tfnome;
    private javax.swing.JTextField tfturma;
    // End of variables declaration//GEN-END:variables
}
