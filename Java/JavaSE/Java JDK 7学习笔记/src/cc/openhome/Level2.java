package cc.openhome;

/**
 * p.73
 * cc.openhome
 * Created by pcwuyu on 16-7-17.
 * File Encoding: UTF-8
 * E-mail: pcwuyu1@gmail.com
 */
public class Level2 {
    public static void main(String[] args) {
        int score = 88;
        int quotient = score / 10;
        char level;
        switch (quotient) {
            case 10:
            case 9:
                level = 'A';
                break;
            case 8:
                level = 'B';
                break;
            case 7:
                level = 'C';
                break;
            case 6:
                level = 'D';
                break;
            default:
                level = 'E';
        }
        System.out.println("得分等级" + level);
    }
}
