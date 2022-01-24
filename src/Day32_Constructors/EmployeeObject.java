package Day32_Constructors;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Alena");
        System.out.println(employee1);

        Employee employee2 = new Employee("Olga", 'F');
        System.out.println(employee2);

        Employee employee3 = new Employee("Tanya", 'F', "SDET");
        System.out.println(employee3);

    }
}
