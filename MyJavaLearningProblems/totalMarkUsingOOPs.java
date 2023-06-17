import java.util.*;
class Student{
    String name;
    String rollNum;
    int marks[]=new int[3];
    
    void marksTot(){
        System.out.println("The Total Marks of a Students");
        System.out.println("Student Name "+this.name);
        System.out.println("The Roll Number "+this.rollNum);
        System.out.println("Total Marks "+(this.marks[0]+this.marks[1]+this.marks[2]));
    }
    
}
public class totalMarkUsingOOPs{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Students Details");
        
        String stdName=s.nextLine();
        String rollNumber=s.next();
        int mark[]=new int[3];
        for(int i=0 ; i<3; i++){
            mark[i]=s.nextInt();
        }
        
        Student std=new Student();
        
        std.name=stdName;
        std.rollNum=rollNumber;
        std.marks[0]=mark[0];
        std.marks[1]=mark[1];
        std.marks[2]=mark[2];
        
        std.marksTot();
        
    }
}