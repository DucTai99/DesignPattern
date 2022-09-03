package ex1_Employee;


public class Manager extends EmployeeDecorator {

	public Manager(EmployeeComponent employee) {
		super(employee);
	}
	
	public void createRequirement() { // tạo yêu cầu
		System.out.println(this.employee.getName() + " is create requirement.");
	}
	
	public void assignTask() { // giao task
		System.out.println(this.employee.getName() + " is assign task.");
	}
	
	public void manageProgress() { // quản lí tiến độ
		System.out.println(this.employee.getName() + " is managing the progress.");
	}
	
	@Override
	public void doTask() {
		employee.doTask();
		createRequirement();
		assignTask();
		manageProgress();
	}

}
