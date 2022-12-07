public class Main {
    public static void main(String[] args) {
        MagicBox <String> box1 = new MagicBox<>(5);
        box1.add("Anya");
        box1.add("Tanya");
        box1.add("Igor");
        box1.add("Sveta");
        box1.add("Nadya");
        box1.add("Irina");
        System.out.println(box1.pick());

        MagicBox <Integer> box2 = new MagicBox<>(3);
        box2.add(500);
        box2.add(400);
        box2.add(300);
        System.out.println(box2.pick());

        MagicBox <String> box3 = new MagicBox<>(3);
        box3.add("Orange");
        System.out.println(box3.pick());
    }
}
