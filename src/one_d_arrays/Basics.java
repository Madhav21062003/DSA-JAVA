package one_d_arrays;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int a[] = new int[5];//declaration and instantiation
        a[0] = 10;//initialization
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;
        //traversing array
        for (int i = 0; i < a.length; i++)//length is the property of array
            System.out.println(a[i]);


        int ar[]={33,3,4,5};//declaration, instantiation and initialization
//printing array
        for(int i=0;i<ar.length;i++)//length is the property of array
            System.out.println(ar[i]);


        int arr1[]=get();
        //printing the values of an array
        for(int i=0;i<arr1.length;i++)
            System.out.println(arr1[i]);
    }

    //creating method which returns an array
    static int[] get(){
        return new int[]{10,30,50,90,60};
    }
}
