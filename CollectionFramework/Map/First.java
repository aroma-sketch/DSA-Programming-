package CollectionFramework.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class First {
     public static void main(String[] args) 
     {
        Map <String,Integer> n= new TreeMap<>();
        //Map <String,Integer> n= new HashMap<>();
        n.put("one",1);
        // n.put("two",2);
        // n.put("two",4);
        n.put("hree",3);

        if(!n.containsKey("two"))
        {
            n.put("two",23);
        }

        n.putIfAbsent("two", 23);
       

        for(Map.Entry<String,Integer> e:n.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            
            System.out.println(e.getValue());
            

        }
        System.out.println(n);
     }
}
