package Day04_Variables;

import java.sql.SQLOutput;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 65;
        int weeklyHours = 40;

        int salary = hourlyRate * weeklyHours * 52;

        System.out.println("HourlyRate = $" + hourlyRate);
        System.out.println("WeeklyHours = " + weeklyHours);
        System.out.println("Salary = $" + salary);


    }
}
