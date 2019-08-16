package com.arep.app;

import java.util.Iterator;

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
        // else{
        //     head.setPrior(head.getNext());
        // }
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
        return new LinkedIterator<T>(this);
    }
}

class Node<E> {
    private Node<E> prior;
    private Node<E> next;
    private E data;

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return this.data;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public Node<E> getPrior() {
        return prior;
    }

    public void setPrior(Node<E> prior) {
        this.prior = prior;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setData(E data) {
        this.data = data;
    }
}

class LinkedIterator<U> implements Iterator<U> {
    private Node<U> current;

    public LinkedIterator(Linked<U> list) {
        this.current = list.getHead();
        System.out.println(current);
    }

    public boolean hasNext() {
        System.out.println(current.getNext());
        return current.getNext() != null;
    }

    public U next() {
        U data = current.getData();
        System.out.println(data);
        this.current = current.getNext();
        return data;
    }

}