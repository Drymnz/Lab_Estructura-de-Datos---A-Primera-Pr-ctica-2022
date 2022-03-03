/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.JflexCup;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client.Bet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client.Client;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.ListSimple;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class guia {

    /*
    code
     */
    private ListSimple<Bet> listBet;
    private String name;
    private int[] horse = null;
    private int conter = 10;
    private double money = 0;

    private void restart() {
        this.conter = 10;
        this.money = 0;
        this.horse = null;
        this.name = "";
    }// 4  = > o(1)

    private void insertHorse(int add) {
        if (this.horse == null) {
            this.horse = new int[this.conter];
            this.horse[this.conter - 1] = add;
        }
        if (this.conter >= 1) {
            this.horse[this.conter - 1] = add;
        }
        this.conter--;
    }// 5  = > o(1)

    private void addBet() {
        boolean checker = (this.conter < 10) && (this.money > 0) && (this.horse != null) && (!this.name.isBlank());
        if (checker) {
            if (listBet==null) {
                listBet = new ListSimple<>(new Bet(new Client(name),horse,money));
            } else {
            }
            listBet.add(new Bet(new Client(name),horse,money));
        }
        restart();
    }// 12  = > o(1)
     public ListSimple<Bet> getListBet() {
        return listBet;
    }
         public void setListBet(ListSimple<Bet> listBet) {
        this.listBet = listBet;
    }
    /*
    code
     */
   
}
