package section02_JavaBasicsExtended.topic05_Classes.practice.MakeOrder;

public class MakeOrder {
    public static int calculatePrice(Product[] products) {
        int sum = 0;
        for (Product product : products) {
            sum += product.price;
        }
        return sum;
    }
}
