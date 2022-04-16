import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int value;

    public CounterApp (int initialValue){
        setBounds(500,500,500,300);
        setTitle("Advanced Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 24);
        setLayout(null);
        JTextField counterValueView = new JTextField();
        counterValueView.setFont(font);
        counterValueView.setBounds(60,20,120,32);
        add(counterValueView);

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("-");
        decrementButton.setFont(font);
        decrementButton.setBounds(20,20,40,32);
        add(decrementButton);

        JButton incrementButton = new JButton("+");
        incrementButton.setFont(font);
        incrementButton.setBounds(180,20,40,32);
        add(incrementButton);

        JButton tenDecrementButton = new JButton("--");
        tenDecrementButton.setFont(font);
        tenDecrementButton.setBounds(20,60,40,32);
        add(tenDecrementButton);

        JButton tenIncrementButton = new JButton("++");
        tenIncrementButton.setFont(font);
        tenIncrementButton.setBounds(180,60,40,32);
        add(tenIncrementButton);

        JButton clearButton = new JButton("clear");
        clearButton.setFont(font);
        clearButton.setBounds(60,60,120,32);
        add(clearButton);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });

        tenDecrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value-=10;
                counterValueView.setText(String.valueOf(value));
            }
        });

        tenIncrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value+=10;
                counterValueView.setText(String.valueOf(value));
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = 0;
                counterValueView.setText(String.valueOf(value));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(0);
    }
}
