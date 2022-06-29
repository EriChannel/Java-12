import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(7);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(4);

        System.out.println(priorityQueue);

        System.out.println("Phần tử đầu tiên: " + priorityQueue.poll());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue);

        System.out.println("Phần tử đầu tiên: " + priorityQueue.peek());
        System.out.println(priorityQueue.element());

        priorityQueue.offer(8);
        System.out.println(priorityQueue);


        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.offer(4);
        linkedList.add(12);
        linkedList.add(9);
        linkedList.add(3);
        System.out.println(linkedList);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(5);
        arrayDeque.add(3);
        arrayDeque.add(1);
        arrayDeque.add(9);

        System.out.println(arrayDeque);
        arrayDeque.addFirst(8);
        arrayDeque.addLast(7);
        System.out.println(arrayDeque);

        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());



    }
}
