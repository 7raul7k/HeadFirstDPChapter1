package ro.myClass.ducks;

public class RedHeadDuck extends Duck implements QuackBehavior, FlyBehavior {

    Quack quack;
    FlyWithWings fly;
    @Override
    public void display() {
        System.out.println("RedHead Duck");
    }

    @Override
    public void fly() {
        fly.fly();

    }

    @Override
    public void quack() {
        quack.quack();

    }
}
