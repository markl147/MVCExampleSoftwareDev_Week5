import javax.swing.*;

public class EmployeeView extends JFrame {

    public void showDetails(String name, String id) {
        JFrame window = new JFrame("Employee");
        JLabel nameLabel = new JLabel(name);
        JLabel idLabel = new JLabel(id);

        JPanel panel = new JPanel();
        panel.add(nameLabel);
        panel.add(idLabel);
        window.getContentPane().add(panel);
        window.setSize(200, 200);
        window.pack();
        window.setVisible(true);
    }

    public void printEmployee(String name, String id) {
        System.out.println("Employee: ");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

}
