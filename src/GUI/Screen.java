package GUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

    private ArrayList<Main> people;
    private DefaultListModel listPeopleModel;

    Screen(){
        super("Contacts Project");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        people = new ArrayList<Main>();
        listPeopleModel = new DefaultListModel();
        listPeople.newModel(listPeopleModel);
        buttonNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ListPeople.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });


    }

    public void refreshPeopleList (){
        listPeopleModel.removeAllElements();

    }
    public void addPerson(Main p){
        people.add(p);

    }

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.setVisible(true);

        Main sheldon = new Main("Sheldon Lee Cooper", "sheldon@gmail.com", "555 0001", "26/02/1980");
        Main howard = new Main("Howard Joel Wolowitz", "howard@gmail.com", "555 0002", "01/03/1981");
        Main bernadette = new Main("Bernadette Rostenkowski-Wolowitz", "bernadette@gmail.com", "555 0002", "01/01/1984");
        Main raj = new Main("Rajesh Ramayan Koothrappali", "raj@gmail.com", "555 0003", "06/10/1981");
        Main penny = new Main("Penny Hofstadter", "penny@gmail.com", "555 0004", "02/12/1985");
        Main leonard = new Main("Leonard Hofstadter", "leonard@gmail.com", "555 0004", "17/05/1980");
        Main amy = new Main("Amy Farrah Fowler", "amy@gmail.com", "555 0005", "17/12/1979");

        screen.addPerson(sheldon);
        screen.addPerson(howard);
        screen.addPerson(bernadette);
        screen.addPerson(raj);
        screen.addPerson(penny);
        screen.addPerson(leonard);
        screen.addPerson(amy);

    }
}
