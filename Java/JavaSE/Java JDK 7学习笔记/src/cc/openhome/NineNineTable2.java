package cc.openhome;

/**
 * p.75 九九乘法2 hack版
 * cc.openhome
 * Created by pcwuyu on 16-7-17.
 * File Encoding: UTF-8
 * E-mail: pcwuyu1@gmail.com
 */
public class NineNineTable2 {
    public static void main(String[] args) {
        for (int i = 2, j = 1; j < 10; i = (i == 9) ? ((++j / j) + 1) : (i + 1)) {
            System.out.printf("%d*%d=%2d%c", i, j, i * j, (i == 9 ? '\n' : ' '));
        }
    }
}

/**
 * 默认为true，表示无线循环
 * for (;;) {
 * ...
 * }
 */

