import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {

    public static void main(String[] args) {

        converter();
    }

    public static void converter() {

        JFrame frame = new JFrame("Temperature Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelCelsius, labelFah;

        JTextField textFieldCelsius, textFieldFah;

        JButton buttonCelsius, buttonFah, buttonClose;

        labelCelsius = new JLabel("Celcius");
        labelCelsius.setBounds(20, 40, 60, 30);

        labelFah = new JLabel("Fahrenheit");
        labelFah.setBounds(170, 40, 80, 30);

        textFieldCelsius = new JTextField("0");
        textFieldCelsius.setBounds(80, 40, 50, 30);

        textFieldFah = new JTextField("0");
        textFieldFah.setBounds(240, 40, 50, 30);

        buttonCelsius = new JButton("Celcius");
        buttonCelsius.setBounds(50, 80, 80, 15);

        buttonFah = new JButton("Fahrenheit");
        buttonFah.setBounds(190, 80, 100, 15);

        buttonClose = new JButton("Close");
        buttonClose.setBounds(150, 150, 80, 30);

        buttonCelsius.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                double celcius = Double.parseDouble(textFieldCelsius.getText());
                double fahrenheit = celcius * 9 / 5 + 32;
                String fahString = String.valueOf(fahrenheit);
                textFieldFah.setText(fahString);
            }
        });

        buttonFah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double fahrenheit = Double.parseDouble(textFieldFah.getText());
                double celcius = (fahrenheit - 32) * 5 / 9;
                String celString = String.valueOf(celcius);
                textFieldCelsius.setText(celString);
            }
        });

        buttonClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.add(labelCelsius);
        frame.add(labelFah);

        frame.add(textFieldCelsius);
        frame.add(textFieldFah);

        frame.add(buttonCelsius);
        frame.add(buttonFah);
        frame.add(buttonClose);

        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setVisible(true);

    }

}