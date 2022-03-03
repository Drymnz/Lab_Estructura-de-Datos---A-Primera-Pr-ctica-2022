/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class FileWriteHandle implements Runnable{
    private FileOutputStream exit;
    private File threadFile;
    private String threadContent;

    public FileWriteHandle(File threadFile, String threadContent) {
        this.threadFile = threadFile;
        this.threadContent = threadContent;
    }

    public boolean awaitText(File file, String content) {
        try {
            exit = new FileOutputStream(file);
            byte[] bytes = content.getBytes();
            exit.write(bytes);
            exit.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileWriteHandle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileWriteHandle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public void run() {
        awaitText(threadFile, threadContent);
    }

    public void setArchivoHilo(File threadFile) {
        this.threadFile = threadFile;
    }

    public void setContenidoHilo(String threadContent) {
        this.threadContent = threadContent;
    }

}
