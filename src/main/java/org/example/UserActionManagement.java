package org.example;

public class UserActionManagement {
    public DoubleLinkedList doubleLinkedList;
    long autoIncrementUserActionId;

    public UserActionManagement(){
        doubleLinkedList = new DoubleLinkedList();
        autoIncrementUserActionId = 0;
    }

    public void insertUserActionList(UserAction userAction){
        userAction.setId(++autoIncrementUserActionId);
        doubleLinkedList.insertAtFirst(userAction);
    }

    public void removeUserActionList(){
        doubleLinkedList.removeAtLast();
    }

    public void printUserActions(){
        if (doubleLinkedList != null && doubleLinkedList.first != null){
            doubleLinkedList.printUserActions();
        } else {
            System.out.println("No actions found!");
        }
    }
}
