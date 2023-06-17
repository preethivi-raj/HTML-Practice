
public class ArrayContainsElement{
   static boolean contain(int arr[] ,int n)
   {
       for(int i=0 ; i<arr.length; i++){
           if(arr[i]==n)
               return true;
       }
       return false;
    }
public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int found=7;
        System.out.println(contain(a,found));
    }
}
