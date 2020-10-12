/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class CarClass {

    public static void main(String[] args) {
        Car car0 = new Car(1998, "Ford");
        for (int i = 0; i < 5; i++) {
            int currentSpeed = car0.accelerate();
            System.out.println("The speed of car0 is: " + currentSpeed);
        }
        for (int j = 0; j < 5; j++) {
            int currentSpeed = car0.brake();
            System.out.println("The speed of car0 is:" + currentSpeed);
        }

    }
}
