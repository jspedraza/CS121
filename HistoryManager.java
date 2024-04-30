import java.util.List;
import java.util.ArrayList;

public class HistoryManager {
    private List<String> history = new ArrayList<>();

    public void saveCalculation(String expression) {
        history.add(expression);
    }

    public List<String> getHistory() {
        return history;
    }
}