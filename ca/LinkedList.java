/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca;

import com.*;

/**
 *
 * @author iregbu2s
 */
public class LinkedList {
    
    private ListElement head;
    private ListElement tail;
    private int counter=0;
    private int data;
    
    public void addElement(ListElement le)
    {
        ListElement tempPtr;
        tempPtr = new ListElement(null, le.getData());
        
        if (head == null)
        {
            head = tempPtr;
            tail = head;
        }
        else
        {
            tail.setNext(tempPtr);
            tail = tempPtr;
        }
        incrementCounter();
    }
    
    
    
}
