package ro.myClass.example;

import ro.myClass.ducks.FlyNoWay;

public  abstract class Drone {


    public void beep(){
        System.out.println("Beep");
    }
    public void spinRotors(){
        System.out.println("Start engine");

    }
    public void take_off(){
        System.out.println();
    }
}
