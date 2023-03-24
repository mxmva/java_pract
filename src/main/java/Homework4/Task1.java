package Homework4;

import java.util.Scanner;
import java.util.Stack;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, апервая - последней.
 Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class Task1 {
    public static void main(String[] args) {
        String a;


            Scanner in = new Scanner(System.in);
            Stack<String> stack = new Stack<>(); // LIFO - last in first out
            do {
                a = in.next();
                if (!a.equals("print") && !a.equals("revert") && !a.equals("Q")) {
                    stack.push(a);
                } else if (a.equals("print")) {
                    for (int i=stack.size()-1; i>=0; i--) {
                        System.out.println(stack.elementAt(i));
                    }
                } else if (a.equals("revert")) {
                    stack.pop();
                }
            } while (!a.equals("Q"));System.out.println(stack);
        }
    }

