package ro.myClass.example;

import ro.myClass.ducks.FlyBehavior;
import ro.myClass.ducks.QuackBehavior;

public class AirDrone implements FlyBehavior, QuackBehavior {
    @Override
    public void fly() {
        System.out.println("Drone is flying");
    }

    @Override
    public void quack() {
        System.out.println("Start Engine");
        System.out.println("Start flying !");

    }
}
