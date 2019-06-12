package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

import static org.junit.Assert.assertFalse;

public class ArrayListTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayListRemoveTest() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello world");
        arrayList.remove("Hello world");
        Assert.assertEquals(true, arrayList.isEmpty());
    }
    @org.junit.Test
    public void TestArrayListClearTest() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello world");
        arrayList.clear();
        Assert.assertTrue(arrayList.isEmpty());
    }

    @org.junit.Test
    public void TestArrayListContainsTRUETest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(15);
        arrayList.add(159);
        Assert.assertTrue(arrayList.contains(15));
    }
    @org.junit.Test
    public void TestArrayListContainsFALSETest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(15);
        arrayList.add(159);
        Assert.assertFalse(arrayList.contains(777));
    }

    @org.junit.Test
    public void TestArrayListIteratorTest() {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello world");
        arrayList.add("string");
        arrayList.add("puppy");
        arrayList.add("bye");
        Iterator<String> stringIterator = arrayList.iterator();
        Assert.assertTrue(stringIterator.hasNext());
    }
    @org.junit.Test
    public void TestArrayListSizeTest() {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello world");
        arrayList.add("string");
        arrayList.add("puppy");
        arrayList.add("bye");

        Assert.assertTrue(arrayList.size()==4);
    }

    
    // Make a bigger test exercising more Stack methods.....
}
