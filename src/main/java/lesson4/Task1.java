package lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();


        {prev: Null, value: "null", next: "1", index: 0}
        {prev: 0, value: "null", next: "2", index: 1}
        {prev: 1, value: "Hello", next: Null, index: 2}



        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку вида \"text~num\": ");
            String input = scanner.nextLine();
            if (input.equals("stop"))
                break;
            String[] parts = input.split("~");

            if (parts[0].equals("print")) {
                int position = Integer.parseInt(parts[1]);
                System.out.println(list.get(position));
                list.remove(position);
                continue;
            }
            list.add(Integer.parseInt(parts[1]), parts[0]);
            System.out.println(list);
        }
    }
}
