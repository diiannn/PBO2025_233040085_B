package Pertemuan4;

public class Node {
        private int value;
        private Node next;

        // Konstruktor
        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        // Setter dan Getter
        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public int getValue() {
            return value;
        }
    }

