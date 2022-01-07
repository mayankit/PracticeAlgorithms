package com.mayankit.www.heap;

/**
 * This class contains the implementation of minHeap.
 *
 * Min heap have two properties.
 *
 * 1. Tree of minHeap is always complete
 * 2. Parent node element is always less than equal to its child elements
 */
public class MinHeap extends Heap{

    public MinHeap(int heapSize) {
        super(heapSize);
    }


    @Override
    protected void insertElement(int element) {
        heap[currentSize] = element;
        int index = currentSize;
        int parent = index/2;

        while(heap[index] < heap[parent] && index > 1){
            swap(index, parent);
            index = parent;
            parent = index/2;
        }
    }


    @Override
    protected int removeElement() {
        int removeElement = heap[1];

        heap[1] = heap[currentSize];
        currentSize--;

        int index = 1;

        while(index < currentSize && !isLeafNode(index)){

            int leftIndex = 2 * index;

            int rightIndex = 2 * index +1;

            if(heap[index] > heap[leftIndex] || heap[index] > heap[rightIndex]){
                if(heap[leftIndex] < heap[rightIndex]){
                    swap(index,leftIndex);
                    index = leftIndex;
                }else{
                    swap(index,rightIndex);
                    index = rightIndex;
                }
            }else{
                break;
            }
        }
        return removeElement;
    }
}
