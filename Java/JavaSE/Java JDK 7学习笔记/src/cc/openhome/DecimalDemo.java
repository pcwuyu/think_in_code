package cc.openhome;

import java.math.BigDecimal;

/**
 * cc.openhome
 * Created by pcwuyu on 16-7-11.
 * File Encoding: UTF-8
 * E-mail: pcwuyu1@gmail.com
 */
public class DecimalDemo {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.8");
        BigDecimal c = a.subtract(b);
        System.out.println(c);
    }
}
