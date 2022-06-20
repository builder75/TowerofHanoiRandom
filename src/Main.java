
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of disks");

        int numberOfDisks = scanner.nextInt();

        for (int i = numberOfDisks; i > 0; i--) {
            stack.push(i);
            stack1.push(i);


        }


        while (!stack.equals(stack3)) {
            double rand = Math.random();
            if (rand < 1.0 / 6 && !stack1.isEmpty()) {
                if (!stack2.isEmpty()) {
                    if (stack1.peek() < stack2.peek()) {
                        stack2.push(stack1.pop());
                    }
                } else {

                    stack2.push(stack1.pop());
                }
                count++;


            } else if (rand >= 1.0 / 6 && rand < 2.0 / 6 && !stack1.isEmpty()) {
                if (!stack3.isEmpty()) {
                    if (stack1.peek() < stack3.peek()) {
                        stack3.push(stack1.pop());
                    }
                } else {

                    stack3.push(stack1.pop());
                }
                count++;

            } else if (rand >= 2.0 / 6 && rand < 3.0 / 6 && !stack2.isEmpty()) {
                if (!stack1.isEmpty()) {
                    if (stack2.peek() < stack1.peek()) {
                        stack1.push(stack2.pop());
                    }
                } else {

                    stack1.push(stack2.pop());
                }
                count++;


            } else if (rand >= 3.0 / 6 && rand <= 4.0 / 6 && !stack2.isEmpty()) {
                if (!stack3.isEmpty()) {
                    if (stack2.peek() < stack3.peek()) {
                        stack3.push(stack2.pop());
                    }
                } else {

                    stack3.push(stack2.pop());
                }
                count++;


            } else if (rand >= 4.0 / 6 && rand < 5.0 / 6 && !stack3.isEmpty()) {
                if (!stack1.isEmpty()) {
                    if (stack3.peek() < stack1.peek()) {
                        stack1.push(stack3.pop());
                    }
                } else {

                    stack1.push(stack3.pop());
                }
                count++;


            } else if (rand >= 5.0 / 6 && !stack3.isEmpty()) {
                if (!stack2.isEmpty()) {
                    if (stack3.peek() < stack2.peek()) {
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
