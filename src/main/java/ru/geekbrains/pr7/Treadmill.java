package ru.geekbrains.pr7;

/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 28.03.2021
 */
public class Treadmill extends Obstacle{
    private int length;

    public Treadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    protected boolean moving(Participants participants){
        System.out.println(super.getName() + " длинной " + this.length);

        participants.actionRunning();

        if(getLength()<=participants.getRunning()){
            System.out.println("Успешно пробежал");
            return true;
        }
        else{
            System.out.println("Не получилось пробежать");
            return false;
        }
    }
}
