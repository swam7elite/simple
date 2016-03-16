package Catch;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Swam on 15.03.16.
 */
public class Main  {
    public static void main(String[] args) throws IOException {
        Generator generator = new Generator();
        Reader rd = new Reader();
        System.out.println("Введите количество символов в пароле: ");
        int tmp = rd.read();
        generator.genPass = new String[tmp];
        System.out.print("Ваш пароль: ");
        generator.passGen();
        try (FileWriter writer = new FileWriter("")){

        }
    }
}
