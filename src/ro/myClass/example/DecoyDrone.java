package ro.myClass.example;

import ro.myClass.ducks.FlyBehavior;
import ro.myClass.ducks.FlyNoWay;
import ro.myClass.ducks.Quack;
import ro.myClass.ducks.QuackBehavior;

public class DecoyDrone implements FlyBehavior, QuackBehavior {
    FlyNoWay flyNoWay;
    @Override
    public void fly() {
        flyNoWay.fly();
    }

    @Override
    public void quack() {
        System.out.println("Engine cant started because is a decoy drone");

    }
}
