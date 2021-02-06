package lesson1.task3;

import java.util.ArrayList;

public class Box<E extends Fruit> {


    private ArrayList<E> fruitBox;

    public Box() {
        this.fruitBox = new ArrayList<>();
    }

    public void display() {
        for (E fruits : fruitBox) {
            System.out.println(fruits + " ");
        }
    }


    public void add(E fruit) {
        this.fruitBox.add(fruit);
    }


    public void remove() {
        this.fruitBox.remove(fruitBox.size() - 1);

    }



    public float getWeight() {
        float weightBox = 0.0f;
        for (E fruit : fruitBox) {
            weightBox += fruit.getWeight();
        }
        return weightBox;
    }




    public boolean compare(Box<?> eBox) {
        return Math.abs(this.getWeight() - eBox.getWeight()) < 0.001;
    }




    public void pour(Box<E> eBox) {
        eBox.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }


}
