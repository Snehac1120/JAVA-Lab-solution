import java.util.Scanner;
public class lab5c7i {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter array size:");
        int size=sc.nextInt();
        int a[]=new int[size];
    System.out.println("original array");
        for(int i=0;i<a.length;i++){
            System.out.print("enter a["+i+"]:");
            a[i]=sc.nextInt();
        }
        // rotation by 1
        int temp=a[0];
        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        //for last ele
        a[a.length-1]=temp;
        System.out.println("rotated array=");
        for(int i:a){
            System.out.print(i+",");
        }
     sc.close();
    }//main
}
   