package raguilar.jala.com;

public class MyLinkedList {

    private static int sizeItem;
    private Node head;

    public MyLinkedList() {

    }

    public void add(Object data) {

        if (head == null) {
            head = new Node(data);
        }

        Node nodeTemp = new Node(data);
        Node nodeCurrent = head;

        if (nodeCurrent != null) {

            while (nodeCurrent.getNext() != null) {
                nodeCurrent = nodeCurrent.getNext();
            }
            nodeCurrent.setNext(nodeTemp);
        }
        incrementCounter();
    }

    private static int getSizeItem() {
        return sizeItem;
    }

    private static void incrementCounter() {
        sizeItem++;
    }

    private void decrementCounter() {
        sizeItem--;
    }

    public void add(Object data, int index) {
        Node nodeTemp = new Node(data);
        Node nodeCurrent = head;

        if (nodeCurrent != null) {
            for (int i = 0; i < index && nodeCurrent.getNext() != null; i++) {
                nodeCurrent = nodeCurrent.getNext();
            }
        }

        nodeTemp.setNext(nodeCurrent.getNext());

        nodeCurrent.setNext(nodeTemp);

        incrementCounter();
    }

    public Object get(int index) {
        if (index < 0)
            return null;
        Node nodeCurrent = null;
        if (head != null) {
            nodeCurrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (nodeCurrent.getNext() == null)
                    return null;

                nodeCurrent = nodeCurrent.getNext();
            }
            return nodeCurrent.getData();
        }
        return nodeCurrent;

    }

    public boolean remove(int index) {
        if (index < 1 || index > size())
            return false;

        Node nodeCurrent = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (nodeCurrent.getNext() == null)
                    return false;

                nodeCurrent = nodeCurrent.getNext();
            }
            nodeCurrent.setNext(nodeCurrent.getNext().getNext());
            decrementCounter();
            return true;

        }
        return false;
    }

    public int size() {
        return getSizeItem();
    }
}
