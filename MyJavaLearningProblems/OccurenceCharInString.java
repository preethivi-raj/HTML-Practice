public class OccurenceCharInString{
    static int OccUsingIteration(String ip , char find){
        
        int occurence=0;
        ip=ip.toLowerCase();
        for(int i=0 ;i<ip.length(); i++){
            if(ip.charAt(i)==find){
                occurence++;
            }
        }
        return occurence;
    }
    static int OccUsingWithoutIteration(String str , char finds){
        str=str.toLowerCase();
        String tofind =Character.toString(finds).toLowerCase();
        int actlen=str.length();
        str=str.replace(tofind,"");
        int afrep=str.length();
        return actlen-afrep;
    }
public static void main(String args[]){
        String a="Preethiviraj";
        char b='e';
       System.out.println(OccUsingIteration(a,b));
       System.out.println(OccUsingWithoutIteration(a,b));
        
    }
}