package Day21;


import java.util.Scanner;

public class Quick {

    static int partition(int a[],int low,int high){

        int pivot=a[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(a[j]<pivot){
                i++;
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }

        int t=a[i+1];
        a[i+1]=a[high];
        a[high]=t;

        return i+1;
    }

    static void quickSort(int a[],int low,int high){

        if(low<high){

            int pi=partition(a,low,high);

            quickSort(a,low,pi-1);
            quickSort(a,pi+1,high);
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size: ");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        quickSort(a,0,n-1);

        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");

        sc.close();
    }
}
