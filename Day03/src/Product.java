public class Product {
    double price;

    public double getPrice() {
        return price;
    }
public double getPrice(int qty){
        return qty*price;
}
    public void setPrice(double price) {
        this.price = price;
    }
}
