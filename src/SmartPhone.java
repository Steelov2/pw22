public class SmartPhone {
  private String model;
  private String brand;
  private int dateOfRelease;

  public SmartPhone(String model, String brand, int dateOfRelease) {
    this.model = model;
    this.brand = brand;
    this.dateOfRelease = dateOfRelease;
  }

  Person person=new Person("Muslim",2001);
  public void start() {
    System.out.println("The smartphone is started");
  }

  @Override
  public String toString() {
    return "SmartPhone{" +
        "model='" + model + '\'' +
        ", brand='" + brand + '\'' +
        ", dateOfRelease=" + dateOfRelease +
        '}';
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getDateOfRelease() {
    return dateOfRelease;
  }

  public void setDateOfRelease(int dateOfRelease) {
    this.dateOfRelease = dateOfRelease;
  }
}
