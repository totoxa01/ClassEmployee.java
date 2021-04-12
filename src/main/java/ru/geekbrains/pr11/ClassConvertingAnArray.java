package ru.geekbrains.pr11;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassConvertingAnArray {
    public static <T> void asList(T[] arr){
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Массив после преобразования: "+alt+"\n---------------------------------");
    }
}
