import java.util.HashMap;

public class Hasmap {
    public static void main(String[] args) {
        HashMap<String, Person> map = new HashMap<>();
        map.put("EM001", new Person("Shahid", 21));
        map.put("EM002", new Person("Mohammed", 23));
        map.put("EM003", new Person("Aiman", 31));

        System.out.println("Size of map is :" + map.size());
        System.out.println(map);

        if (map.containsKey("EM001")) {
            Person p = map.get("EM001");
            System.out.println(p);
            p.display();
        }
    }
}
