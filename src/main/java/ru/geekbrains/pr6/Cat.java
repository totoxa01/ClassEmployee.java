package ru.geekbrains.pr6;

public class Cat {
    private String name; //имя кота
    private int appetite; //аппетит

    private boolean satiety; //сытость

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(AbstractBowl bowl){
        bowl.decreaseFood(this.appetite);

    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}
