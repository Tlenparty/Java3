package lesson1.tasks1_2;

public class StorageGeneric<E> implements IStorage<E> {


    private E[] arr;
    private int currentSize; // Ограничение массива

    public StorageGeneric(int size) {
        this.arr = (E[]) new Object[size];  // Не можем создать массив парметризированного типа <E>
    }

    @Override
    public void add(E value) {
        add(value, currentSize);
    }

    @Override
    public void add(E value, int index) {
        arr[index] = value;
        currentSize++;

    }

    public void remove(int index) {
        arr[index] = null;
        currentSize--;
    }

    @Override
    public E get(int index) {
        return arr[index];
    }

    @Override
    public boolean find(E value) {
        for (int i = 0; i < currentSize; i++) {
            if (value.equals(arr[i])) {
                return true;
            }

        }
        return false;
    }

    @Override
    public void display() {
        for (E value : arr) {
            System.out.println(value + " ");
        }

    }

    @Override
    public void sort() {  // Сортировка 2х массивов
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Comparable a = (Comparable) arr[i]; // Нет гарантий
                Comparable b = (Comparable) arr[j];
                if (a.compareTo(b) > 0) {
                    exchange(i, j);
                }
            }
        }

    }


    @Override
    public int getCurrentSize() {
        return 0;
    }


    public void exchange(int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
