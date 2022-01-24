package Day31_ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    public ArrayList<Tester> testerList = new ArrayList<>();
    public ArrayList<Developer> devList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester (Tester tester){
        testerList.add(tester);
    }

    public void addTesters(Tester[] testers){
        testerList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        devList.add(developer);
    }
    public void addDevelopers (Developer[] developers){
        devList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){
        testerList.removeIf(p-> p.employeeID==employeeID);
    }
    public void removeDeveloper(int employeeID){
        devList.removeIf(p-> p.employeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers= " + testerList.size() +
                ", total number of developers= " + devList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
