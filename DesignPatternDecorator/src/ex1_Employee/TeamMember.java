package ex1_Employee;

public class TeamMember extends EmployeeDecorator {

	public TeamMember(EmployeeComponent employee) {
		super(employee);
	}
	
	public void reportTask() {
		System.out.println(this.employee.getName() + " is reporting his assgined tasks.");
	}
	
	public void coordinateWithOthers() { // phối hợp với ng khác
		System.out.println(this.employee.getName() + " is coordinating with other members of his team.");
	}
	@Override
	public void doTask() {
		employee.doTask();
		reportTask();
		coordinateWithOthers();
	}

}
