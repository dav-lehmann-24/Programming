import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class ModifiedGUI extends JFrame{
    JLabel lblTitle;
    JLabel lblName;
    JTextField txtName;
    JLabel lblAge;
    JTextField txtAge;
    JLabel lblGender;
    JTextField txtGender;
    JButton btnSubmit;
    JLabel lblOutput;

    public ModifiedGUI() {
        setLayout(null);
        setVisible(true);
        setSize(600, 600);
        setTitle("Modified GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lblTitle = new JLabel("Welcome to my modified GUI :D");
        lblTitle.setBounds(0, 0, 600, 30);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        add(lblTitle);

        lblName = new JLabel("Name: ");
        lblName.setBounds(0, 50, 600, 30);
        lblName.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lblName);

        lblAge = new JLabel("Age: ");
        lblAge.setBounds(0, 100, 600, 30);
        lblAge.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lblAge);

        lblGender = new JLabel("Gender: ");
        lblGender.setBounds(0, 150, 600, 30);
        lblGender.setFont(new Font("Arial", Font.PLAIN, 14));
        add(lblGender);

        txtName = new JTextField();
        txtName.setBounds(100, 50, 200, 30);
        txtName.setFont(new Font("Arial", Font.PLAIN, 14));
        add(txtName);

        txtAge = new JTextField();
        txtAge.setBounds(100, 100, 50, 30);
        txtAge.setFont(new Font("Arial", Font.PLAIN, 14));
        add(txtAge);

        txtGender = new JTextField();
        txtGender.setBounds(100, 150, 100, 30);
        txtGender.setFont(new Font("Arial", Font.PLAIN, 14));
        add(txtGender);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(0, 200, 300, 30);
        btnSubmit.setFont(new Font("Arial", Font.PLAIN, 14));
        add(btnSubmit);

        lblOutput = new JLabel();
        lblOutput.setBounds(0, 250, 600, 30);
        lblOutput.setFont(new Font("Arial", Font.BOLD, 14));
        add(lblOutput);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String age = txtAge.getText();
                String gender = txtGender.getText();
                lblOutput.setText("Your name is " + name + ", you are " + age + " years old and you are a " + gender + "!");
            }
        });
    }
}