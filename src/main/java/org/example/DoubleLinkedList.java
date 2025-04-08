package org.example;

public class DoubleLinkedList {
    public Node first;
    public Node last;

    public DoubleLinkedList() {
        first = null;
        last = null;
    }

    public void insertAtFirst(UserAction userAction) {
        Node newNode = new Node(userAction);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            first.previous = newNode;
            newNode.next = first;
            first = newNode;
        }
    }

    public Node last(){
        return last;
    }

    public UserAction removeAtFirst() {
        if (first == null) {
            return null;
        } else {
            Node removedNode = first;
            if (first == last) {
                first = null;
                last = null;
            } else {
                first = first.next;
                first.previous = null;
            }
            return removedNode.getUserAction();
        }
    }

    public void printUserActions() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.userAction.toString() + "\n\n");
            temp = temp.next;
        }
        System.out.println();
    }
}
