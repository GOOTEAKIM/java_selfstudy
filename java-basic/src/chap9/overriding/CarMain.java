package chap9.overriding;

import chap9.ex1.GasCar;

public class CarMain {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();

        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();

    }
}
