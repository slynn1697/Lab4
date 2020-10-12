/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class Circle {
    private double radius;
    private double PI = 3.14159;
    public double area;
    public double diameter;
    public double circumference;
    
    public Circle(double radius){
    this.radius = radius;
    this.PI = 3.14159;
    }
    public Circle (){
    this.radius = 0.0;
    }
    
    public double area(){
    return area = PI * radius * radius;
    }
    
    public double diameter(){
    return diameter = radius * 2;
    }
    
    public double circumference(){
    return circumference = 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
    
}
