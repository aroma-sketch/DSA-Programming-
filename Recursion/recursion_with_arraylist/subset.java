// package Recursion.recursion_with_arraylist;
// import java.io.*;
// import java.util.*;
// public class subset {
//     public static void main(String []args) throws Exception{
//         Scanner ob= new Scanner(System.in);
//         int a=ob.nextInt();
//         int n=ob.nextInt();
//         ArrayList<Integer> arr= new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             arr.add(n);
//           }
//           ArrayList<Integer> ans= ob.subset(arr,n);
// Collections.sort(ans);
// for(int sum :ans){
//         System.out.println(sum+" ");
//     }
//     System.out.println();}

//     public static ArrayList<Integer> gss(int n, ArrayList<Integer>arr) {

//     if(str.length()==0)
//     {
//         ArrayList<String> bres= new ArrayList <>(); 
//         bres.add("");
//         return bres;
//     }
//         char ch=str.charAt(0);           //first charchter ="a"
//         String ros=str.substring(1);             // substring ="bc"
//         ArrayList<String> rres= gss(ros);        //getting the result
//         ArrayList<String> mres= new ArrayList <>();        //intialisind new arraylist with new size
//         for (String rstr: rres)                   //for loop
//         {
//             mres.add("-"+rstr);          // when a=false
            
//         }
//         for (String rstr: rres)                   //for loop
//         {
            
//             mres.add(ch+ rstr);         //when a=true
//         }
       
//         return mres;
        
//         }
        
// }
