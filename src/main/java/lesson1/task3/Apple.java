package lesson1.task3;

public class Apple extends Fruit {

    private String name = "Яблоко";
    private float weight = 1.0f;

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
