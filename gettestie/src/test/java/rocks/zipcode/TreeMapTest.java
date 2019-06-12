package rocks.zipcode;

import org.junit.Assert;

import java.util.TreeMap;

import static org.junit.Assert.assertFalse;

public class TreeMapTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestTreeMapIsEmpty() {
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Hello world", 1);
        assertFalse("false", treeMap.isEmpty()); // false
    }
    @org.junit.Test
    public void TestTreeMapRemoveTest() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Hello world", 1);
        treeMap.remove("Hello world");
        Assert.assertEquals(true, treeMap.isEmpty());
    }
    @org.junit.Test
    public void TestTreeMapClearTest() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("testString", 1);
        treeMap.clear();
        Assert.assertTrue(treeMap.isEmpty());
    }

    @org.junit.Test
    public void TestTreeMapContainsKeyTRUETest() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("2", 1);
        treeMap.put("tg", 15);
        treeMap.put("testString", 159);
        Assert.assertTrue(treeMap.containsKey("tg"));

    }
    @org.junit.Test
    public void TestTreeMapContainsValueFALSETest() {
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("asdf", 1);
        treeMap.put("String", 15);
        treeMap.put("testString", 159);
        Assert.assertFalse(treeMap.containsValue(777));
    }

    @org.junit.Test
    public void TestTreeMapReplaceTest() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Hello world",1);
        treeMap.put("string",1);
        treeMap.put("puppy",1);
        treeMap.put("bye",1);

        treeMap.replace("Hello world", 1, 99999);
        Integer actual = treeMap.get("Hello world");
        Integer expected = 99999;

        Assert.assertEquals(expected,actual);


    }
    @org.junit.Test
    public void TestTreeMapSizeTest() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("asdf",1);
        treeMap.put("testwerString", 2);
        treeMap.put("testStrhhing", 3);
        treeMap.put("testString", 4);

        Assert.assertTrue(treeMap.size() == 4);
    }



    // Make a bigger test exercising more Stack methods.....
}
