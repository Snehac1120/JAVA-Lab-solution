import java.util.Scanner;
class sen{
    int a,e,i,o,u;

    void getter(){
        String s;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter a string");
            s=sc.nextLine();
            if(s.equals("quit")){
                break;
            }
                for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                if(c=='a' || c=='A'){
                    a++;
                }
                if(c=='e' || c=='E'){
                    e++;
                }
                if(c=='i' || c=='I'){
                    i++;
                }
                if(c=='o' || c=='O'){
                    o++;
                }
                if(c=='u' || c=='U'){
                    u++;
                }
                }
             
            }
            System.out.println("no. of a="+a+",e="+e+",i="+i+",o="+o+",u="+u);
            sc.close();
        }
    }
public class lab7b3 {
    public static void main(String[] args) {
        sen l1=new sen();
        l1.getter();
       }
}
