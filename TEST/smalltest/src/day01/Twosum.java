package day01;

public class Twosum {
    public static void main(String[] args) {
        String a="0";
        String b="9901";
        System.out.println(twoSum(a,b));
    }
    public static String twoSum(String a,String b){
        StringBuffer stringBuffer=new StringBuffer();
        int len=Math.max(a.length(),b.length());
        int flag=0;
        for(int i=1;i<=len;i++){
            int anum=i>a.length()?0:a.charAt(a.length()-i)-'0';
            int bnum=i>b.length()?0:b.charAt(b.length()-i)-'0';
            stringBuffer.insert(0,(char)((anum+bnum+flag)%10+'0'));
            flag=(anum+bnum+flag)/10;
        }
        if(flag!=0){
            stringBuffer.insert(0,(char) (flag+'0'));
        }
        return stringBuffer.toString();
    }
}
