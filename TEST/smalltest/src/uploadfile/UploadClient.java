package uploadfile;

import java.io.*;
import java.net.Socket;

//上传文件客户端
public class UploadClient {
    public static void main(String[] args) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/lishubin/Desktop/123.png"));
             Socket socket = new Socket("127.0.0.1", 9999);) {
            OutputStream os = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                os.write(bytes, 0, len);
                os.flush();
            }
            socket.shutdownOutput();
            InputStream is = socket.getInputStream();
            while ((len = is.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, len));
            }
        }
    }
}
