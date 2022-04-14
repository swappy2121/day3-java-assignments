public class Wages_For_Month {
}
   public static void main(String[] args) {
       // constants
       public static final int IS_FULL_TIME = 1;
       public static final int IS_PART_TIME = 2;
       public static final int EMP_RATE_PER_HOUR = 20;
       public static final int NUM_OF_WORKING_DAYS = 2;
       // variables
       int empHrs = 0, empWage = 0, totalEmpWage = 0;
       // computation
       for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
           int empCheck = (int) math.floor(math.random() * 10) % 3;

       switch (empCheck) {
           case IS_FULL_TIME
               ;
               empHrs = 8;
               break;
           case IS_PART_TIME
               ;
               empHrs = 4;
               break;
           default:
               empHrs = 0;

       }
       empWage = emoHrs * EMP_RATE_PER_HOUR;
       totalEmpWage += empWage;
       System.out.println("Emp Wage : " + empWage);
   }

       System.out.println("Emp wage : " + totalEmpWage);

   }