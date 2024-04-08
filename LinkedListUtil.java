public class LinkedListUtil {

    private static class Node<T> {
        T item;
        Node<T> next;

        Node(T item) {
            this.item = item;
            this.next = null;
        }
    }

    public static <T> void removeAfter(Node<T> node) {
        if (node == null || node.next == null) {
            return;
        }
        node.next = node.next.next;
    }

    public static <T> Node<T> copy(Node<T> original) {
        if (original == null) {
            return null;
        }
        Node<T> copyHead = new Node<>(original.item);
        Node<T> currentCopy = copyHead;
        Node<T> currentOriginal = original.next;
        while (currentOriginal != null) {
            currentCopy.next = new Node<>(currentOriginal.item);
            currentOriginal = currentOriginal.next;
            currentCopy = currentCopy.next;
        }
        return copyHead;
    }

    public static void removeDuplicate(Node<String> head, String key) {
        while (head != null && head.item.equals(key)) {
            head = head.next; // Move head if it's a duplicate
        }

        Node<String> current = head;
        while (current != null && current.next != null) {
            if (current.next.item.equals(key)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public static int max(Node<Integer> head) {
        if (head == null) {
            return 0;
        }
        int max = head.item;
        while (head != null) {
            if (head.item > max) {
                max = head.item;
            }
            head = head.next;
        }
        return max;
    }

    // Add a main method if you want to run some test cases.
    public static void main(String[] args) {
        // You can add some test cases here to test your methods.
    }
}
