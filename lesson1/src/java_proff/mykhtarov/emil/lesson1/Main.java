package java_proff.mykhtarov.emil.lesson1;

public class Main {

    public static void main(String[] args) {

        StorageSwap<Integer> storage1 = new StorageSwapImpl<Integer>(new Integer[5]);
        storage1.add(44);
        storage1.add(16);
        storage1.add(92);
        storage1.add(73);
        storage1.add(81);

        storage1.display();
        storage1.swap(1, 5);
        storage1.display();

        storage1.arrayToList();
    }
}
