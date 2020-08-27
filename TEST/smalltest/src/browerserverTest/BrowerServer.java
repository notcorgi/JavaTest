package browerserverTest;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class BrowerServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(System.getProperty("user.dir")); //此处为相对路径的标杆值   /Users/lishubin/Desktop/github_repositories/JavaTest/TEST 即项目根目录
        ServerSocket ss = new ServerSocket(9998);
        while (true) {
            Socket socket = ss.accept();
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                        String string = br.readLine();
                        String[] strings = string.split(" ");
                        String filepath = strings[1].substring(1);
                        System.out.println(filepath);//请求资源的相对路径
                        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filepath));
                             BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());) {
                            bos.write("HTTP/1.1 200 OK\r\n".getBytes());
                            bos.write("Content-Type:text/html\r\n".getBytes());
                            // 必须要写入空行,否则浏览器不解析
                            bos.write("\r\n".getBytes());
                            byte[] bytes = new byte[1024];
                            int len;
                            while ((len = bis.read(bytes)) != -1) {
                                bos.write(bytes, 0, len);
                                bos.flush();
                            }
                        }
//                        System.out.println(string);
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }
    }
}
