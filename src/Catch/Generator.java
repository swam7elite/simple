package Catch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Swam on 15.03.16.
 */
public class Generator {


   private String[] abc = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
   private String[] abcUP = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"};
   private String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
   private int lenghtPassword;


    String[] genPass = new String[lenghtPassword];




    Random random = new Random();


    public void passGen() {

        for (int i = 0; i < genPass.length; i++) {
            int x = random.nextInt(3);
            if (x == 0) {
                genPass[i] = abc[random.nextInt(abc.length)];
            }
            if (x == 1) {
                genPass[i] = abcUP[random.nextInt(abcUP.length)];
            }
            if (x == 2) {
                genPass[i] = num[random.nextInt(num.length)];
            }


            System.out.print(genPass[i]);
        }
    }


}
