package filecopy;
//使用Bufferedoutputstream 加字节数组复制文件

import java.io.*;

public class CopyCSDN3 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        File file1 = new File("C:\\Users\\李书彬\\Desktop\\picture.png");
        File file2 = new File("C:\\Users\\李书彬\\Desktop\\picturecopy.png");
        try (BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file1));
             BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(file2));) {
            byte[] bytes = new byte[1024];//创建1024B字节数组
            int len;
            while ((len = bi.read(bytes)) != -1) {
                bo.write(bytes, 0, len);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        long end = System.currentTimeMillis();
        System.out.println("finish,耗时:" + (end - start) + "毫秒");


    }
}
