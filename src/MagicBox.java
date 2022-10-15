import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public MagicBox(int num) {
        this.items = (T[]) new Object[num];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("Место для добавления нового элемента больше нет!");
        return false;
    }

    public T pick() {
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                count++;
            }
        }
        if (count > 0) {
            throw new RuntimeException("Коробка неполная, количество незаполненных ячеек: " + count + ".");
        } else {
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        }
    }
}