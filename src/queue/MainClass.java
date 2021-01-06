package queue;
import java.util.LinkedList;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(12);
        queue.enqueue(24);
        queue.enqueue(36);
        System.out.println(queue);
        System.out.println(queue.dequeue());
    }
}
