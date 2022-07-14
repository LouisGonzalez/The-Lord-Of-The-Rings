package game.utils;

import java.util.Scanner;

public class Terminal {
    
    public void showMessage(String message){
        System.out.println(message);
    }

    public int askNumber(String message){
        Scanner scanner = new Scanner(System.in);
        showMessage(message);
        return scanner.nextInt();
    }

    public String askString(String message){
        Scanner scanner = new Scanner(System.in);
        showMessage(message);
        return scanner.nextLine();
    }


}
