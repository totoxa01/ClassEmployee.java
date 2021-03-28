package ru.geekbrains.pr7;

/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 28.03.2021
 */
public class Wall extends Obstacle{
    private int heigth;

    public Wall(String name, int heigth) {
        super(name);
        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Participants participants){
        System.out.println(super.getName() + " высотой " + this.heigth);

        participants.actionJump();

        if(getHeigth()<=participants.getJump()){
            System.out.println("Успешно перепрыгнул");
            return true;
        }
        else{
            System.out.println("Не получилось перепрыгнуть");
            return false;
        }
    }

}
