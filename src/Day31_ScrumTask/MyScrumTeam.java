package Day31_ScrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Alena", 12345, "SDET", 80000);
        Tester tester2 = new Tester("Tanya", 23456, "SDET", 90000);
        Tester tester3 = new Tester("Olya", 34567, "SDET", 85000);
        Tester tester4 = new Tester("Anya", 45678, "SDET", 95000);

        Tester[] testers = {tester2,tester3,tester4};


        Developer developer1 = new Developer("Max",11,"Java developer", 125000);
        Developer developer2 = new Developer("Jenya",12,"Java developer", 135000);
        Developer developer3 = new Developer("Kile",13,"Java developer", 145000);
        Developer developer4 = new Developer("John",14,"Java developer", 155000);

        Developer[] developers = {developer2,developer3, developer4};

        ScrumTeam scrum = new ScrumTeam("Alex", "Vas", "Katya", 14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        for (Tester eachTester : scrum.testerList){
            System.out.println(eachTester.name + " : "+ eachTester.salary);
        }

        for (Developer eachDeveloper : scrum.devList){
            System.out.println(eachDeveloper.name + " : "+ eachDeveloper.salary);
        }

        System.out.println("-----------------------------------------------------");

        scrum.removeTester(12345);
        scrum.removeDeveloper(11);

        System.out.println(scrum);

    }







}
