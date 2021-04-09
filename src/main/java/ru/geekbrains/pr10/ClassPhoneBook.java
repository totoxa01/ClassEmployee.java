package ru.geekbrains.pr10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ClassPhoneBook {
    private Map<String, HashSet<String>> map;

    ClassPhoneBook() {
        this.map = new HashMap<>();
    }

    void add(String lastName, String phone) {
        HashSet<String> numbers;

        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(lastName, numbers);

    }

    Set<String> get(String lastName) {
        return map.get(lastName);
    }

    public void fillPhone(){
        add("Абрамов","8-956-965-96-52");
        add("Авдеев","8-954-635-45-88");
        add("Ибрагимов","8-965-456-12-32");
        add("Мельников","8-654-445-45-43");
        add("Леванов","8-654-455-45-32");
        add("Котяев","8-945-432-32-23");
        add("Кудряшов","8-945-546-43-56");
        add("Семенов","8-944-322-34-54");
        add("Абрамов","");
        add("Анисимов","");
        add("Анисимов","");
        add("Иванов","");
    }
}
