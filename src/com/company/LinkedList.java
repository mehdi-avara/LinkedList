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
        LinkedList linkedList = this;
        for (int i = 0; i < index; i++) {
            linkedList = linkedList.nextObj;
        }
        linkedList.addFirst(element);

    }

    /***
     * append all of the elements
     * in the specified linkedlist to the end of this list
     ***/
    public boolean addAll(LinkedList linkedlist) {
        if (this.isEmpty()){
            this.number= linkedlist.number;
            this.nextObj=linkedlist.nextObj;
            return true;
        }
        LinkedList remoteHolder = this;
        while (remoteHolder.nextObj != null) {
            remoteHolder = remoteHolder.nextObj;
        }
        remoteHolder.nextObj = linkedlist;
        return true;
    }


    /**
     * appends all of the elements
     * in the specified linkedlist starting at the specified index
     ***/
    public boolean addAll(int index, LinkedList linkedlist) {
        LinkedList holder = this;
        for (int i = 0; i < index; i++) {
            holder = holder.nextObj;
        }

        return holder.addTo0Index(linkedlist);
    }

    private boolean addTo0Index(LinkedList linkedList) {
        linkedList.add(this.number);
        linkedList.addAll(this.nextObj);
        this.number = linkedList.number;
        this.nextObj = linkedList.nextObj;
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
        add(element);
    }

    /***
     * Removes all of the elements from this list. The list will be empty after this call returns.
     ***/
    public void clear() {
        this.nextObj = null;
        this.number = null;
    }

    /***
     * Returns `true` if this list contains the specified element.
     ***/
    public boolean contains(Integer i) {
        LinkedList linkedList = this;
        while (linkedList.nextObj != null) {
            if (i.equals(linkedList.number)) {
                return true;
            }
            linkedList=linkedList.nextObj;
        }
        return false;
    }

    /***
     * Returns the element at the specified position in this list.
     ***/
    public Integer get(int index) {
        LinkedList linkedList = this;
        for (int i = 0; i < index; i++) {
            linkedList=linkedList.nextObj;
        }
        return linkedList.number;
    }

    /***
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     ***/
    public int indexOf(Integer i) {
        LinkedList linkedList = this;
        int count = 0;
        while (linkedList.nextObj != null) {
            if (linkedList.number.equals(i)) {
                return count;
            }
            linkedList = linkedList.nextObj;
            count++;
        }
        return -1;
    }

    /***
     * Retrieves and removes the head (first element) of this list.
     ***/
    public Integer remove() {
        Integer result = this.number;
        this.number = this.nextObj.number;
        this.nextObj = this.nextObj.nextObj;
        return result;
    }

    /***
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     *  Returns the element that was removed from the list.
     ***/
    public Integer remove(int index) {
        LinkedList linkedList = this;
        for (int i = 0; i < index; i++) {
            linkedList = linkedList.nextObj;
        }
        return linkedList.remove();
    }

    /***
     * Returns the number of elements in this list.
     ***/
    public int size() {
        int count = 0;
        LinkedList linkedList=this;
        while (linkedList.nextObj!=null) {
            count++;
            linkedList=linkedList.nextObj;
        }
        return count;
    }

    /***
     * Returns an array containing all of the elements in this list in proper sequence.
     ***/
    public Integer[] toArray() {
        Integer[] result = new Integer[this.size()];
        LinkedList linkedList = this;
        for (int i = 0; i < result.length; i++) {
            result[i]=linkedList.number;
            linkedList=linkedList.nextObj;
        }
        return result;
    }

    /***
     * Returns true if this list contains no elements.
     ***/
    public boolean isEmpty() {
        return nextObj == null;
    }
}
