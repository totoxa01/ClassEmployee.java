package ru.geekbrains.pr7;

/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 28.03.2021
 */
public class Human implements Participants{
    private String name;
    private int running;
    private int jump;

    public Human(String name, int running, int jump) {
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
    public void actionJump(){
        System.out.println("Человек " + this.name + " прыгает " + this.getJump());
    }

    @Override
    public void actionRunning(){
        System.out.println("Человек " + this.name + " бежит " + this.getRunning());
    }
}
