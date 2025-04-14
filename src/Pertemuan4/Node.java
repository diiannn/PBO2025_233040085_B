package Pertemuan4;

// Kelas Node digunakan untuk membuat simpul (node) dalam struktur data linked list
public class Node {
    private int value;   // Menyimpan nilai dari node
    private Node next;   // Referensi ke node berikutnya dalam linked list

    // Konstruktor: membuat node baru dengan nilai tertentu
    // dan mengatur referensi next ke null
    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    // Setter untuk mengatur node berikutnya
    public void setNext(Node next) {
        this.next = next;
    }

    // Getter untuk mengambil referensi ke node berikutnya
    public Node getNext() {
        return next;
    }

    // Getter untuk mengambil nilai dari node
    public int getValue() {
        return value;
    }
}
