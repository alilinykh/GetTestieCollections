package rocks.zipcode;

import org.junit.Assert;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestPriorityQueueRemoveTest() {
        PriorityQueue<String> priorityQ = new PriorityQueue<>();
        priorityQ.add("Hello world");
        priorityQ.remove("Hello world");
        Assert.assertEquals(true, priorityQ.isEmpty());
    }
    @org.junit.Test
    public void TestPriorityQueueClearTest() {
        PriorityQueue<String> priorityQ = new PriorityQueue<>();
        priorityQ.add("Hello world");
        priorityQ.clear();
        Assert.assertTrue(priorityQ.isEmpty());
    }

    @org.junit.Test
    public void TestPriorityQueueContainsTRUETest() {
        PriorityQueue<Integer> priorityQ = new PriorityQueue<>();
        priorityQ.add(1);
        priorityQ.add(15);
        priorityQ.add(159);
        Assert.assertTrue(priorityQ.contains(15));
    }
    @org.junit.Test
    public void TestPriorityQueueContainsFALSETest() {
        PriorityQueue<Integer> priorityQ = new PriorityQueue<>();
        priorityQ.add(1);
        priorityQ.add(15);
        priorityQ.add(159);
        Assert.assertFalse(priorityQ.contains(777));
    }

    @org.junit.Test
    public void TestPriorityQueueIteratorTest() {
        PriorityQueue<String> priorityQ = new PriorityQueue<>();

        priorityQ.add("Hello world");
        priorityQ.add("string");
        priorityQ.add("puppy");
        priorityQ.add("bye");
        Iterator<String> stringIterator = priorityQ.iterator();
        Assert.assertTrue(stringIterator.hasNext());
    }
    @org.junit.Test
    public void TestPriorityQueueSizeTest() {
        PriorityQueue<String> priorityQ = new PriorityQueue<>();

        priorityQ.add("Hello world");
        priorityQ.add("string");
        priorityQ.add("puppy");
        priorityQ.add("bye");

        Assert.assertTrue(priorityQ.size()==4);
    }

    
    // Make a bigger test exercising more Stack methods.....
}
