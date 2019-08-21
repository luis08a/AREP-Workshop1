package com.arep.app;

import java.util.Iterator;

import com.arep.app.Node;
import com.arep.app.Linked;

/**
 * CustomIterator
 */
public class CustomIterator<E> implements Iterator<E> {
    private Node<E> current;

    public CustomIterator(Linked<E> list) {
        this.current = list.getHead().getPrior();
    }

    public boolean hasNext() {
        return current != null;
    }

    public E next() {
        E data = current.getData();
        this.current = current.getNext();
        return data;
    }

}