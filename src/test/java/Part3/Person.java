package Part3;

public class Person {

    String fullName;
    int age;

    public void move() {
        System.out.println("Person рухається");
    }

    public void talk() {
        System.out.println("Person говорить");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

}
