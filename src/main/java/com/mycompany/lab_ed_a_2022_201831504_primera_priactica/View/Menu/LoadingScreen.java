/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.View.Menu;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class LoadingScreen extends JPanel {

    private String loadName;
    private double progress;
    private Color backGround;
    private Color colorProgress;
    private Color colorLyrics;

    public LoadingScreen(String loadName, double progress, Color backGround, Color colorProgress, Color colorLyrics) {
        this.loadName = loadName;
        this.progress = progress;
        this.backGround = backGround;
        this.colorProgress = colorProgress;
        this.colorLyrics = colorLyrics;
    }

    public LoadingScreen() {
        this("Cargando", 0, Color.WHITE, Color.GREEN, Color.black);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(this.colorProgress);
        g.fillRect(0, 0, (int) progress, this.getHeight());
        g.setColor(this.colorLyrics);
        g.drawString(loadName + ": " + calculateProgress() + "%", (this.getWidth() / 3) - (loadName.length()), this.getHeight() / 2);
    }

    public void setBenchamarkProgress(double referente, double valor) {//2
        double division = valor / referente;//3
        if (division < 1) {//1
            this.progress = division * this.getWidth();//2
        } else {
            this.progress = this.getWidth();//2
        }
    }//10 => O (1)

    private int calculateProgress() {
        return (int) ((this.progress / this.getWidth()) * 100);
    }

    //set y get
    public String getLoadName() {
        return loadName;
    }

    public void setLoadName(String loadName) {
        this.loadName = loadName;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public Color getBackGround() {
        return backGround;
    }

    public void setBackGround(Color backGround) {
        this.backGround = backGround;
    }

    public Color getColorProgress() {
        return colorProgress;
    }

    public void setColorProgress(Color colorProgress) {
        this.colorProgress = colorProgress;
    }

    public Color getColorLyrics() {
        return colorLyrics;
    }

    public void setColorLyrics(Color colorLyrics) {
        this.colorLyrics = colorLyrics;
    }
    //fin set y get
}
