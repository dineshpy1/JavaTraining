abstract class TotalPrice implements DiscountPrice,NoDiscount {
    private int price=154;
    private int qty=6;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public void priceWithDiscount(int discount) {
        int result=(price*qty)-discount;
        System.out.println("The price with discount is "+ result);
    }

    @Override
    public void priceWithNoDiscount(int discount) {
        int result=(price*qty);
        System.out.println("The price with no discount is "+ result);
    }
}
class Price extends TotalPrice{
    void price(){
    System.out.println("Total Price");
}}

