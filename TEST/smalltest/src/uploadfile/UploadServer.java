package uploadfile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        while (true) {
            Socket socket = ss.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/lishubin/Desktop/123copy.png"));
                    ) {
                        InputStream is = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int len;
                        while ((len = is.read(bytes)) != -1) {
                            bos.write(bytes, 0, len);
                            bos.flush();
                        }
                        OutputStream os = socket.getOutputStream();
                        os.write("收到".getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
