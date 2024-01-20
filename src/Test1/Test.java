package Test1;

public class Test {
    public static void main(String[] args) {
        for (Test1 test1 : Test1.values()) {
            System.out.println(test1 + " : " + test1.getDays());

        }
        Test1.FRIDAY.isWeekend();

    }
}
