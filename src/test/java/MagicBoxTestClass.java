import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagicBoxTestClass {
    MagicBox<String> box1 = new MagicBox<>(1);
    MagicBox<String> box3 = new MagicBox<>(2);

    @Test
    public void testConstructor() {
        MagicBox<String> box2 = new MagicBox<>(1);
        Assertions.assertNotNull(box2);
    }

    @Test
    public void testAddToBox() {
        box1.add("test");
        String result = box1.pick();
        Assertions.assertEquals("test", result);
    }

    @Test
    public void testRuntimeException() {
        Assertions.assertThrows(RuntimeException.class, () -> box1.pick());
    }

    @Test
    public void testAddMoreItems() {
        box3.add("one");
        box3.add("two");
        boolean result = box3.add("three");
        Assertions.assertEquals(false, result);
    }
}
