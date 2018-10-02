package easygrade.gui;

import easygrade.util.PlacementHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameAddStudent extends JFrame {

    private String studentName;

    public FrameAddStudent()
    {
        setSize(360, 90);
        this.setTitle("Add Student");

        PlacementHelper.setJFrameItemCenter(this);

        //Create Panel for Frame
        JPanel addStudentPanel = new JPanel();

        //Setup user input for student name
        JLabel newName = new JLabel("Student Name");
        JTextField enterName = new JTextField(20);

        //Add Components to Panel
        addStudentPanel.add(newName);
        addStudentPanel.add(enterName);

        //Listeners
        enterName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameClass.addStudent(enterName.getText());
                dispose();
            }
        });

        this.add(addStudentPanel);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}
