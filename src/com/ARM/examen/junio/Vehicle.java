package com.ARM.examen.junio;



public class Vehicle {

  protected int speed;
  protected int gear;

  public Vehicle() {
    super();
  }

  public int getSpeed() {
    return speed;
  }

  public int getgear() {
    return gear;
  }

  public void setspeed(int speed) {
    this.speed = speed;
  }

  public void setsgear(int gear) {
    this.gear = gear;
  }

  public void changeGear(int newGear) {     
      gear = newGear;
  }

  public void speedUp(int increment) {
      speed = speed + increment;
  }

  public void applyBrakes(int decrement) {     
      speed = speed - decrement;
  }

  public void printStates() {
      System.out.println("speed: " + speed
          + " gear: " + gear);
  }

}
