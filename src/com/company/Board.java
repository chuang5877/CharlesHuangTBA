package com.company;

import com.company.Rooms.Room;
import com.company.Person;

public class Board {
    Room[][]b;
    public Board(Room[][]b){
        this.b=b;
    }
    public Board(int h, int w){
        b=new Room[h][w];
    }
    public void printBoard(Person p1){
        String s="[ ]";
        String p="[X]";
        for(Room[] i:b){
            for(Room n:i) {
                if (i.equals(p1.getX()) && n.equals(p1.getY())) {
                    System.out.print(p);
                } else {
                    System.out.print(s);
                }
            }
            System.out.print('\n');
        }
    }
}

