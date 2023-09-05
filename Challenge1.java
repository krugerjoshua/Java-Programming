public class challenge {
    public static void main(String[] args) {
        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double combinedVariables = (firstVariable + secondVariable) * 100.00d;

        System.out.println("Step 3's answer: " + combinedVariables);

        double thirdVariable = 40.00d;
        double remainderVariable = combinedVariables % thirdVariable;

        System.out.println("Remainder of step 3's answer: " + remainderVariable);

        boolean isNull = (remainderVariable == 0) ? true : false;

        System.out.println("isNoRemainder = " + isNull);

        if (!isNull) {
            System.out.println("Got some remainder");
        }
    }
}
