package generaltest;
//实现类不是泛型类
public class GenralTest3plm implements GeneralTest3<String> {
    @Override
    public String print(String s) {
        System.out.println(s);
        return s;
    }
}
