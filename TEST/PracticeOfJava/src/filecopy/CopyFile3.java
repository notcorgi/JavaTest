package filecopy;
//bufferReader/bufferWriter默认不读写换行符，需自己添加

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CopyFile3 {
    public static void main(String[] args) throws IOException {

        try (Reader reader = new FileReader("/Users/lishubin/Desktop/test.txt", StandardCharsets.UTF_8);//此处可写为匿名类
             Writer writer = new FileWriter("/Users/lishubin/Desktop/testcopy.txt", StandardCharsets.UTF_8);//此处可写为匿名类
             BufferedReader bufferedReader = new BufferedReader(reader);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();//添加换行，若无此操作则文件中数据均在同一行
            }
            bufferedWriter.write("我是复制文件3");

        }
        System.out.println("finish");
    }
}
