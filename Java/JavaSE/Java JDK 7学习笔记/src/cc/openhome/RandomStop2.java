package cc.openhome;

/**
 * cc.openhome
 * Created by pcwuyu on 16-7-10.
 * File Encoding: UTF-8
 * E-mail: pcwuyu1@gmail.com
 */
public class RandomStop2 {
    public static void main(String[] args) {
        int number;
        do {
            number = (int) (Math.random() * 10);  //随机数
            System.out.println(number);
        } while (number != 5);  //再判断要不要继续执行, 注意while之后有；
        System.out.println("I hit 5... Orz");
    }
}
