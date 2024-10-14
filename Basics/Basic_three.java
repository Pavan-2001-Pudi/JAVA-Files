//3. Write a program to print a table for number 15 with length 10.(use printf)
public class Basic_three {
    public static void main(String[] args) {
        int number =15;
        int length =10;
        for(int i=1;i<=length;i++){
            System.out.printf("%d x %d =%d%n",number,i,number * i);
        }
    }
    
}
