/*How to add label in awit program in Java */

package problem_solving_question;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class AWTLabel {
    public static void main(String[] args) {
        Frame frame = new Frame("Add many Label.");
        Panel panel = new Panel();
        frame.add(panel);

        Label label = new Label("Hi..........................");
        label.setVisible(true);
        panel.add(label);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

    }   
}
