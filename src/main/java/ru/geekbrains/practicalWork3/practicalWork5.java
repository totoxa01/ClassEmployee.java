package ru.geekbrains.practicalWork3;

import java.util.Scanner;


/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 21.03.2021
 */
public class practicalWork5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Dog dog=new Dog();
        Cat cat=new Cat();
        int quantity=0;
        int dogQuantity=0;
        int catQuantity=0;
        System.out.println("Выберите животное");
        System.out.println("1. Собака");
        System.out.println("2. Кот");
        System.out.println("3. Собаки и кошки");
        int type=scanner.nextInt();
        System.out.println(type);
        if(type==1){
            System.out.println("Сколько собак?");
            quantity=scanner.nextInt();
            dog.createDog(quantity);
            Output.otputAnimal(quantity);
            System.out.println(" собак");
        }
        else if(type==2){
            System.out.println("Сколько котов?");
            quantity=scanner.nextInt();
            cat.createCat(quantity);
            Output.otputAnimal(quantity);
            System.out.println(" кошек");
        }
        else if(type==3){
            System.out.println("Сколько собак?");
            dogQuantity=scanner.nextInt();
            dog.createDog(dogQuantity);
            System.out.println("------------------------------------------------");
            System.out.println("Сколько котов?");
            catQuantity=scanner.nextInt();
            cat.createCat(catQuantity);
            System.out.println("------------------------------------------------");
            Output.otputAnimal(dogQuantity,catQuantity);
        }
    }
}
class Output{
    public static void otputAnimal(int quantity){
        System.out.print("Всего создали "+quantity);
    }
    public static void otputAnimal(int quantityDog, int quantityCat){
        int quantityAnimal=quantityCat+quantityDog;
        System.out.println("Всего создали " + quantityAnimal + " животных, из них " +quantityDog+" собак и " + quantityCat + " кошек");
    }
}

class Animal {
    protected String name;
    protected double run;
    protected double sail;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }


}

class Dog extends Animal{

    public Dog(){
    }
    public Dog(String name, double run, double sail){
        this.name=name;
        this.run=run;
        this.sail=sail;
    }

    public void dogInfo(){
        System.out.println("Собака по кличке "+name);
    }

    public void dogRun(){
        if(run>500)
            System.out.println(name+" не может бежать больше 500 м");
        else
            System.out.println(name+" пробежал: "+run +" м");
    }

    public void dogSail(){
        if(sail>10)
            System.out.println(name+" не может проплыть больше 10 м");
        else
            System.out.println(name+" проплыл: "+sail+" м");
    }
    public void createDog(int quantity){
        Scanner scanner=new Scanner(System.in);
        for (int i=1;i<=quantity;i++){
            System.out.println("Введите данные о "+ i +" собаке");
            System.out.println("введите имя собаки");
            this.name=scanner.next();

            System.out.println("введите сколько метров пробежала собака");
            this.run=scanner.nextFloat();

            System.out.println("введите сколько метров проплыла собака");
            this.sail=scanner.nextFloat();
            dogInfo();
            dogRun();
            dogSail();
        }
    }
}

class Cat extends Animal {

    public Cat(){

    }

    public Cat(String name, double run) {
        this.name = name;
        this.run = run;
    }

    public void catInfo() {
        System.out.println("Кот по кличке " + name);
    }

    public void catRun() {
        if (run > 200)
            System.out.println(name + " не может бежать больше 200 м");
        else
            System.out.println(name + " пробежал: " + run + " м");
    }
    public void createCat(int quantity){
        Scanner scanner=new Scanner(System.in);
        for (int i=1;i<=quantity;i++){
            System.out.println("Введите данные о "+ i +" коте");
            System.out.println("введите имя кота");
            this.name=scanner.next();

            System.out.println("введите сколько метров пробежала кот");
            this.run=scanner.nextFloat();

            catInfo();
            catRun();
        }
    }
}



