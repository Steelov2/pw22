public class Person {
  private String fio;
  private Integer yearOfBirth;

  public Person() {
  }

  public Person(String fio) {
    this();
    this.fio = fio;
  }

  public Person(String fio, Integer yearOfBirth) {
    this(fio);
    this.yearOfBirth = yearOfBirth;
  }

  public void pushTheButtonStart() {
    System.out.println("The button start is pushed");
  }

  @Override
  public String toString() {
    return "Person{" +
        "fio='" + fio + '\'' +
        ", yearOfBirth=" + yearOfBirth +
        '}';
  }

  public String getFio() {
    return fio;
  }

  public void setFio(String fio) {
    this.fio = fio;
  }

  public Integer getYearOfBirth() {
    return yearOfBirth;
  }

  public void setYearOfBirth(Integer yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }
}
