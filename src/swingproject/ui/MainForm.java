package swingproject.ui;

import swingproject.business.ContactBussiness;
import swingproject.entity.ContactEntity;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JButton btnNewContact;
    private JButton btnRemove;
    private JTable tblContats;
    private JLabel lblContactCount;

    private ContactBussiness mContactBusiness;

    public MainForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setListiners();

        mContactBusiness = new ContactBussiness();

        loadContacts();

    }

    private void setListiners() {
        btnNewContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new ContactForm().setVisible(true);
                dispose();
            }
        });

        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (tblContats.getSelectedRow() == -1) return;

                String nome = tblContats.getValueAt(tblContats.getSelectedRow(), 0).toString();
                String telefone = tblContats.getValueAt(tblContats.getSelectedRow(), 1).toString();

                mContactBusiness.delete(new ContactEntity(nome, telefone));

                loadContacts();
            }
        });

        tblContats.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                if (listSelectionEvent.getValueIsAdjusting()) {


                }
            }
        });
    }

    private void loadContacts() {

        List<ContactEntity> list = mContactBusiness.getList();

        String[] columnNames = {"Name", "Telefone"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames);

        for (ContactEntity i : list) {
            Object[] o = new Object[2];

            o[0] = i.getName();
            o[1] = i.getPhone();

            model.addRow(o);
        }

        tblContats.clearSelection();
        tblContats.setModel(model);

        lblContactCount.setText(String.valueOf(list.size()) + " contato(s)");
    }
}