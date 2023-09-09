package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        LinkedList linkedList = new LinkedList(23);

        linkedList.append(34);
        linkedList.append(56);
        linkedList.append(89);

        System.out.println("After append");
        linkedList.printlist();
        System.out.println();

        linkedList.prepend(12);
        linkedList.prepend(10);

        System.out.println("After prepend");
        linkedList.printlist();
        System.out.println();

        linkedList.removelast();
        linkedList.removelast();
        System.out.println("After remove last");
        linkedList.printlist();
        System.out.println();

        linkedList.removefirst();
        linkedList.removefirst();
        System.out.println("After remove first");
        linkedList.printlist();

        System.out.println();
        System.out.println("Get value by index ");
        System.out.println(linkedList.get(1).value);
        System.out.println(linkedList.get(0).value);


        System.out.println();
        System.out.println("set value by index ");
        System.out.println(linkedList.set(1, 34));
        System.out.println(linkedList.set(0, 67));


        System.out.println();
        linkedList.printlist();









    }
}