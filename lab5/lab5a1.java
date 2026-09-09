import java.util.Scanner;
public class lab5a1{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print("enter a["+i+"]:");
            arr[i]=sc.nextInt();
        }
        lab5a1 add=new lab5a1();
       int sum=add.sumArr(arr);
       System.out.println("sum="+sum);

    sc.close();
   } 
    int sumArr(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
        }
}
