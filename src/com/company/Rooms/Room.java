package com.company.Rooms;

import com.company.Person;

public class Room {
    Person p1;
    int x;
    int y;
    public void enterRoom(Person p){
        p1=p;
        p.setX(this.x);
        p.setY(this.y);
    }
    public void leaveRoom(Person p){
        p1=null;
    }
} 
