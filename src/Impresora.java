/*
 * @Author: Juan José González Giraldo
 * @Date: 2021-07-23 20:07:05
 * @Last Modified by: Juan José González Giraldo
 * @Last Modified time: 2021-07-23 20:44:44
 */

/** {@link Impresora} is an abstraction of a printer */
public class Impresora {
  /** Unique identifier of the {@link Impresora} in the database */
  private int id;

  /** Unique identifier of the {@link Impresora} */
  private String serial;

  /** Manufacturer of the {@link Impresora} */
  private String marca;

  /** Flag indicating whether the {@link Impresora} has scanning capabilities */
  private Boolean escaner;

  /** Constructor without parameters */
  public Impresora() {
  }

  /**
   * Constructor with parameters
   *
   * @param serial  unique identifier for the new {@link Impresora}
   * @param marca   manufacturer of {@link Impresora}
   * @param escaner flag indicating {@link Impresora} scanning capabilities
   */
  public Impresora(String serial, String marca, Boolean escaner) {
    this.serial = serial;
    this.marca = marca;
    this.escaner = escaner;
  }

  /**
   * Returns the database unique identifier of the {@link Impresora}
   *
   * @return
   */
  public int getId() {
    return id;
  }

  /**
   * Sets the database unique identifier
   *
   * @param id database unique identifier of the {@link Impresora}
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Returns the {@link Impresora} serial
   *
   * @return
   */
  public String getSerial() {
    return serial;
  }

  /**
   * Changes the {@link Impresora} serial
   *
   * @param serial unique identifier for {@link Impresora}
   */
  public void setSerial(String serial) {
    this.serial = serial;
  }

  /**
   * Returns the manufacturer of {@link Impresora}
   *
   * @return
   */
  public String getMarca() {
    return marca;
  }

  /**
   * Changes the manufacturer of {@link Impresora}
   *
   * @param marca manufacturer of {@link Impresora}
   */
  public void setMarca(String marca) {
    this.marca = marca;
  }

  /**
   * Returns the escaner flag indicating {@link Impresora} scanning capabilities
   *
   * @return
   */
  public Boolean getEscaner() {
    return escaner;
  }

  /**
   * Changes the escaner flag indicating {@link Impresora} scanning capabilities
   *
   * @param escaner flag indicating {@link Impresora} scanning capabilities
   */
  public void setEscaner(Boolean escaner) {
    this.escaner = escaner;
  }

  /** Returns an String representation of {@link Impresora} */
  public String toString() {
    return "Impresora [serial=" + serial + ", marca=" + marca + ", escaner=" + escaner + "]";
  }
}