/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.FileManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class FileManagerIn {
    private FileInputStream entry;

    public String upLoadTextFile(File file) {
        String extract = "";
        try {
            entry = new FileInputStream(file);
            int valor;
            while ((valor = entry.read()) != -1) {
                char caracter = (char) valor;
                extract += caracter;
            }
            entry.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "error en lectura");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "error en lectura");
        }
        return extract;
    }

    public File addressExists(File check) {
        if (check.exists()) {
            return check;
        } else {
            if (check.mkdirs()) {
                System.out.println("FUE CREADO " + check.getName());
                return check;
            } else {
                System.out.println("NO SE PUDO CREAR " + check.getName());
            }
        }
        return null;
    }
}
