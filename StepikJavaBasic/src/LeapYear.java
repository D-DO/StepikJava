public class LeapYear {
    public static void main(String[] args) {

        int year = 104;
        System.out.println(leapYearCount(year));

    }

    public static int leapYearCount(int year) {

//        int leapYear;
//
//        leapYear = year / 4;
//        leapYear = leapYear - year / 100;
//        leapYear = leapYear + year / 400;

        year = year / 4-  year / 100  + year / 400;


        return year;
    }
}
