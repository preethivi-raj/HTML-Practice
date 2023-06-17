public class SmallestNumInArray{
    static int findSmall(int arr[]){
         int small=arr[1];
        for(int i=0 ;  i<arr.length; i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
      return small;
    }
    static int findBig(int arr[]){
        int big=arr[1];
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]>big){
                big=arr[i];
            }
        }
        return big;
    }
    
    public static void main(String args[]){
        int a[]={17,4,8,9,12};
        System.out.println("The Smallest Number in Array :"+findSmall(a));
        System.out.println("The Bigget Number in Array :"+findBig(a));
    }
}