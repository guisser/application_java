package interface_graphique;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TEST extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public TEST() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Saisir id_agent :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(40, 35, 161, 45);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(229, 44, 217, 27);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(451, 101, 89, 23);
		add(btnNewButton);

	}
}
