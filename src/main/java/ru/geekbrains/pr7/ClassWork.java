package ru.geekbrains.pr7;

import java.util.Random;

/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 28.03.2021
 */
public class ClassWork {
    public static void main(String[] args) {
        Random rand = new Random();
        Participants[] participants = new Participants[3];

        int lenght = rand.nextInt(5);
        int heigth = rand.nextInt(5);
        participants[0] = new Human("Борис", lenght, heigth);

        lenght = rand.nextInt(5);
        heigth = rand.nextInt(5);
        participants[1] = new Robot("FAN", lenght, heigth);

        lenght = rand.nextInt(5);
        heigth = rand.nextInt(5);
        participants[2] = new Cat("Барсик", lenght, heigth);

        Obstacle[] obstacles = new Obstacle[6];

        boolean isTreadmill;
        for (int i = 0; i < obstacles.length; i++) {
            lenght = rand.nextInt(5);
            isTreadmill = rand.nextBoolean();
            if (isTreadmill) {
                obstacles[i] = new Treadmill("Дорога " + i, lenght);
            } else {
                obstacles[i] = new Wall("Стена " + i, lenght);
            }
        }

        for (int i = 0; i < participants.length; i++) {
            boolean result = true;
            for (int j = 0; j < obstacles.length; j++) {

                result = obstacles[j].moving(participants[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Поздравляю!!!");
            } else {
                System.out.println("К сожалению не получилось, попробуйте снова.");
            }
        }

    }
}
