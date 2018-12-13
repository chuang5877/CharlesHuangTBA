package com.company.Rooms;

import com.company.Main;
import com.company.Person;
import java.util.Scanner;

public class Skeleton extends Room {

    public Skeleton(int x,int y){

    }
    public void enterRoom(Person n){
        p1=n;
        n.setX(this.x);
        n.setY(this.y);
        System.out.print("You enter a room with a skeleton. The skeleton approaches you. Do you want to attack?");
        Scanner in=new Scanner(System.in);
        String i=in.nextLine();
        if(i.equalsIgnoreCase("yes")){
            double coin=Math.random();
            if(coin<=.5){
                System.out.println("You bleed to death on the filthy dungeon floor");
                Main.gameOff();
            }else{
                System.out.println("The skeleton falls apart. You wouldn't want to wait to see if it could rebuild itself");
            }
        }
    }
}
