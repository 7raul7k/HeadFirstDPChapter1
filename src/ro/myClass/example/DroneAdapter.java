package ro.myClass.example;

import ro.myClass.ducks.*;


public class DroneAdapter  implements QuackBehavior {

    Drone drone;
    public void display() {
        System.out.println("Im a drone");
    }

    @Override
    public void fly() {
        drone.spinRotors();
        drone.take_off();

    }

    @Override
    public void quack() {
        drone.beep();


    }
}
