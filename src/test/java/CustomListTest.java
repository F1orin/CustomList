package test.java;

import main.java.ua.com.florin.customlist.CustomList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomListTest {

    CustomList customList;
    CustomList emptyCustomList;
    CustomList oneItemCustomList;
    CustomList fiveItemsCustomList;
    String firstValue;
    String secondValue;
    String thirdValue;
    String fourthValue;
    String fifthValue;

    @Before
    public void setUp() throws Exception {

        firstValue = "first";
        secondValue = null;
        thirdValue = "value";
        fourthValue = new String("value");
        fifthValue = null;

        customList = new CustomList();
        emptyCustomList = new CustomList();

        oneItemCustomList = new CustomList();
        oneItemCustomList.add(firstValue);

        fiveItemsCustomList = new CustomList();
        fiveItemsCustomList.add(firstValue);
        fiveItemsCustomList.add(secondValue);
        fiveItemsCustomList.add(thirdValue);
        fiveItemsCustomList.add(fourthValue);
        fiveItemsCustomList.add(fifthValue);
    }

    @After
    public void tearDown() throws Exception {
        customList = null;
        emptyCustomList = null;
        oneItemCustomList = null;
        fiveItemsCustomList = null;
    }

    @Test
    public void testSubList() throws Exception {

    }

    @Test
    public void testSize() throws Exception {
        assertEquals(0,emptyCustomList.size());
        assertEquals(1,oneItemCustomList.size());
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(emptyCustomList.isEmpty());
        assertFalse(oneItemCustomList.isEmpty());
    }

    @Test
    public void testContains() throws Exception {

    }

    @Test
    public void testIterator() throws Exception {

    }

    @Test
    public void testToArray() throws Exception {

    }

    @Test
    public void testToArray1() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {
        assertTrue(customList.isEmpty());
        assertTrue(customList.add(firstValue));
        assertFalse(customList.isEmpty());
        assertEquals(1, customList.size());
    }

    @Test
    public void testRemove() throws Exception {
        assertFalse(oneItemCustomList.isEmpty());
        assertEquals(firstValue, oneItemCustomList.remove(0));
        assertTrue(oneItemCustomList.isEmpty());
    }

    @Test
    public void testContainsAll() throws Exception {

    }

    @Test
    public void testAddAll() throws Exception {

    }

    @Test
    public void testAddAll1() throws Exception {

    }

    @Test
    public void testRemoveAll() throws Exception {

    }

    @Test
    public void testRetainAll() throws Exception {

    }

    @Test
    public void testClear() throws Exception {

    }

    @Test
    public void testGet() throws Exception {

    }

    @Test
    public void testSet() throws Exception {

    }

    @Test
    public void testAdd1() throws Exception {

    }

    @Test
    public void testRemove1() throws Exception {

    }

    @Test
    public void testIndexOf() throws Exception {
        assertEquals(2, fiveItemsCustomList.indexOf(thirdValue));
        assertEquals(-1, oneItemCustomList.indexOf(thirdValue));
        assertEquals(1, fiveItemsCustomList.indexOf(null));
    }

    @Test
    public void testLastIndexOf() throws Exception {
        assertEquals(3, fiveItemsCustomList.lastIndexOf(fourthValue));
        assertEquals(0, fiveItemsCustomList.lastIndexOf(firstValue));
        assertEquals(-1, oneItemCustomList.lastIndexOf(thirdValue));
        assertEquals(4, fiveItemsCustomList.lastIndexOf(null));
    }

    @Test
    public void testListIterator() throws Exception {

    }

    @Test
    public void testListIterator1() throws Exception {

    }
}