package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame{
    private JPanel panelMain;
    private JPanel PanelTop;
    private JPanel PanelBottomLeft;
    private JPanel PanelBottomRight;
    private JList ListPeople;
    private JButton buttonNew;
    private JButton buttonSave;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textDateOfBirth;
    private JPanel panel1;

    Screen(){
        super("Contacts Project");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        buttonNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.setVisible(true);
    }
}
