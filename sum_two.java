
import java.util.Scanner;

public   class  sum_two
{
   int  sum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a=");
        int a=sc.nextInt();
        System.out.print("b=");
        int b=sc.nextInt();
        sum_two obj=new sum_two();
        int num=obj.sum(a,b);
        System.out.println(num);
        
        
    }
}