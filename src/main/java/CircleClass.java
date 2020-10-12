/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class CircleClass {
    public static void main(String[] args) {
        Circle newCirc = new Circle(5);
        double areaOfCirc = newCirc.area();
        double diameterOfCirc = newCirc.diameter();
        double circumferenceOfCirc = newCirc.circumference();
        System.out.println("The diameter of newCirc is:" + diameterOfCirc);
        System.out.println("The circumferance of newCirc is:" + circumferenceOfCirc);
        System.out.println("The area of newCirc is:" + areaOfCirc);

    }
}
