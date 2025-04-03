public class employee_details{
    String name;
    int id;
    Double salary;

    void  employee_details(String name,int id,Double salary) {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display()
    {
        System.out.println("NAME:"+name);
        System.out.println("ID:"+id);
        System.out.println("SALARY:"+salary);
    }
    void rise(Double per)
    {
        salary+=salary*(per/100);
    }
    public static void main(String[] args) {
        employee_details obj=new employee_details();
        obj.employee_details("suruthi",303,5000.0);
        obj.display();
        obj.rise(10.0);
        System.out.println("After raising the salary");
        obj.display();
    }
}