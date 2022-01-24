package Day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana", 'F', 30, 50000);

        employee1.setAge(32);
        employee1.setSalary(employee1.getSalary() + 10000);

        System.out.println(employee1);



    }


}
