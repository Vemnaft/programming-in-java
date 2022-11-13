package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    /**
     * In a stack, the last element added will be the first to be removed (LIFO)
     */
    private DLinkList<E> elems = new DLinkList<>();


    /**
     * Method to remove the top of the stack (the last element of the list)
     * @return
     */
    @Override
    public E pop() {
        return this.elems.removeLast();
    }

    /**
     * Method to add an element to the top of the stack (so, the last element of the list)
     * @param x
     */
    @Override
    public void push(E x) {
        this.elems.addLast(x);
    }

    /**
     * Method to count the number of elements in the stack
     * @return
     */
    @Override
    public int numOfElems() {
        return this.elems.counting();
    }

    /**
     * Method to return the bottom element of the stack (so, the first element of the list)
     * @return
     */
    @Override
    public E peek() {
        E peek = this.elems.removeFirst();
        /**
         * We add back the element in the stack
         */
        this.elems.addFirst(peek);
        return peek;
    }
}
