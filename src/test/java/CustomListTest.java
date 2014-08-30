package test.java;

import main.java.ua.com.florin.customlist.CustomList;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

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
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testSubList() throws Exception {
        oneItemCustomList.add(null);
        assertEquals(oneItemCustomList.get(0), fiveItemsCustomList.subList(0, 1).get(0));
        assertEquals(oneItemCustomList.get(1), fiveItemsCustomList.subList(0, 2).get(1));
        assertEquals(oneItemCustomList.size(), fiveItemsCustomList.subList(0, 2).size());
    }

    @Test
    public void testSize() throws Exception {
        assertEquals(0, emptyCustomList.size());
        assertEquals(1, oneItemCustomList.size());
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(emptyCustomList.isEmpty());
        assertFalse(oneItemCustomList.isEmpty());
    }

    @Test
    public void testContains() throws Exception {
        assertTrue(fiveItemsCustomList.contains(firstValue));
        assertFalse(emptyCustomList.contains(firstValue));
    }

    @Test
    public void testIterator() throws Exception {

    }

    @Test
    public void testToArray() throws Exception {
        Object[] objects = new Object[1];
        objects[0] = firstValue;
        Object[] emptyObjects = new Object[0];
        assertEquals(objects, oneItemCustomList.toArray());
        assertEquals(emptyObjects, emptyCustomList.toArray());
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
        assertTrue(oneItemCustomList.remove(firstValue));
        assertEquals(0, oneItemCustomList.size());
        customList.add(null);
        customList.add(null);
        assertTrue(customList.remove(null));
        assertEquals(null, customList.get(0));
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
        emptyCustomList.add(firstValue);
        assertFalse(emptyCustomList.isEmpty());
        emptyCustomList.clear();
        assertTrue(emptyCustomList.isEmpty());
        assertEquals(-1, emptyCustomList.indexOf(firstValue));
    }

    @Test
    public void testGet() throws Exception {
        assertEquals(firstValue, fiveItemsCustomList.get(0));
        assertEquals(fifthValue, fiveItemsCustomList.get(4));
        expectedException.expect(IndexOutOfBoundsException.class);
        emptyCustomList.get(2);
    }

    @Test
    public void testSet() throws Exception {
        customList.add(firstValue);
        assertEquals(firstValue, customList.set(0, thirdValue));
        assertEquals(thirdValue, customList.get(0));
    }

    @Test
    public void testAdd1() throws Exception {

    }

    @Test
    public void testRemove1() throws Exception {
        assertFalse(oneItemCustomList.isEmpty());
        assertEquals(firstValue, oneItemCustomList.remove(0));
        assertTrue(oneItemCustomList.isEmpty());
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