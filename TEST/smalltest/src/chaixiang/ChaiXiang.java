package chaixiang;

public class ChaiXiang {
    public static void main(String[] args) {
        Short a = 10, b = 20;
        Short d = 30;
        int e = 30;
        Integer f = new Integer(30);
        Integer g = new Integer(30);
        Integer c = 30;
        Integer h = 30;
        Integer i = 128;
        Integer j = 128;
        String k="30";
        String l="30";
        String m=new String("30");
        String n=new String("30");
        System.out.println(c == a + b);//true a,b在运算时进行拆箱，再对c进行拆箱，等同于基本类型的比较：30=10+20
        System.out.println(d == a + b);//true a,b在运算时进行拆箱，再对c进行拆箱，等同于基本类型的比较：30=10+20
        System.out.println(c.equals(a + b));//true a+b首先在运算时拆箱为short a+ short b;byte short char在运算时会自动提升为int类型进行计算，即int a+int b，equals对结果进行装箱，即Integer 30
        System.out.println(d.equals(a + b));//false a+b首先在运算时拆箱为short a+ short b;byte short char在运算时会自动提升为int类型进行计算，即int a+int b，equals对结果进行装箱，即Integer 30,Integer与Short类型不同，为false
        System.out.println(d == e);//true Short自动拆箱为基本类型进行比较数值大小
        System.out.println(f == g);//false f,g为new出来的两个不同对象，故地址不同，为false
        System.out.println(f.equals(g));//true g,f类型相同，值相同，故为true
        System.out.println(c == h);//true -128<=c,h<=127,在内存中为同一对象，故为true
        System.out.println(i == j);//false c,h>127 超出预定对象范围，故在内存中new出新对象，c,h为两个不同对象，故为false
        System.out.println(k==l);//true 在内存中属于同一个对象
        System.out.println(k==m);//false 不同对象的地址不同
        System.out.println(k.equals(m));//true k,m的值相同均为"30"
        System.out.println(m==n);//false//不同对象的地址不同
        System.out.println(m.equals(n));//true n,m的值相同均为"30"
    }


}
