package com.arep.app;

import java.util.Iterator;

import com.arep.app.Node;
import com.arep.app.CustomIterator;

/**
 * Linked
 */
public class Linked<T> implements Iterable<T> {

    private Node<T> head;
    private int size;
    private boolean empty = true;

    public Linked() {
        head = new Node<T>(null);
        size = 0;
    }

    public void add(T data) {
        Node<T> node = new Node<T>(data);
        if (empty) {
            empty = false;
            head.setPrior(node);
        }
        else{
            // head.setPrior(head.getNext());
            head.getNext().setNext(node);
        }
        head.setNext(node);
        size++;
    }

    public void removeFirst() {
    }

    public void removeLast() {
    }

    public void remove(Object o) {

    }

    public T get(Object o) {
        return null;
    }

    public T getFirst() {
        return head.getPrior().getData();
    }

    public Node<T> getHead() {
        return this.head;
    }

    public T getLast() {
        return head.getNext().getData();
    }

    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return new CustomIterator<T>(this);
    }
}