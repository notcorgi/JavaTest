package testWriter;
//测试outputstream与writer中 write方法的不同12；
import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestWriter {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream=new FileOutputStream("/Users/lishubin/Desktop/test2.txt");
        Writer writer=new FileWriter("/Users/lishubin/Desktop/test3.txt", StandardCharsets.UTF_8);
        outputStream.write("你好".getBytes());
        writer.write("hhhh");//写入内存，需要flush或close才能写入文件
        writer.flush();
    }
}
