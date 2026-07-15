package Day12;

import java.util.Scanner;

public class Markdemo {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        try {

    if(marks < 0)
        throw new Exception("Invalid Marks");

    System.out.println("Marks = " + marks);

}

        catch(Exception e) {

            System.out.println(e.getMessage());

        }finally{

        sc.close();}
    }

}