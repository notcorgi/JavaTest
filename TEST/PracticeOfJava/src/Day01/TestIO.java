package Day01;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TestIO {
    public static void read1() throws IOException {
        File file = new File("/Users/lishubin/Desktop/test1.txt");
        if (file.isDirectory()){
            File list[] = file.listFiles();
//            System.out.println(list[0]);

            for(File a:list){
                System.out.println(a);
            }

        }
        else {
            byte[] bytes=new byte[10];
            try(FileInputStream input = new FileInputStream(file)){
                System.out.println(input.read(bytes));
               String ch =new String(bytes,"UTF-8");    //decode
               System.out.println(ch);
                }
            }
        try(FileOutputStream output = new FileOutputStream(file)){
            output.write("hello 李书彬".getBytes("UTF-8"));   //encode
        }
    }
    public static void main(String[] args) throws IOException{
        read1();
    }
}
