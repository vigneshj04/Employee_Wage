
public class EmployeeWage {
    public static void main(String[] args) {

        empAttendance();
        empDayWage();
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

}




