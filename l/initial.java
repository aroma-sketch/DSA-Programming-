package l;

    

//stack using array

public class initial {
    static int n=10;
    int top;
    int a[]=new int [n];

    void push( int x){
        if(top== n-1){
            System.out.println(" overflow");
        }
        else{
            top++;
            a[top]=x;
            System.out.println(x+"added to stack ");
        }
        
    }
    void pop()
    {
        if(top==-1){
            System.out.println(" underflow");
        }
        else{
             int x =a [top];
            top--;
            System.out.println(x);
        }
    }
    void peek(){
        if(top==-1){
            System.out.println("emoty");
        }
        else{
            System.out.println(a[top]);
        }
    }
    void print()
{
    for (int i=top;i>=0;i--){
        System.out.println(" "+a[i]);
    }
}}
class Main{
    public static void main(String args[])
    {
        Stack s= new Stack();
        s.push(11111);
        s.push(22222);
        s.push(33333);
        System.out.println("deleted from stack:"+s.pop());
        System.out.println("Top element is :" + s.peek());
        System.out.print("element present is :" );
s.print();
    }
}    


