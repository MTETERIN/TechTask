package com.sbt.teterin.unit2;

import com.sbt.teterin.unit3.Wrapper;

/**
 * Created by MrYcropchick on 12.12.2017.
 */
public class Node {
    private int startPosition;
    private int endPosition;
    private Wrapper wrapper;
    private Node next;



    public Node(int startPosition, int endPosition, Wrapper wrapper, Node next) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.wrapper = wrapper;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public int getEndPosition() {
        return endPosition;
    }

    public Wrapper getWrapper() {
        return wrapper;
    }


    public void setNext(Node next) {
        this.next = next;
    }
}
