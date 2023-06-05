public class Vehicle {
    public void getInfo(){
        System.out.println("Parent class");
    }
}
class Car extends Vehicle{
    public void getInfo(){
        System.out.println("Child class");
    }
}
