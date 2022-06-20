
import java.util.Stack;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        Stack<String> stack3 = new Stack<>();


        // compare result
        stack.push("F");
        stack.push("E");
        stack.push("D");
        stack.push("C");
        stack.push("B");
        stack.push("A");

        // start
        stack1.push("F");
        stack1.push("E");
        stack1.push("D");
        stack1.push("C");
        stack1.push("B");
        stack1.push("A");


        while (!stack.equals(stack3)) {
            double rand = Math.random();
            if (rand < 1.0 / 6 && !stack1.isEmpty()) {
                if (!stack2.isEmpty()) {
                    if (stack1.peek().charAt(0) < stack2.peek().charAt(0)) {
                        stack2.push(stack1.pop());
                    }
                } else {

                    stack2.push(stack1.pop());
                }
                count++;


            } else if (rand >= 1.0 / 6 && rand < 2.0 / 6 && !stack1.isEmpty()) {
                if (!stack3.isEmpty()) {
                    if (stack1.peek().charAt(0) < stack3.peek().charAt(0)) {
                        stack3.push(stack1.pop());
                    }
                } else {

                    stack3.push(stack1.pop());
                }
                count++;

            } else if (rand >= 2.0 / 6 && rand < 3.0 / 6 && !stack2.isEmpty()) {
                if (!stack1.isEmpty()) {
                    if (stack2.peek().charAt(0) < stack1.peek().charAt(0)) {
                        stack1.push(stack2.pop());
                    }
                } else {

                    stack1.push(stack2.pop());
                }
                count++;


            } else if (rand >= 3.0 / 6 && rand <= 4.0 / 6 && !stack2.isEmpty()) {
                if (!stack3.isEmpty()) {
                    if (stack2.peek().charAt(0) < stack3.peek().charAt(0)) {
                        stack3.push(stack2.pop());
                    }
                } else {

                    stack3.push(stack2.pop());
                }
                count++;


            } else if (rand >= 4.0 / 6 && rand < 5.0 / 6 && !stack3.isEmpty()) {
                if (!stack1.isEmpty()) {
                    if (stack3.peek().charAt(0) < stack1.peek().charAt(0)) {
                        stack1.push(stack3.pop());
                    }
                } else {

                    stack1.push(stack3.pop());
                }
                count++;


            } else if (rand >= 5.0 / 6 && !stack3.isEmpty()) {
                if (!stack2.isEmpty()) {
                    if (stack3.peek().charAt(0) < stack2.peek().charAt(0)) {
                        stack2.push(stack3.pop());
                    }
                } else {

                    stack2.push(stack3.pop());
                }
                count++;


            }
            System.out.println(stack3);


        }
        System.out.println(stack3);
        System.out.println(count);


    }
}
