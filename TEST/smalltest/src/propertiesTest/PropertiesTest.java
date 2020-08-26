package propertiesTest;
//简单测试properties
import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        String filename="/Users/lishubin/Desktop/test2.txt";
        Writer writer=new FileWriter(filename);
        Reader reader=new FileReader(filename);
        Properties properties=new Properties();
        properties.setProperty("li","18");
        properties.setProperty("liu","21");
        properties.setProperty("san","28");
        properties.store(writer,"zhushi");
        properties.load(reader);
        Set<Object> objects = properties.keySet();
        for (Object object : objects) {
            System.out.println(object+"-->"+properties.get(object));
        }
        
    }
}
