/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Checker.CheckerBet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client.Bet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client.Client;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.FileManager.FileManagerIn;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.JflexCup.Lexema;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.JflexCup.parser;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.ListSimple;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Start;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Window;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class AddBet extends javax.swing.JPanel {

    private Lexema lexema;
    private parser parser;
    private Window window;

    /**
     * Creates new form AddBet
     */
    public AddBet(Window window) {
        initComponents();
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

        bottonBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jButtonAnalyze = new javax.swing.JButton();
        jButtonAddFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        manualAddBet1 = new com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.ManualAddBet();
        jButtonAddOne = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        bottonBack.setText("Atras");
        bottonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonBackActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jButtonAnalyze.setText("Añadir texto");
        jButtonAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalyzeActionPerformed(evt);
            }
        });

        jButtonAddFile.setText("Ingresar Archivo");
        jButtonAddFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFileActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre :");

        jLabel2.setText("Monto :");

        jButtonAddOne.setText("Añadir");
        jButtonAddOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddOneActionPerformed(evt);
            }
        });

        jButton1.setText("Cierre de apuestas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(121, 121, 121)
                                    .addComponent(jButtonAnalyze))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jButtonAddOne, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manualAddBet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name)
                                    .addComponent(amount)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bottonBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAddFile)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottonBack)
                    .addComponent(jButtonAddFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAnalyze)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manualAddBet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
// back to main
    private void bottonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonBackActionPerformed
        if (window != null)
            window.goMain();
    }//GEN-LAST:event_bottonBackActionPerformed
//analyzes and adds the analyzed bets to the list
    private void jButtonAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalyzeActionPerformed
        if (!jTextArea.getText().isBlank()) {
            String seand = jTextArea.getText() + "\n";
            Reader reader = new StringReader(seand);
            lexema = new Lexema(reader);
            parser = new parser(lexema);
            try {
                parser.parse();
                jTextArea.setText("");
            } catch (IOException ex) {
                Logger.getLogger(AddBet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(AddBet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "por favor ingrese ");
        }
    }//GEN-LAST:event_jButtonAnalyzeActionPerformed

//add a .txt file in the text area
    private void jButtonAddFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddFileActionPerformed
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter(".txt", "txt");
        JFileChooser seleccionarArchivo = new JFileChooser();
        seleccionarArchivo.setFileFilter(filtrado);
        if (seleccionarArchivo.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            java.io.File archivo = seleccionarArchivo.getSelectedFile();
            if (!(archivo.canRead() && archivo.getName().endsWith("txt"))) {
                JOptionPane.showMessageDialog(null, "El archivo no es valido");
            } else {
                this.jTextArea.setText(new FileManagerIn().upLoadTextFile(archivo));
            }
        }
    }//GEN-LAST:event_jButtonAddFileActionPerformed
    private void reset() {
        name.setText("");
        amount.setText("");
        manualAddBet1.listRestart();
    }
//add a bet to the list
    private void jButtonAddOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddOneActionPerformed
        if (!name.getText().isBlank() && !amount.getText().isBlank()) {
            try {
                if ((new CheckerBet().sumTotal(manualAddBet1.listNum(), 0, manualAddBet1.listNum().length - 1)) == 55) {
                    if (Start.listBet == null) {
                        Start.listBet = new ListSimple<>(new Bet(new Client(name.getText()), manualAddBet1.listNum(), Double.valueOf(amount.getText())));
                    } else {
                        Start.listBet.add(new Bet(new Client(name.getText()), manualAddBet1.listNum(), Double.valueOf(amount.getText())));
                    }
                    reset();
                } else {
                    JOptionPane.showMessageDialog(null, "Un caballo ser repite");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "llena las casillas");
        }
    }//GEN-LAST:event_jButtonAddOneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Start.listBet == null) {
            JOptionPane.showMessageDialog(null, "Por favor ingres una apuesta");
        } else if (window != null) {
            window.getBetVerifi().getjButtonResults().setEnabled(false);
            window.getBetVerifi().getLoadingScreen1().setBenchamarkProgress(10, 0);
            window.goBetVerification();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton bottonBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddFile;
    private javax.swing.JButton jButtonAddOne;
    private javax.swing.JButton jButtonAnalyze;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.ManualAddBet manualAddBet1;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
