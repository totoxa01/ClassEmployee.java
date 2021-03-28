package ru.geekbrains.pr6;

public class AbstractBowl {

    private int food;

    public void putFood(int amount) {
        this.food += amount;
    }

    public void decreaseFood(int amount) {
        this.food -= amount;
    }

    public AbstractBowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return this.food;
    }

    void increaseFood() {
        this.food += 400;
        System.out.println("В миску добавили 400 грамм корма");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }
}
