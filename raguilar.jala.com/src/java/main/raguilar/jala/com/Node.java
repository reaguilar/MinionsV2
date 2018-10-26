package raguilar.jala.com;

public class Node {
    private Node next;
    private Object data;

    public Node(Object dataValue) {
        next = null;
        data = dataValue;
    }

    @SuppressWarnings("unused")
    public Node(Object dataValue, Node nextValue) {
        next = nextValue;
        data = dataValue;
    }

    public Object getData() {
        return data;
    }

    @SuppressWarnings("unused")
    public void setData(Object dataValue) {
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }

}
