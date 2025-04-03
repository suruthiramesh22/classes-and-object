
import java.util.Scanner;

public  class  student_details{
    String name;
    int age;
    int mark;

    student_details(String name,int age,int mark)
    {
        this.name=name;
        this.age=age;
        this.mark=mark;
       
    }
    public boolean isPassed() {
        return mark > 40;
    }
    void isdisplay(){
  
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("mark:"+mark+(isPassed() ? "pass" : "fail "));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter student name:");
        String name=sc.nextLine();
        System.out.println("enter a age:");
        int age=sc.nextInt();
        System.out.println("enter a mark:");
        int mark=sc.nextInt();
        student_details obj=new student_details(name,age,mark);
        obj.isdisplay();
       
    }
}