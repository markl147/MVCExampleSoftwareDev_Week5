public class EmployeeController {
    private EmployeeModel model;
    private EmployeeView view;

    public EmployeeController(EmployeeModel m, EmployeeView v) {
        this.model = m;
        this.view = v;
    }

    public void setEmployeeName(String n) {
        model.setName(n);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeId(String i) {
        model.setId(i);
    }

    public String getEmployeeId() {
        return model.getId();
    }

    public void updateView() {
        view.printEmployee(model.getName(), model.getId());
    }

    public void showDetails() {
        view.showDetails(model.getName(), model.getId());
    }
}
