public class LeapYear {
        public static boolean isLeapYear (int year){
            if ((year >= 1) & (year <= 9999)){ // valid range
                if ( year % 4 == 0 ){ // calculate leap year (Step 1)
                    if ( year % 100 == 0 ){ // (Step 2)
                        if ( year % 400 == 0 ) { // (Step 3)
                            return true; // Leap Year is true (Step 4)
                        }else {
                            return false; // Year is not a leap year (Step 5)
                        }

                    }else {
                        return true;
                    }
                }else {
                    return false; // Step 5 (the year is not a leap year) not divisable by 4
                }


            } else { // invalid range
                return false;
            }

        }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
}
