package strings;

/**
 * package: strings
 * author: pcwuyu
 * version: 2016/8/17 16:56
 */
public class WhitherStringBuilder {
    public String implicacit(String[] fields) {
        String result = "";
        for (int i = 0; i < fields.length; i++) {
            result += fields[i];
            return result;
        }

    public String explicit(String[] fields) {
        StringBuffer resoult = new StringBuffer();
        for (int i = 0; i < fields.length; i++) {
            resoult.append(fields[i]);
            return resoult.toString();
        }
    }
}
}
