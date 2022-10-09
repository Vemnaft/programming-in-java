package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;
/**
 * interface for all the stack methods
 * @param <E>
 */
public interface MyStack<E> {
    /**
     * Method to remove the first element from the stack
     * @return
     */
    E pop();

    /**
     * Method to add an element to the first place of the stack
     * @param x
     */
    void push(E x);
    /**
     * Method to check if the stack is empty
     * @return
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }
    /**
     * Method that returns the number of elements in the stack
     * @return
     */
    int numOfElems();
    /**
     * Get the first element of the stack
     * @return
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
