package com.company;

import java.util.Scanner;

public class Main {
    private static boolean gameOn = true;

    public static void main(String[] args) {
        Board b1=new Board(4,4);
        b1.printBoard();
        Person p1=new Person(0,0);
        Scanner in=new Scanner(System.in);
    }
    public static void gameOff(){
        gameOn = false;
    }
}


