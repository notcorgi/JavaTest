package filecopy;
//利用字节流FileInputStream复制文件并在文件后面加上自定义字符串   使用try catch捕捉处理异常
import java.io.*;

public class CopyFile {
    public static void main(String[] args)  {
        File file=new File("/Users/lishubin/Desktop/test.txt");
        File file1=new File("/Users/lishubin/Desktop/testcopy.txt");
        byte[] buffer=new byte[100];//
        try(InputStream inputStream=new FileInputStream(file);OutputStream outputStream=new FileOutputStream(file1)){
            int len;
            while((len=inputStream.read(buffer))!=-1){//返回收到的实际读取的字节数len
                outputStream.write(buffer,0,len);//buffer中从0开始的len个字节，排除原buffer中的数的影响
                String string=new String(buffer,0,len,"uTf-8"); //字节数组转string
                System.out.print(string);//在控制台打印原文件内容
            }
            String string="我是复制文件1";  //自定义字符串
            outputStream.write(string.getBytes("utf-8")); //文件末尾加上自定义字符串
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println("finish");
    }
}
