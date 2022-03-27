package com.company;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(1);
        linkedList1.add(3);
        System.out.println(linkedList1.size()); // 2
        linkedList1.add(1, 2);
        Integer list[] = linkedList1.toArray();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]); // 1 2 3
        }
        System.out.println(linkedList1.contains(4)); // false
        System.out.println(linkedList1.indexOf(1)); // 0
        LinkedList linkedList2 = new LinkedList();
        linkedList2.addAll(linkedList1);
        System.out.println(linkedList2.size()); // 3
        linkedList2.clear();
        System.out.println(linkedList2.isEmpty()); // true
    }
}
