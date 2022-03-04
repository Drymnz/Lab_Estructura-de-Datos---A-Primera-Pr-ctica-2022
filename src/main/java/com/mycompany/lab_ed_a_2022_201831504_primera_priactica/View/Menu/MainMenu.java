/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Checker.CheckerBut;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Start;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Window;
import java.awt.Graphics;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class MainMenu extends javax.swing.JPanel {

    private Thread hilo = new Thread(new CheckerBut());

    /**
     * Creates new form mainMenu
     */
    public MainMenu() {
        initComponents();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAddBut = new javax.swing.JButton();
        jButtonCloseBut = new javax.swing.JButton();
        JButtonVerifyBet = new javax.swing.JButton();
        jButtonIncomeResults = new javax.swing.JButton();
        jButtondeLiveryResults = new javax.swing.JButton();

        setBackground(new java.awt.Color(37, 174, 193));

        jButtonAddBut.setText("agregar apuestas");
        jButtonAddBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddButActionPerformed(evt);
            }
        });

        jButtonCloseBut.setText("cierre apuestas");

        JButtonVerifyBet.setText("Verificar apuestas");
        JButtonVerifyBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonVerifyBetActionPerformed(evt);
            }
        });

        jButtonIncomeResults.setText("Ingreso de resultados");

        jButtondeLiveryResults.setText("Entrega de resultados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCloseBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonVerifyBet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonIncomeResults, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(jButtondeLiveryResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAddBut)
                .addGap(18, 18, 18)
                .addComponent(jButtonCloseBut)
                .addGap(18, 18, 18)
                .addComponent(JButtonVerifyBet)
                .addGap(18, 18, 18)
                .addComponent(jButtonIncomeResults)
                .addGap(18, 18, 18)
                .addComponent(jButtondeLiveryResults)
                .addContainerGap(361, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddButActionPerformed
        if (Start.window != null)
            Start.window.goAddBet();
    }//GEN-LAST:event_jButtonAddButActionPerformed

    private void JButtonVerifyBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonVerifyBetActionPerformed
        if (!hilo.isAlive()) {
            hilo.start();
        } 
    }//GEN-LAST:event_JButtonVerifyBetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonVerifyBet;
    private javax.swing.JButton jButtonAddBut;
    private javax.swing.JButton jButtonCloseBut;
    private javax.swing.JButton jButtonIncomeResults;
    private javax.swing.JButton jButtondeLiveryResults;
    // End of variables declaration//GEN-END:variables

}
