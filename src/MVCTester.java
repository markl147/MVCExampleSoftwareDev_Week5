public class MVCTester {
    public static void main(String[] args) {

        EmployeeModel model = new EmployeeModel();

        model.setName("Claire Smith");
        model.setId("5");

        EmployeeView view = new EmployeeView();

        view.showDetails(model.getName(), model.getId());
        //gui

        EmployeeController c = new EmployeeController(model, view);

        c.setEmployeeName("Sarah");
        c.setEmployeeId("10");
        c.updateView();

        c.setEmployeeName("Claire Jones");
        c.showDetails();
        c.setEmployeeName("Claire Burke");
        c.showDetails();
        c.setEmployeeName("Claire Brady");
        c.showDetails();
        c.setEmployeeName("Claire Green");
        c.showDetails();

    }
}
