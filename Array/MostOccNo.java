package Array;

import java.util.*;
// most occured digit in an array
public class MostOccNo {
    
    static int MostOccuredNumber(int a[],int n)
    {
        int c=0;
        int max=0;
        int OccuredNumber=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                c++;
            }}
           
       if(c>max)
       {
        max=c;
        OccuredNumber=a[i];
       }
       
    }
    return OccuredNumber;
}


    public static void main(String[] args) throws Exception {

    Scanner ob=new Scanner (System.in);
    int i;
    
    //size of array
    System.out.print("size=");
     int n =ob.nextInt();

     //elements
    System.out.print("elem in array:");
    int a[]= new int[n];
    
    for( i=0;i<n;i++)
    {
        a[i]=ob.nextInt();
           
    }

int d=MostOccuredNumber(a,n);
System.out.println("most occured="+d);


}

}

