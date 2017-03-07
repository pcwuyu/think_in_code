package cc.openhome;

import java.math.BigDecimal;

/**
 * cc.openhome
 * Created by pcwuyu on 16-7-11.
 * File Encoding: UTF-8
 * E-mail: pcwuyu1@gmail.com
 */
public class DecimalDemo2 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.1");
        BigDecimal c = new BigDecimal("0.1");
        BigDecimal result = new BigDecimal("0.3");

        if (a.add(b).add(c).equals(result)) {
            System.out.println("等于 0.3");
        } else {
            System.out.println("不等于 0.3");
        }
    }
}
