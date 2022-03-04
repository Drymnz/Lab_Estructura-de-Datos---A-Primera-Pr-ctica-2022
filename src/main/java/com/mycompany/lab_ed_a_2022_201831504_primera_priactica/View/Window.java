/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Start;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.AddBet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.EntryResults;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.MainMenu;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Benjamin
 */
public class Window extends JFrame{
    private CardLayout file = new CardLayout();
    // menus
    private Container panel ;
    private MainMenu main = new MainMenu();
    private AddBet addBetWindow = new AddBet();
    private EntryResults results = new EntryResults();

    public Window() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = this.getContentPane();
        panel.setLayout(file);
        subWindow();
    }
    //add window
    private void subWindow(){
        panel.add(main, "MainMenu");
        panel.add(addBetWindow,"addBetWindow");
        panel.add(results,"results");
    }
    /*siwch of window*/
    public void goMain() {
        file.show(panel, "MainMenu");
        restoreWindow(338, 620, "Hipodromo");
    }
    public void goAddBet() {
        file.show(panel, "addBetWindow");
        restoreWindow(338, 620, "Añadir apuesta");
    }
    public void goResults() {
        file.show(panel, "results");
        restoreWindow(326, 300, "Resultados");
    }
    /*end siwch*/
    private void restoreWindow(int width, int height, String title) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);//center window
    }
}
