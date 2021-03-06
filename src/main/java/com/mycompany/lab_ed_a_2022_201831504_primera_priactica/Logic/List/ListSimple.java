/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List;

import com.mycompany.lab_ed_a_2022_201831504_primera_priactica.Logic.List.Node.Node;
import java.io.Serializable;

/**
 *
 * @author Benjamín de Jesús Pérez Aguilar
 */
public class ListSimple<T> implements Serializable {

    private Node first;
    private Node last;
    private Node spotter;
    private int counter = 0;

    public ListSimple() {
        this.spotter = null;//1
        this.first = null;//1
        this.last = null;
        this.counter = 0;//1
    }//3 =>O (1)

    public ListSimple(T object) {
        start(object);
    }//3 =>O (1)

    // start of list
    public void start(T object) {
        this.spotter = new Node(object);
        this.first = this.spotter;
        this.last = this.spotter;
        counter++;
    }//3 =>O (1)

    // add item to list
    public void add(T object) {//1
        if (spotter == null) {//1
            start(object);//1
        } else {
            Node add = new Node(object);//1
            this.last.setNext(add);//1
            add.setBack(this.last);//1
            this.spotter = add;//1
            this.last = add;//1
        }
        counter++;//1
    }//9 => O (1)

    //moven back
    public void movenBack() {
        if (this.spotter.getBack() != null) {//1
            this.spotter = this.spotter.getBack();//1
        }
    }//2 =>O (1)

    //moven next
    public void movenNext() {
        if (this.spotter.getNext() != null) {//1
            this.spotter = this.spotter.getNext();//1
        }
    }//3 =>O (1)
    //moven to start

    public void movenStart() {
        this.spotter = this.first;//1
    }//1 =>O (1)
    //moven to end

    public void movenEnd() {//1
        while (this.spotter.getNext() != null || this.spotter.getNext().getBack() != null) {//n
            movenNext();//n
        }
    }//2n =>O (n)
    //clear all list

    public void clearList() {
        this.first = null;//1
        this.spotter = null;//1
    }//2 =>O (1)
    //remove last

    public void removeLast() {
        if (this.first.getNext() == null) {//1
            clearList();//1
        } else {
            this.spotter = this.last.getBack();//1
            this.spotter.setNext(null);//1
        }
    }//4 =>O (1)
//remove spotter

    public void removeSpotter() {
        if (!(this.spotter == null)) {//1
            Node next = this.spotter.getNext();//if next null
            Node back = this.spotter.getBack();//1
            if (back != null) {
                back.setNext(next);//2
            }
            if (next != null) {
                next.setBack(back);//2
            }
            if (this.last == this.spotter) {//1
                this.last = back;//1
                this.last.getBack().setNext(back);
            }
            this.spotter = null;//1
            if (next != null) {//1
                this.spotter = next;//2
            } else {
                this.spotter = back;//2
            }
            counter--;//1
        }
    }//17 => o(1)
    //to simulate the get
    public T get(int positions) {//1
        if (positions >= this.counter) {
            return null;
        } else {
            movenStart();//1
            for (int i = 0; i < positions; i++) {//n
                movenNext();//n
            }
            return (T) this.spotter.getObject();//1
        }
    }//3+ 2n => O (n)

    public Node getNode(int positions) {//1
        if (positions >= this.counter) {
            return null;
        } else {
            movenStart();//1
            for (int i = 0; i < positions; i++) {//n
                movenNext();//n
            }
            return this.spotter;//1
        }
    }//3+ 2n => O (n)

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public Node getSpotter() {
        return spotter;
    }

    public void setSpotter(Node spotter) {
        this.spotter = spotter;
    }

    public int getCounter() {
        return counter;
    }

}
