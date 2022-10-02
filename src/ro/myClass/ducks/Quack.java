package ro.myClass.ducks;

public  class Quack implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("Quack");
    }

}
