package CollectionFramework.ArrayClass;
import java.util.Arrays;
public class ArryClass {
    
    public static void main(String[] args) {
      
        int a[]={1,2,3,4,5,5,6,7,8,9};
        int index=Arrays.binarySearch(a, 5);

        System.out.println(index);


        
        Integer[]num={10,20,1,33,24,564,34};
        Arrays.sort(num);

        for (int i :num){
            System.out.println(i);
        }
    }
}
