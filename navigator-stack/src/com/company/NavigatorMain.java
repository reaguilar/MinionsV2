package com.company;

import com.company.stackapp.NavigationStack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavigatorMain {
    private JPanel panelMain;
    private JButton redoButton;
    private JButton enterButton;
    private JTextField textField;
    private JButton undoButton;
    private JTextArea textArea1;
    private NavigationStack navigationStack;

    public NavigatorMain() {
        navigationStack = new NavigationStack<String>();

        undoButton.setEnabled(false);
        redoButton.setEnabled(false);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "The field is required");
                    return;
                }

                navigationStack.addItem(textField.getText());
                textArea1.setText("");
                fillTheTextArea();
                undoButton.setEnabled(true);
            }
        });
        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                navigationStack.undo();
                textArea1.setText("");
                int i = 0;
                fillTheTextArea();
                redoButton.setEnabled(true);
                if (!navigationStack.can_undo()) undoButton.setEnabled(false);

            }
        });

        redoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                navigationStack.redo();
                textArea1.setText("");
                fillTheTextArea();
                undoButton.setEnabled(true);
                if (!navigationStack.can_redo()) redoButton.setEnabled(false);
            }
        });
    }

    public void fillTheTextArea() {
        int i = 0;
        while (navigationStack.getUndostackSize() > i) {
            Object resul = navigationStack.getundostack()[i++];
            textArea1.append(resul.toString() + '\n');

        }
    }

    public static void main(String[] arg) {
        JFrame frame = new JFrame("NavigatorMain");
        frame.setContentPane(new NavigatorMain().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int ancho = (int) d.getWidth() / 2;
        int alto = (int) d.getHeight() / 2;
        frame.setSize(ancho, alto);
        frame.setVisible(true);
    }


}
