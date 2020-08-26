package Day01;
import javax.imageio.IIOException;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TestServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
//        Thread thread1 = new Thread(thread);
        while(true){
            System.out.println("server is working");
            Socket sock = server.accept();
            System.out.println("connected from " + sock.getRemoteSocketAddress());
            Runnable thread = new Server1(sock);
            Thread thread1 = new Thread(thread);
            thread1.run();
        }
    }
}

class Server1 implements Runnable{
    public Socket sock;
    public Server1(Socket sock){
        this.sock = sock;
    }
    @Override
    public void run() {
        System.out.println("开始对话");
        try (InputStream inputStream = this.sock.getInputStream()){
            try(OutputStream outputStream = this.sock.getOutputStream()){
                handle(inputStream,outputStream);
            }
        }catch (IOException e){
            try {
                this.sock.close();
            }catch (IOException eo){
                System.out.println(eo.getStackTrace());
            }
        }
    }

    private void handle(InputStream a,OutputStream b) throws IOException{
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(a, StandardCharsets.UTF_8));
        BufferedWriter bufferedwriter = new BufferedWriter(new OutputStreamWriter(b, StandardCharsets.UTF_8));
        bufferedwriter.write("hello\n");
        bufferedwriter.flush();
        System.out.println("111");
//        System.out.println(bufferedreader.readLine());
        while (true){
            String str = bufferedreader.readLine();
            System.out.println("收到信息:"+str);
            if (str.equals("bye")){
                bufferedwriter.write("bye");
                bufferedwriter.newLine();
                bufferedwriter.flush();
                break;
            }
            bufferedwriter.write(str+"\n");
            bufferedwriter.flush();
        }
    }
}

