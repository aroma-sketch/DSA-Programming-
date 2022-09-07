package CollectionFramework.Arraylist;
import java.util.ArrayList;
import java.util.List;

public class First {
 public static void main(String[] args) {
    List <Integer> list= new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list);
 
 list.add(4); // add at end
 System.out.println(list);

 list.add(0,0); // method overloading
 System.out.println(list);

 List <Integer> newlist= new ArrayList<>(); // creating new arraylist
    newlist.add(10);
    newlist.add(20);

    list.addAll(newlist);  // adding in a new array list
    System.out.println(list);

    System.out.println(list.get(3)); // getting element at index

    list.remove(0);  //remove element at index 0
    System.out.println(list);
    
    list.remove(Integer.valueOf(20));  //remove specfic element
    System.out.println(list);

    
    list.set(2,1000);  //remove element at index 0
    System.out.println(list);

    list.contains(1000);  //remove element at index 0
    System.out.println(list);

    list.clear();  //remove element at index 0
    System.out.println(list);

}

}
