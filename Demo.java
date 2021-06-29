package GAMETRY;

import javax.swing.*;

public abstract class Demo {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "What a cringe name, " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        if (age < 18) {
            JOptionPane.showMessageDialog(null, "Young G!");
        } else {
            JOptionPane.showMessageDialog(null, "OK BOOMER!");
        }

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
        if (height <= 1.50) {
            JOptionPane.showMessageDialog(null, "Kinda short.");
        } else +{
            JOptionPane.showMessageDialog(null, "You are " + height + " cm tall!");
        }
    }

}
