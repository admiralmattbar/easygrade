/**
 * Easy Grade
 * An small, simple application to keep track of student grades.
 * Create and save lists of students and assignments as well as weighted grades.
 *
 * (c) 2018 Matthew Kissel
 * GitHub https://github.com/admiralmattbar/easygrade.git
 */

package easygrade;

import easygrade.gui.Frame;
import easygrade.gui.FrameAddStudent;
import easygrade.gui.FrameClass;
import easygrade.util.ConsoleTime;

import javax.swing.*;


public class EasyGrade {

    public static long start_time;

    public static void main(String args[]) throws InterruptedException {
        start_time = System.currentTimeMillis();
        ConsoleTime.printLog("Starting Program.");

        //new Frame();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FrameClass("World History");
                //new FrameAddStudent();
            }
        });



        
    }


}
