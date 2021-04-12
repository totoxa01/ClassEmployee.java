package ru.geekbrains.pr11;

import java.util.Arrays;

public class ClassSwapsTheElements {
    public static void swapTheElements(Object[] array, int index1, int index2){
        System.out.println("Начальный массив "+ Arrays.toString(array));
        Object swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
        System.out.println("Результат после перемещения: "+Arrays.toString(array)+"\n---------------------------------");
    }
}
