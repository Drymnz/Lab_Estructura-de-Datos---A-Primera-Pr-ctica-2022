/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Checker;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client.Bet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.ListSimple;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Start;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu.LoadingScreen;
import javax.swing.JButton;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class CheckerBet implements Runnable {

    private final int total = 55;
    private LoadingScreen screen;
    private JButton button;

    public CheckerBet() {
    }

    public CheckerBet(LoadingScreen screen, JButton button) {//2
        this.screen = screen;//1
        this.button = button;//1
    }//4 => O (1)

    private void checkerBut() {
        if (Start.listBet != null) {
            int conter = 0;
            long[] promedio = null;
            promedio = new long[Start.listBet.getCounter()];
            Start.listBet.movenStart();//1
            boolean begin = (Start.listBet != null) && Start.listBet.getSpotter() != null;//2
            while (begin) {            //n
                long start = System.nanoTime();
                begin = !(Start.listBet.getSpotter().getNext() == null);//n
                Bet bet = (Bet) Start.listBet.getSpotter().getObject(); //n
                if (sumTotal(bet.getListHourse(), 0, (bet.getListHourse().length - 1)) != this.total) {//n+17
                    Start.listBet.removeSpotter();//n
                } else {
                    Start.listBet.movenNext();//n
                }
                long end = System.nanoTime() - start;
                System.out.println("TIEMPO DE PROCESO DE VERIFICACION->" + end);
                promedio[conter] = end;
                conter++;//1
                screen.setBenchamarkProgress(Start.listBet.getCounter(), conter);//10 => O (1)
            }
            if (promedio != null) {
                System.out.println("SE TARDO PROMEDIO DE --->" + sumTotalLong(promedio));
            }
            System.out.println("LOS PASOS SON -->" + conter);
        }
    }//5n+31 => O(n)

    public long sumTotalLong(long[] list) {//1
        long total = 0;//1
        for (int i = 0; i < list.length; i++) {//n+2
            total += list[i];//n
        }
        total = (list.length > 0) ? (total / list.length) : 0;//n
        return total;
    }
//3n + 5 => O (1)
    public int sumTotal(int[] list, int start, int end) {//3
        if (start == end) {//1
            return list[end];//1
        } else {
            int mid = (start + end) / 2;//3
            int left = sumTotal(list, start, mid);//3
            int right = sumTotal(list, mid + 1, end);//3
            return right + left;//2
        }
    }//17 => O(1)

    @Override
    public void run() {
        checkerBut();//5n+20 => O(n)
        this.button.setEnabled(true);//1
    }//5n+20

}
