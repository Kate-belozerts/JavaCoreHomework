package hw4;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addBuyer("Jack", 35, "89118882233");
        shop.addBuyer("Mike", 35, "89118882233");

        shop.addProduct("Table", 5000);
        shop.addProduct("Chair", 1500);
        shop.addProduct("Sofa", 20000);
        shop.addProduct("Kitchen", 300000);
        shop.addProduct("Shower", 50000);

        shop.fillOrder(2, shop);

        shop.amountOfOrders();
    }
}
