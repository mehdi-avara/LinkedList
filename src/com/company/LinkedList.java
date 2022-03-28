package com.company;

public class LinkedList {

    private Integer number;
    private LinkedList nextObj;

    LinkedList() {
        nextObj = null;
    }

    /***
     * adds the specified element to the end of the list
     ***/
    public boolean add(Integer element) {
        LinkedList holder = this;
        while (holder.nextObj != null) {
            holder = holder.nextObj;
        }
        holder.number = element;
        holder.nextObj = new LinkedList();
        return true;
    }

    /***
     * adds the specified element
     * at the specified index of your list
     ***/
    public void add(int index, Integer element) {
//        if (index == 0 || this.nextObj == null) {
//            addFirst(element);
//        } else {
//            this.nextObj.add(index - 1, element);
//        }
        int count = 0;
        LinkedList linkedList = this;
        while (count!=index || this.nextObj == null) {
            linkedList=linkedList.nextObj;
            count++;
        }
        linkedList.addFirst(element);

    }

    /***
     * append all of the elements
     * in the specified linkedlist to the end of this list
     ***/
    public boolean addAll(LinkedList linkedlist) {
        LinkedList remoteHolder=this;
        while (remoteHolder.nextObj.nextObj!=null){
            remoteHolder=remoteHolder.nextObj;
        }
        remoteHolder.nextObj=linkedlist;
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
        LinkedList remoteHolder = this.nextObj;
        Integer numberHolder = this.number;
        this.number = element;
        this.nextObj = new LinkedList();
        this.nextObj.nextObj = remoteHolder;
        this.nextObj.number = numberHolder;
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
        LinkedList linkedList=this;
        int count = 0;
        while (linkedList.nextObj != null) {
            if (linkedList.number.equals(i)){
                return count;
            }
            linkedList=linkedList.nextObj;
            count++;
        }
        return -1;
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
        return nextObj==null;
    }
}
