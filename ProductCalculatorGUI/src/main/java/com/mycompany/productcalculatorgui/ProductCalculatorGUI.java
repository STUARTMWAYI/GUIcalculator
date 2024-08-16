/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productcalculatorgui;

/**
 *
 * @author stuart
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductCalculatorGUI {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Product Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Using null layout for simplicity

        // Create components
        JLabel label1 = new JLabel("Enter first number:");
        label1.setBounds(20, 20, 120, 25);
        frame.add(label1);

        JTextField textField1 = new JTextField();
        textField1.setBounds(150, 20, 100, 25);
        frame.add(textField1);

        JLabel label2 = new JLabel("Enter second number:");
        label2.setBounds(20, 60, 120, 25);
        frame.add(label2);

        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 60, 100, 25);
        frame.add(textField2);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(80, 100, 100, 25);
        frame.add(calculateButton);

        JLabel resultLabel = new JLabel("Product:");
        resultLabel.setBounds(20, 140, 120, 25);
        frame.add(resultLabel);

        JTextField resultField = new JTextField();
        resultField.setBounds(150, 140, 100, 25);
        resultField.setEditable(false); // Make the result field non-editable
        frame.add(resultField);

        // Action listener for the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get numbers from the text fields
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());

                    // Calculate the product
                    double product = num1 * num2;

                    // Display the result
                    resultField.setText(String.valueOf(product));
                } catch (NumberFormatException ex) {
                    // Handle the case where the input is not a valid number
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}

