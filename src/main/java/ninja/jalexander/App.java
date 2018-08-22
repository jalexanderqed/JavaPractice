package ninja.jalexander;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500, 500);


        JPanel panel1 = new JPanel();

        JButton button1 = new JButton("button text");

        panel1.add(button1);
        jFrame.add(panel1);
        jFrame.setVisible(true);
    }
}
