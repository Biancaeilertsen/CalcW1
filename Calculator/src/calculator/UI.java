package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame {
    private JPanel Calculator;
    private JTextArea textArea1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;

    private JButton cButton;
    private JButton mButton;
    private JButton bckButton;

    private JButton minusButton;
    private JButton plusButton;
    private JButton equalsButton;
    private JButton multiplyButton;
    private JButton percentButton;
    private JButton divideButton;

    double firstnum;
    double secondnum;
    double result;
    String operations;
    String answer;


    public UI() {
        //textArea1.setHorizontalAlignment(SwingConstants.RIGHT);
        add(Calculator);
        setTitle("Our Calculator");
        setSize(400, 300);

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String EnterNumber = textArea1.getText() + a1Button.getText();
                textArea1.setText(EnterNumber);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String EnterNumber = textArea1.getText() + a2Button.getText();
                textArea1.setText(EnterNumber);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String EnterNumber = textArea1.getText() + a3Button.getText();
                textArea1.setText(EnterNumber);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String EnterNumber = textArea1.getText() + a4Button.getText();
                textArea1.setText(EnterNumber);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String EnterNumber = textArea1.getText() + a5Button.getText();
                textArea1.setText(EnterNumber);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String EnterNumber = textArea1.getText() + a6Button.getText();
                textArea1.setText(EnterNumber);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String EnterNumber = textArea1.getText() + a7Button.getText();
                textArea1.setText(EnterNumber);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String EnterNumber = textArea1.getText() + a8Button.getText();
                textArea1.setText(EnterNumber);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String EnterNumber = textArea1.getText() + a9Button.getText();
                textArea1.setText(EnterNumber);
            }

        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String EnterNumber = textArea1.getText() + a0Button.getText();
                textArea1.setText(EnterNumber);
            }
        });

        mButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea1.setText(null);
            }
        });
        bckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String backspace = null;

                if (textArea1.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(textArea1.getText());
                    strB.deleteCharAt(textArea1.getText().length() - 1);
                    backspace = strB.toString();
                    textArea1.setText(backspace);
                }
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstnum = Integer.getInteger(textArea1.getText());
                textArea1.setText("");
                operations = "-";
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstnum = Integer.getInteger(textArea1.getText());
                textArea1.setText("");
                operations = "+";
            }
        });
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstnum = Integer.getInteger(textArea1.getText());
                textArea1.setText("");
                operations = "x";
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                firstnum = Integer.getInteger(textArea1.getText());
                textArea1.setText("");
                operations = "/";
            }
        });


    }
}
