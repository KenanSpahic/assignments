package employeerecords;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {


        EmployeeRecords employees = new EmployeeRecords();
        employees.setVisible(true);
        employees.setLocationRelativeTo(null);
        employees.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
