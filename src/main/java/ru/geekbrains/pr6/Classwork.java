package ru.geekbrains.pr6;

public class Classwork {
    public static void main(String[] args) {
        Cat[] cats= {
                new Cat("Barsik",105),
                new Cat("Murzik", 100),
                new Cat("Vaska",150),
                new Cat("Rizhik",450)
        };
        CatBowl bowl=new CatBowl(500);
        System.out.println("У нас есть четыре кота: " + cats[0].getName() + ", " + cats[1].getName() + ", " + cats[2].getName()+ " и " + cats[3].getName());
        System.out.println("Сейчас в миске " + bowl.getFood() + " грамм кошачьего корма. Посмотрим насколько его хватит, в данный момент коты очень голодны и направляются трапезничать.\n");

        for (Cat cat : cats) {
            if(cat.getSatiety()==false){
                if(!bowl.checkFood(cat.getAppetite())){
                    bowl.increaseFood();
                }
                cat.eat(bowl);
                System.out.println("Кот " + cat.getName() + " съел " + cat.getAppetite() + " грамм корма");
            }
            cat.setSatiety(true);
            System.out.println("Сытость кота " + cat.getName()+" = "+ cat.getSatiety());
        }
        System.out.println("\nПосле кормежки в миске осталось " + bowl.getFood() + " грамм корма.\n");
    }
}
