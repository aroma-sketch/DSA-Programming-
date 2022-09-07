package CollectionFramework.Arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraverseLoop {
    public static void main(String[] args) {
        List <Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
         list.add(4); // add at end
         
for (int i = 0; i < list.size(); i++) {
    System.out.print(list.get(i)+" ");
}

   for(Integer element: list)
   {
    System.out.print(element+" ");
   }


   Iterator<Integer> it=list.iterator();
   while(it.hasNext())
   {
    System.out.print(it.next()+" ");
   }
    
    
       
    
    }
    
}
