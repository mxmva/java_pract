package Homework1;

public class Task1 {
    public static void main(String[] args) {
        //Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] numbers = {5,9,3,66,7,2};
        int maximum = 0;
        int minimum = numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]< minimum) minimum=numbers[i];
            if(numbers[i]>maximum) maximum=numbers[i];
        }
        System.out.println(numbers);
        System.out.println("Min is " + minimum);
        System.out.println("Max is " + maximum);

    }
}
