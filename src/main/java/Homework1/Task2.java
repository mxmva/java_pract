package Homework1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
//        Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны
//        быть отличны от заданного, а остальные - равны ему.
        int[] array = {3,2,2,3};
        int endItem = array.length;
        int val = 3;
        int shift =1;
            String arrayString = Arrays.toString(array);
            System.out.println("Current array" + arrayString);
        for (int i = 0; i < endItem - shift; i++) {
           while (array[endItem-shift]==val){
               shift++;
            }
           if(array[i] ==val){
               int tmp = array[i];
               array[i] = array[endItem-shift];
               array[endItem-shift]=tmp;
           }

        }
        arrayString = Arrays.toString(array);
        System.out.println("Sort array" + arrayString);
    }
}