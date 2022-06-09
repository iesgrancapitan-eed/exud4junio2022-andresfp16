/**
 * <p>
 * Paquete donde se encuentra la clase Byke y Vehicle
 */
package com.ARM.examen.junio;

/**
 * Clase Vehicle de la cual hereda Byke.
 * 
 * @author andres
 *
 */
public class Vehicle {

  /**
   * <p>
   * Variables de la clase las cuales son la velocidad --> speed y el marcha --> gear
   */
  protected int speed;
  protected int gear;

  /**
   * <p>
   * Constructor que crea un Vehiculo
   */
  public Vehicle() {
    super();
  }

  /**
   * <p>
   * Método que te devuelve la velocidad
   * @return Velocidad que es devuelta
   */
  public int getSpeed() {
    return speed;
  }

  /**
   * <p>
   * Te devuelve la marcha 
   * @return Marcha que es devuelta
   */
  public int getgear() {
    return gear;
  }

  /**
   * <p>
   * Cambia la velocidad del vehículo
   * @param speed Nueva velocidad que ha cambiado
   */
  public void setspeed(int speed) {
    this.speed = speed;
  }

  /**
   * <p>
   * Cambia la marcha de tu vehiculo
   * @param gear Nueva Marcha
   */
  public void setsgear(int gear) {
    this.gear = gear;
  }
  
  /**
   * <p>
   * Cambia la marcha de tu vehiculo
   * @param newGear Nueva Marcha
   */
  public void changeGear(int newGear) {     
      gear = newGear;
  }

  /**
   * <p>
   * Método que incrementa la velocidad 
   * @param increment Velocidad que se va a incrementar
   */
  public void speedUp(int increment) {
      speed = speed + increment;
  }
  /**
   * <p>
   * Método que decrementa la velocidad 
   * @param decrement Velocidad que se va a decrementa
   */
  public void applyBrakes(int decrement) {     
      speed = speed - decrement;
  }

  /**
   * <p>
   * Te devuelve la velocidad y la marcha de tu vehículo
   */
  public void printStates() {
      System.out.println("speed: " + speed
          + " gear: " + gear);
  }

}
