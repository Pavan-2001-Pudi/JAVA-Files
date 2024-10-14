//2.write a program to print all even numbers between 1 to 50.
public class Basic_two {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
