//9. Write a program to create a function that takes a set of integers and returns the largest of integers.

import java.util.Scanner;
public class Basic_nine {
    public static int function(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            
        }
        return max;
    }

     
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int a = function(arr);
    System.out.println(a);

    sc.close();
}
}