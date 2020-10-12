/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class Car {
    private int yearModel;
    private String make;
    private int speed = 0;
    private int accelerate = 5;
    private int brake = 5;

    public Car(int model, String make){
    this.yearModel = model;
    this.make = make;
    this.speed = 0;

    }
    
    public int accelerate(){
    return speed = accelerate + speed;
    }
    public int brake(){
    return speed = speed - brake;
    }
   
    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getAccelerate() {
        return accelerate;
    }

    public void setAccelerate(int accelerate) {
        this.accelerate = accelerate;
    }

    public int getBrake() {
        return brake;
    }
    
    public void setBrake(int brake) {
        this.brake = brake;
    }
    
    
}