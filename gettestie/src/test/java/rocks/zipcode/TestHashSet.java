package rocks.zipcode;

import org.junit.Assert;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

import static org.junit.Assert.assertFalse;

public class TestHashSet {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashSetIsEmpty() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello world");
        assertFalse("false", hashSet.isEmpty()); // false
    }
    @org.junit.Test
    public void TestHashSetRemoveTest() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello world");
        hashSet.remove("Hello world");
        Assert.assertEquals(true, hashSet.isEmpty());
    }
    @org.junit.Test
    public void TestHashSetClearTest() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello world");
        hashSet.clear();
        Assert.assertTrue(hashSet.isEmpty());
    }

    @org.junit.Test
    public void TestHashSetContainsTRUETest() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(15);
        hashSet.add(159);
        Assert.assertTrue(hashSet.contains(15));
    }
    @org.junit.Test
    public void TestHashSetContainsFALSETest() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(15);
        hashSet.add(159);
        Assert.assertFalse(hashSet.contains(777));
    }

    @org.junit.Test
    public void TestHashSetIteratorTest() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Hello world");
        hashSet.add("string");
        hashSet.add("puppy");
        hashSet.add("bye");
        Iterator<String> stringIterator = hashSet.iterator();
        Assert.assertTrue(stringIterator.hasNext());
    }
    @org.junit.Test
    public void TestHashSetSizeTest() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Hello world");
        hashSet.add("string");
        hashSet.add("puppy");
        hashSet.add("bye");

        Assert.assertTrue(hashSet.size()==4);
    }



    // Make a bigger test exercising more Stack methods.....
}
