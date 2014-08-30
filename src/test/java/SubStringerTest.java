package test.java;

import main.java.ua.com.florin.substring.SubStringer;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class SubStringerTest {

    String testString;

    @Before
    public void setUp() throws Exception {
        testString = "Test";
    }

    @After
    public void tearDown() throws Exception {
        testString = null;
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testMySubString() throws Exception {
        assertEquals(testString.substring(2), SubStringer.mySubString(testString, 2));
        assertEquals(testString.substring(4), SubStringer.mySubString(testString, 4));
        expectedException.expect(IndexOutOfBoundsException.class);
        SubStringer.mySubString(testString, 5);
    }

    @Test
    public void testMySubString1() throws Exception {
        assertEquals(testString.substring(2, 4), SubStringer.mySubString(testString, 2, 4));
        assertEquals(testString.substring(4, 4), SubStringer.mySubString(testString, 4, 4));
        expectedException.expect(IndexOutOfBoundsException.class);
        SubStringer.mySubString(testString, 3, 2);
    }
}