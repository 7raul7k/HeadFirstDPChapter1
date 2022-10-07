package ro.myClass.ducks;

public class MuteQuack implements QuackBehavior{
    FlyWithWings fly;
    @Override
    public void fly() {
        fly.fly();
    }

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
