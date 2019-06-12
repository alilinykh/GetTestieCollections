package rocks.zipcode;

import org.junit.Assert;

import java.util.Vector;
import java.util.Iterator;

public class VectorTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestVectorRemoveTest() {
        Vector<String> vector = new Vector<>();
        vector.add("Hello world");
        vector.remove("Hello world");
        Assert.assertEquals(true, vector.isEmpty());
    }
    @org.junit.Test
    public void TestVectorClearTest() {
        Vector<String> vector = new Vector<>();
        vector.add("Hello world");
        vector.clear();
        Assert.assertTrue(vector.isEmpty());
    }

    @org.junit.Test
    public void TestVectorContainsTRUETest() {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(15);
        vector.add(159);
        Assert.assertTrue(vector.contains(15));
    }
    @org.junit.Test
    public void TestVectorContainsFALSETest() {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(15);
        vector.add(159);
        Assert.assertFalse(vector.contains(777));
    }

    @org.junit.Test
    public void TestVectorIteratorTest() {
        Vector<String> vector = new Vector<>();

        vector.add("Hello world");
        vector.add("string");
        vector.add("puppy");
        vector.add("bye");
        Iterator<String> stringIterator = vector.iterator();
        Assert.assertTrue(stringIterator.hasNext());
    }
    @org.junit.Test
    public void TestVectorSizeTest() {
        Vector<String> vector = new Vector<>();

        vector.add("Hello world");
        vector.add("string");
        vector.add("puppy");
        vector.add("bye");

        Assert.assertTrue(vector.size()==4);
    }

    
    // Make a bigger test exercising more Stack methods.....
}
