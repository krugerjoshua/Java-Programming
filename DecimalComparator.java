public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        int multipliedNum1 = (int) (num1 * 1000);
        int multipliedNum2 = (int) (num2 * 1000);
        
        if (multipliedNum1 == multipliedNum2) {
            return true;
        } else {
            return false;
        }
    }
}
