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

    /**
     * Сделать метод getWeight(), который высчитывает вес коробки, зная количество фруктов и вес одного фрукта
     * (вес яблока – 1.0f, апельсина – 1.5f. Не важно, в каких это единицах);
     */

    public float getWeight() {
        float weightBox = 0.0f;
        for (E fruit : fruitBox) {
            weightBox += fruit.getWeight();
        }
        return weightBox;
    }

    /**
     * Внутри класса Коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут
     * в compare в качестве параметра, true – если она равны по весу, false – в противном случае (коробки с яблоками
     * мы можем сравнивать с коробками с апельсинами);
     */

    public boolean compare(Box<?> eBox) {
        return Math.abs(this.getWeight() - eBox.getWeight()) < 0.001;
    }


    /**
     * Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую (помним про сортировку фруктов:
     * нельзя яблоки высыпать в коробку с апельсинами). Соответственно, в текущей коробке фруктов не остается,
     * а в другую перекидываются объекты, которые были в этой коробке;
     */

    public void pour(Box<E> eBox) {
        eBox.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }


}
