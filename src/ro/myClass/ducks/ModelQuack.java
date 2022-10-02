package ro.myClass.ducks;

public class ModelQuack extends Duck{
    public ModelQuack(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display(){
        System.out.println("I'm a model duck");
    }
}
