import java.util.Scanner;
public class lab5a2 {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print("enter a["+i+"]:");
            arr[i]=sc.nextInt();
        }
        lab5a2 add=new lab5a2();
       int sum=add.sumArr(arr);
       System.out.println("sum="+sum);

       double avg=add.avgArr(arr);
       System.out.println("avg="+avg);
    sc.close();
   } 
    int sumArr(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
        }
    double avgArr(int[] arr){
        int sum=0;
        double avg;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        avg=(double)sum/arr.length;
        return avg;
        }
}

