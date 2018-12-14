package com.company.Rooms;
import com.company.Main;
import com.company.Person;

import java.util.Scanner;

public class EmptyRoom extends Room {
    public EmptyRoom(int x,int y){
        super(x,y);
    }
    @Override
    public void enterRoom(Person n){
        p1=n;
        n.setX(this.x);
        n.setY(this.y);
        System.out.println("There's a big red button in the middle of the room. Do you want to press it?");
        Scanner in=new Scanner(System.in);
        String i=in.nextLine();
        if(i.equalsIgnoreCase("yes")) {
            double coin = Math.random();
            if (coin < .1) {
                System.out.println("A white light appears and consumes you.");
                Main.gameOff();
            } else {
                System.out.println("Nothing happens.");

            }
        }
    }
}
