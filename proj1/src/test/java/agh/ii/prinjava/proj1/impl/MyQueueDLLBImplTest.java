package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * To verify the enqueue, we can dequeue the queue, and verify the element
     */
    @Test
    void enqueue(){
        this.queueOfInts.enqueue(28);
        this.queueOfInts.enqueue(4);
        assertEquals(28, this.queueOfInts.dequeue());
    }

    /**
     * Because we remove the first element of the queue, we expect to remove the first element queued
     */
    @Test
    void dequeue(){
        this.queueOfInts.enqueue(28);
        this.queueOfInts.enqueue(4);
        this.queueOfInts.enqueue(13);
        assertEquals(28, this.queueOfInts.dequeue());
    }

    /**
     * We just check the number of elements in the queue
     */
    @Test
    void numOfElems(){
        this.queueOfInts.enqueue(28);
        this.queueOfInts.enqueue(4);
        this.queueOfInts.enqueue(13);
        this.queueOfInts.enqueue(6);
        assertEquals(4, this.queueOfInts.numOfElems());
    }

    /**
     * We look at the last element of the queue that was queued
     */
    @Test
    void peek(){
        this.queueOfInts.enqueue(28);
        this.queueOfInts.enqueue(4);
        this.queueOfInts.enqueue(13);
        assertEquals(13, this.queueOfInts.peek());
    }
}