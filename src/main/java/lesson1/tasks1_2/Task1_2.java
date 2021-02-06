package lesson1.tasks1_2;

public class Task1_2 {

    /**
     * 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
     * 2. Написать метод, который преобразует массив в ArrayList;
     */

    public static void main(String[] args) {

        StorageGeneric <String> strStorage = new StorageGeneric<>(5);
        StorageGeneric <Integer> intStorage = new StorageGeneric<>(5);

        strStorage.add("A");
        strStorage.add("B");
        strStorage.add("C");
        strStorage.add("D");
        strStorage.display();
        strStorage.exchange(1,3);
        strStorage.display();



        intStorage.add(1);
        intStorage.add(2);
        intStorage.add(3);
        intStorage.add(4);
        intStorage.display();
        intStorage.exchange(0,3);
        intStorage.display();


    }
}

