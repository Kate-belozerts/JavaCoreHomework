package hw4.exceptions;

import java.io.IOException;

public class CustomerException extends RuntimeException {

    @Override
    public String toString() {
        String message = "Такого пользователя не существует😢";
        return "CustomerException; " +
                "message - " + message;
    }
}
