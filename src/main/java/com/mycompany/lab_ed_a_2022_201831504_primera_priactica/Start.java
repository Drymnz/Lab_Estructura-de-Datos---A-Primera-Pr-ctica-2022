/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client.Bet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.ListSimple;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Window;
import java.awt.Graphics;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class Start {
    public static Window window = new Window(){
            @Override
            public void paint(Graphics g) {
                super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
        };
    
    public static ListSimple<Bet> listBet = null;
    
    public static void main(String[] args) {
        window.setSize(338, 620);
        window.setVisible(true);
        window.setLocationRelativeTo(null);//center window
    }

}
