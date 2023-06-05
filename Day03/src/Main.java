import com.sun.source.tree.CatchTree;

public class Main {
    public static void main(String[] args) {
       DepartmentSize obj=new DepartmentSize();
       System.out.println("The size is "+ obj.getDepartmentSize());
       Product obj2=new Product();
       obj2.price=123.45;
       System.out.println("The price is "+ obj2.getPrice());
       System.out.println("The price with quantity is " + obj2.getPrice(2));
       Car car=new Car();
       car.getInfo();





    }
}