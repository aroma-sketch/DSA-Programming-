package CollectionFramework.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority {
    public static void main(String[] args)
  {

    Queue<Integer> list= new PriorityQueue <>(Comparator.reverseOrder());
    list.offer(1000);
        list.offer(20);
        list.offer(30);
        list.offer(2);

    System.out.println(list);
    list.poll();
    System.out.println(list);

}

}

