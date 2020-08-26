package cast;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Cast {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String string = "123";

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string);//String转StringBuffer
        /* 或*/
        StringBuffer stringBuffer1=new StringBuffer(string);//String转StringBuffer
        String string1=stringBuffer1.toString();//StringBuffer转String
        System.out.println("===========================================");


        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(string);//字符串转StringBuilder
        /*或*/
        StringBuilder stringBuilder1=new StringBuilder(string);//字符串转StringBuilder
        String string2=stringBuilder1.toString();//StringBuilder转String
        System.out.println("===========================================");


        char[] chars = string.toCharArray();//String转char数组
        String string3=new String(chars);//字符数组转String
        System.out.println("===========================================");


        int num=Integer.parseInt(string,10);//String转为10进制int整型
        String string4=""+num;//整数转String 需创建两个对象,char转String同理
        String string5=String.valueOf(num); //整数转String 只需创建一个对象，char转String同理
        System.out.println("===========================================");


        byte[] bytes1=string.getBytes(StandardCharsets.UTF_8);//String转byte数组 按utf-8进行编码(StandardCharsets.UTF_8或”UTF-8“均可)
        String string6=new String(bytes1,0,3,"UTF-8");//字节数组按编码方式转String(可能无法编码，会抛出异常)(StandardCharsets.UTF_8或”UTF-8“均可)
    }
}
