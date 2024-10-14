/*42.Create a treeset of strings and sort them by length (use Comparator) */

import java.util.Comparator;
import java.util.TreeSet;

public class FortyTwo {
    public static void main(String[] args) {
        // Create a TreeSet with a custom Comparator to sort by string length
        TreeSet<String> stringSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Compare by length
                return Integer.compare(s1.length(), s2.length());
            }
        });

        // Add strings to the TreeSet
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("kiwi");
        stringSet.add("watermelon");
        stringSet.add("pear");
        stringSet.add("grape");

        // Display the sorted strings by length
        System.out.println("Strings sorted by length:");
        for (String str : stringSet) {
            System.out.println(str);
        }
    }
}
