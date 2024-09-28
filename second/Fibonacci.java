package second;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int count=2;
        while (count<=7){
            count++;
            int temp=b;
            b=a+b;
            a=temp;
            System.out.println(b);
        }
    }
}
