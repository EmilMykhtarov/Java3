package java_proff.mykhtarov.emil.lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StorageSwapImpl<T> implements StorageSwap<T> {
    private T[] data;
    private int currentSize;

    public StorageSwapImpl(T[] data) {
        this.data = data;
    }

    public void add(T value) {
        add(value, currentSize);
    }

    public void add(T value, int index) {
        data[index] = value;
        currentSize++;
    }

    public void swap(int number1, int number2) {
        T temp = data[number1 - 1];
        data[number1 - 1] = data[number2 - 1];
        data[number2 - 1] = temp;
    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("-------");
    }
    public void arrayToList() {
        List<T> listFromArray = new ArrayList<T>();
        Collections.addAll(listFromArray, data);
        for (T str : listFromArray)
            System.out.print(" " + str);
    }
}
