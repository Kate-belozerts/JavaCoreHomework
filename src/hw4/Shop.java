package hw4;

import hw4.exceptions.AmountException;
import hw4.exceptions.CustomerException;
import hw4.exceptions.ProductException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private final List<Buyer> buyerList;
    private final List<Product> productList;
    private final List<Order> orders;

    {
        buyerList = new ArrayList<>();
        productList = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public Order getOrder(Buyer buyer, Product product, int count){

        Order order = new Order(buyer, product, count);
        this.orders.add(order);
        return order;
    }

    public void fillOrder(int count, Shop shop) {
        int num = 0;
        Product product1 = null;
        Buyer buyer1 = null;
        for (int i = 0; i < count;) {
            try {
                System.out.println("Введите товар, который хоитите приобрести: ");
                String product = new Scanner(System.in).nextLine();
                product1 = getProduct(product);
                if (product1 == null || !isProducing(product1)) {
                    i--;
                    throw new ProductException();
                }

                System.out.println("Введите имя покупателя: ");
                String buyer = new Scanner(System.in).nextLine();
                buyer1 = getBuyerByName(buyer);
                if (buyer == null || !isExist(buyer1)) throw new CustomerException();

                System.out.println("Введите количество товара: ");
                num = new Scanner(System.in).nextInt();
                if (num < 0 || num > 50) {
                    num = 1;
                }

            }catch (ProductException | AmountException e){
                System.out.println(e.toString());
            }
            shop.getOrder(buyer1, product1, num);
            i++;
        }
    }

    private boolean isExist(Buyer buyer) {
        for (Buyer b : buyerList) {
            if (b == buyer) return true;
        }
        return false;
    }

    private boolean isProducing(Product product) {
        for (Product p : productList) {
            if (p == product) return true;
        }
        return false;
    }

    public Buyer getBuyerByName(String name) {
        for (Buyer buyer : buyerList) {
            if (buyer.getFIO().equals(name)) return buyer;
        }
        return null;
    }

    public Product getProduct(String name) {
        for (Product p :
                productList) {
            if (p.getName().equals(name)) return p;
        }
        return null;
    }

    public void addBuyer(String name, int age, String number) {
        buyerList.add(new Buyer(name, age, number));
    }

    public void addProduct(String name, int price) {
        productList.add(new Product(name, price));
    }

    public void amountOfOrders() {
        System.out.println("Общее количество заказов - " + orders.size() + " Заказы: " + orders.toString());
    }
}
