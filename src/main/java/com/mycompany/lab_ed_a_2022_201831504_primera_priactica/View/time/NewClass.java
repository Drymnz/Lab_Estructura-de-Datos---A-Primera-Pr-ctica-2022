/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.time;

import java.util.ArrayList;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class NewClass {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] listString = {"benja", "pamela","Benjamin","Pamela","shi","Romero Perez","Benjamin de Jesus","Nemo","Papa pitufo","Oliver","Pedro","Pedro piter","Funado","Eliminado"};
        print(listString);
        print(sort(listString));
    }

    public static String[] sort(String[] list) {
        for (int i = 0; i < list.length; i++) {
            String string = list[i];
            for (int j = i + 1; j < list.length; j++) {
                print(list);
                if (list[i].toLowerCase().compareTo(list[j].toLowerCase()) > 0) {
                    list[i] = list[j];
                    list[j] = string;
                }
            }

        }
        return list;
    }
    public static void print(String[] lis){
        for (int i = 0; i < lis.length; i++) {
            String li = lis[i];
            System.out.print(li + ",");
        }
        System.out.println("");
    }

}
