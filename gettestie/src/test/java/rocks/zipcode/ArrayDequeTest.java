package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDequeTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayDequeRemoveTest() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Hello world");
        arrayDeque.remove("Hello world");
        Assert.assertEquals(true, arrayDeque.isEmpty());
    }
    @org.junit.Test
    public void TestArrayDequeClearTest() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Hello world");
        arrayDeque.clear();
        Assert.assertTrue(arrayDeque.isEmpty());
    }

    @org.junit.Test
    public void TestArrayDequeContainsTRUETest() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.add(15);
        arrayDeque.add(159);
        Assert.assertTrue(arrayDeque.contains(15));
    }
    @org.junit.Test
    public void TestArrayDequeContainsFALSETest() {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.add(15);
        arrayDeque.add(159);
        Assert.assertFalse(arrayDeque.contains(777));
    }

    @org.junit.Test
    public void TestArrayDequeIteratorTest() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("Hello world");
        arrayDeque.add("string");
        arrayDeque.add("puppy");
        arrayDeque.add("bye");
        Iterator<String> stringIterator = arrayDeque.iterator();
        Assert.assertTrue(stringIterator.hasNext());
    }
    @org.junit.Test
    public void TestArrayDequeSizeTest() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("Hello world");
        arrayDeque.add("string");
        arrayDeque.add("puppy");
        arrayDeque.add("bye");

        Assert.assertTrue(arrayDeque.size()==4);
    }

    
    // Make a bigger test exercising more Stack methods.....
}
