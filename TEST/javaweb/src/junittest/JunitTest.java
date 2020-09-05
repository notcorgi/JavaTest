package junittest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

public class JunitTest {
    @Before
    public void init(){
        System.out.println("begin");
//    Add test = new Add();
    }
    @After
    public void close(){
        System.out.println("end");
    }

    @Test
    public void addtest() {
        Add test = new Add();
        int result = test.add(10, 2);
        System.out.println(result);
        Assert.assertEquals(12, result);

    }

    @Test
    public void subTest(){
        Sub test=new Sub();
        int result=test.sub(10,12);
        System.out.println(result);
        Assert.assertEquals(-2,result);
    }

}
