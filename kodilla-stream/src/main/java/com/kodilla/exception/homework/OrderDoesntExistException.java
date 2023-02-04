package com.kodilla.exception.homework;

public class OrderDoesntExistException extends Exception {

    public OrderDoesntExistException(String orderNr) {
        super("Order with number '" + orderNr + "' does not exist in the Warehouse.");
    }
}



abstract class EntityNotFoundException extends Exception {

    public EntityNotFoundException(Object obj) {
        super("Object " + obj + " not found");
    }
}

// Book, User, Rental, Retrun, Employee

class BookNotFoundException extends EntityNotFoundException {

    public BookNotFoundException(String bookNr) {
        super(bookNr);
    }

}

class UserNotFoundException extends EntityNotFoundException {

    public UserNotFoundException(Integer userId) {
        super(userId);
    }

}