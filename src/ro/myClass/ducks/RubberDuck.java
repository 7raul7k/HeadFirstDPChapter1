package ro.myClass.ducks;

public class RubberDuck extends Duck implements QuackBehavior, FlyBehavior {
   Quack quack;
    @Override
    public void quack() {
    quack.quack();
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
    @Override
    public void fly(){
        // do nothing
    }
}
