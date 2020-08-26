package Day01;
public class TestArray {
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] str= new int[2][2];


        str[0]=new int[]{2,3};
        str[1][3]=1;
        for (int[] x : a){
            for (int y: x){
                System.out.println(y);
            }
        }
    }

}

abstract class Test1{
    public abstract void hh();
}

