package edu.gmu.bah.class14.lab2;

/**
 * Created by student on 5/13/14.
 */
public class Car implements Vehicle {

    @Override
    public void drive(int speed) {
        if(speed > 90) {
            System.out.println("Too Fast");
        } else {
            System.out.println("Driving " + speed + "mph");
        }
    }

    @Override
    public int wheel_count() {
        return 4;
    }

    @Override
    public int door_count() {
        return 4;
    }

    @Override
    public String honk() {
        return "beep beep";
    }


}
