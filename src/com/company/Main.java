package com.company;

import java.util.Scanner;
import com.company.Person;
import com.company.Rooms.Room;
import com.company.Rooms.EmptyRoom;

public class Main {
    private static boolean gameOn = true;

    public static void main(String[] args) {
        Board b1=new Board(4,4);
        for(int i=0;0<Board.length();i++){
            for (int c=0;0<Board.length();c++){
                Room[i][c]=new EmptyRoom()
            }
        }
        b1.printBoard();
        Person p1=new Person(0,0);
        Scanner in=new Scanner(System.in);
    }
    public static void gameOff(){
        gameOn = false;
    }
}


