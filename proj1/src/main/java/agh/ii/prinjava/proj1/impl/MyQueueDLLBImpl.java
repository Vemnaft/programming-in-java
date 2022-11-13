package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    /** In a queue, the first element added will be the first to be removed (FIFO) */
    private DLinkList<E> elems = new DLinkList<>();


    /**
     * Method to add an element to the beginning of the queue (the last element of the list)
     * @param x
     */
    @Override
    public void enqueue(E x) {
        this.elems.addLast(x);
    }

    /**
     * Method to remove the end of the queue (so, the first element of the list)
     * @return
     */
    @Override
    public E dequeue() {
        return this.elems.removeFirst();
    }

    /**
     * Method to count the number of elements in the queue
     * @return
     */
    @Override
    public int numOfElems() {
        return this.elems.counting();
    }

    /**
     * Method to return the last element of the queue (so, the last element of the list)
     * @return
     */
    @Override
    public E peek() {
        E peek = this.elems.removeLast();
        /** We add back the element in the queue */
        this.elems.addLast(peek);
        return peek;
    }
}
