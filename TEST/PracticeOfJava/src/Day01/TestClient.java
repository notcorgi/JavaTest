package Day01;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        try (InputStream inputstream = socket.getInputStream()) {
            try (OutputStream outputstream = socket.getOutputStream()) {
                handle(inputstream, outputstream);
            }
        }
        socket.close();
        System.out.println("finish");
    }

    private static void handle(InputStream a, OutputStream b) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(b, StandardCharsets.UTF_8));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a, StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in);
        System.out.println("[server] " + bufferedReader.readLine());
//        bufferedWriter.write("hello");
//        bufferedWriter.flush();
        while (true) {
            System.out.println("请输入:");
            String str = scanner.nextLine();
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            System.out.println("已发送");
            System.out.println("接收信息:" + bufferedReader.readLine());
            if (str.equals("bye")) {
                break;
            }
        }
    }
}
