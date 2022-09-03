package ex1_Employee;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
//            List<EmployeeComponent> components = new ArrayList<>();
//            components.add(new EmployeeConcreteComponent("Tài Coder"));
//            components.add(new TeamLeader(components.get(components.size() - 1)));
//            components.add(new Manager(components.get(components.size() - 1)));
//            components.add(new TeamLeader(components.get(components.size() - 1)));
//
//            components.forEach(employee -> {
//                    employee.showBasicInformation();
//                    employee.doTask();
//                    System.out.println("\n");
//            });
		System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employee = new EmployeeConcreteComponent("Tài Coder");
        employee.showBasicInformation();
        employee.doTask();

        System.out.println("\nTEAM LEADER: ");
        EmployeeComponent teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\nMANAGER: ");
        EmployeeComponent manager = new Manager(employee);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("\nTEAM LEADER AND MANAGER: ");
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
//        EmployeeComponent teamLeaderAndManager = new TeamLeader(manager);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
	}

}
