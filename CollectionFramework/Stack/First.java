package CollectionFramework.Stack;
import java.util.Stack;


public class First {
    public static void main(String[] args) {
        Stack <String> animals = new Stack<>();
        animals.push("kite");
        animals.push("horse");
        animals.push("hello");
         animals.push("nest"); // add at end
    
    System.out.println(animals);  
    System.out.println(animals.peek()); 
    System.out.println(animals.pop());  
    System.out.println(animals.peek()); 
 }
}
