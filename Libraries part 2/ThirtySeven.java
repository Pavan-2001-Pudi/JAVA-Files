
/*37.Write 20 marks into Marks.data. */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ThirtySeven {
    public static void main(String[] args) {
        String filename = "Marks.data";
        Random random = new Random();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < 20; i++) {
                int mark = random.nextInt(101);
                writer.write(String.valueOf(mark));

                if (i < 19) {
                    writer.write(", ");
                }
            }
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }

        System.out.println("20 random marks written to " + filename);
    }
}
