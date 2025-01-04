//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Test Case 1.1 for UC1(Max at 1st position): " + MaximumFinder.findMaximum(30, 20, 10));
        System.out.println("Test Case 1.2 for UC1(Max at 2nd position): " + MaximumFinder.findMaximum(20, 30, 10));
        System.out.println("Test Case 1.3 for UC1(Max at 3rd position): " + MaximumFinder.findMaximum(10, 20, 30));
        System.out.println("Test Case 2.1 for UC2(Max at 1st position): " + MaximumFinder.findMaximum(30.5f, 20.2f, 10.1f));
        System.out.println("Test Case 2.2 for UC2(Max at 2nd position): " + MaximumFinder.findMaximum(20.2f, 30.5f, 10.1f));
        System.out.println("Test Case 2.3 for UC2(Max at 3rd position): " + MaximumFinder.findMaximum(10.1f, 20.2f, 30.5f));

    }
}