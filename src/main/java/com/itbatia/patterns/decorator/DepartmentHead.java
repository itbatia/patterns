package main.java.com.itbatia.patterns.decorator;

public class DepartmentHead extends WorkerDecorator {
    public DepartmentHead(Worker worker) {
        super(worker);
    }

    public String managesDepartment() {
        return "Manages the department.";
    }

    @Override
    public String work() {
        return super.work() + managesDepartment();
    }
}
