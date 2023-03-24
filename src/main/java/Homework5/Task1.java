package Homework5;
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class Task1 {
    public static Map<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Имя: ");
        String str = sc.nextLine();
        sc.close();
        findPerson(str);
    }

    public static void addPerson() {
        phoneBook.put("Ivan", List.of("123", "234"));
        phoneBook.put("Svetlana", List.of("345", "456"));
        phoneBook.put("Kristina",List.of("567"));
        phoneBook.put("Petr",List.of("678", "789"));
        phoneBook.put("Mariya",List.of("890", "900"));
}
    public static void findPerson(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
