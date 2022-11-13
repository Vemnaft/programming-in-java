package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Because we remove the last element of the stack, we expect to remove the last element pushed
     */
    @Test
    void pop(){
        this.stackOfInts.push(28);
        this.stackOfInts.push(4);
        assertEquals(4, this.stackOfInts.pop());
    }

    /**
     * To verify the push, we can pop the stack, and verify the element
     */
    @Test
    void push(){
        this.stackOfInts.push(28);
        this.stackOfInts.push(4);
        this.stackOfInts.push(13);
        assertEquals(13, this.stackOfInts.pop());
    }

    /**
     * We just check the number of elements in the stack
     */
    @Test
    void numOfElems(){
        this.stackOfInts.push(28);
        this.stackOfInts.push(4);
        this.stackOfInts.push(13);
        assertEquals(3, this.stackOfInts.numOfElems());
    }

    /**
     * We look at the first element of the stack that was pushed
     */
    @Test
    void peek(){
        this.stackOfInts.push(28);
        this.stackOfInts.push(4);
        this.stackOfInts.push(13);
        assertEquals(28, this.stackOfInts.peek());
    }
}