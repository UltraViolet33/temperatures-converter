import javax.swing.*;

public class App {

    public static void main(String[] args) {

        converter();
    }

    public static void converter() {
        JFrame frame = new JFrame("Currency Converter");

        JLabel labelEuro, labelDollar;

        JTextField textFieldEuro, textFieldDollar;

        JButton button1, button2, button3;

        labelEuro = new JLabel("Euros");
        labelEuro.setBounds(20, 40, 60, 30);

        labelDollar = new JLabel("Dollars");
        labelDollar.setBounds(20, 40, 60, 30);

        frame.add(labelEuro);
        frame.add(labelDollar);

        frame.setSize(400, 300);
        frame.setVisible(true);

    }

}