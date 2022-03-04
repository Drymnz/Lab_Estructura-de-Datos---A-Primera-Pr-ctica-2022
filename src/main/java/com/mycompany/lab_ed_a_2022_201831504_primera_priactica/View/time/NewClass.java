/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.time;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class NewClass {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumTotal(list, 0, 9));
    }
        private static int sumTotal(int[] list,int start,int end){
        if (start == end ) {
            return list[end];
        } else {
            int mid = (start+end) / 2;
            int left = sumTotal(list, start, mid);
            int right = sumTotal(list, mid+1, end);
            return right + left ;
        }
    }
}
