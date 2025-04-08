package org.example;

public class UserActionManagement {
    public DoubleLinkedList doubleLinkedListMain;
    public DoubleLinkedList doubleLinkedListUndo;

    long autoIncrementUserActionId;

    public UserActionManagement(){
        doubleLinkedListMain = new DoubleLinkedList();
        doubleLinkedListUndo = new DoubleLinkedList();
        autoIncrementUserActionId = 0;
    }

    public void insertUserActionList(UserAction userAction){
        userAction.setId(++autoIncrementUserActionId);
        doubleLinkedListMain.insertAtFirst(userAction);
        //limpar doubleLinkedListUndo
        while (doubleLinkedListUndo.removeAtFirst() != null) {
            doubleLinkedListUndo.removeAtFirst();
        }
    }

    public void UndoUserActionList(){
        UserAction removedUserAction = doubleLinkedListMain.removeAtFirst();
        doubleLinkedListUndo.insertAtFirst(removedUserAction);
        System.out.println("UserAction removed: " + removedUserAction.toString());
    }

    public void redoUserActionList(){
        UserAction redoneUserAction = doubleLinkedListUndo.removeAtFirst();
        doubleLinkedListMain.insertAtFirst(redoneUserAction);
        System.out.println("UserAction redone: " + redoneUserAction.toString());
    }

    public void printUserActions(){
        if (doubleLinkedListMain != null && doubleLinkedListMain.first != null){
            doubleLinkedListMain.printUserActions();
        } else {
            System.out.println("No actions found!");
        }
    }
}
