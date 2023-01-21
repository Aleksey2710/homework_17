package com.skypro.homework_17.exceptions;
/**
 * Создаем свое проверяемое исключение.
 */

import com.skypro.homework_17.drivers.Driver;

public class NotDriverCategoryException extends Exception {


    public NotDriverCategoryException(String message) {
        super(message);
    }
}
