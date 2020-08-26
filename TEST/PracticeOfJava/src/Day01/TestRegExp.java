package Day01;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegExp {
    public static void main(String[] args) {
        String str = "it is a do*wwg haha";
        Pattern pattern = Pattern.compile("\\wo\\*ww\\w");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            System.out.println(str.substring(matcher.start(),matcher.end()));
        }
        String string = matcher.replaceAll("代替字符串");
        System.out.println(string);
        System.out.println(str);  //原字符串不变
    }
}
