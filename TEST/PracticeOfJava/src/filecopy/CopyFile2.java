package filecopy;
//利用字符流FileReader复制文件并在文件后面加上自定义字符串，使用throws抛出异常
import java.io.*;
import java.nio.charset.StandardCharsets;

public class CopyFile2 {
    public static void main(String[] args) throws IOException {
        File file=new File("/Users/lishubin/Desktop/test.txt");
        File file1=new File("/Users/lishubin/Desktop/testcopy.txt");
        try(Reader reader=new FileReader(file, StandardCharsets.UTF_8); Writer writer=new FileWriter(file1,StandardCharsets.UTF_8)){
            char[] chars=new char[100];
            int len;
            while ((len=reader.read(chars))!=-1){//实际读取len个字符
                writer.write(chars,0,len);
                 String string=new String(chars,0,len);//字符数组转string
                System.out.println(string);//在控制台打印原文件内容
            }
            String string="我是复制文件2";
            writer.write(string);
        }
        System.out.println("finish");
    }
}
