package ro.myClass.ducks;

public class RedHeadDuck extends Duck implements QuackBehavior, FlyBehavior {
    @Override
    public void display() {
        System.out.println("RedHead Duck");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }
}
