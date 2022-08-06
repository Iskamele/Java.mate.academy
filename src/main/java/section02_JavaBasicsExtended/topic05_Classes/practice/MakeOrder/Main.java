package section02_JavaBasicsExtended.topic05_Classes.practice.MakeOrder;
import static section02_JavaBasicsExtended.topic05_Classes.practice.MakeOrder.MakeOrder.calculatePrice;

public class Main {
    public static void main(String[] args) {
        Product firstProduct = new Product();
        firstProduct.name = "Apple";
        firstProduct.price = 15;

        Product secondProduct = new Product();
        secondProduct.name = "Banana";
        secondProduct.price = 35;

        Product thirdProduct = new Product();
        thirdProduct.name = "Abricot";
        thirdProduct.price = 50;

        Product[] array = {firstProduct, secondProduct, thirdProduct};

        System.out.println(calculatePrice(array));
    }
}
