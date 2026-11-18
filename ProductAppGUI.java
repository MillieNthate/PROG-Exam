package mattressapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProductAppGUI extends JFrame {
    private JTextField txtCustomerName;
    private JComboBox<String> cmbProduct;
    private JTextField txtPrice;

    public ProductAppGUI() {
        setTitle("Product App");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // --- Q.2.4: Menu System ---
        JMenuBar menuBar = new JMenuBar();
        
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0)); 
        fileMenu.add(exitItem);

        JMenu toolsMenu = new JMenu("Tools");
        JMenuItem processItem = new JMenuItem("Process");
        JMenuItem clearItem = new JMenuItem("Clear");
        
        // Action for Process Menu Item 
        processItem.addActionListener(e -> processSale());
        
        // Action for Clear Menu Item
        clearItem.addActionListener(e -> {
            txtCustomerName.setText("");
            txtPrice.setText("");
            cmbProduct.setSelectedIndex(0);
        });

        toolsMenu.add(processItem);
        toolsMenu.add(clearItem);
        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);
        setJMenuBar(menuBar);

        // --- Q.2.2: Form Components ---
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 10, 20));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        formPanel.add(new JLabel("Customer Name:"));
        txtCustomerName = new JTextField();
        formPanel.add(txtCustomerName);

        formPanel.add(new JLabel("Select Product:"));
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        cmbProduct = new JComboBox<>(products);
        formPanel.add(cmbProduct);

        formPanel.add(new JLabel("Enter Price:"));
        txtPrice = new JTextField();
        formPanel.add(txtPrice);

        add(formPanel, BorderLayout.CENTER);

        // --- Process Button ---
        JPanel buttonPanel = new JPanel();
        JButton btnProcess = new JButton("PROCESS");
        btnProcess.addActionListener(e -> processSale());
        buttonPanel.add(btnProcess);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    // --- Q.2.3: Process Logic & File Saving ---
    private void processSale() {
        try {
            String customer = txtCustomerName.getText();
            String product = (String) cmbProduct.getSelectedItem();
            double price = Double.parseDouble(txtPrice.getText());

            ProductCalculations calc = new ProductCalculations(price);
            double vat = calc.GetVat();
            double comm = calc.GetCommission();
            double total = calc.GetTotal();

            // 1. Show Message Dialog
            String msg = "Customer Name: " + customer + "\n" +
                         "Product: " + product + "\n" +
                         "VAT: R " + vat + "\n" +
                         "COMMISSION: R " + comm + "\n" +
                         "TOTAL: R " + total;
            JOptionPane.showMessageDialog(this, msg, "Message", JOptionPane.INFORMATION_MESSAGE);

            // 2. Save to data.txt
            try (PrintWriter out = new PrintWriter(new FileWriter("data.txt", true))) {
                out.println("DATA LOG");
                out.println("************************");
                out.println("Customer Name: " + customer);
                out.println("Product: " + product);
                out.println("VAT: R " + vat);
                out.println("COMMISSION: R " + comm);
                out.println("TOTAL: R " + total);
                out.println("************************\n");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage());
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for price.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ProductAppGUI().setVisible(true));
    }
}