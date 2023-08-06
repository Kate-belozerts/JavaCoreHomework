package hw4;

import hw4.exceptions.CustomerException;

public class Order {
    private Buyer buyer;
    private Product product;
    private int count;

    public Order(Buyer buyer, Product product, int count) {
        this.buyer = buyer;
        this.product = product;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order " +
                "buyer=" + buyer +
                ", product=" + product +
                ", count=" + count;
    }
}
