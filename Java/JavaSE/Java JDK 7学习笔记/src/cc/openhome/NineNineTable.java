package cc.openhome;

/**
 * p.74 九九乘法
 * cc.openhome
 * Created by pcwuyu on 16-7-17.
 * File Encoding: UTF-8
 * E-mail: pcwuyu1@gmail.com
 */
public class NineNineTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d*%d=%2d ", i, j, i * j);
            }
            System.out.println();
        }
    }
}
