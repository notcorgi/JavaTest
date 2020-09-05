package serverclient;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9998);
        while (true) {
            Socket socket = ss.accept();
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\lishubin\\Desktop\\123copy.jpg"));) {
                        InputStream is = socket.getInputStream();
                        int len;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {
                            bos.write(bytes, 0, len);
                        }
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            });
            thread.start();
        }
    }
}
