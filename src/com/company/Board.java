package com.company;

import com.company.Rooms.Room;

public class Board {
    static Room[][] board;
    public Board(int h, int w){
        this.board=new Room[h][w];
    }
    public static int length(){
        int c=0;
        for(int i=0;i<board.length;i++){
            c++;
        }
        return c;
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

