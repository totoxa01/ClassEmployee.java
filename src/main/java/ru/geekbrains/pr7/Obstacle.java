package ru.geekbrains.pr7;

/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 28.03.2021
 */
public abstract class Obstacle {
    private String name;

    public Obstacle(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Participants participants);

    public String getName() {
        return name;
    }
}
