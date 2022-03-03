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
public class Client implements Serializable{
    private String name;

    public Client(String name) {
        this.name = name;
    }//1 =>O (1)

    public String getName() {
        return name;
    }//1 =>O (1)

    public void setName(String name) {
        this.name = name;
    }//1 =>O (1)
    
}
