import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExpressionEvaluator {
    private ScriptEngine engine;

    public ExpressionEvaluator() {
        engine = new ScriptEngineManager().getEngineByName("JavaScript");
        if (engine == null) {
            throw new RuntimeException("JavaScript engine not available");
        }
    }

    public String evaluate(String expression) throws ScriptException {
        return String.valueOf(engine.eval(expression));
    }
}
