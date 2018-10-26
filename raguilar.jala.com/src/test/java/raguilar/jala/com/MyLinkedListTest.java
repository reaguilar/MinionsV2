package raguilar.jala.com;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void addAtIndex() {
        MyLinkedList ll = new MyLinkedList();
        ll.add(11);
        ll.add(12);
        ll.add(13);
        ll.add(8);
        ll.add(7);
        ll.add(4,4);
        assertEquals(11,ll.get(0));
        assertEquals(12,ll.get(1));
        assertEquals(13,ll.get(2));
        assertEquals(8,ll.get(3));
        assertEquals(7,ll.get(5));
        assertEquals(4,ll.get(4));
    }

    @Test
    public void RemoveTheItemInThepositionOne() {
        MyLinkedList ll = new MyLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        ll.remove(1);

        assertEquals(1,ll.get(0));
        assertEquals(3,ll.get(1));
    }

    @Test
    public void addString() {
        MyLinkedList ll = new MyLinkedList();
        ll.add("Hello");
        ll.add("Juan");

        assertEquals("Hello",ll.get(0));
        assertEquals("Juan",ll.get(1));
    }
}