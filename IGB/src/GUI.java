import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.Panel;
public class GUI {
	private JTextField textField;
	public GUI() {
       JFrame frame = new JFrame();
		
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setSize( 500, 663);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel panel= new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(200, 100, 300, 300));
		panel.setSize(500, 800);
		panel.setLayout(new GridLayout(0,1));
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		Label label = new Label("");
		
		
		JButton btnNewButton = new JButton("Modifier");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Client cl= new Client("Kajan","Nith","Paris","26/03/1945","mail",
						 "0408053",'M',123);
				
				label.setText(cl.Infos());
				
			}
		});
		
		
		panel.add(label);
		label.setSize(500, 500);
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textField);
		textField.setColumns(10);
		panel.add(btnNewButton);
		btnNewButton.setAlignmentY(100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Banque de France");
		frame.pack();
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		 
		new GUI();

	}

}
