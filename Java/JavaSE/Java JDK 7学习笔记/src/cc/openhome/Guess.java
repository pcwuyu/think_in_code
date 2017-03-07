package cc.openhome;

import java.util.Scanner;

/**
 * cc.openhome
 * Created by pcwuyu on 16-7-11.
 * File Encoding: UTF-8
 * E-mail: pcwuyu1@gmail.com
 */
public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //建立Scanner实例
        int number = (int) (Math.random() * 10);
        int guess;

        do {
            System.out.print("猜数字(0 ~ 9):");
            guess = scanner.nextInt();
        } while (guess != number);

        System.out.println("猜中了...XD");
    }
}
