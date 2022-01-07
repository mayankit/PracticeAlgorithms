package com.mayankit.www.heap;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;


class MaxHeapTest {

    @Test
    public void testMethods(){
        Heap maxHeap = new MaxHeap(6);
        maxHeap.add(5);
        maxHeap.add(2);
        maxHeap.add(4);
        maxHeap.add(8);
        maxHeap.add(1);
        maxHeap.add(6);
        maxHeap.add(3);

        assertEquals(8, maxHeap.pop());
        assertEquals(6, maxHeap.pop());
        assertEquals(5, maxHeap.pop());
        assertEquals(4, maxHeap.pop());
        assertEquals(2, maxHeap.pop());
        assertEquals(1, maxHeap.pop());
        assertEquals(Integer.MIN_VALUE, maxHeap.pop());

    }
}