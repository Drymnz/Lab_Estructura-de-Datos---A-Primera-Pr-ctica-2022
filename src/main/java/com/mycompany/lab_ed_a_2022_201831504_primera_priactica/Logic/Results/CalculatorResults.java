/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Results;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client.Bet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.ListSimple;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Start;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.LoadingScreen;
import javax.swing.JButton;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class CalculatorResults implements Runnable {

    private int[] results;
    private ListSimple<ResultsBet> listResults = null;
    private ListSimple<Bet> listBet;
    private LoadingScreen screen;
    private JButton button;

    public CalculatorResults(int[] results, LoadingScreen screen, JButton button) {
        this.results = results;
        this.screen = screen;
        this.button = button;
    }

    private void calculator() {
        if (listBet != null) {//1
            int conter = 0;
            listBet.movenStart();//1
            boolean begin = (listBet != null) && listBet.getSpotter() != null;//2
            while (begin) {            //n
                begin = !(listBet.getSpotter().getNext() == null);//n
                Bet bet = (Bet) listBet.getSpotter().getObject(); //n
                if (listResults != null) {//n
                    listResults.add(new ResultsBet(bet, finalPunctuation(bet.getListHourse(), 0, results.length - 1, results), bet.getListHourse()));//n
                } else {
                    listResults = new ListSimple<>(new ResultsBet(bet, finalPunctuation(bet.getListHourse(), 0, results.length - 1, results), bet.getListHourse()));//n
                }
                listBet.movenNext();
                conter++;//1
                screen.setBenchamarkProgress(Start.listBet.getCounter(), conter);//10 => O (1)
            }
        }
    }//15+5n => O (n)

    public int finalPunctuation(int[] list, int start, int end, int[] listResults) {//4
        if (start == end) {//1
            return (list[end] == listResults[end]) ? (list.length - end) : 0;//1
        } else {
            int mid = (start + end) / 2;//3
            int left = finalPunctuation(list, start, mid, listResults);//3
            int right = finalPunctuation(list, mid + 1, end, listResults);//3
            return right + left;//2
        }
    }//18 => O(1)

    @Override
    public void run() {
        calculator();
        button.setEnabled(true);
    }

}
