package serverclient;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\lishubin\\Desktop\\123.jpg"));
             Socket socket = new Socket("127.0.0.1", 9998);
        ) {
            OutputStream os = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            os.write("发送结束".getBytes());
        }
    }

}
