package Day13;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = {10,20,30,40,50};

        System.out.print("Enter element: ");
        int key = sc.nextInt();

        int low = 0, high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key) {
                System.out.println("Found");
                return;
            }

            if (a[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        System.out.println("Not Found");
        
       
            sc.close();}
    
}
