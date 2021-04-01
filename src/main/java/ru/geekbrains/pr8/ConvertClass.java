package ru.geekbrains.pr8;

/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 01.04.2021
 */
public class ConvertClass {
    public static int massConvert(String[][] massiv)
        throws MyArraySizeException, MyArrayDataException{
        int summa = 0;
        if (4 != massiv.length) throw new MyArraySizeException();

        for (int i = 0; i < massiv.length; i++) {

            if (4 != massiv[i].length) throw new MyArraySizeException();

            for (int k = 0; k < massiv[i].length; k++) {

                try {
                    summa += Integer.parseInt(massiv[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, k);
                }
            }
        }
        return summa;
    }
}
