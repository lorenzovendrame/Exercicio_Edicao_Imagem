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

    public void removeAtLast() {
        if (last == null) {
            System.out.println("No actions to be removed");
        } else {
            System.out.println("Undo action: \n" + last.userAction.toString());
            if (last.userAction == first.userAction) {
                first = null;
            }
            last = last.previous;
            if (last != null) {
                last.next = null;
            }
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
