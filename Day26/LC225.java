package Day26;

import java.util.LinkedList;
import java.util.Queue;

public class LC225 {

    static class MyStack {

        Queue<Integer> queue;

        public MyStack() {
            queue = new LinkedList<>();
        }

        public void push(int x) {

            queue.offer(x);

            int size = queue.size();

            while (size > 1) {
                queue.offer(queue.poll());
                size--;
            }
        }

        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.top());    // 3
        System.out.println(stack.pop());    // 3
        System.out.println(stack.top());    // 2
        System.out.println(stack.empty());  // false
    }
}
