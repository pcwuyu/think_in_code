package cc.openhome;

/**
 * cc.openhome
 * Created by pcwuyu on 16-7-17.
 * File Encoding: UTF-8
 * E-mail: pcwuyu1@gmail.com
 */
public class Odd {
    public static void main(String[] args) {
        int input = 10;
        int remain = input % 2;
        if (remain == 1) {
            System.out.println(input + "为奇数%n");
        } else {
            System.out.println(input + "为偶数%n");
        }
    }
}