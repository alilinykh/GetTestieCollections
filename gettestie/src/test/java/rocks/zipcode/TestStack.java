package rocks.zipcode;

import org.junit.Assert;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStackIsEmpty() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertFalse("false", stack.isEmpty()); // false
    }
    @org.junit.Test
    public void TestStackPopTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.pop();
        Assert.assertEquals(true, stack.isEmpty());
    }
    @org.junit.Test
    public void TestStackPeekTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        String expected = "Hello world";
        String actual = stack.peek();
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestStackPushTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        Integer expected = 1;
        Integer actual = stack.size();
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void TestStackSearchTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.push("string");
        stack.push("puppy");
        stack.push("bye");
        Integer expected = 2;
        Integer actual = stack.search("puppy");
        Assert.assertEquals(expected,actual);
    }



    // Make a bigger test exercising more Stack methods.....
}
