
public class Calculator {
    Item[] expr;
    int ipointer;
    Stack stack;
    public Calculator(Item[] expr) {
        this.expr = expr;
        this.ipointer = 0; // primary pointer for the left-right 0-infinite math
        this.stack = new Stack(expr.length);
    }
    public int run() {
        while ( ipointer < expr.length ) {
            step();
        }
        return stack.pop();
    }
    public void step() {
        Item nxt = expr[ipointer++];
        switch (nxt.getType()) {
            case VALUE:{
                stack.push(nxt.getValue());
                break;
            }
            case ADD: {
                int y = stack.pop();
                int x = stack.pop();
                stack.push(x + y);
                break;
            }
            case MUL: {
                int y = stack.pop();
                int x = stack.pop();
                stack.push(x * y);
                break;
            }
            case SUB: {
                int y = stack.pop();
                int x = stack.pop();
                stack.push(x - y);
                break;
            }
            case DIV: {
                int y = stack.pop();
                int x = stack.pop();
                stack.push(x / y);
                break;
            }
        }
    }
}
