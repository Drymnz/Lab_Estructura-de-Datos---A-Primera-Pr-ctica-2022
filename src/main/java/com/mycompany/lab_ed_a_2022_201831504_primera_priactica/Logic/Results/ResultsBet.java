/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Results;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client.Bet;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class ResultsBet {
    private Bet bet;
    private int finalPunctuation;
    private int[] results;

    public ResultsBet(Bet bet, int finalPunctuation, int[] results) {
        this.bet = bet;
        this.finalPunctuation = finalPunctuation;
        this.results = results;
    }
    

    public Bet getBet() {
        return bet;
    }

    public void setBet(Bet bet) {
        this.bet = bet;
    }

    public int getFinalPunctuation() {
        return finalPunctuation;
    }

    public void setFinalPunctuation(int finalPunctuation) {
        this.finalPunctuation = finalPunctuation;
    }

    public int[] getResults() {
        return results;
    }

    public void setResults(int[] results) {
        this.results = results;
    }
    
}
