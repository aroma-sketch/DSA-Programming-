package CollectionFramework.Queue;
import java.util.ArrayDeque;

public class ArrayDeqeue {
    public static void main(String[] args)
    {
ArrayDeque<Integer> adq=new ArrayDeque<>();

adq.offer(23);
adq.offerFirst(12);
adq.offerFirst(139);
adq.offer(236);
 System.out.println(adq);

 System.out.println(adq.peek());
 System.out.println(adq.peekFirst());
 System.out.println(adq.peekLast());

 System.out.println(adq.poll());
 System.out.println(adq.pollFirst());
 System.out.println(adq.pollLast());
    }

}
