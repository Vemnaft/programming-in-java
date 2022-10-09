package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * interface for all the queue methods
 * @param <E>
 */
public interface MyQueue<E> {
    /**
     * Add elements to the queue
     * @param x
     */
    void enqueue(E x);

    /**
     * Remove elements from the queue
     * @return
     */
    E dequeue();

    /**
     * Method to check if the queue is empty
     * @return
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * Method that returns the number of elements in the queue
     * @return
     */
    int numOfElems();

    /**
     * Get the first element of the queue
     * @return
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
