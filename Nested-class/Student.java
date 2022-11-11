public class Student {
    private String name;
    private double percentage;

    public Student() {
        super();
    }

    public Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    void result() {
        Marksheet m = new Marksheet();
        m.generateResult();
    }

    class Marksheet {

        void generateResult() {
            System.out.println("~~~ Mumbai Univercity ~~~");
            System.out.println("Name :" + name);
            System.out.println("Percentage :" + percentage);
        }
    }
}
