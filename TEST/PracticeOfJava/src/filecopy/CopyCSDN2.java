package filecopy;
//利用字节流FileInputStream加单个字节复制文件  使用try catch捕捉处理异常

import java.io.*;

public class CopyCSDN2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        File file = new File("C:\\Users\\李书彬\\Desktop\\picture.png");
        File file1 = new File("C:\\Users\\李书彬\\Desktop\\picturecopy.png");
        try (InputStream inputStream = new FileInputStream(file); OutputStream outputStream = new FileOutputStream(file1)) {
            int len;
            while ((len = inputStream.read()) != -1) {//返回收到的实际读取的字节数len
                outputStream.write(len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        long end = System.currentTimeMillis();
        System.out.println("finish,耗时:" + (end - start) + "毫秒");
    }
}
