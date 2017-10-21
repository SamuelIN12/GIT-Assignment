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
    
    public  void incrementCounter()
    {
        counter++;
    }
    
    private void decrementCounter()
    {
        counter--;
    }
    
    @SuppressWarnings("null")
    public ListElement getElement(int index)
    
    {
        
        ListElement CurrPtr = new ListElement();
        if (head != null)
        {
            CurrPtr = head;
            for (int i = 0; i < index; i++)
            {
                if (CurrPtr.getNext() == null)
                {return null;}
                CurrPtr = CurrPtr.getNext();
            }
            return CurrPtr;
        }
        return null;
    }
    
    public ListElement deleteElement(int index)
    {
        ListElement NumPtr = head;
        ListElement TemPtr = null;
        
        if (!(head == null && tail == null))
        {
            if (index == 0)
            {
                NumPtr = NumPtr.getNext();
                NumPtr.setNext(NumPtr.getNext());
                head = NumPtr;
            }
            else
            {
                
                for (int i = 1; i < index; i++)
                    NumPtr = NumPtr.getNext();
                
                
                TemPtr = NumPtr.getNext();
                NumPtr.setNext(NumPtr.getNext().getNext());
            }
        }
        return null;
    }
    
    
    public void printLinkedListHead()
    {
        ListElement currentPtr = new ListElement();
        
        currentPtr=head;
        while(currentPtr != null)
        {
            System.out.println("List Element from head are: " + currentPtr.getData() + "\n");
            currentPtr = currentPtr.getNext();
        }
    }
    
    public void printLinkedListTail()
    {
        ListElement currentPtr = new ListElement();
        
        currentPtr = tail;
        while(currentPtr != null)
        {
            System.out.println("List Element from head are: " + currentPtr.getData() + "\n");
            currentPtr = currentPtr.getPrevious();
        }
    }
    
    
}
