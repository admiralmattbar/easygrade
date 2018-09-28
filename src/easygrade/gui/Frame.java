package easygrade.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Frame extends JFrame{

    public Frame()
    {
        setSize(1024, 768);
        Toolkit tk = Toolkit.getDefaultToolkit();

        Dimension dim = tk.getScreenSize();

        int xPos = (dim.width/2) - (this.getWidth()/2);
        int yPos = (dim.height/2) - (this.getHeight()/2);

        this.setLocation(xPos, yPos);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Frame");

        JPanel thePanel = new JPanel();
        JLabel label1 = new JLabel("I am the label.");

        label1.setToolTipText("This is useless.");
        thePanel.add(label1);

        JButton button1 = new JButton("Click me to feel better.");
        button1.setToolTipText("It does nothing.");

        thePanel.add(button1);

        JTextField textField1 = new JTextField("This is the text field.", 15);

        textField1.setColumns(10);

        textField1.setText("New TextField text.");

        textField1.setToolTipText("You are hovering over the text field.");

        thePanel.add(textField1);

        JTextArea textArea1 = new JTextArea(15,20);
        textArea1.setText("This is a Text Area.");
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);

        int numOfLines = textArea1.getLineCount();

        textArea1.append(" number of lines : " + numOfLines);

        thePanel.add(textArea1);

        JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        thePanel.add(scrollbar1);


        this.add(thePanel);
        this.setVisible(true);

    }

}