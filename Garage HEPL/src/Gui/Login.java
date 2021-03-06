/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.util.*;
import Login.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Vince
 */
public class Login extends java.awt.Dialog {

    /**
     * Creates new form Login
     */
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tfUser = new java.awt.TextField();
        tfPw = new java.awt.TextField();
        labUser = new java.awt.Label();
        labLogin = new java.awt.Label();
        buok = new java.awt.Button();
        buannuler = new java.awt.Button();
        jExterieurButton = new javax.swing.JRadioButton();
        jMembreButton = new javax.swing.JRadioButton();

        setModal(true);
        setName("Login"); // NOI18N
        setResizable(false);
        setTitle("Login");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        tfUser.setName("TF_login"); // NOI18N

        tfPw.setName("TF_pw"); // NOI18N

        labUser.setText("Utilisateur :");

        labLogin.setText("Mot de passe :");

        buok.setLabel("ok");
        buok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buokActionPerformed(evt);
            }
        });

        buannuler.setLabel("annuler");
        buannuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buannulerActionPerformed(evt);
            }
        });

        buttonGroup1.add(jExterieurButton);
        jExterieurButton.setText("Extérieur habillé");
        jExterieurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExterieurButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(jMembreButton);
        jMembreButton.setSelected(true);
        jMembreButton.setText("Membre du personnel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buok, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMembreButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buannuler, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jExterieurButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPw, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jExterieurButton)
                    .addComponent(jMembreButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buannuler, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buok, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        System.exit(0);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void buokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buokActionPerformed
        String login, password,role;
        Hashtable hashpswd = new Hashtable();
        hashpswd .put("Vince","123");
        hashpswd .put("Thib","321");
        
        Hashtable hashrole = new Hashtable();
        hashrole.put("Vince","Membre");
        hashrole.put("Thib","Exterieur");
        
        
        login=tfUser.getText();
        password=tfPw.getText();
        if(jMembreButton.isSelected())
            role="Membre";
        else
            role="Exterieur";
        try
        {
            if(login.equals("") || password.equals(""))//Si ils sont vides
                throw new ExUtilisateurVide("Utilisateur ou mot de passe vide");
            else
            {
                if(hashpswd.get(login)==null)
                    throw new ExUtilisateurInconnu("Utilisateur inconnu");
                else
                {
                    if(password.equals(hashpswd .get(login)))
                    {
                        if(!hashrole.get(login).equals(role))
                        {
                            if(role.equals("Membre"))
                                jMembreButton.setSelected(false);
                            else
                                jMembreButton.setSelected(true);
                            if(role.equals("Exterieur"))
                                jExterieurButton.setSelected(false);
                            else
                                jExterieurButton.setSelected(true);
                            JOptionPane.showMessageDialog( this,"La qualité du membre est erronée", "Attention", JOptionPane.INFORMATION_MESSAGE);
                        }
                        this.dispose();
                    }    
                }
            }
        }catch(ExUtilisateurVide ex)
        {
            JOptionPane.showMessageDialog(this, ex, "Login", JOptionPane.ERROR_MESSAGE, null);
        } catch (ExUtilisateurInconnu ex) {
            JOptionPane.showMessageDialog(this, ex, "Login", JOptionPane.ERROR_MESSAGE, null);
            System.exit(0);
        }
       
    }//GEN-LAST:event_buokActionPerformed

    private void buannulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buannulerActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        dispose();
    }//GEN-LAST:event_buannulerActionPerformed

    private void jExterieurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExterieurButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jExterieurButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buannuler;
    private java.awt.Button buok;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jExterieurButton;
    private javax.swing.JRadioButton jMembreButton;
    private java.awt.Label labLogin;
    private java.awt.Label labUser;
    private java.awt.TextField tfPw;
    private java.awt.TextField tfUser;
    // End of variables declaration//GEN-END:variables
}
