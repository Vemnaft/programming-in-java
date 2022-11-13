package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * We remove the first node of the list and compare it with the expected value, it must be the last addFirst method used
     */
    @Test
    void addFirst(){
        dLinkList.addFirst(5);
        dLinkList.addFirst(13);
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        System.out.println(dLinkList);
        assertEquals(2, dLinkList.removeFirst());
    }

    /**
     * We remove the last node of the list and compare it with the expected value, it must be the last addLast method used
     */
    @Test
    void addLast(){
        dLinkList.addLast(5);
        dLinkList.addLast(13);
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        System.out.println(dLinkList);
        assertEquals(2, dLinkList.removeLast());
    }

    /**
     * We remove the first node of the list and compare it with the expected value, it must be the first addLast method used
     */
    @Test
    void removeFirst(){
        dLinkList.addLast(5);
        dLinkList.addLast(13);
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        System.out.println(dLinkList);
        assertEquals(5, dLinkList.removeFirst());
    }

    /**
     * We remove the last node of the list and compare it with the expected value, it must be the first addFirst method used
     */
    @Test
    void removeLast(){
        dLinkList.addFirst(5);
        dLinkList.addFirst(13);
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        System.out.println(dLinkList);
        assertEquals(5, dLinkList.removeLast());
    }

    @Test
    void ToStringTest(){
        dLinkList.addFirst(5);
        dLinkList.addFirst(13);
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        System.out.println(dLinkList);
        assertEquals("2,1,13,5,", dLinkList.toString());
    }
}