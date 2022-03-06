/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.SortingMethods;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Checker.CheckerBet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.ListSimple;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.Node.Node;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Results.ResultsBet;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Start;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class SortResults {

    public ListSimple<ResultsBet> sortName(ListSimple<ResultsBet> listResults) {
        if (listResults != null) {//1
            long start = System.nanoTime();;
            int conter = 0;
            for (int i = 1; i < listResults.getCounter();) {//2
                ResultsBet resultSpotter = listResults.get(i - 1);//n +n
                ResultsBet resultNext = listResults.get(i);//n+n
                conter++;
                if ((resultSpotter != null) && (resultNext != null) && (firstGreaterSecondText(resultSpotter, resultNext))) {//n+n+n
                    listResults.getNode(i - 1).setObject(resultNext);//n+n
                    listResults.getNode(i).setObject(resultSpotter);//n  +n
                    conter++;
                } else {
                    i++;//n
                    conter++;
                }
                if (i == 0) {//n
                    i = 1;//n
                }
            }
            long end = System.nanoTime() - start;
            System.out.println("TIEMPO PARA ORDENAR --->" + end);
            System.out.println("LOS PASOS PARA ORDENAR -->" + conter);
        }
        return listResults;
    }//12n + 3 => O(n)

    public ListSimple<ResultsBet> sortNum(ListSimple<ResultsBet> listResults) {
        if (listResults != null) {//1
            long start = System.nanoTime();;
            int conter = 0;
            for (int i = 1; i < listResults.getCounter();) {//2
                ResultsBet resultSpotter = listResults.get(i - 1);//2n
                ResultsBet resultNext = listResults.get(i);//2n
                conter++;
                if ((resultSpotter != null) && (resultNext != null) && (resultSpotter.getFinalPunctuation() > resultNext.getFinalPunctuation())) {//3n
                    listResults.getNode(i - 1).setObject(resultNext);//2n
                    listResults.getNode(i).setObject(resultSpotter);//2n  
                    conter++;
                } else {
                    i++;//n
                    conter++;
                }
                if (i == 0) {//n
                    i = 1;//n
                }
            }
            long end = System.nanoTime() - start;
            System.out.println("TIEMPO PARA ORDENAR --->" + end);
            System.out.println("LOS PASOS PARA ORDENAR -->" + conter);
        }
        return listResults;
    }//12n + 3 => O(n)

//first text is greater than second
    private boolean firstGreaterSecondText(ResultsBet resultSpotter, ResultsBet resultNext) {
        return (resultSpotter.getBet().getPeople().getName().toLowerCase().compareTo(resultNext.getBet().getPeople().getName().toLowerCase())) >= 0;
    }
}
