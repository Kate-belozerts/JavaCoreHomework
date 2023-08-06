package hw4.exceptions;

import hw4.Product;

public class AmountException extends RuntimeException{

    @Override
    public String toString() {
        String message = "Слишком большое количество товара. " +
                "Один покупатель не может за 1 заказ приобрести более 50 товаров";
        return "AmountException; " +
                "message - " + message;
    }
}
