// 6. Write a program to accept the number and display the largest factor other than the number.

import java.util.Scanner;
public class Basic_six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num-1;i>0;i--){
            if(num%i==0){
                System.out.println(i);
                break;
            }
            
        }
        
    }

    
}
