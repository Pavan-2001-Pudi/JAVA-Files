/*11.Write a program to consider command line arguments num, length as inputs (where length is optional) if you 
  won't get that use default number as length. */

public class Basic_eleven {
    public class CommandLineArgs {

        public static void main(String[] args) {
            int defaultLength = 5;
            int num;
            int length;

            if (args.length < 1) {
                System.out.println("Please provide at least one number.");
                return;
            }
            try {
                num = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format for num. Please enter a valid integer.");
                return;
            }

            if (args.length >= 2) {
                try {
                    length = Integer.parseInt(args[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format for length. Using default length: " + defaultLength);
                    length = defaultLength;
                }
            } else {
                length = defaultLength;
            }

            System.out.println("Number (num): " + num);
            System.out.println("Length (length): " + length);
        }
    }

}
