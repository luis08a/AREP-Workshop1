package com.arep.app;

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