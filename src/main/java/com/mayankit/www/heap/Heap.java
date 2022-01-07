package com.mayankit.www.heap;

/**
 * Abstract class to define the common method for the heap and
 * definitions for the abstract method that need to be implemented by the
 * different types of heap ie Max or Min
 */
public abstract class Heap {

    //This is the array that keep the elements of the heap
    int[] heap;

    //This is the size of heap. One thing that I don't like with this implementation is
    // We need to increase the size of Array, If number of elements need to be increased.
    // and may be reduced the size of Array , if number of elements are too low.
    //For this implementation ,I am not going into all those complexities and trying to keep it simple.
    int heapSize;

    // This indicates the number of elements in the heap
    int currentSize;

    //Constructor which is common for all the implementations
    public Heap( int heapSize) {
        this.heapSize = heapSize;
        this.heap = new int[heapSize+1];

        //I figured out that its better to not use the 0th index
        // for any implementation of heap. That will keep the logic very straight forward
        // When we try to figure out the child nodes or parent nodes
        heap[0] = 0;
    }

    /**
     * Method to add the element in the heap
     * @param element added element
     */
    public void add(int element){
        currentSize++;

        if(currentSize > heapSize){
            //Ideally throw exception or implement array extension logic
            System.out.println("Heap is full, We cannot insert more elements");
            currentSize--;
            return;
        }

        insertElement(element);
    }

    protected abstract void insertElement(int element);

    /**
     * Gives the peek element of the heap
     *
     * @return integer value
     */
    public int peek(){
        return heap[1];
    }

    /**
     * Give the top element of the heap and
     * also delete it from the heap.
     *
     * @return integer value
     */
    public  int pop(){
        if(currentSize < 1){
            System.out.println("This heap is empty and There is nothing to remove");
            return Integer.MIN_VALUE;
        }else{
            return removeElement();
        }
    }

    protected abstract int removeElement();

    /**
     * Return the size of the heap.
     * Which represents the number of elements int the heap
     *
     * @return int value of size
     */
    public int size(){
        return currentSize;
    }

    /**
     * Swap the elements of heap. Helper method when push/pop element from heap
     * @param index
     * @param parent
     */
    protected void swap(int index, int parent){
        int temp = heap[index];
        heap[index] = heap[parent];
        heap[parent] = temp;
    }

    protected boolean isLeafNode(int index){
        return index > currentSize/2;
    }

}
