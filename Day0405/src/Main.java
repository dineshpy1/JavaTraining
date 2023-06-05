public class Main {
    public static void main(String[] args) {
        Price price=new Price();
        price.priceWithDiscount(50);
        price.priceWithNoDiscount(0);
        Subclass subclass=new Subclass();
        System.out.println("Static result is " + Static.returnResult());
        FinalClass finalClass=new FinalClass();
        finalClass.finalMethod();
        System.out.println("Final Variable is "+ finalClass.finalVariable);
    }
}