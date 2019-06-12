package rocks.zipcode;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

import static org.junit.Assert.assertFalse;

public class HashMapTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashMapIsEmpty() {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Hello world", 1);
        assertFalse("false", hashMap.isEmpty()); // false
    }
    @org.junit.Test
    public void TestHashMapRemoveTest() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Hello world", 1);
        hashMap.remove("Hello world");
        Assert.assertEquals(true, hashMap.isEmpty());
    }
    @org.junit.Test
    public void TestHashMapClearTest() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("testString", 1);
        hashMap.clear();
        Assert.assertTrue(hashMap.isEmpty());
    }

    @org.junit.Test
    public void TestHashMapContainsKeyTRUETest() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("2", 1);
        hashMap.put("tg", 15);
        hashMap.put("testString", 159);
        Assert.assertTrue(hashMap.containsKey("tg"));

    }
    @org.junit.Test
    public void TestHashMapContainsValueFALSETest() {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("asdf", 1);
        hashMap.put("String", 15);
        hashMap.put("testString", 159);
        Assert.assertFalse(hashMap.containsValue(777));
    }

    @org.junit.Test
    public void TestHashMapReplaceTest() {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Hello world",1);
        hashMap.put("string",1);
        hashMap.put("puppy",1);
        hashMap.put("bye",1);

        hashMap.replace("Hello world", 1, 99999);
        Integer actual = hashMap.get("Hello world");
        Integer expected = 99999;

        Assert.assertEquals(expected,actual);


    }
    @org.junit.Test
    public void TestHashMapSizeTest() {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("asdf",1);
        hashMap.put("testwerString", 2);
        hashMap.put("testStrhhing", 3);
        hashMap.put("testString", 4);

        Assert.assertTrue(hashMap.size() == 4);
    }



    // Make a bigger test exercising more Stack methods.....
}
