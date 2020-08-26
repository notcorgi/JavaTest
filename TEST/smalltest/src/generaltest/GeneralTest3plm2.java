package generaltest;
//实现类仍是泛型类
public class GeneralTest3plm2 <T>implements GeneralTest3<T>{
    @Override
    public T print(T t) {
        System.out.println(t);
        return t;
    }
}
