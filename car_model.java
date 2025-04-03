public  class car_model{
    String brand;
    int model;
    int year;

    car_model(int model,int year,String brand){
        this.brand=brand;
        this.year=year;
        this.model=model;
    }
    void display(){
        System.out.println("brand:"+brand);
        System.out.println("model:"+model);
        System.out.println("year:"+year);
    }
    public static void main(String[] args) {
        car_model obj=new car_model(200,2007,"BMW");
        obj.display();

    }
}