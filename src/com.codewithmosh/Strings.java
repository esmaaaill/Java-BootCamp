package com.codewithmosh;

public class Strings {
    public static void main(String[] args) {

        String message = "Hello World" + "!!";
        System.out.println(message);

        // Using Methods of String Class
        System.out.println(message.startsWith("Hello"));
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("o"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

        // escape sequences in strings
        // if you want to pring "" in the output you can use escape sequence \" to print it
        String message2 = "Hello \"World\"!!";
        System.out.println(message2);
        // newline escape sequence \n
        String message3 = "Hello \nWorld!!";
        System.out.println(message3);
        // tab escape sequence \t
        String message4 = "Hello \tWorld!!";
        System.out.println(message4);


    }
}
