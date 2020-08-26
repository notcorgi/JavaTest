package Day01;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestIO2 {
    public static void main(String[] args) throws IOException{
        write1();
        read1();
    }

    public static void write1()throws IOException{
        File file = new File("/Users/lishubin/Desktop/test1.txt");
        try(Writer file1 = new FileWriter(file,StandardCharsets.UTF_8)){
            String str = "liu hah李";
            file1.write(str);
        }

    }

    public static void read1() throws IOException {
        File file = new File("/Users/lishubin/Desktop/test1.txt");
        try(Reader file1 =new FileReader(file, StandardCharsets.UTF_8)) {
            char[] content = new char[100];
            int x = file1.read();
            System.out.println((char)(x));

            file1.read(content);
            System.out.println(content);
        }
    }
}
