package raguilar.jala.com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyArrayListTest {
    @Test(expected=IndexOutOfBoundsException.class)
    public void testInteger() {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(400);
        assertTrue(400 == list.get(4));
        assertTrue(2 == list.get(1));
        assertTrue(3 == list.get(2));

        list.get(6);
    }

    @Test
    public void testString() {
        MyArrayList<String> list = new MyArrayList<String>();
        list.add("Hola");
        list.add("Hola02");
        assertEquals("Hola",list.get(0));
        assertEquals("Hola02", list.get(1));
    }

    @Test
    public void testDouble() {
        MyArrayList<Double> list = new MyArrayList<Double>();
        list.add(2.23);
        list.add(3.02);
        assertEquals(2.23,list.get(0),0.00);
        assertEquals(3.02,list.get(1),0.00);
    }
}