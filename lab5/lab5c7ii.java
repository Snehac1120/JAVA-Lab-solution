import java.util.Scanner;
public class lab5c7ii {
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
    System.out.println("enter pivot");
        int k=sc.nextInt();
        // rotate by k
     int[] temp=new int[a.length];
    //      for(int i=0;i<a.length-k;i++){
    //        temp[i]=a[i+k];
    //    }
    //     // for remaining ele
    //    for(int i=0;i<k;i++){
    //     int j=k;
    //    temp[j]=a[i];
    //     j++;
    //    }
    int j=0;
    for(int i=k;i<a.length;i++){
        temp[j]=a[i];
        j++;
    }
    for(int i=0;i<k;i++){
        temp[j]=a[i];
        j++;
    }
         for(int i:temp){
            System.out.print(i+",");
        }
     sc.close();
    }//main
}
   
