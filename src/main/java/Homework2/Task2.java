package Homework2;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.FileWriter;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
// и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
public class Task2 {
    public static void main(String[] args) {
       String test = test100();
       createWriteFile(test);

        }
        static String test100(){
        StringBuilder test = new StringBuilder("TEST");
        StringBuilder str = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                str.append(test.toString());
            }
            return str.toString();
        }
        static void createWriteFile(String str){
        try(FileWriter writer = new FileWriter("newFile")){
            writer.write(str);
        } catch (Exception e){
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
        }
    }

