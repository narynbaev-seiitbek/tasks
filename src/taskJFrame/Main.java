package taskJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        final int screenWidth = 500;
        final int screenHeight = 300;

        JFrame frame = new JFrame();
        frame.setSize(screenWidth,screenHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Button button = new Button("Нажми");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Нажато");
            }
        });

        BorderLayout borderLayout = new BorderLayout();
        frame.getContentPane().setLayout(borderLayout);
        frame.getContentPane().add(button,BorderLayout.CENTER);

        frame.setVisible(true);
    }

}
