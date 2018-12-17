package com.company.Rooms;
import com.company.Main;
import com.company.Person;

import java.util.Scanner;

public class Door extends Room {
    public Door(int x,int y){
        super(x,y);
    }
    @Override
    public void enterRoom(Person n){
        p1=n;
        n.setX(this.x);
        n.setY(this.y);
        System.out.println("A door stands in front of you. You feel a cool breeze. Do you want to open it?");
        Scanner in=new Scanner(System.in);
        String i=in.nextLine();
        if(i.equalsIgnoreCase("yes")) {
            System.out.println("Congrats! You have exited the dungeon!");
            Main.gameOff();
        } else {
            System.out.println("You walk back into the dungeon.");
        }
    }
}
