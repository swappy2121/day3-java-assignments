public class Switch_Case_Statement {
    // constants
    int IS_FULL_TIME = 1;
    int IS_PART_TIME = 2;
    int EMP_RATE_PER_HOUR = 20;
}
    public static void main(String[] args) {
        // variables
        int empHrs = 0;
        int empWage = 0;
        // computation
        double empCheck = Math.floor(math.random() * 10) % 3;
        switch ((int)empCheck) {
            case IS_FULL_TIME;
               empHrs = 8;
            case IS_PART_TIME;
               empHrs = 4;
            default;
               empHrs = 0;

        }
        empWage = emoHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage : " + empWage);


    }