
// import java.util.ArrayList;
// import java.util.List;
import java.util.Stack;

public class MinStack {

    public static void main(String[] args) {

    }

    Stack<Integer> stack;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        this.stack = new Stack<>();
    }

    public void push(int x) {
        if (x < min) {
            this.stack.push(x);
        }
    }

    public void pop() {

    }

    // public int top() {

    // }

    // public int getMin() {

    // }

    // -----------------------------------------
    // public MinStack() {
    // this.stack = new Stack<>();
    // }

    // public void push(int x) {
    // if (x <= min) {
    // this.stack.push(min);
    // this.min = x;
    // }
    // this.stack.push(x);
    // }

    // public void pop() {
    // if (stack.peek() == this.min) {
    // this.stack.pop();
    // min = this.stack.pop();
    // } else {
    // this.stack.pop();
    // }
    // }

    // public int top() {
    // return this.stack.peek();
    // }

    // public int getMin() {
    // return min;
    // }
}
