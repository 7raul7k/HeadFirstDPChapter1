package ro.myClass.ducks;

public class DecoyDuck extends Duck implements QuackBehavior, FlyBehavior {
    @Override
    public void quack(){
        //do nothing
    }
    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }
    @Override
    public void fly(){
        //do nothing
    }
}
