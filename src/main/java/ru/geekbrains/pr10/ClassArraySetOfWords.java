package ru.geekbrains.pr10;

import java.util.HashMap;
import java.util.Map;

public class ClassArraySetOfWords {
    public static void arraySetOfWords(){
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Дом", "Стол", "Стул", "Кошка", "Собака",
                "Попугай", "Стул", "Молоко", "Бутерброд",
                "Молоко", "Дом", "Человек", "Дом", "Сыр",
                "Мама", "Папа", "Сестра", "Москва", "Калининград"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }
}
