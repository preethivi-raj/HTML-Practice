class Stack
{
    int s[]=new int[10];
    int tos;
    Stack(){
        tos=-1;
    }
    void push(int item){
        if(tos==9)
          System.out.println("Stack is Full");
        else  
        s[++tos]=item;        
    }
    int pop(){
        if(tos>=0)
          return s[tos--];
        else
          System.out.println("Stack is Empty");
          return -1;
    }
}
public class StackElements{
    public static void main(String args[]){
        Stack s1=new Stack();
        s1.push(10);
        s1.push(22);
        s1.push(34);
        System.out.println(s1.pop());
    }
}