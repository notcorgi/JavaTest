package generaltest;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Byte a=10;
        GeneralTest<String> generalTest = new GeneralTest<>("li", 20, "male");
        GeneralTest<Integer> generalTest1 = new GeneralTest<>("li", 10, 1);
        System.out.println("========================================");

        GeneralTest2 generalTest2 = new GeneralTest2();
        generalTest2.print("hahha");
        GeneralTest2 generalTest3 = new GeneralTest2();
        generalTest3.print(121);
        System.out.println("========================================");

        GenralTest3plm genralTest3plm = new GenralTest3plm();
        genralTest3plm.print("hahha");
        System.out.println("========================================");

        GeneralTest3plm2<String> generalTest3plm2=new GeneralTest3plm2<>();
        generalTest3plm2.print("hahahah");
        GeneralTest3plm2<Integer> integerGeneralTest3plm2=new GeneralTest3plm2<>();
        integerGeneralTest3plm2.print(1213);
    }


}
