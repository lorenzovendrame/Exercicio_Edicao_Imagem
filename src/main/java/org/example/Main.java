package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserActionManagement userActionManagement = new UserActionManagement();
        while (true){

            System.out.println("=========================================");
            System.out.println("|   Gerenciamento de Ações do Usuário   |");
            System.out.println("=========================================");
            System.out.println("| Opções :                              |");
            System.out.println("|      1. Inserir Ações                 |");
            System.out.println("|      2. Desfazer Ações                |");
            System.out.println("|      3. Refazer Ações                 |");
            System.out.println("|      4. Mostrar Todas as Ações        |");
            System.out.println("|      5. Sair                          |");
            System.out.println("=========================================");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1:
                    Scanner userActionDescriptionScan = new Scanner(System.in);
                    System.out.println("Insira a descrição da Ação do Usuário: ");
                    String userActionDescription = userActionDescriptionScan.nextLine();
                    System.out.println("Insira o ID da Imagem Resultante: ");
                    int imageId = userActionDescriptionScan.nextInt();
                    UserAction userAction = new UserAction(userActionManagement.autoIncrementUserActionId, userActionDescription, imageId);
                    userActionManagement.insertUserActionList(userAction);
                    break;
                case 2:
                    if (userActionManagement.doubleLinkedListMain != null && userActionManagement.doubleLinkedListMain.last() != null) {
                        userActionManagement.UndoUserActionList();
                    } else {
                        System.out.println("Sem ações para serem desfeitas!");
                    }
                    break;
                case 3:
                    if (userActionManagement.doubleLinkedListUndo != null && userActionManagement.doubleLinkedListUndo.last() != null) {
                        userActionManagement.redoUserActionList();
                    } else {
                        System.out.println("Sem ações para serem refeitas!");
                    }
                    break;
                case 4:
                    userActionManagement.printUserActions();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }
        }
    }
}