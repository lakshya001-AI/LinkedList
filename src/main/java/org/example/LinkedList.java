package org.example;

public class LinkedList {

    class Node{
        //Node class contains the value and next pointer
        int value;
        Node next;

        //constructor for the node
        public Node(int value){
            this.value = value;
        }
    }

    //linkedlist contains the head , tail, and length of the linked list

   private Node head;
    private Node tail;
    private int length;

    //constructor for the linkedlist

    public LinkedList(int value){
        Node newnode = new Node(value);
        head = newnode;
        tail = newnode;
        length = 1;
    }

    //So, there are various operations that we can perform using the linkedlist
    //like printlist, append , prepend, removelast, removefirst, get, set operations

    //printlist operation
    public void printlist(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    //append operation : append is used to add the node into the linkedlist from the last
    public void append(int value){
        Node newnode = new Node(value);
        if(length == 0){
            head = newnode;
            tail = newnode;
        }
        else {
            tail.next = newnode;
            tail = newnode;
            length++;
        }
    }

    //prepend operation : prepend is used to add the node into the linkedlist from the start
    public void prepend(int value){
        Node newnode = new Node(value);
        if (length == 0){
            head = newnode;
            tail = newnode;
        }
        else {
            newnode.next = head;
            head = newnode;
            length++;
        }
    }

    //remove last operation
    public Node removelast(){
        if(length == 0){
            return null;
        }
        Node temp = head;
        Node pre = head;

        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;

        return temp;
    }


    //remove first operation
    public Node removefirst()
    {
        if(length == 0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        return temp;
    }

    //get method operation
    public Node get(int index){
        Node temp = head;
        if(index < 0 || index > length){
            return null;
        }
        for (int i = 0 ; i < index ; ++i){
            temp = temp.next;
        }
        return  temp;
    }

    //set method operation
    public boolean set(int index, int value){
        if(index < 0 || index > length){
            return false;
        }

        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }






}
