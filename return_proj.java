
import java.util.Scanner;

public class return_proj
{
    int score;

    String returns(int score) {

        if(score<45)
        {
            return "fail";
        }
        else{
            return "passes";
        }
        
    }
   
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        return_proj obj=new return_proj();
        String result=obj.returns(score);
        System.out.println(result);
        
    }
}