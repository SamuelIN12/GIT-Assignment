/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author iregbu2s
 */
public class ListElement {
    
    private ListElement next ;
    private ListElement previous ;
    private int data ;
    
    public ListElement ()
    {
        this . data = 0;
        this . next = null ;
        this . previous = null ;
    }
    
    public ListElement (ListElement nextValue, int data1)
    {
        this . data = data1;
        this . next = nextValue ;
    }
    
    public ListElement (int data1, ListElement nextValue, ListElement preValue)
    {
        this . data = data1;
        this . next = nextValue;
        this.previous = preValue;
    }
    
    public void setData ( int data)
    {
        this . data = data ;
    }
    public int getData ()
    {
        return this . data ;
    }
    public ListElement getNext()
    {
        return next;
    }
    public void setNext(ListElement nextVal)
    {
        next = nextVal;
    }
    
    public ListElement getPrevious()
    {
        return previous;
    }
    public void setPrevious(ListElement PreValue)
    {
        previous = PreValue;
    }
    
    
}
