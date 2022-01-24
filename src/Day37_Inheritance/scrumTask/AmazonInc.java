package Day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Alena", 38, 'F', 123, 100000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Tanya", 35, 'F', 234, 120000, company);

        ScrumMaster sm = new ScrumMaster("Ksenia", 35, 'F', 345, 125000, company);

        Tester tester1 = new Tester("Max", 36,'M', "QA", 456, 80000, company);
        Tester tester2 = new Tester("Maxim", 38,'M', "QA", 556, 85000, company);

        Tester[] testers = {tester1,tester2};


        Developer developer1 = new Developer("Kyle", 40, 'M', "Java developer", 678, 150000, company);

        ScrumTeam scrumTeam1 = new ScrumTeam(po,ba,sm);

        scrumTeam1.addDeveloper(developer1);
        scrumTeam1.addTesters(testers);

        System.out.println(scrumTeam1);


        for (Tester tester: scrumTeam1.testers){
            System.out.println(tester.name + " "  + tester.salary);
        }

    }






}
