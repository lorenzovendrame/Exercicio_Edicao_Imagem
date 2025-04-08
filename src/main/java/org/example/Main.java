package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserActionManagement userActionManagement = new UserActionManagement();
        while (true){

            System.out.println("==============================");
            System.out.println("|   User Action Management   |");
            System.out.println("==============================");
            System.out.println("| Options :                  |");
            System.out.println("|      1. Insert Actions     |");
            System.out.println("|      2. Remove Actions     |");
            System.out.println("|      3. Print All Actions  |");
            System.out.println("|      4. Exit               |");
            System.out.println("==============================");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    Scanner userActionDescriptionScan = new Scanner(System.in);
                    System.out.println("Enter User Action Description: ");
                    String userActionDescription = userActionDescriptionScan.nextLine();
                    System.out.println("Enter ID of resulting image: ");
                    int imageId = userActionDescriptionScan.nextInt();
                    UserAction userAction = new UserAction(userActionManagement.autoIncrementUserActionId, userActionDescription, imageId);
                    userActionManagement.insertUserActionList(userAction);
                    break;
                case 2:
                    if (userActionManagement.doubleLinkedList != null && userActionManagement.doubleLinkedList.last() != null) {
                        userActionManagement.removeUserActionList();
                    } else {
                        System.out.println("No actions to be removed!");
                    }
                    break;
                case 3:
                    userActionManagement.printUserActions();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid option!");
                    break;
            }
        }
    }
}