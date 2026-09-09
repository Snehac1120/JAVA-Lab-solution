import java.util.Scanner;
class A{
            Scanner sc=new Scanner(System.in);
       int[] arr={1,3,4,6,7};
       public void sortArray(){
        //logic

        }


      public void  searchArray(){
        //logic
        System.out.println("enter index");
        int index=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==index){
                System.out.println("found");
            }
          
            }
        }
       

     public void sumArray(){
        //logic
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("sum is="+sum);
        }

     public void avgArray(){
        //logic
         int sum=0;
        double avg;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        avg=(double)sum/arr.length;
    System.out.println("avg is="+avg); }
     }
        
public class lab6b4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A obj=new A();
        obj.sumArray();
        obj.avgArray();
        obj.searchArray();
        obj.sortArray();
        sc.close();
    }
}
