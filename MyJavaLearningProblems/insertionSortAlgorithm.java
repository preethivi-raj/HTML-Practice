import java.util.*;
public class insertionSortAlgorithm {
    public static void main(String args[]) {
     Scanner s= new Scanner(System.in);
     int n=s.nextInt();
     int a[]=new int[n];
     for(int i=0 ; i<n;i++){
         a[i]=s.nextInt();
     }
     for(int i=1; i<n; i++){
         int key=a[i];
         int j=i-1;
         while(j>=0 && a[j]>key){
             a[j+1]=a[j];
             j--;
         }
         a[j+1]=key;
     }
     for(int x: a){
         System.out.print(x+" ");
     }
    }
}