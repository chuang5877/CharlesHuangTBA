package com.company;

public class Board {
    Room[][] board;
    public Board(int h, int w){
        this.board=new Room[h][w];
    }
    public void printBoard(){
        for(Room[] i:board){
            for(Room n:i){
                System.out.print(n);
            }
            System.out.print('\n');
        }
    }
}
