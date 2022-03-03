/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client;

import java.io.Serializable;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class Horse implements Serializable{
    private int num;

    public Horse(int num) {
        this.num = num;
    }//1 => O (1)

    public int getNum() {
        return num;
    }//1 => O (1)

    public void setNum(int num) {
        this.num = num;
    }//1 => O (1)
    
}
