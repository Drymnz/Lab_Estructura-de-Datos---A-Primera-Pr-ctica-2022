/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Client;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.ListSimple;
import java.io.Serializable;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class Bet implements Serializable{
    private Client people;
    private int[] listHourse;
    private double amount;

    public Bet(Client people, int[] listHourse, double amount) {//3
        this.people = people;//1
        this.listHourse = listHourse;//1
        this.amount = amount;//1
    }//6 => O (1)

    

    public Client getPeople() {
        return people;
    }//1 =>O (1)

    public void setPeople(Client people) {
        this.people = people;
    }//1 =>O (1)


    public double getAmount() {
        return amount;
    }//1 =>O (1)

    public void setAmount(double amount) {
        this.amount = amount;
    }//1 =>O (1)

    public int[] getListHourse() {
        return listHourse;//1
    }////1 => O (1)

    public void setListHourse(int[] listHourse) {//1
        this.listHourse = listHourse;//1
    }//1 => O (1)


    
}
