package org.example;

public class Node {
    public UserAction userAction;
    public Node next;
    public Node previous;

    public Node(UserAction userAction) {
        this.userAction = userAction;
        this.next = null;
        this.previous = null;
    }

    public UserAction getUserAction() {
        return userAction;
    }
}
