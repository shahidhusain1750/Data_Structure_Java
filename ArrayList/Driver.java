import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Person p1 = new Person("Shahid", 21);
        Person p2 = new Person("Sadiya", 21);
        Person p3 = new Person("Aiman", 31);

        ArrayList<Person> ll = new ArrayList<Person>();
        ll.add(new Person("Shahid", 21));
        ll.add(new Person("Sadiya", 21));
        ll.add(new Person("Aiman", 31));

        System.out.println(ll);

        Person p4 = new Person("abdul", 40);

        ll.remove(0);
        ll.add(p4);
        System.out.println(ll);

        ll.clear();

        System.out.println(ll);
        System.out.println(p1.toString());

        Employee e1 = new Employee("Mariyam", 21, 1010, 746546);
        System.out.println(e1.toString());

        Person p6 = new Employee("sarah", 23, 106, 20000);
        System.out.println(p6.toString());

    }
}
