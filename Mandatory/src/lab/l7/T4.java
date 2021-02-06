/*
 * @Description: Task 4
 * @Version: 1.0.0.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-06 23:36:09
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 23:45:44
 */

package lab.l7;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

class T4
{
    /**
     * Create widgets and show them.
     */
    private static void createAndShowGui()
    {
        JFrame frame = new JFrame("Hello World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 250);

        JButton button = new JButton("Press me!");
        frame.getContentPane().add(button);
        button.addActionListener(e -> {
            if (JOptionPane.showConfirmDialog(frame, "Do you really want to close the window") == JOptionPane.YES_OPTION)
                    frame.dispose();
        });
        frame.setVisible(true);
    } // end method createAndShowGui

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(T4::createAndShowGui);
    } // end main
} // end class T4