public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
        var dq = queue.dequeue();
        System.out.println(dq);
        System.out.println(queue);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(70);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        PriorityQueue pq = new PriorityQueue();
        pq.add(5);
        pq.add(3);
        pq.add(6);
        pq.add(1);
        pq.add(4);
        System.out.println(pq);
    }

}
