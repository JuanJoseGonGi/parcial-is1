/*
 * @Author: Juan José González Giraldo
 * @Date: 2021-07-23 20:07:05
 * @Last Modified by: Juan José González Giraldo
 * @Last Modified time: 2021-07-23 20:07:56
 */

/** Impresora is an abstraction of a printer */
public class Impresora {
  /** Unique identifier of the Impresora */
  private String serial;

  /** Manufacturer of the Impresora */
  private String marca;

  /** Flag indicating whether the Impresora has scanning capabilities */
  private Boolean escaner;

  /** Constructor without parameters */
  public Impresora() {
  }

  /**
   * Constructor with parameters
   *
   * @param serial  unique identifier for the new Impresora
   * @param marca   manufacturer of Impresora
   * @param escaner flag indicating Impresora scanning capabilities
   */
  public Impresora(String serial, String marca, Boolean escaner) {
    this.serial = serial;
    this.marca = marca;
    this.escaner = escaner;
  }

  /**
   * Returns the Impresora serial
   *
   * @return
   */
  public String getSerial() {
    return serial;
  }

  /**
   * Changes the Impresora serial
   *
   * @param serial unique identifier for Impresora
   */
  public void setSerial(String serial) {
    this.serial = serial;
  }

  /**
   * Returns the manufacturer of Impresora
   *
   * @return
   */
  public String getMarca() {
    return marca;
  }

  /**
   * Changes the manufacturer of Impresora
   *
   * @param marca manufacturer of Impresora
   */
  public void setMarca(String marca) {
    this.marca = marca;
  }

  /**
   * Returns the escaner flag indicating Impresora scanning capabilities
   *
   * @return
   */
  public Boolean getEscaner() {
    return escaner;
  }

  /**
   * Changes the escaner flag indicating Impresora scanning capabilities
   *
   * @param escaner flag indicating Impresora scanning capabilities
   */
  public void setEscaner(Boolean escaner) {
    this.escaner = escaner;
  }

  /** Returns an String representation of Impresora */
  public String toString() {
    return "Impresora [serial=" + serial + ", marca=" + marca + ", escaner=" + escaner + "]";
  }
}