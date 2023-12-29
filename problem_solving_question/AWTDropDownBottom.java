/*
 * How add Dropdown bottom in awt program java
 */

package problem_solving_question;

import java.awt.*;

import javax.swing.JComboBox;
import javax.swing.plaf.ComboBoxUI;

public class AWTDropDownBottom {
    public static void main(String[] args) {
        Frame fram = new Frame("DropDown Bottom");

        Panel panel = new Panel();
        fram.add(panel);

        Label label = new Label("Select the one posible item.");
        label.setVisible(true);
        panel.add(label);

        //String[] choice = {"Choice 1", "Choice 2", "Choice 3", "Choice 4", "Choice 5"};
        // final JComboBox<String> jcb = new JComboBox<String>(choice);
        // panel.add(jcb);
        // panel.setVisible(true);

        Choice choice = new Choice();
        choice.add("Choice 1");
        choice.add("Choice 2");
        choice.add("Choice 3");
        choice.add("Choice 4");
        choice.add("Choice 5");
        panel.add(choice);
        panel.setVisible(true);

        Button button = new Button("OKK");
        panel.add(button);

        fram.setSize(400, 400);
        fram.setVisible(true);
    }
}
