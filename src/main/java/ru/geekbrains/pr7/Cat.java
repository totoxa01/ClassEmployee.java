package ru.geekbrains.pr7;

/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 28.03.2021
 */
public class Cat implements Participants {
    private String name;
    private int running;
    private int jump;

    public Cat(String name, int running, int jump) {
        this.name = name;
        this.running = running;
        this.jump = jump;
    }

    @Override
    public int getRunning() {
        return running;
    }

    @Override
    public int getJump() {
        return jump;
    }

    @Override
    public void actionRunning(){
        System.out.println("Кот " + this.name + " бежит " + this.getRunning());
    }

    @Override
    public void actionJump(){
        System.out.println("Кот " + this.name + " прыгает " + this.getJump());
    }
}
