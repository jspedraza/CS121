import java.util.Scanner;
import java.io.*;

class TwentyQuestionsGame {
    private Node root;
    private Scanner scanner;

    public TwentyQuestionsGame() {
        this.scanner = new Scanner(System.in);
        loadTree();
    }

    private void loadTree() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("gameTree.dat"))) {
            root = (Node) in.readObject();
        } catch (Exception e) {
            // Initialize with a basic tree if no file exists
            root = new Node("Is it an animal?");
            root.yes = new Node("Does it meow?");
            root.yes.yes = new Node("Cat");
            root.yes.no = new Node("Dog");
            root.no = new Node("Is it a plant?");
            root.no.yes = new Node("Tree");
            root.no.no = new Node("Rock");
        }
    }

    public void playGame() {
        Node current = root;
        Node parent = null;
        boolean isYesNode = true;

        while (current.yes != null || current.no != null) {
            System.out.println(current.data);
            String answer = scanner.nextLine().trim().toLowerCase();
            parent = current;
            if (answer.equals("yes")) {
                current = current.yes;
                isYesNode = true;
            } else {
                current = current.no;
                isYesNode = false;
            }
        }

        System.out.println("Is it a " + current.data + "?");
        if (scanner.nextLine().trim().toLowerCase().equals("yes")) {
            System.out.println("I win!");
        } else {
            System.out.println("You win! What were you thinking of?");
            String correctAnswer = scanner.nextLine();
            System.out.println("Please give me a question that distinguishes a " + correctAnswer +
                    " from a " + current.data);
            String newQuestion = scanner.nextLine();
            System.out.println("What is the answer for " + correctAnswer + "? (yes/no)");
            String newAnswer = scanner.nextLine().trim().toLowerCase();

            Node newQuestionNode = new Node(newQuestion);
            Node newAnswerNode = new Node(correctAnswer);

            if (newAnswer.equals("yes")) {
                newQuestionNode.yes = newAnswerNode;
                newQuestionNode.no = current;
            } else {
                newQuestionNode.yes = current;
                newQuestionNode.no = newAnswerNode;
            }

            if (isYesNode) {
                parent.yes = newQuestionNode;
            } else {
                parent.no = newQuestionNode;
            }
        }
        saveTree();
    }

    private void saveTree() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("gameTree.dat"))) {
            out.writeObject(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TwentyQuestionsGame game = new TwentyQuestionsGame();
        game.playGame();
    }
}
