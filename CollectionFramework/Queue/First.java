package CollectionFramework.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class First {
    public static void main(String[] args) {
        Queue <Integer> animals = new LinkedList<>();
        animals.offer(10);
        animals.offer(40);
        animals.offer(30);
        animals.offer(20);; // add at end
    
    System.out.println(animals);  
    System.out.println(animals.poll()); 
    System.out.println(animals);  
    System.out.println(animals.peek()); 
 }
}