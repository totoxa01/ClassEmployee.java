package ru.geekbrains.pr11.Task;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public Box(){
    }

    public float getWeight(){
        float weight = 0.0f;

        for(T o : box){
            weight += o.getWeight();
        }return weight;
    }
    public boolean compare(Box newBox) {
        if(getWeight() == newBox.getWeight()) return true;
        return false;
    }


    public void addFruit(T fruit, int sum){
        for(int i=0;i<sum;i++){
            box.add(fruit);
        }
    }
}
