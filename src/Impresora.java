public class Impresora {
  private String serial;
  private String marca;
  private Boolean escaner;

  public Impresora() {
  }

  public Impresora(String serial, String marca, Boolean escaner) {
    this.serial = serial;
    this.marca = marca;
    this.escaner = escaner;
  }

  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public Boolean getEscaner() {
    return escaner;
  }

  public void setEscaner(Boolean escaner) {
    this.escaner = escaner;
  }

  public String toString() {
    return "Impresora [serial=" + serial + ", marca=" + marca + ", escaner=" + escaner + "]";
  }
}