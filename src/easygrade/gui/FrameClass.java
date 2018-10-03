package easygrade.gui;

import easygrade.util.ConsoleTime;
import easygrade.util.PlacementHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameClass extends JFrame {

    private static int numStudents = 0;
    private static JPanel classPanel;

    public FrameClass(String name)
    {
        setSize(1024, 768);

        this.setTitle(name);

        PlacementHelper.setJFrameItemCenter(this);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the panel
        classPanel = new JPanel();
        classPanel.setLayout(null);

        //Buttons
        JButton addStudentButton = new JButton("Add Student");
        PlacementHelper.positionComponent(addStudentButton, 100, 100, 150, 20);

        //Listeners
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Add JFrame for name.
                new FrameAddStudent();
            }
        });


        //Add things to panel
        classPanel.add(addStudentButton);

        this.add(classPanel);
        this.setVisible(true);

        addStudent("Billy");
    }

    public static void addStudent(String name)
    {
        numStudents++;
        ConsoleTime.printLog("Incremebted numStudents by 1.");
        JLabel newStudent = new JLabel(name);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int yPos = ((dim.height/100) + (numStudents*25) + 50);
        newStudent.setBounds(dim.width/100, yPos, 150, 20);

        ConsoleTime.printLog("Placing student at x: " + dim.width/100 + " y: " + yPos + ".");
        classPanel.add(newStudent);
        ConsoleTime.printLog("Added " + name + " Student Count: " + numStudents + ".");
    }

}
