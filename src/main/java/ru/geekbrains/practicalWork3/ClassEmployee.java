package ru.geekbrains.practicalWork3;

/**
 * Project practical_work
 *
 * @Author Svetlana Totmyanina
 * Create 15.03.2021
 */
public class ClassEmployee {
    public static void main(String[] args) {
        Employee[] mass = new Employee[5];
        mass[0] = new Employee("Иванов Иван Иванович", "преподаватель", "ivanov@mail.ru","+7-895-456-20-31",35456.45, 24);
        mass[1] = new Employee("Сергеев Михаил Анатольевич", "зам.директора", "sergeev@ya.ru", "+7-987-564-52-63", 250000, 47);
        mass[2] = new Employee("Гапеев Егор Юрьевич", "бухгалтер", "gapeev@mail.ru", "+7-965-654-52-30", 120000, 28);
        mass[3] = new Employee("Тютерев Роман Юрьеви", "маркетолог", "tuterev@ya.ru", "+7-456-756-84-56", 105000, 23);
        mass[4] = new Employee("Беспалый Георгий Валерьевич", "юрист", "bespalyi@mail.ru", "+7-958-632-54-65", 168000, 45);

        for (Employee e : mass) if (e.getAge() > 40) e.OutputsInformation();
    }
}

class Employee{
    public String FCS;
    public String position;
    public String email;
    public String phone;
    public double salary;
    public int age;

    public Employee(String FCS, String position, String email, String phone, double salary, int age ){
        this.FCS=FCS;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void OutputsInformation(){
        System.out.println("ФИО: " + FCS + "; Должность: " + position + "; Email: " + email +
                "; Номер телефона: " + phone + "; Зарплата: " + salary + "; Возраст: " + age);
    }

    int getAge() {
        return age;
    }

}
