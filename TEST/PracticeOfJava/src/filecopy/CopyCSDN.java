package filecopy;
//利用字节流FileInputStream加字节数组复制文件  使用try catch捕捉处理异常

import java.io.*;

public class CopyCSDN {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        File file = new File("C:\\Users\\李书彬\\Desktop\\picture.png");
        File file1 = new File("C:\\Users\\李书彬\\Desktop\\picturecopy.png");
        byte[] buffer = new byte[1024];// 创建1024B的字节数组
        try (InputStream inputStream = new FileInputStream(file); OutputStream outputStream = new FileOutputStream(file1)) {
            int len;
            while ((len = inputStream.read(buffer)) != -1) {//返回收到的实际读取的字节数len
                outputStream.write(buffer, 0, len);//buffer中从0开始的len个字节，排除原buffer中的数的影响
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        long end = System.currentTimeMillis();
        System.out.println("finish,耗时:" + (end - start) + "毫秒");
    }
}
