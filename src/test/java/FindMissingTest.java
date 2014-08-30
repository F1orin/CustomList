package test.java;

import main.java.ua.com.florin.findmissing.FindMissing;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FindMissingTest {

    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 10};

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        array = null;
    }

    @Test
    public void testFindMissing() throws Exception {
        assertEquals(9, FindMissing.findMissing(array));
        assertNotEquals(10, FindMissing.findMissing(array));
    }
}