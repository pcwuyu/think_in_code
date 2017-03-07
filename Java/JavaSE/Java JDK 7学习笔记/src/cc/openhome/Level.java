package cc.openhome;

/**
 * p.72 switch表达式
 * cc.openhome
 * Created by pcwuyu on 16-7-17.
 * File Encoding: UTF-8
 * E-mail: pcwuyu1@gmail.com
 */
public class Level {
    public static void main(String[] args) {
        int score = 88;
        char level;
        if (score >= 90) {
            level = 'A';
        } else if (score >= 80 && score < 90) {
            level = 'B';
        } else if (score >= 70 && score < 80) {
            level = 'C';
        } else if (score >= 60 && score < 70) {
            level = 'D';
        } else {
            level = 'E';
        }
        System.out.println("得分等级" + level);
    }
}