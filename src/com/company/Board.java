package com.company;

import com.company.Rooms.Room;

public class Board {
    Room[][] board;
    public Board(int h, int w){
        this.board=new Room[h][w];
    }
    public void printBoard(){
        String s="[ ]";
        for(Room[] i:board){
            for(Room n:i){
                System.out.print(s);
            }
            System.out.print('\n');
        }
    }
}

