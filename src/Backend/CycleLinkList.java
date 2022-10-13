package Backend;

public class CycleLinkList<E> {
    private class CLLNode {
        E data;
        CLLNode next;

        public  CLLNode(E data) {
            this.data = data;
            next = null;
        }

        public String toString() {
            return data.toString();
        }
    }

    CLLNode head;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }
    public int size() {
        return size;
    }

    public void insert(E data) {
        if (isEmpty()) {
            head = new CLLNode(data);
        } else {
            CLLNode newNode = new CLLNode(data);
            CLLNode currentNode = head;
            int n = size;
            while (n - 1 > 0) {
                currentNode = currentNode.next;
                n--;
            }
            currentNode.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    public E getCurrentData() {
        return head.data;
    }

    public E goNextData() {
        head = head.next;
        return head.data;
    }

    public String toString() {
        CLLNode currentNode = head;
        return toStringHelper(currentNode, size) + " ";
    }

    private CLLNode toStringHelper(CLLNode node, int n) {
        int i = n;
        if (i <= 0) {
            return null;
        }
        System.out.println(node);
        return toStringHelper(node.next, i - 1);
    }
}
