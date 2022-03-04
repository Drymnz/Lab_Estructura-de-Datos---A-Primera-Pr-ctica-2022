/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.JflexCup;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client.Bet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client.Client;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.ListSimple;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Start;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class guia {

    /*
    code
     */
    private String name;
    private int[] horse = null;
    private int conter = 0;
    private double money = 0;

    private void restart() {
        this.conter = 0;
        this.money = 0;
        this.horse = null;
        this.name = "";
    }// 4  = > o(1)

    private void insertHorse(int add) {
        if (this.horse == null) {
            this.horse = new int[10];
            this.horse[this.conter] = add;
        } else if (this.conter <= 10) {
            this.horse[this.conter] = add;
        }
        this.conter++;
    }// 5  = > o(1)

    private void addBet() {
        boolean checker = (this.conter <= 10) && (this.money > 0) && (this.horse != null) && (!this.name.isBlank());
        if (checker) {
            if (Start.listBet == null) {
                Start.listBet = new ListSimple<>(new Bet(new Client(name), horse, money));
            } else {
                Start.listBet.add(new Bet(new Client(name), horse, money));
            }
        }
        restart();
    }// 12  = > o(1)

    /*
    code
     */
}
