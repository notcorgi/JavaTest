package Day01;
class Income{
    double income;
    public Income(double income){
        this.income = income;
    }
    public double getTax(){
        return income * 0.1;
    }

}
class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

    public double getTax() {
        return 0.2 * income;
    }
}
class special extends Income{
    public special(double income){
        super(income);
    }
    @Override
    public double getTax(){
        return 0;
    }
}
public class Main{
    public static void main(String[] args){
        Income[] a = {new Salary(5000), new special(5000),new Income(1000)};
        sum2(a);
    }
    public static void sum2(Income...incomes){
        double sum1 = 0;
        for (Income a:incomes){
            sum1 = sum1 + a.getTax();
        }
        System.out.println(sum1);
    }
}
