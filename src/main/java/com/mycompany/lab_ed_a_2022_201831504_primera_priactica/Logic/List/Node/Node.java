/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.Node;

import java.io.Serializable;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class Node <T> implements Serializable{
    
    private T object = null;
    private Node next = null;
    private Node back = null;
    
    // start to list one objet
    public Node(T object) {
        this.object = object;
    }//1 =>O (1)
    /*
    @Object main 
    @back Node
    */
    public Node (T object, Node back){
        this.object = object;
        this.next = back;
    }//2 =>O (1)
     /*
    @Object main 
    @next Node
    @back Node
    */
    public Node (T object, Node next, Node back){
        this.object = object;
        this.back = back;
        this.next = next;
    }//3 =>O (1)

    public T getObject() {
        return object;
    }//1 =>O (1)

    public void setObject(T object) {
        this.object = object;
    }//1 =>O (1)

    public Node getNext() {
        return next;
    }//1 =>O (1)

    public void setNext(Node next) {
        this.next = next;
    }//1 =>O (1)

    public Node getBack() {
        return back;
    }//1 =>O (1)

    public void setBack(Node back) {
        this.back = back;
    }//1 =>O (1)
    
}
