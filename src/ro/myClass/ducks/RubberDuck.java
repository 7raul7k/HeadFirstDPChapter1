package ro.myClass.ducks;

public class RubberDuck extends Duck implements QuackBehavior, FlyBehavior {
    @Override
    public void quack() {

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
