
public class EmployeeWage {
    public static void main(String[] args) {

        empAttendance();
        empDayWage();
        empWagePartTime();
        empSwitchCase();
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


}




