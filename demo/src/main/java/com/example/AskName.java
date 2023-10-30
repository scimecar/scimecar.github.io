package com.example;

import java.util.Scanner;

public class AskName {
    
    public static void ask(String msg){
        
    Scanner input = new Scanner(System.in);
    System.out.println(msg);
    String userName = input.nextLine();
    System.out.println("Hello " + userName + "!");
    
    input.close();

    }
    
}
