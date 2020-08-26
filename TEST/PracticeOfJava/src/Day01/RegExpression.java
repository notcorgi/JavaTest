//正则表达式分组过滤
package Day01;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("(\\d{2,3})\\-(\\d{7,8})");
        Matcher matcher = pattern.matcher("12-1234567");
        Scanner scanner = new Scanner(System.in);
        if (matcher.matches()){
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
        System.out.println("请输入：\n");
        String string = scanner.nextLine();
        String s = "(([1-9][0-9]{5,9}@qq)|([a-zA-Z1-9][a-zA-Z0-9]{5,9}@163))\\.com";
        if (string.matches(s)){
            System.out.println("匹配成功");
        }
        regEmail(string);
    }

    public static void regEmail(String str){
        Pattern pattern = Pattern.compile("(([1-9][0-9]{5,9}@qq)|([a-zA-Z1-9][a-zA-Z0-9]{5,9}@163))\\.com");
        Matcher matcher =pattern.matcher(str);
        if (matcher.matches()){
            System.out.println(matcher.group(1));
        }
    }
}
