package student_management_project;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        StudentTable frame = new StudentTable();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 780, 690);
        frame.setTitle("Student Table");

    }
}
