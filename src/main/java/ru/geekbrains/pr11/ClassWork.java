package ru.geekbrains.pr11;

import ru.geekbrains.pr11.Task.Apple;
import ru.geekbrains.pr11.Task.Box;
import ru.geekbrains.pr11.Task.Orange;

public class ClassWork {
    //ClassSwapsTheElements swapsTheElements = new ClassSwapsTheElements();
    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!Задание 1!!!!!!!!!!!!!!!!!!!!!");
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"} ;
        ClassSwapsTheElements.swapTheElements(arr1,1,4);
        ClassSwapsTheElements.swapTheElements(arr2,0,2);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!Задание 2!!!!!!!!!!!!!!!!!!!!!");
        String[] arrayOfStrings = {"A", "B", "C", "D"};
        ClassConvertingAnArray.asList(arrayOfStrings);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!Задание 3!!!!!!!!!!!!!!!!!!!!!");

        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("Добавление фруктов: ");
        or.addFruit(new Orange(),10);
        or1.addFruit(new Orange(),12);
        ap.addFruit(new Apple(),8);
        ap1.addFruit(new Apple(),18);
        System.out.println("Коробка 1: "+or.getWeight());
        System.out.println("Коробка 2: "+or1.getWeight());
        System.out.println("Коробка 3: "+ap.getWeight());
        System.out.println("Коробка 4: "+ap1.getWeight());
        System.out.println("Сравнение коробок: ");
        System.out.println("Коробка 1 равна коробке 3: "+or.compare(ap));
        System.out.println("Коробка 2 равна коробке 4: "+or1.compare(ap1));
    }
}
