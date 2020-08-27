package clientserverTest1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        while((len=is.read(bytes))!=-1) {  //此处由于只读了一句，故len!=-1一直在循环中，故需要在客户端结束
            System.out.println(new String(bytes, 0, len));
        }
        System.out.println(2.2);
        OutputStream os = socket.getOutputStream();
        os.write("我是服务器".getBytes());
//        os.flush();
//        System.out.println(2);
//        os.close();
        socket.close();
        serverSocket.close();
    }
}
