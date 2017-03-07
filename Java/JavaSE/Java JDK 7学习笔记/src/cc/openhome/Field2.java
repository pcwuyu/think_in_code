package cc.openhome;

/**
 * cc.openhome
 * Created by pcwuyu on 16-7-11.
 * File Encoding: UTF-8
 * E-mail: pcwuyu1@gmail.com
 */
class Clothes2 {
    String color;
    char size;

    Clothes2(String color, char size) {  //定义构造函数
        //color 参数的值指定给这个对象的 color 成员
        this.color = color;
        this.size = size;
    }
}

public class Field2 {
    public static void main(String[] args) {  //定义构造函数
        //使用指定的构造函数构建对象
        Clothes2 c1 = new Clothes2("red", 'S');
        Clothes2 c2 = new Clothes2("green", 'M');

        System.out.printf("c1 (%s, %c)%n", c1.color, c1.size);
        System.out.printf("c2 (%s, %c)%n", c2.color, c2.size);
    }
}