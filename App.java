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

        labelEuro = new JLabel("Euro");
        labelEuro.setBounds(20, 40, 60, 30);

        labelDollar = new JLabel("Dollars");
        labelDollar.setBounds(170, 40, 60, 30);
        
        
        textFieldEuro = new JTextField("0");
        textFieldEuro.setBounds(80, 40, 50, 30);

        
        textFieldDollar = new JTextField("0");
        textFieldDollar.setBounds(240, 40, 50, 30);


        
        frame.add(labelEuro);
        frame.add(labelDollar);

        frame.add(textFieldEuro);
        frame.add(textFieldDollar);
        
        
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setVisible(true);

    }

}