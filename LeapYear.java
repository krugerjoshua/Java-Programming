public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year > 0 && year < 9999) {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
                return true;
            } else if (year % 4 == 0 && year % 100 == 0 && year % 400 > 0 || year % 400 < 0) {
                return false;
            } else if (year % 4 == 0 && year % 100 > 0 || year % 100 < 0 && year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
          return false;
        }
    }
}
