package clientserverTest1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream os = socket.getOutputStream();
        os.write("hello".getBytes());
        socket.shutdownOutput();
//        os.flush();
        InputStream is = socket.getInputStream();
        int len;
        byte[] bytes = new byte[1024];
        System.out.println(1.1);
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
//        System.out.println(1);
        os.close();
        socket.close();
    }
}
