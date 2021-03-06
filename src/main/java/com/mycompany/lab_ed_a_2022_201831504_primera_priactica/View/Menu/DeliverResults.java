/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Checker.CheckerBet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Results.CalculatorResults;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Window;
import javax.swing.JButton;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class DeliverResults extends javax.swing.JPanel {

    private Window window;
    private Thread hilo;
    private int[] list;
    private CalculatorResults cal;

    /**
     * Creates new form DeliverResults
     */
    public DeliverResults(Window window) {
        initComponents();
        this.jButtonNext.setEnabled(false);
        this.window = window;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        loadingScreen1 = new com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.LoadingScreen();
        jButton2 = new javax.swing.JButton();

        back.setText("Atras");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButtonNext.setText("Entrega de resultados");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loadingScreen1Layout = new javax.swing.GroupLayout(loadingScreen1);
        loadingScreen1.setLayout(loadingScreen1Layout);
        loadingScreen1Layout.setHorizontalGroup(
            loadingScreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        loadingScreen1Layout.setVerticalGroup(
            loadingScreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton2.setText("Analisar Resultados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadingScreen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(jButtonNext))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(jButtonNext))
                .addGap(18, 18, 18)
                .addComponent(loadingScreen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (window != null) {
            window.goResults();
            if (hilo.isAlive()) {
                hilo.stop();
            } else {
                hilo = null;
            }
        }
    }//GEN-LAST:event_backActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (hilo == null) {
            cal = new CalculatorResults(list,loadingScreen1, jButtonNext);
            hilo = new Thread(cal);
            if (!hilo.isAlive()) {
                hilo.start();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
         if (window != null) {
            window.goListResults(cal.getListResults());
         }
    }//GEN-LAST:event_jButtonNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonNext;
    private com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.LoadingScreen loadingScreen1;
    // End of variables declaration//GEN-END:variables

    public JButton getjButtonNext() {
        return jButtonNext;
    }

    public LoadingScreen getLoadingScreen1() {
        return loadingScreen1;
    }

    public void setList(int[] list) {
        this.list = list;
    }

}
