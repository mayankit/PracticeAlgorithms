package com.mayankit.www.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {


    @Test
    public void testMethods(){
     Heap minHeap = new MinHeap(6);
     minHeap.add(5);
     minHeap.add(2);
     minHeap.add(4);
     minHeap.add(8);
     minHeap.add(1);
     minHeap.add(6);
     minHeap.add(3);

        assertEquals(1, minHeap.pop());
        assertEquals(2, minHeap.pop());
        assertEquals(4, minHeap.pop());
        assertEquals(5, minHeap.pop());
        assertEquals(6, minHeap.pop());
        assertEquals(8, minHeap.pop());
        assertEquals(Integer.MIN_VALUE, minHeap.pop());
    }

}