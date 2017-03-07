package cc.openhome;

/**
 * cc.openhome
 * Created by pcwuyu on 16-7-10.
 * File Encoding: UTF-8
 * E-mail: pcwuyu1@gmail.com
 */

//定义Close类
class Clothes {
    String color;
    char size;
}

public class Field {
    public static void main(String[] args) {
        //建立Clothes实例
        Clothes c1 = new Clothes();
        Clothes c2 = new Clothes();

        //为个别对象的数据成员指定值
        c1.color = "red";
        c1.size = 'S';
        c2.color = "green";
        c2.size = 'M';

        //显示个别对象的数据成员值
        System.out.printf("c1 (%s, %c)%n", c1.color, c1.size);
        System.out.printf("c2 (%s, %c)%n", c2.color, c2.size);
    }
}