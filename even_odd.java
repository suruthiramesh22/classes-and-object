
import java.util.Scanner;

public  class even_odd{
    void oddeven(int num)
    {
        if(num%2==0)
        {
            System.out.print("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        even_odd obj=new even_odd();
        obj.oddeven(num);
        
    }
}