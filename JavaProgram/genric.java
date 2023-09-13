package JavaProgram;

class test<T extends Number>
{
    T ob1,ob2;
    int sum1;
        double sum;
    public void getSum(T a, T b)
    {
        ob1=a;
        ob2=b;
        sum1=ob1.intValue()+ob2.intValue();
        System.out.println("sum = " + sum1);

    }

}
public class genric {
    public static void main(String[] args) {
        test<Integer> i1 = new test<Integer>();
        i1.getSum(10,20);
    }
}
