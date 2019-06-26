package com.kaminsky.ioCharStreams;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        con = System.console();
        if(con == null){
            System.out.println("No console found");
            return;
        }

        str = con.readLine("Enter a string: ");
        con.printf("Here is your string: %s\n", str);
    }
}
