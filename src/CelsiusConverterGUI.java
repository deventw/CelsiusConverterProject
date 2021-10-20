import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodListener;

public class CelsiusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel ceisiusLabel;
    private JButton convertButton;
    private JLabel fahrenheitLabel;

    public CelsiusConverterGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get text from text field and convert to double and update temperature
                int tempFah = (int)((Double.parseDouble(celsiusTextField.getText()))*1.8+32);
                fahrenheitLabel.setText("Fahrenheit 華氏溫度："+tempFah);
            }
        });
    }

    public static void main(String[] arg){
        JFrame frame = new CelsiusConverterGUI("My Celsius Converter 溫度轉換器");
        frame.setVisible(true);
    }
}
