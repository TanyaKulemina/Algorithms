package Lesson_3;

public class LinkedList {
    private Node head;

    public void addFirst(int value) {
        Node node = new Node(value);
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    private class Node {

        private int value;

        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
