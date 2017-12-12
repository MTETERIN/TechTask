package com.sbt.teterin.unit2;

import com.sbt.teterin.unit3.Wrapper;

/**
 * Created by MrYcropchick on 12.12.2017.
 */

/**
 * Typical Linked List
 */
public class LinkedListOutput {
    public Node head;

    public LinkedListOutput() {
        head = null;
    }

    public void add(int startPostion, int endPosition,Wrapper wrapper)
    {
        Node newNode = new Node(startPostion,endPosition,wrapper,null);
        if(head == null)
            head=newNode;
        else{
            Node current = head;
            while(current.getNext() != null)
            {
                current = current.getNext();
            }
            current.setNext(newNode);

        }
    }
}
