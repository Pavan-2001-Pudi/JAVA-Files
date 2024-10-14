/* 15.Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
—> Courses are: JAVA, PYTHON.
—> The total fees for java is 10k and for python is 7.5k.
—> Provide a constructor to take required details.The default course is JAVA.
—> Provide the following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount).*/

public class Student {
    private static final int JAVA_FEE = 10000;
    private static final int PYTHON_FEE = 7500;
    private String adminNo;
    private String stuName;
    private String courseJoined;
    private int feesPaid;

    public Student(String adminNO, String stuName) {
        this.adminNo = adminNo;
        this.stuName = stuName;
        this.courseJoined = "JAVA";
        this.feesPaid = 0;
    }

    public Student(String adminNo, String stuName, String courseJoined) {
        this.adminNo = adminNo;
        this.stuName = stuName;
        this.courseJoined = courseJoined;
        this.feesPaid = 0;
    }

    public int getTotalfee() {
        if (courseJoined.equalsIgnoreCase("JAVA")) {
            return JAVA_FEE;
        } else if (courseJoined.equalsIgnoreCase("PYTHON")) {
            return PYTHON_FEE;
        }
        return 0;
    }

    public int getDue() {
        return getTotalfee() - feesPaid;
    }

    public int getFeePaid() {
        return feesPaid;
    }

    public void payment(int amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Payment amount cannot be negative.");
        }
        if (feesPaid + amount > getTotalfee()) {
            throw new IllegalArgumentException("Payment exceeds total fee.");
        }
        feesPaid += amount;
    }

    public static void main(String[] args) {
        Student student1 = new Student("101", "Pavan");

        System.out.println("Total Fee: " + student1.getTotalfee());
        System.out.println("Due Amount: " + student1.getDue());

        student1.payment(3000);
        System.out.println("Fee Paid: " + student1.getFeePaid());
        System.out.println("Due Amount after payment: " + student1.getDue());
    }

}
