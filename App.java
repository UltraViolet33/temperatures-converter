import javax.swing.*;

public class App {

    public static void main(String[] args) {

        converter();
    }

    public static void converter() {

        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelEuro, labelDollar;

        JTextField textFieldEuro, textFieldDollar;

        JButton buttonEuro, buttonDollar, buttonClose;

        labelEuro = new JLabel("Euro");
        labelEuro.setBounds(20, 40, 60, 30);

        labelDollar = new JLabel("Dollars");
        labelDollar.setBounds(170, 40, 60, 30);
        
        textFieldEuro = new JTextField("0");
        textFieldEuro.setBounds(80, 40, 50, 30);

        textFieldDollar = new JTextField("0");
        textFieldDollar.setBounds(240, 40, 50, 30);


        buttonEuro = new JButton("Euros");
        buttonEuro.setBounds(50, 80, 80, 15);

        
        buttonDollar = new JButton("Dollars");
        buttonDollar.setBounds(190, 80, 80, 15);

        
        buttonClose = new JButton("Close");
        buttonClose.setBounds(150, 150, 60, 30);
        
        frame.add(labelEuro);
        frame.add(labelDollar);

        frame.add(textFieldEuro);
        frame.add(textFieldDollar);


        frame.add(buttonEuro);
        frame.add(buttonDollar);
        frame.add(buttonClose);

        
        
        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setVisible(true);

    }

}