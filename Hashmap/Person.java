public class Person {

    protected String name;
    protected int age;

    public Person() {
        System.out.println("Default constructor");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // @Override
    // public String toString() {
    // return "Person [name=" + name + ", age=" + age + "]";
    // }

    public void display() {
        System.out.println("Display of Person...");
    }

}