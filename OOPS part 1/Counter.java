/*14.Create a class called Counter that stores a number and provides methods to increment, decrement and return the count. 
Provide the constructor without parameters that sets the values to zero and another constructor with parameters takes 
the values and starts from there.*/

public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public Counter(int initialCount) {
        this.count = initialCount;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();

        System.out.println("Initial count (counter1): " + counter1.getCount());

        counter1.increment();
        System.out.println("After increment (counter1): " + counter1.getCount());

        Counter counter2 = new Counter(5);
        System.out.println("Initial count (counter2): " + counter2.getCount());

        counter2.decrement();
        System.out.println("After decrement (counter2): " + counter2.getCount());
    }
}
