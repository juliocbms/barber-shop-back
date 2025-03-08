package br.com.dio.barber_shop_ui.exception;

public class EmailInUseException extends RuntimeException{
    public EmailInUseException(String message) {
        super(message);
    }
}
