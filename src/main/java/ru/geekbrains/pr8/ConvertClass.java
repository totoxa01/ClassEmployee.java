package ru.geekbrains.pr8;

/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 01.04.2021
 */
public class ConvertClass {
    public static int massConvert(String[][] mass)
        throws MyArraySizeException, MyArrayDataException{
        int summa = 0;
        if (4 != mass.length) throw new MyArraySizeException();

        for (int i = 0; i < mass.length; i++) {

            if (4 != mass[i].length) throw new MyArraySizeException();

            for (int k = 0; k < mass[i].length; k++) {

                try {
                    summa += Integer.parseInt(mass[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, k);
                }
            }
        }
        return summa;
    }
}
