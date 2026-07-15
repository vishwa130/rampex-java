package Day18;

import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++)
                if(a[j]<a[min])
                    min=j;

            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }

        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");

        sc.close();
    }
}
