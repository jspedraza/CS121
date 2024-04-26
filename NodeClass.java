import java.io.Serializable;

class Node implements Serializable {
    String data;
    Node yes;
    Node no;

    Node(String data) {
        this.data = data;
        this.yes = null;
        this.no = null;
    }
}
