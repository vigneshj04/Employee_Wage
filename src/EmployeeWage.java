
public class EmployeeWage {

    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int NUM_OF_WORKING_DAYS = 20;
    static final int MAXI_HRS_IN_MONTH = 100;


    public static void main(String[] args) {
        empAttendance();
        empDayWage();
        empWagePartTime();
        empSwitchCase();
        empWageDays();
        employeeWageMonthly();
    }

    static void empAttendance() {

        int IS_FULL_TIME = 1;
        double empCheck = Math.floor((Math.random() * 10) % 2);
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is Absent");
        }
    }


    public static void empDayWage() {
        int Present = 1;
        int Wage_per_Hour = 20;
        int total_working_Hrs = 8;
        double empCheck = Math.floor((Math.random() * 10) % 2);
        if (Present == empCheck) {
            System.out.println("Employee wage per day = " + total_working_Hrs * Wage_per_Hour);
        } else
            System.out.println("Employee is absent");
    }


    public static void empWagePartTime() {

        int Present = 1;
        int PART_TIME = 2;
        int WAGE_PER_HR = 20;
        int Total_working_Hrs = 8;
        int Part_Time_Working_Hrs = 4;

        double empCheck = Math.floor((Math.random() * 10) % 3);
        if (Present == empCheck) {
            System.out.println("Employee wage per day = " + Total_working_Hrs * WAGE_PER_HR);
        } else if (PART_TIME == empCheck) {
            System.out.println("Employee is Working in Partime wage is =" + Part_Time_Working_Hrs * WAGE_PER_HR);
        } else {
            System.out.println("Employee is absent");
        }

    }

    public static void empSwitchCase() {
        final int present = 1;
        final int part_Time = 2;
        int wage_per_Hour = 20;
        int total_working_Hrs = 8;
        int part_Time_Working_Hrs = 4;
        int emp_check = (int) Math.floor((Math.random() * 10) % 2 + 1);
        switch (emp_check) {
            case present:
                System.out.println("Employee Working in Full Time");
                System.out.println("Employee Wage is =" + wage_per_Hour * total_working_Hrs);
                break;
            case part_Time:
                System.out.println("Employee Working in Part Time");
                System.out.println("Employee Wage is = " + wage_per_Hour * part_Time_Working_Hrs);
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }

    public static void empWageDays() {
        int empHrs = 0;
        int empWage = 0;
        int totalWage = 0;

        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalWage += empWage;
            System.out.println("Emp wage = " + empWage);
        }
        System.out.println("Total Wage : " + totalWage);
    }

    public static void employeeWageMonthly() {

        int empWage = 0;
        int totalWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= MAXI_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            int empHrs = 0;
            totalWorkingDays++;
            int empCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalWage += empWage;
            System.out.println("Emp wage = " + empWage);
        }
        System.out.println("Total Wage : " + totalWage);
    }

    public static int calculateEmpWageForCompany(String company, int empRate, int numOfDays, int maxHrs) {
        int empWage = 0;
        int totalWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= MAXI_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            int empHrs = 0;
            totalWorkingDays++;
            int empCheck = (int) Math.floor((Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalWage += empWage;
            System.out.println("Emp wage = " + empWage);
        }
        System.out.println("Total Wage for Company : "+company +" " + totalWage);
        return totalWage;
    }
}






