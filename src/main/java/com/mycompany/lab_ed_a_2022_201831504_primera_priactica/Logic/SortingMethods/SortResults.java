/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.SortingMethods;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.ListSimple;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.Node.Node;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Results.ResultsBet;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class SortResults {

    public ListSimple<ResultsBet> sortName(ListSimple<ResultsBet> listResults) {
        if (listResults != null) {//1
            boolean begin = (listResults != null) && listResults.getSpotter() != null;//2
            for (int i = 0; i < listResults.getCounter(); i++) {//n
                for (int j = i; j < listResults.getCounter(); j++) {//n²
                    ResultsBet resultSpotter = listResults.get(j);//n²
                    ResultsBet resultNext = listResults.get(j + 1);//n²
                    if ((resultSpotter != null) && (resultNext != null) && (firstGreaterSecondText(resultSpotter.getBet().getPeople().getName(), resultNext.getBet().getPeople().getName()))) {//n²
                        listResults.getNode(j + 1).setObject(resultSpotter);//n²
                        listResults.getNode(j).setObject(resultNext);//n²
                    }
                }
            }
        }
        return listResults;
    }//6n²+n+2 => O(n²)

    public ListSimple<ResultsBet> sortNum(ListSimple<ResultsBet> listResults) {
        if (listResults != null) {//1
            boolean begin = (listResults != null) && listResults.getSpotter() != null;//2
            for (int i = 0; i < listResults.getCounter(); i++) {//n
                for (int j = i; j < listResults.getCounter(); j++) {//n²
                    ResultsBet resultSpotter = listResults.get(j);//n²
                    ResultsBet resultNext = listResults.get(j + 1);//n²
                    if ((resultSpotter != null) && (resultNext != null) && (resultSpotter.getFinalPunctuation() > resultNext.getFinalPunctuation())) {//n²
                        listResults.getNode(j + 1).setObject(resultSpotter);//n²
                        listResults.getNode(j).setObject(resultNext);//n²
                    }
                }
            }
        }
        return listResults;
    }//6n²+n+2 => O(n²)

    //first text is greater than second
    private boolean firstGreaterSecondText(String first, String second) {
        return (first.toLowerCase().compareTo(second.toLowerCase())) >= 0;
    }
}
