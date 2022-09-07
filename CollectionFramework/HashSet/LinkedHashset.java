
package CollectionFramework.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset  {
    public static void main(String[] args)
     {
  //  Set <Integer> set = new LinkedHashSet<>();
  Set <Integer> set = new TreeSet<>();  
  set.add(100);
    set.add(20);
    set.add(100);
    set.add(30);

    System.out.println(set);

    set.remove(30);

    System.out.println(set);

    System.out.println(set.contains(30));
    System.out.println(set.size());
}}
