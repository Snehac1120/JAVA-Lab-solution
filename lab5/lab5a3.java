import java.util.Scanner;
public class lab5a3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.print("enter a["+i+"]:");
            arr[i]=sc.nextInt();
        }
        lab5a3 sol=new lab5a3();
        int[] rev=sol.revArr(arr);
       System.out.println("Reversed array:");
        for (int i=0;i<rev.length;i++) {
        System.out.println("rev["+i+"]:"+rev[i]);
        }
        sc.close();
    }
   int[] revArr(int[] arr){
            int[] rev= new int[arr.length];
            int j=0;
        for(int i=arr.length-1;i>=0;i--){
            rev[j]=arr[i];
            j++;
        }
        return rev;
        }
}
