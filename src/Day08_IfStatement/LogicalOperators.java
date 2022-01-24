package Day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
    String Name = "Steven";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(Name + " is eligible to vote: " + isEligible);

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 21;
        int income = 60000;

        boolean isEligible2 = creditScore >=700 && age2 >=21 && income >= 60000;

        System.out.println( name2 +" is eligible for loan "+ isEligible2);

    String name4 = "James";
    String countryOfBirth = "UK";
    boolean marriedToUSCitizen = false;

    boolean isEligeble4 = countryOfBirth == "USA" || marriedToUSCitizen == true;

        System.out.println(name4 + " is eligible to apply for US citizenship " + isEligeble4);

        String name5 = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >=3.5 || familyIncome <= 60000;

        System.out.println(name5 + " is eligible for scoolarship  "+ isEligible5);












    }


}
