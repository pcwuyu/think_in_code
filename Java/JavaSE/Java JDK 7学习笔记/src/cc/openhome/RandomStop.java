package cc.openhome;

/**
 * cc.openhome
 * Created by pcwuyu on 16-7-10.
 * File Encoding: UTF-8
 * E-mail: pcwuyu1@gmail.com
 */

/**
 * While->前测试循环
 * 在循环执行前先判断
 */
public class RandomStop {
    public static void main(String[] args) {
        while (true) { //直接执行
            int number = (int) (Math.random() * 10);  //随机0~9的数值
            System.out.println(number);
            if (number == 5) {
                System.out.println("I hit 5 ... Orz");
                break;  //遇到5离开循环
            }
        }
    }
}
