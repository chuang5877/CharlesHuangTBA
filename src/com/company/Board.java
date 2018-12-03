package com.company;

public class Board {
    String[][] Board;
    private int x;
    private int y;
    public Board(String difficulty){
        if(difficulty.equalsIgnoreCase("Easy")){
            this.Board=new String[5][5];
        }else if(difficulty.equalsIgnoreCase("Normal")){
            this.Board=new String[7][7];
        }else if(difficulty.equalsIgnoreCase("Hard")){
            this.Board=new String[9][9];
        }else{

        }
    }
}
