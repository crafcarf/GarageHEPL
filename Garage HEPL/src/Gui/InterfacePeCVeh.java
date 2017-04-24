/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tibha
 */
public class InterfacePeCVeh extends javax.swing.JDialog {

    /**
     * Creates new form InterfacePeCVeh
     */
    public InterfacePeCVeh(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {},
        new String [] {
        "Type voiture", "Immatriculation", "Propriétaire","Travail","Remarques"
        }
        ));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabTravaux = new javax.swing.JLabel();
        jRaBuPont = new javax.swing.JRadioButton();
        jRaBuSol = new javax.swing.JRadioButton();
        jComboBoxPont = new javax.swing.JComboBox<>();
        jBuOk = new javax.swing.JButton();
        jBuCancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Garage HEPL: Prise en charge du véhicule");

        jLabTravaux.setText("Travaux en attente");

        buttonGroup1.add(jRaBuPont);
        jRaBuPont.setText("Pont");

        buttonGroup1.add(jRaBuSol);
        jRaBuSol.setText("Sol");
        jRaBuSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRaBuSolActionPerformed(evt);
            }
        });

        jComboBoxPont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jBuOk.setText("OK");
        jBuOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuOkActionPerformed(evt);
            }
        });

        jBuCancel.setText("Annuler");
        jBuCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuCancelActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Type voiture", "Immatriculation", "Propriétaire", "Travail", "Remarques"
            }
        ));
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabTravaux)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRaBuPont)
                                .addGap(73, 73, 73)
                                .addComponent(jComboBoxPont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRaBuSol)
                                .addGap(181, 181, 181))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jBuOk)
                                .addGap(238, 238, 238)
                                .addComponent(jBuCancel)
                                .addContainerGap(93, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabTravaux)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRaBuSol)
                    .addComponent(jRaBuPont)
                    .addComponent(jComboBoxPont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBuOk)
                    .addComponent(jBuCancel))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBuCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBuCancelActionPerformed

    private void jRaBuSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRaBuSolActionPerformed
        
        //jTable1.setModel(dtm);
    }//GEN-LAST:event_jRaBuSolActionPerformed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        DefaultTableModel dtm = (DefaultTableModel)this.jTable1.getModel();
        Vector ligne = new Vector();
        ligne = ((InterfaceApplication)getParent()).Travail.get(0);
        dtm.addRow(ligne);
        jTable1.setModel(dtm);
    }//GEN-LAST:event_jTable1FocusGained

    private void jBuOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuOkActionPerformed
        int line;
        Vector ligne=new Vector();
        line=jTable1.getSelectedRow();
        ligne.add(jTable1.getValueAt(line, 0));
        ligne.add(jTable1.getValueAt(line, 1));
        ligne.add(jTable1.getValueAt(line, 2));
        ligne.add(jTable1.getValueAt(line, 3));
        ligne.add(jTable1.getValueAt(line, 4));
        if(jRaBuSol.isSelected())
            ligne.add("Sol");
        else
            if(jRaBuPont.isSelected())
                ligne.add("Pont " + jComboBoxPont.getSelectedItem().toString());
            else
                ligne.clear();
        this.setVisible(false);
    }//GEN-LAST:event_jBuOkActionPerformed

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
            java.util.logging.Logger.getLogger(InterfacePeCVeh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePeCVeh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePeCVeh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePeCVeh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InterfacePeCVeh dialog = new InterfacePeCVeh(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBuCancel;
    private javax.swing.JButton jBuOk;
    private javax.swing.JComboBox<String> jComboBoxPont;
    private javax.swing.JLabel jLabTravaux;
    private javax.swing.JRadioButton jRaBuPont;
    private javax.swing.JRadioButton jRaBuSol;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
