package ro.myClass.ducks;

public class MiniDuckSimulator {

        public static void main(String[] args){
            Duck mallard = new MallardDuck();
            mallard.performQuack();
            mallard.performFly();

            Duck model = new ModelQuack();
            model.performFly();
            model.setFlyBehavior(new FlyRocketPowered());
            model.performFly();


    }



}
