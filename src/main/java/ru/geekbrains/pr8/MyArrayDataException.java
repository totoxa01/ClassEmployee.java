package ru.geekbrains.pr8;

/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 01.04.2021
 */
public class MyArrayDataException extends ExceptionCustom{
    public MyArrayDataException(int row, int col) {
        super(String.format("Не получилось преобразовать в массиве[%d, %d]", row, col));
    }
}
