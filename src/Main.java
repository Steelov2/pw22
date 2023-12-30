public class Main {
  public static void main(String[] args) {
    Person person=new Person("Muslim",2001);
    SmartPhone smartPhone =new SmartPhone("Galaxy s23", "Samsung", 2023);
    person.pushTheButtonStart();
    smartPhone.start();
  }
}