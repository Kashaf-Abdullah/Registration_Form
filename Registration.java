//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package mypackage;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Registration extends JFrame implements ActionListener {
    JLabel label_name;
    JLabel label_password;
    JLabel label_email;
    JLabel label_gender;
    JLabel label_city;
    JLabel label_country;
    JLabel label_phone_no;
    JTextField textfield_name;
    JPasswordField textfield_password;
    JTextField textfield_email;
    JTextField textfield_country;
    JTextField textfield_phone_no;
    JRadioButton radio_btn_male;
    JRadioButton radio_btn_female;
    JComboBox comboBox_city;
    JCheckBox checkbox_terms;
    JButton button_register;
    JButton button_clear;
    ImageIcon icon = new ImageIcon("Icon.png");
    ButtonGroup group;

    Registration() {
        this.setIconImage(this.icon.getImage());
        this.label_name = new JLabel("Name :");
        this.label_name.setBounds(50, 70, 100, 100);
        this.label_password = new JLabel("Password :");
        this.label_password.setBounds(50, 120, 100, 100);
        this.label_email = new JLabel("Email :");
        this.label_email.setBounds(50, 170, 100, 100);
        this.label_gender = new JLabel("Gender :");
        this.label_gender.setBounds(50, 220, 100, 100);
        this.label_city = new JLabel("City :");
        this.label_city.setBounds(50, 270, 100, 100);
        this.label_country = new JLabel("Country :");
        this.label_country.setBounds(50, 320, 100, 100);
        this.label_phone_no = new JLabel("Phone no :");
        this.label_phone_no.setBounds(50, 370, 100, 100);
        this.textfield_name = new JTextField();
        this.textfield_name.setBounds(210, 95, 240, 40);
        this.textfield_password = new JPasswordField();
        this.textfield_password.setBounds(210, 145, 240, 40);
        this.textfield_email = new JTextField();
        this.textfield_email.setBounds(210, 195, 240, 40);
        this.textfield_country = new JTextField();
        this.textfield_country.setBounds(210, 345, 240, 40);
        this.textfield_phone_no = new JTextField();
        this.textfield_phone_no.setBounds(210, 395, 240, 40);
        this.radio_btn_male = new JRadioButton("male ");
        this.radio_btn_male.setBounds(210, 245, 100, 50);
        this.radio_btn_female = new JRadioButton("female ");
        this.radio_btn_female.setBounds(320, 245, 100, 50);
        String[] cntry = new String[]{"Lahore", "karachi", "Islamabad", "Peshawar", "Rawalpindi"};
        this.comboBox_city = new JComboBox(cntry);
        this.comboBox_city.setBounds(210, 295, 240, 40);
        this.checkbox_terms = new JCheckBox("Are you agree on this terms and conditionds");
        this.checkbox_terms.setBounds(50, 430, 190, 70);
        this.button_register = new JButton("REGISTER");
        this.button_register.setBounds(50, 485, 100, 50);
        this.button_clear = new JButton("CLEAR");
        this.button_clear.setBounds(350, 485, 100, 50);
        this.group = new ButtonGroup();
        this.group.add(this.radio_btn_female);
        this.group.add(this.radio_btn_male);
        this.add(this.label_name);
        this.add(this.textfield_name);
        this.add(this.label_password);
        this.add(this.textfield_password);
        this.add(this.label_email);
        this.add(this.textfield_email);
        this.add(this.label_gender);
        this.add(this.radio_btn_male);
        this.add(this.radio_btn_female);
        this.add(this.label_city);
        this.add(this.comboBox_city);
        this.add(this.label_country);
        this.add(this.textfield_country);
        this.add(this.label_phone_no);
        this.add(this.textfield_phone_no);
        this.add(this.checkbox_terms);
        this.add(this.button_register);
        this.add(this.button_clear);
        this.button_clear.addActionListener(this);
        this.getContentPane().setBackground(Color.pink);
        this.checkbox_terms.setBackground(Color.pink);
        this.radio_btn_male.setBackground(Color.pink);
        this.radio_btn_female.setBackground(Color.pink);
        this.button_register.addActionListener(this);
        this.setLayout((LayoutManager)null);
        this.setDefaultCloseOperation(3);
        this.setSize(500, 600);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button_clear) {
            this.textfield_phone_no.setText("");
            this.textfield_name.setText("");
            this.textfield_password.setText("");
            this.textfield_country.setText("");
            this.textfield_email.setText("");
        } else if (e.getSource() == this.button_register) {
            if (this.checkbox_terms.isSelected()) {
                String var10001 = this.textfield_name.getText();
                JOptionPane.showMessageDialog(this, "Name :" + var10001 + " Password " + this.textfield_password.getText() + " Email " + this.textfield_email.getText() + " Country" + this.textfield_country.getText() + " Phone number :" + this.textfield_phone_no.getText() + "city :" + this.comboBox_city.getSelectedItem());
            } else {
                JOptionPane.showMessageDialog(this, "first agree on terms and conditions");
            }
        }

    }
}
