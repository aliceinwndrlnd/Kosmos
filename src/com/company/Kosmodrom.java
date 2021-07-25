package com.company;

public class Kosmodrom {

    public void welcomeToCosmos() {
        Shattl shattl = new Shattl();
        shattl.preStartChecking();
        shattl.startEngine();
        shattl.start();
        System.out.println("--------------------------------------------------------");
        SpaceX spaceX = new SpaceX();
        spaceX.preStartChecking();
        spaceX.startEngine();
        spaceX.start();

        }
    }





