package hw4.exceptions;

public class ProductException extends RuntimeException{

    @Override
    public String toString() {
        String message = "Такого товара не сущестует, выберите другой";
        return "ProductException; " +
                "message - " + message;
    }
}
