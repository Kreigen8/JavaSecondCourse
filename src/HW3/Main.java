package HW3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("White");
        list.add("Black");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Red");
        list.add("Purple");
        list.add("Green");
        list.add("Red");
        list.add("Purple");
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Red");
        list.add("Purple");
        System.out.println(list);
        HashMap<String, Integer> hmap = new HashMap<>();
        for (String x:list) {
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hmap);

        PhoneBook phBook = new PhoneBook();
        phBook.add("Ivanov", 1111111L);
        phBook.add("Petrov", 2222222L);
        phBook.add("Sidorov", 3333333L);
        phBook.add("Ivanov", 4444444L);
        phBook.add("Petrov", 5555555L);
        phBook.add("Ivanov", 6666666L);
        System.out.println("Tel: " + phBook.get("Ivanov"));

    }
}
