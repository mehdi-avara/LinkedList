package com.company;

public class LinkedList {

    Integer number;
    LinkedList nextObj;
    
    /***
     * adds the specified element to the end of the list
     ***/
    public boolean add(Integer element) {
        return true;
    }

    /***
     * adds the specified element
     * at the specified index of your list
     ***/
    public void add(int index, Integer element) {

    }

    /***
     * append all of the elements
     * in the specified linkedlist to the end of this list
     ***/
    public boolean addAll(LinkedList linkedlist) {
        return true;
    }


    /**
     * appends all of the elements
     * in the specified linkedlist starting at the specified index
     ***/
    public boolean addAll(int index, LinkedList linkedlist) {
        return true;
    }

    /***
     * inserts a specified element at the beginning of this list
     ***/
    public void addFirst(Integer element) {

    }

    /***
     * appends the specified element at the end of this list
     ***/
    public void addLast(Integer element) {

    }

    /***
     * Removes all of the elements from this list. The list will be empty after this call returns.
     ***/
    public void clear() {

    }

    /***
     * Returns `true` if this list contains the specified element.
     ***/
    public boolean contains(Integer i) {
        return true;
    }

    /***
     * Returns the element at the specified position in this list.
     ***/
    public Integer get(int index) {
        return null;
    }

    /***
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     ***/
    public int indexOf(Integer i) {
return 1;
    }

    /***
     * Retrieves and removes the head (first element) of this list.
     ***/
    public Integer remove() {

        return null;
    }

    /***
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     *  Returns the element that was removed from the list.
     ***/
    public Integer remove(int index) {

        return null;
    }

    /***
     * Returns the number of elements in this list.
     ***/
    public int size() {

        return 0;
    }

    /***
     * Returns an array containing all of the elements in this list in proper sequence.
     ***/
    public Integer[] toArray() {

        return new Integer[0];
    }

    /***
     * Returns true if this list contains no elements.
     ***/
    public boolean isEmpty() {
        return true;
    }
}
