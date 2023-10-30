package com.example;

import java.util.Scanner;

public class StringCompare {
    
    public static void ask(String msg){
        
    Scanner input = new Scanner(System.in);
    System.out.println(msg);
    String userName = input.nextLine();
    if (userName.equals("Ralph"))
    {
        System.out.println("Hello " + userName + "!");
    }
    else
    {
        System.out.println("You're not Ralph!");
    }
    
    input.close();

    }

}
