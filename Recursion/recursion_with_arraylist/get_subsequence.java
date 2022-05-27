
package Recursion.recursion_with_arraylist;
 import java.io.*;
 import java.util.*;


//  [abc]" = ["---","--c" , "-b-" ,"-bc","a--", "a-c" ,"ab-" , "abc"] .
public class get_subsequence {
    public static void main(String []args) throws Exception{
        Scanner ob= new Scanner(System.in);
        String str=ob.nextLine();
        ArrayList<String> res= gss(str);
        System.out.println(res);
    }
    public static ArrayList<String> gss(String str) {
    if(str.length()==0)
    {
        ArrayList<String> bres= new ArrayList <>(); 
        bres.add("");
        return bres;
    }
        char ch=str.charAt(0);           //first charchter ="a"
        String ros=str.substring(1);             // substring ="bc"
        ArrayList<String> rres= gss(ros);        //getting the result
        ArrayList<String> mres= new ArrayList <>();        //intialisind new arraylist with new size
        for (String rstr: rres)                   //for loop
        {
            mres.add("-"+rstr);          // when a=false
            
        }
        for (String rstr: rres)                   //for loop
        {
            
            mres.add(ch+ rstr);         //when a=true
        }
       
        return mres;
        
        }
        
    }

