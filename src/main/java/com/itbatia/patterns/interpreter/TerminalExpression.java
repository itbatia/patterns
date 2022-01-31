package main.java.com.itbatia.patterns.interpreter;

public class TerminalExpression implements Expression {
    private String keyword;

    public TerminalExpression(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(keyword)) {
            return true;
        }
        return false;
    }
}
