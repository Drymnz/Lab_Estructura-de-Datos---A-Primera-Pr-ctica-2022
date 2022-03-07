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
    }//2 => o (1)

    public boolean awaitText(File file, String content) {//2
        try {
            exit = new FileOutputStream(file);//1
            byte[] bytes = content.getBytes();//1
            exit.write(bytes);//1
            exit.close();//1
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
        awaitText(threadFile, threadContent);//2
    }

    public void setArchivoHilo(File threadFile) {//2
        this.threadFile = threadFile;//1
    }

    public void setContenidoHilo(String threadContent) {//1
        this.threadContent = threadContent;//1
    }

}
