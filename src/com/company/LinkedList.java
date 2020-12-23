package com.company;

public class LinkedList {

    Node head;

    static class Node<T> {
        T data;
        Node next;

        Node(T d){
            data = d;
            next = null;
        }

    }

    private void printList(){
        Node n = head;
        while( n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new LinkedList.Node<>("First");

        Node<String> second = new Node<>("Second");
        linkedList.head.next = second;
        second.next = new Node<>("Three");

        linkedList.printList();
    }
}
