/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client.Bet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.ListSimple;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Results.ResultsBet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Start;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.AddBet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.BetVerification;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.DeliverResults;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.EntryResults;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.MainMenu;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.ShowResultTables;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Benjamin
 */
public class Window extends JFrame {

    private CardLayout file = new CardLayout();
    // menus
    private Container panel;
    private MainMenu main;
    private AddBet addBetWindow;
    private EntryResults results;
    private BetVerification betVerifi;
    private DeliverResults deliverResults;
    private ShowResultTables table;

    public Window() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = this.getContentPane();
        panel.setLayout(file);
        this.setTitle("Hipodromo");
        newWindows();
        subWindow();
       // goMain();
    }

    //restore windows, = new
    private void newWindows() {
        main = new MainMenu(this);
        addBetWindow = new AddBet(this);
        results = new EntryResults(this);
        betVerifi = new BetVerification(this);
        deliverResults = new DeliverResults(this);
        table = new ShowResultTables(this);
    }

    //add window
    private void subWindow() {
        panel.add(main, "MainMenu");
        panel.add(addBetWindow, "addBetWindow");
        panel.add(results, "results");
        panel.add(betVerifi, "BetVerification");
        panel.add(deliverResults, "DeliverResults");
        panel.add(table, "Table");
    }

    /*siwch of window*/
    public void goMain() {
        file.show(panel, "MainMenu");
        restoreWindow(223, 213, "Hipodromo");
        newWindows();
    }

    public void goAddBet() {
        file.show(panel, "addBetWindow");
        restoreWindow(342, 710, "Añadir apuesta");
    }

    public void goResults() {
        file.show(panel, "results");
        restoreWindow(326, 300, "Resultados");
    }

    public void goBetVerification() {
        file.show(panel, "BetVerification");
        restoreWindow(472, 181, "Verificar apuestas");
    }

    public void goDeliverResults(int[] list) {
        deliverResults.setList(list);
        file.show(panel, "DeliverResults");
        restoreWindow(400, 240, "Escanear resultados");
    }
    public void goListResults(ListSimple<ResultsBet> listResults) {
        table.setListResults(listResults);
        table.getHilo().start();
        file.show(panel, "Table");
        restoreWindow(558, 423, "Escanear resultados");
    }

    /*end siwch*/
    private void restoreWindow(int width, int height, String title) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);//center window
    }

    public CardLayout getFile() {
        return file;
    }

    public void setFile(CardLayout file) {
        this.file = file;
    }

    public Container getPanel() {
        return panel;
    }

    public void setPanel(Container panel) {
        this.panel = panel;
    }

    public MainMenu getMain() {
        return main;
    }

    public void setMain(MainMenu main) {
        this.main = main;
    }

    public AddBet getAddBetWindow() {
        return addBetWindow;
    }

    public void setAddBetWindow(AddBet addBetWindow) {
        this.addBetWindow = addBetWindow;
    }

    public EntryResults getResults() {
        return results;
    }

    public void setResults(EntryResults results) {
        this.results = results;
    }

    public BetVerification getBetVerifi() {
        return betVerifi;
    }

    public void setBetVerifi(BetVerification betVerifi) {
        this.betVerifi = betVerifi;
    }

    public DeliverResults getDeliverResults() {
        return deliverResults;
    }

    public void setDeliverResults(DeliverResults deliverResults) {
        this.deliverResults = deliverResults;
    }

}
