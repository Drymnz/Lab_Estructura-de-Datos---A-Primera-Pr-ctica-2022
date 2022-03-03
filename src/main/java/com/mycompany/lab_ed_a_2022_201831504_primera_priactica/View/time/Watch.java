/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.time;

import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import java.nio.CharBuffer;
import java.text.AttributedCharacterIterator;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JPanel;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class Watch extends JPanel {
    
    private String hour = "";
    private String min = "";
    private String seg = "";
    private final String TEXTHOUR = "La hora es : ";
    private int sizeText = 10;

    public Watch() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        g.drawString(TEXTHOUR + hour+":"+min+":"+seg, 5 , 30);
        now();
    }

    private void now(){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            
        }
        Calendar calen = new GregorianCalendar();
        Date date = new Date();
        calen.setTime(date);
        hour = ((calen.get(calen.HOUR_OF_DAY))<9)? "0"+((calen.get(calen.HOUR_OF_DAY))):(calen.get(calen.HOUR_OF_DAY))+"";
        min = ((calen.get(calen.MINUTE)<9)?  ("0"+calen.get(calen.MINUTE)) : (calen.get(calen.MINUTE))) +"";// 1 => 01
        seg = (((calen.get(calen.SECOND))<9)? "0"+(calen.get(calen.SECOND)) : (calen.get(calen.SECOND)))+"";
    }
    public String hour(){
        return TEXTHOUR + hour+":"+min+":"+seg;
    }
}
