/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.FileManager;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.ListSimple;
import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.Results.ResultsBet;
import java.io.File;
import javax.swing.JButton;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class ExportFormatCSV implements Runnable {

    private ListSimple<ResultsBet> listResults;
    private File file;
    private final String SEPERATOR = ",";
    private final String SEPERATORLISTHORSESTART = "[";
    private final String SEPERATORLISTHORSEEND = "]";
    private final String SEPERATORROW = "\n";
    private JButton e;

    public ExportFormatCSV(ListSimple<ResultsBet> listResults, File file, JButton e) {
        this.listResults = listResults;
        this.file = file;
        this.e = e;
    }

    private void exportar() {
        if (this.listResults != null && this.file != null) {
            String export = "NOMBRE" + SEPERATOR + "LISTADO" + SEPERATOR + "PUNTUACION";
            for (int i = 0; i < listResults.getCounter(); i++) {
                ResultsBet get = listResults.get(i);
                export += row(get) + SEPERATORROW;
            }
            Thread h = new Thread((new FileWriteHandle(file, export)));
            h.start();
        }
        e.setEnabled(true);
    }//3n²+n+6 => O(n)

    private String row(ResultsBet get) {//
        return get.getBet().getPeople().getName() + SEPERATOR + listHorse(get.getBet().getListHourse()) + SEPERATOR + get.getFinalPunctuation();
    }//3n+6 => O(n)

    private String listHorse(int[] list) {//1
        String retu = "";//1
        for (int i = 0; i < list.length; i++) {//2n+1
            retu += SEPERATORLISTHORSESTART + list[i] + SEPERATORLISTHORSEEND;//n
        }
        return retu;//1
    }//3n+3 => O(n)

    @Override
    public void run() {
    }

}
