class Box{
    int length; //instance variables
    int breath;
    int height;
    
    Box(int l ,int b , int h){ // construtor
        length=l;
        breath=b;
        height=h;
    }
    Box(){ // overloaded construtor 
        length=-1;
        breath=-1;
        height=-1;
    }
    
    Box(int l){
        length=breath=height=l;
    }
    void setDim(int length ,int breath , int height){ // setting the dimesion
        this.length=length;
        this.breath=breath;
        this.height=height;
    }
    
    int vol(){
        return length*breath*height;
    }
}
public class invokingMethods{
    public static void main(String args[]){
        Box black=new Box(5,4,3);
        
        black.setDim(1,2,3);
        
        System.out.println("black Box vol = "+black.vol());
        
        Box wood=new Box(3,4,6);
        wood.setDim(1,2,3);
       
        System.out.println("wood Bod Vol = "+wood.vol());
        
        Box b1=new Box();
        
        Box b2 =new Box(12);
        
        System.out.println(b2.length);
        
        
    }
}