package swingproject.ui;

import com.sun.tools.javac.Main;
import swingproject.business.ContactBussiness;
import swingproject.entity.ContactEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    private JPanel rootPanel;
    private JTextField txtName;
    private JTextField txtTelefone;
    private JButton btnSave;
    private JButton btnCancel;
    private JPanel jpanel;

    private ContactBussiness contactBussiness;

    public ContactForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setListiners();

        contactBussiness = new ContactBussiness();
    }

    private void setListiners() {
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    String nome = txtName.getText();
                    String telefone = txtTelefone.getText();

                    ContactEntity contactEntity = new ContactEntity(nome, telefone);

                    contactBussiness.save(contactEntity);

                    new MainForm();
                    dispose();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(new JFrame(), ex.getMessage());
                }
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new MainForm();
                dispose();
            }
        });
    }
}