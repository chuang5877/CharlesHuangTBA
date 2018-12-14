package com.company;

import java.util.Scanner;
import com.company.Person;
import com.company.Rooms.Room;
import com.company.Rooms.EmptyRoom;
import com.company.Rooms.Skeleton;

public class Main {
    private static boolean gameOn = true;

    public static void main(String[] args) {
        Person p0=new Person(0,0);
        Board b1=new Board(4,4);
        Room[][] building=new Room[4][4];
        for(int i=0;i<building.length;i++){
            for (int c=0;c<building[i].length;c++){
              building[i][c]=new EmptyRoom(i,c);
            }
        }int x = (int)(Math.random()*building.length);
        int y = (int)(Math.random()*building.length);
        int a=(int)(Math.random()*building.length);
        int b=(int)(Math.random()*building.length);
        building[x][y] = new Skeleton(x, y);
        building[a][b]=new Skeleton(a,b);
        b1.printBoard(p0);
        Person p1=new Person(0,0);
        Scanner in=new Scanner(System.in);
        while (gameOn){
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, p1, building))
            {
                System.out.println("Your coordinates: Y=" + p1.getX() + " X=" + p1.getY());
                b1.printBoard(p0);
            }
            else {
                System.out.println("Please choose a valid move.");
            }


        }
        in.close();
        }
    public static boolean validMove(String move, Person p, Room[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getX() > 0)
                {
                    map[p.getX()][p.getY()].leaveRoom(p);
                    map[p.getX()-1][p.getY()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (p.getY()< map[p.getY()].length -1)
                {
                    map[p.getX()][p.getY()].leaveRoom(p);
                    map[p.getX()][p.getY() + 1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getX() < map.length - 1)
                {
                    map[p.getX()][p.getY()].leaveRoom(p);
                    map[p.getX()+1][p.getY()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getY() > 0)
                {
                    map[p.getX()][p.getY()].leaveRoom(p);
                    map[p.getX()][p.getY()-1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }
    public static void gameOff(){
        gameOn = false;
    }
}


